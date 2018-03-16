package cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.story.javamodel;

import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdInitializerAspect;
import cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.story.javamodel.IStory;

public class StoryInitializerAspect extends BusinessObjectIdInitializerAspect<IStory> 
{
	public StoryInitializerAspect()
	{
		super(IStory.class);
	}
}
