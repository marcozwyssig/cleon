package cleon.architecturemethods.eamod.metamodel.spec.chrv.goals.javamodel;

import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdInitializerAspect;

public class GoalInitializationAspect extends BusinessObjectIdInitializerAspect<IGoal> 
{
	public GoalInitializationAspect()
	{
		super(IGoal.class);
	}
}