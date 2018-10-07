package cleon.common.modularity.spec.buildingblock.javamodel;

import java.util.ArrayList;
import java.util.List;

import ch.actifsource.core.INode;
import ch.actifsource.core.Statement;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.IReadJobExecutor;
import ch.actifsource.core.model.aspects.IOwnRangeRestrictionAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.SingleStatementInconsistency;
import ch.actifsource.util.filter.Filter;
import ch.actifsource.util.filter.IFilter;
import cleon.common.modularity.spec.buildingblock.FunctionSpace_Buildingblock.IBuildingBlockFunctions;

public class DependenyOwnRestrictionAspect implements IOwnRangeRestrictionAspect {

	@Override
	public IFilter<INode> allowedTypeFilter(IReadJobExecutor ireadjobexecutor, INode inode, INode inode1) {
		return Filter.includeAll();
	}

	@Override
	public void validate(ValidationContext validationcontext, Statement statement,
			List<IResourceInconsistency> inconsistencyList) {
		ITypeSystem typeSystem = TypeSystem.create(validationcontext.getReadJobExecutor());
		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		IDependentBuildingBlock dependentBuildingBlock = resourceRepository.getResource(IDependentBuildingBlock.class,
				validationcontext.getResource());

		IDependency dependency = resourceRepository.getResource(IDependency.class, statement.object());
		IBuildingBlock dependencyBuildingBlock = dependency.selectTo();

		IBuildingBlockFunctions blockFunctions = dependentBuildingBlock.extension(IBuildingBlockFunctions.class);
		List<IBuildingBlock> indirectBuildingBlocks = blockFunctions.GetIndirectDependingBuildingBlocks();

		if (indirectBuildingBlocks.contains(dependencyBuildingBlock)) {
			inconsistencyList.add(new SingleStatementInconsistency(statement, "Dependency is inherited redundant."));
		}

		List<IBuildingBlock> directBuildingBlocks = new ArrayList<>(blockFunctions.GetDirectDependingBuildingBlocks());

		directBuildingBlocks.remove(dependencyBuildingBlock);

		if (directBuildingBlocks.contains(dependencyBuildingBlock)) {
			inconsistencyList.add(new SingleStatementInconsistency(statement, "Dependency is redundant."));
		}
	}

}
