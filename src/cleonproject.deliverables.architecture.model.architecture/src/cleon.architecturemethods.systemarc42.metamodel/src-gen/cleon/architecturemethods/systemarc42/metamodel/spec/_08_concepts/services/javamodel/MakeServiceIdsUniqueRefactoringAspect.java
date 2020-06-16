package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel;

import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.Resource;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.impl.AbstractAllInstancesRefactorerAspect;
import ch.actifsource.core.set.INodeSet;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.ServicesPackage;
import cleon.common.resources.metamodel.spec.id.IdPackage;

public class MakeServiceIdsUniqueRefactoringAspect extends AbstractAllInstancesRefactorerAspect {

	public MakeServiceIdsUniqueRefactoringAspect() {
		super("1.0", 2020, 5, 16, "Make all ids in service unique", IdPackage.IntegerBusinessObjectId);
	}

	@Override
	protected void refactor(final IModifiable executor, final Package paramPackage, final INode paramINode) {
		makeUnique(executor, paramPackage, ServicesPackage.Service);
	}

	private void makeUnique(final IModifiable executor, final Package paramPackage, final Resource resource) {
		final INodeSet nodeSet = Select.instances(executor, resource);
		int i = 0;
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
}