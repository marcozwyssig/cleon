package cleon.conception.eamod.spec.chrv.motivation.goals.javamodel;

import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdInitializerAspect;

public class GoalInitializationAspect extends BusinessObjectIdInitializerAspect<IGoal> 
{
	public GoalInitializationAspect()
	{
		super(IGoal.class);
	}
}