package cleon.support.projectmanagement.spec.planning.goals.javamodel;

import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdInitializerAspect;

public class GoalInitializerAspect extends BusinessObjectIdInitializerAspect<IGoal> 
{
	public GoalInitializerAspect()
	{
		super(IGoal.class);
	}
}
