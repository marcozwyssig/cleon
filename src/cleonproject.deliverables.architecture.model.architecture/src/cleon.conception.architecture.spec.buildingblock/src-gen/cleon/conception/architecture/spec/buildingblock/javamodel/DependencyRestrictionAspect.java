package cleon.conception.architecture.spec.buildingblock.javamodel;

import java.util.List;

import javax.annotation.CheckForNull;

import ch.actifsource.core.INode;
import ch.actifsource.core.Statement;
import ch.actifsource.core.aspect.NullAllowed;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.IReadJobExecutor;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.IResourcePlacement;
import ch.actifsource.core.model.aspects.IUseRangeRestrictionAspect;
import ch.actifsource.core.model.aspects.impl.AbstractStatelessAspectImpl;
import ch.actifsource.core.select.ISelectable;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.SingleStatementInconsistency;
import ch.actifsource.util.collection.IOrderedSet;
import ch.actifsource.util.filter.Filter;
import ch.actifsource.util.filter.IFilter;
import cleon.conception.architecture.spec.buildingblock.FunctionSpace.IBuildingBlockFunctions;
import cleon.conception.architecture.spec.buildingblock.FunctionSpace.IDependencyFunctions;

public class DependencyRestrictionAspect extends AbstractStatelessAspectImpl implements IUseRangeRestrictionAspect {

	public IFilter<INode> allowedObjectsFilter(final ISelectable selectable, INode subject, INode predicate) {
  	  	ITypeSystem typeSystem = TypeSystem.create(selectable);
		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		
		IDependency dependency = resourceRepository.getResource(IDependency.class, subject);
		IDependencyFunctions dependencyFunctions = dependency.extension(IDependencyFunctions.class);
		
		List<IBuildingBlock> getAllNotAllowedDependencies = dependencyFunctions.GetAllNotAllowedDependencies();

		return new IFilter<INode>() {
			public boolean include(INode element) {
				IBuildingBlock buildingBlock = resourceRepository.getResource(IBuildingBlock.class, element);
				return (!getAllNotAllowedDependencies.contains(buildingBlock));
			}
		};
	}

	public IFilter<INode> allowedTypeFilter(IReadJobExecutor readExecutor, INode subject, INode predicate) {
		return Filter.excludeAll();
	}
	
	private void validate( IReadJobExecutor executor, IBuildingBlock currentBuildingBlock, IBuildingBlock toValidate, Statement statement, List<IResourceInconsistency> inconsistencyList)
	{
		IBuildingBlockFunctions dependencyFunctions = currentBuildingBlock.extension(IBuildingBlockFunctions.class);
//		ch.actifsource.util.log.Logger.instance().logInfo("Current " + Select.simpleName(executor, currentBuildingBlock.getResource()));	
		List<IBuildingBlock> buildingBlocks = dependencyFunctions.GetDirectDependingBuildingBlocks();
//		buildingBlocks.forEach(x -> {
//			ch.actifsource.util.log.Logger.instance().logInfo("Dependent " + Select.simpleName(executor, x.getResource()));			
//		});
		
		if (buildingBlocks.contains(toValidate))
		{
			inconsistencyList.add(new SingleStatementInconsistency(statement, "Object is not allowed because of recursive dependency"));
		}
		
		if (inconsistencyList.isEmpty())
		{
			buildingBlocks.forEach(x -> {
				validate(executor, x, toValidate, statement, inconsistencyList);
			});
		}
		
	}

	public void validate(ValidationContext context, Statement statement, List<IResourceInconsistency> inconsistencyList) {
  	  	ITypeSystem typeSystem = TypeSystem.create(context.getReadJobExecutor());
		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		
		IDependency dependency = resourceRepository.getResource(IDependency.class, context.getResource());
		IDependencyFunctions dependencyFunctions = dependency.extension(IDependencyFunctions.class);
		
		validate(context.getReadJobExecutor(), dependencyFunctions.GetBuildingBlock(), dependencyFunctions.GetBuildingBlock(), statement, inconsistencyList );
	}

	@CheckForNull
	@NullAllowed
	public IOrderedSet<IResourcePlacement> getPossibleNewObjectPlacements(IReadJobExecutor executor, INode subject,
			INode predicate, INode type) {
		return null;
	}

}
