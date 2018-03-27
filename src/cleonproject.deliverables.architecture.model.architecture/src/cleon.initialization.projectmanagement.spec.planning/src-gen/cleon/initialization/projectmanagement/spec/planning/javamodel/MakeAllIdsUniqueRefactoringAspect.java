package cleon.initialization.projectmanagement.spec.planning.javamodel;

import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.Resource;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.impl.AbstractAllInstancesRefactorerAspect;
import ch.actifsource.core.set.INodeSet;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import cleon.common.resources.spec.resources.id.IdPackage;
import cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage;

public class MakeAllIdsUniqueRefactoringAspect extends AbstractAllInstancesRefactorerAspect {

	public MakeAllIdsUniqueRefactoringAspect() {
		super("1.0", 2016, 4, 11, "Make all ids in projectmanagement unique", IdPackage.BusinessObjectId);
	}

	@Override
	protected void refactor(IModifiable executor, Package paramPackage, INode paramINode) {
		makeUnique(executor, paramPackage, BacklogPackage.WorkItem);

	}
	
	private void makeUnique(IModifiable executor, Package paramPackage, Resource resource)
	{
		INodeSet nodeSet = Select.instances(executor, resource);
		
		int i = 0;
		for(INode node : nodeSet)
		{
			++i;
			try
			{
				Update.createOrModifyStatement(executor, paramPackage, node, IdPackage.BusinessObjectId_identifier, LiteralUtil.create(i));
			}
			catch(Exception e)
			{
				ch.actifsource.util.log.Logger.instance().logError(e.toString());				
			}
		}
	}
}