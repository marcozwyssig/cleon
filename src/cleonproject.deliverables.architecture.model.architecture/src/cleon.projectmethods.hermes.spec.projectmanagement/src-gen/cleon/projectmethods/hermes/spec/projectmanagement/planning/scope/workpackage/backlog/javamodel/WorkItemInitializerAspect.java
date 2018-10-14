package cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel;

import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdInitializerAspect;

public class WorkItemInitializerAspect extends BusinessObjectIdInitializerAspect<IWorkItem> 
{
	public WorkItemInitializerAspect()
	{
		super(IWorkItem.class);
	}
}