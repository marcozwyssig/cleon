package cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel;

import cleon.sda.spec.javamodel.BusinessObjectIdInitializerAspect;

public class GoalInitializerAspect extends BusinessObjectIdInitializerAspect<IGoal> 
{
	public GoalInitializerAspect()
	{
		super(IGoal.class);
	}
}