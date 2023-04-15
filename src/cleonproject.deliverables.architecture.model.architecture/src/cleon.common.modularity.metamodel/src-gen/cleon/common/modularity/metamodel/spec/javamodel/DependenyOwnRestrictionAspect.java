package cleon.common.modularity.metamodel.spec.javamodel;

import java.util.ArrayList;
import java.util.List;

import ch.actifsource.core.INode;
import ch.actifsource.core.Statement;
import ch.actifsource.core.job.IReadJobExecutor;
import ch.actifsource.core.model.aspects.IOwnRangeRestrictionAspect;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.SingleStatementInconsistency;
import ch.actifsource.util.filter.Filter;
import ch.actifsource.util.filter.IFilter;
import cleon.common.modularity.metamodel.spec.FunctionSpace_Buildingblock.IBuildingBlockFunctions;

public class DependenyOwnRestrictionAspect implements IOwnRangeRestrictionAspect {

	@Override
	public IFilter<INode> allowedTypeFilter(IReadJobExecutor ireadjobexecutor, INode inode, INode inode1) {
		return Filter.includeAll();
	}

	@Override
	public void validate(ValidationContext validationcontext, Statement statement,
			List<IResourceInconsistency> inconsistencyList) {
		final var typeSystem = TypeSystem.create(validationcontext.getReadJobExecutor());
		final var resourceRepository = typeSystem.getResourceRepository();
		final var dependentBuildingBlock = resourceRepository.getResource(IDependentBuildingBlock.class,
				validationcontext.getResource());

		final var dependency = resourceRepository.getResource(IDependency.class, statement.object());
		final var dependencyBuildingBlock = dependency.selectTo();

		final var blockFunctions = dependentBuildingBlock.extension(IBuildingBlockFunctions.class);
		final var indirectBuildingBlocks = blockFunctions.IndirectDependingBuildingBlocks();

		if (indirectBuildingBlocks.contains(dependencyBuildingBlock)) {
			inconsistencyList.add(new SingleStatementInconsistency(statement, "Dependency is inherited redundant."));
		}

		final var directBuildingBlocks = new ArrayList<>(blockFunctions.DependsOn());

		directBuildingBlocks.remove(dependencyBuildingBlock);

		if (directBuildingBlocks.contains(dependencyBuildingBlock)) {
			inconsistencyList.add(new SingleStatementInconsistency(statement, "Dependency is redundant."));
		}
	}

}
