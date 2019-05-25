package cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel;

import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.Resource;
import ch.actifsource.core.Statement;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.impl.AbstractAllInstancesRefactorerAspect;
import ch.actifsource.core.set.INodeSet;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage;
import cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.Buildingblock_viewPackage;
import cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.systemconfiguration.SystemconfigurationPackage;
import cleon.common.modularity.spec.buildingblock.BuildingblockPackage;
import cleon.common.resources.spec.resources.id.IdPackage;

public class MakeAllIdsUniqueRefactoringAspect extends AbstractAllInstancesRefactorerAspect {

	public MakeAllIdsUniqueRefactoringAspect() {
		super("1.0", 2019, 4, 26, "Make all ids in itarc42 buildingblock unique", IdPackage.IntegerBusinessObjectId);
	}

	@Override
	protected void refactor(IModifiable executor, Package paramPackage, INode paramINode) {
		makeUnique(executor, paramPackage, Buildingblock_viewPackage.SystemConfiguration);
		makeUnique(executor, paramPackage, Buildingblock_viewPackage.SystemComponent);
	}

	private void makeUnique(IModifiable executor, Package paramPackage, Resource resource) {
		INodeSet nodeSet = Select.instances(executor, resource);
		int i = 0;
		for (INode node : nodeSet) {
			++i;
			try {
				Update.createOrModifyStatement(executor, paramPackage, node,
						IdPackage.IntegerBusinessObjectId_identifier, LiteralUtil.create(i));
			} catch (Throwable e) {
				ch.actifsource.util.log.Logger.instance()
				.logInfo("Exception on change off " + Select.simpleName(executor, node));
				ch.actifsource.util.log.Logger.instance().logWarning(e);
			}
		}
	}
}