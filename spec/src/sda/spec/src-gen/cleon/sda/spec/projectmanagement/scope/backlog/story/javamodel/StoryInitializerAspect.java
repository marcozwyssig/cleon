package cleon.sda.spec.projectmanagement.scope.backlog.story.javamodel;

import cleon.sda.spec.javamodel.BusinessObjectIdInitializerAspect;


public class StoryInitializerAspect extends BusinessObjectIdInitializerAspect<IStory> 
{
	public StoryInitializerAspect()
	{
		super(IStory.class);
	}
}
