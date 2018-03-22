package cleon.conception.eamod.spec.chrv.motivation.goals.javamodel;

import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class GoalIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<IGoal> 
{
	public GoalIdValidationAspect()
	{
		super(IGoal.class);
	}
}