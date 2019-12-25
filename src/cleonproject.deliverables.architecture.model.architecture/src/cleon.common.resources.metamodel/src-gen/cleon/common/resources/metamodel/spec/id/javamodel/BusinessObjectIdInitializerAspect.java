package cleon.common.resources.metamodel.spec.id.javamodel;

import java.util.List;
import java.util.OptionalInt;

import ch.actifsource.core.CorePackage;
import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.AbstractInitializationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import cleon.common.resources.metamodel.spec.id.IdPackage;

public abstract class BusinessObjectIdInitializerAspect<T extends IIntegerBusinessObjectId>
		extends AbstractInitializationAspect {

	private Class<T> _classInstance;

	protected BusinessObjectIdInitializerAspect(Class<T> classInstance) {
		_classInstance = classInstance;
	}

	protected Class<T> Clazz() {
		return _classInstance;
	}

	public void initialize(IModifiable modifiable, INode clazz, Package pkg, INode newInstance) {

		ITypeSystem typeSystem = TypeSystem.create(modifiable);
		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();

		try {
			Integer nextId = getNextId(resourceRepository, resourceRepository.getResource(Clazz(), newInstance));
			Update.createOrModifyStatement(modifiable, pkg, newInstance, IdPackage.IntegerBusinessObjectId_identifier, LiteralUtil.create(nextId));
		} catch (Exception e) {
			Update.createStatement(modifiable, pkg, newInstance, CorePackage.NamedResource_name,
					LiteralUtil.create(e.toString()));
		}
	}

	protected List<T> selectRessources(IDynamicResourceRepository resourceRepository, T newInstance) {
		return resourceRepository.getAllResources(Clazz());
	}

	protected Integer getNextId(IDynamicResourceRepository resourceRepository, T newInstance) {
		OptionalInt maxOptional = findNextId(selectRessources(resourceRepository, newInstance));
		if (maxOptional.isPresent()) {
			return maxOptional.getAsInt() + 1;
		} else {
			return getStartId(newInstance);
		}
	}

	protected Integer getStartId(T newInstance) {
		return 0;
	}

	protected OptionalInt findNextId(List<T> resources) {
		return resources.stream().filter(y -> y.selectIdentifier() != null).mapToInt(x -> x.selectIdentifier()).max();
	}
}
