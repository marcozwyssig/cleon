package cleon.architecturemethods.eamod.spec.test.javamodel;


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
import cleon.common.resources.spec.resources.id.IdPackage;
import cleon.architecturemethods.eamod.spec.test._01_concept._01_test_goals._01_test_goalsPackage;
import cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._07_testspecificationPackage;

public class MakeAllIdsUniqueRefactoringAspect extends AbstractAllInstancesRefactorerAspect {

	public MakeAllIdsUniqueRefactoringAspect() {
		super("1.0", 2016, 5, 20, "Make all ids in testing unique", IdPackage.IntegerBusinessObjectId);
	}

	@Override
	protected void refactor(IModifiable executor, Package paramPackage, INode paramINode) {
		makeUnique(executor, paramPackage, _07_testspecificationPackage.Test);	
		makeUnique(executor, paramPackage, _01_test_goalsPackage.TestGoal);
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
				Update.createOrModifyStatement(executor, paramPackage, node, IdPackage.IntegerBusinessObjectId_identifier, LiteralUtil.create(i));
			}
			catch(Exception e)
			{
				ch.actifsource.util.log.Logger.instance().logError(e.toString());				
			}
		}
		
	}
}