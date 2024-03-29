package cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel;

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
import cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage;
import cleon.common.resources.metamodel.spec.id.IdPackage;
import cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.IssuesPackage;
import cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.SourcesPackage;
import cleon.architecturemethods.eamod.metamodel.spec.chrv.goals.GoalsPackage;
import cleon.architecturemethods.eamod.metamodel.spec.chrv.principles.PrinciplesPackage;
import cleon.architecturemethods.eamod.metamodel.spec.chrv.drivers.DriversPackage;

public class MakeAllIdsUniqueRefactoringAspect extends AbstractAllInstancesRefactorerAspect {

	public MakeAllIdsUniqueRefactoringAspect() {
		super("1.0", 2016, 4, 11, "Make all ids in requirementsmanagement unique", IdPackage.IntegerBusinessObjectId);
	}

	@Override
	protected void refactor(IModifiable executor, Package paramPackage, INode paramINode) {
		makeUnique(executor, RequirementPackage.Requirement);	
		makeUnique(executor, IssuesPackage.Issue);
		makeUnique(executor, SourcesPackage.Source);
		makeUnique(executor, GoalsPackage.Goal);
		makeUnique(executor, PrinciplesPackage.Principle);
		makeUnique(executor, DriversPackage.Driver);
	}
	
	private void makeUnique(IModifiable executor, Resource resource)
	{
		INodeSet nodeSet = Select.instances(executor, resource);
		
		int i = 0;
		for(INode node : nodeSet)
		{
			++i;
			try
			{
				Statement idstatement = Select.statementForAttributeOrNull(executor, IdPackage.IntegerBusinessObjectId_identifier, node);
				Update.modify(executor, idstatement, LiteralUtil.create(i));				
			}
			catch(Exception e)
			{
				ch.actifsource.util.log.Logger.instance().logError(e.toString());				
			}
		}
		
	}

}