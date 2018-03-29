package cleon.common.importwizard.spec.asrc2xml.javamodel;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import ch.actifsource.core.INode;
import ch.actifsource.core.Statement;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.javamodel.Class;
import ch.actifsource.core.javamodel.IClass;
import ch.actifsource.core.javamodel.IRelation;
import ch.actifsource.core.javamodel.Relation;
import ch.actifsource.core.job.IReadJobExecutor;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.IResourcePlacement;
import ch.actifsource.core.model.aspects.IUseRangeRestrictionAspect;
import ch.actifsource.core.select.ISelectable;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.SingleStatementInconsistency;
import ch.actifsource.util.collection.IOrderedSet;
import ch.actifsource.util.filter.Filter;
import ch.actifsource.util.filter.IFilter;

public class ImportAssociationParentUseRangeRestrictionAspect implements IUseRangeRestrictionAspect {

	@Override
	public IFilter<INode> allowedTypeFilter(IReadJobExecutor readExecutor, INode subject, INode predicate) {
		return Filter.excludeAll();
	}

	@Override
	public IFilter<INode> allowedObjectsFilter(ISelectable readExecutor, INode subject, INode predicate) {
		Set<INode> objects = validObjects(readExecutor, subject);
		return new IFilter<INode>() {
			public boolean include(INode element) {
				return objects.contains(element);
			}
		};
	}

	private Set<INode> validObjects(ISelectable readExecutor, INode subject) {
		ITypeSystem typeSystem = TypeSystem.create(readExecutor);
		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		IImportAssociation association = resourceRepository.getResource(IImportAssociation.class, subject);
		IClass clazz = (IClass) association.selectAssocation().selectRange();
		List<IRelation> newrelations = Relation.selectToMeRange(clazz);
		Set<IClass> classes = newrelations.stream().map(x -> Class.selectToMeProperty(x)).collect(Collectors.toSet());
		Set<INode> objects = new HashSet<>();
		classes.forEach(x -> objects.addAll(Select.instances(readExecutor, x.getResource()).asUnmodifiableList()));
		return objects;
	}

	private boolean isAllowedObject(ValidationContext context, Statement statement) {
		Set<INode> objects = validObjects(context.getSelectable(), context.getResource());
		return objects.contains(statement.subject()) || objects.contains(statement.object());
	}

	@Override
	public void validate(ValidationContext context, Statement statement, List<IResourceInconsistency> inconsistencyList) {

		if (isAllowedObject(context, statement)) {
			return;
		} else {
			inconsistencyList.add(new SingleStatementInconsistency(statement, "Object not allowed."));
			return;
		}
	}

	@Override
	public IOrderedSet<IResourcePlacement> getPossibleNewObjectPlacements(IReadJobExecutor ireadjobexecutor, INode inode, INode inode1, INode inode2) {
		return null;
	}
}
