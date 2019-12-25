package cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.goals.javamodel;

import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class GoalIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<IGoal> 
{
	public GoalIdValidationAspect()
	{
		super(IGoal.class);
	}
}