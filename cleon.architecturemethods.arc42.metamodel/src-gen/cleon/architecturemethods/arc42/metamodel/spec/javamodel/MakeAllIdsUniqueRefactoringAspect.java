package cleon.architecturemethods.arc42.metamodel.spec.javamodel;

import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.Resource;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.impl.AbstractAllInstancesRefactorerAspect;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.DomainPackage;
import cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage;
import cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage;
import cleon.common.resources.metamodel.spec.id.IdPackage;

public class MakeAllIdsUniqueRefactoringAspect extends AbstractAllInstancesRefactorerAspect {

	public MakeAllIdsUniqueRefactoringAspect() {
		super("1.0", 2019, 4, 26, "Make all ids in itarc42 buildingblock unique", IdPackage.IntegerBusinessObjectId);
	}

	private void makeUnique(final IModifiable executor, final Package paramPackage, final Resource resource) {
		final var nodeSet = Select.instances(executor, resource);
		var i = 0;
		for (final INode node : nodeSet) {
			++i;
			try {
				Update.createOrModifyStatement(executor, paramPackage, node,
						IdPackage.IntegerBusinessObjectId_identifier, LiteralUtil.create(i));
			} catch (final Throwable e) {
				ch.actifsource.util.log.Logger.instance()
				.logInfo("Exception on change off " + Select.simpleName(executor, node));
				ch.actifsource.util.log.Logger.instance().logWarning(e);
			}
		}
	}

	@Override
	protected void refactor(final IModifiable executor, final Package paramPackage, final INode paramINode) {
		makeUnique(executor, paramPackage, SystemconfigurationPackage.FunctionSpace_aE_SystemConfiguration_SystemConfiguration);
		makeUnique(executor, paramPackage, SystemPackage.FunctionSpace_aE_SystemArc42_aE_BuildingBlockView_SystemComponent);
		makeUnique(executor, paramPackage, DomainPackage.Actor);
	}
}