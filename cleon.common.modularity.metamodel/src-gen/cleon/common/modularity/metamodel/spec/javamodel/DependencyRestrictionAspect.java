package cleon.common.modularity.metamodel.spec.javamodel;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.CheckForNull;
import ch.actifsource.core.INode;
import ch.actifsource.core.Statement;
import ch.actifsource.core.aspect.NullAllowed;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.IReadJobExecutor;
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
import cleon.common.modularity.metamodel.spec.FunctionSpace_Buildingblock.*;

public class DependencyRestrictionAspect extends AbstractStatelessAspectImpl implements IUseRangeRestrictionAspect {

	@Override
	public IFilter<INode> allowedObjectsFilter(final ISelectable selectable, INode subject, INode predicate) {
		final ITypeSystem typeSystem = TypeSystem.create(selectable);
		final IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();

		final IDependency dependency = resourceRepository.getResource(IDependency.class, subject);
		final IDependencyFunctions dependencyFunctions = dependency.extension(IDependencyFunctions.class);

		final List<IBuildingBlock> getAllNotAllowedDependencies = dependencyFunctions.GetAllNotAllowedDependencies();

		return element -> {
			final IBuildingBlock buildingBlock = resourceRepository.getResource(IBuildingBlock.class, element);
			return !getAllNotAllowedDependencies.contains(buildingBlock);
		};
	}

	@Override
	public IFilter<INode> allowedTypeFilter(IReadJobExecutor readExecutor, INode subject, INode predicate) {
		return Filter.excludeAll();
	}

	@Override
	public void validate(ValidationContext context, Statement statement, List<IResourceInconsistency> inconsistencyList) {
		final ITypeSystem typeSystem = TypeSystem.create(context.getReadJobExecutor());
		final IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		final IDependency dependency = resourceRepository.getResource(IDependency.class, context.getResource());
		final IBuildingBlock startBuildingBlock = DependentBuildingBlock.selectToMeHasDependency(dependency);
		//ch.actifsource.util.log.Logger.instance().logInfo("BuildingBlock: " + Select.simpleName(context.getReadJobExecutor(), startBuildingBlock.getResource()));
		validate(context.getReadJobExecutor(), startBuildingBlock, startBuildingBlock, new ArrayList<IBuildingBlock>(), statement, inconsistencyList );
	}

	private void validate( IReadJobExecutor executor, IBuildingBlock currentBuildingBlock, IBuildingBlock toValidate, List<IBuildingBlock> checkBuildingBlocks, Statement statement, List<IResourceInconsistency> inconsistencyList)
	{		
		if(!inconsistencyList.isEmpty())
		{
			return;
		}

		final IBuildingBlockFunctions currentBuildingBlockFunctions = currentBuildingBlock.extension(IBuildingBlockFunctions.class);
		final List<IDependency> dependingBuildings = currentBuildingBlockFunctions.OnlyDependencies();	

		for( final IDependency dependency : dependingBuildings)
		{
			if(!IsRecursiveDependencyAllowed(dependency))
			{
				//ch.actifsource.util.log.Logger.instance().logInfo("Checking dependency " + Select.simpleName(executor, dependency.getResource()) + " for " + Select.simpleName(executor, toValidate.getResource()));
				final IBuildingBlock nextBuildingBlock = dependency.selectTo();
				if( nextBuildingBlock.equals(toValidate))
				{
					inconsistencyList.add(new SingleStatementInconsistency(statement, "Object is not allowed because of recursive dependency"));
					return;
				}
				else
				{
					if( checkBuildingBlocks.contains(nextBuildingBlock))
					{
						continue;
					}
					else
					{
						checkBuildingBlocks.add(currentBuildingBlock);
						validate(executor, nextBuildingBlock, toValidate, checkBuildingBlocks, statement, inconsistencyList);						
					}					
				}
			}
		}

	}

	private boolean IsRecursiveDependencyAllowed(IDependency dependency) {
		if( dependency.selectAllowRecursiveDependency() == null)
		{
			return false;
		}
		else
		{
			return dependency.selectAllowRecursiveDependency();
		}
	}



	@Override
	@CheckForNull
	@NullAllowed
	public IOrderedSet<IResourcePlacement> getPossibleNewObjectPlacements(IReadJobExecutor executor, INode subject,
			INode predicate, INode type) {
		return null;
	}

}
