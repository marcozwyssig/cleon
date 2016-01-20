package cleon.sda.spec.projectmanagement.scope.backlog.javamodel;

import cleon.sda.spec.javamodel.BusinessObjectIdInitializerAspect;

public class WorkItemInitializerAspect extends BusinessObjectIdInitializerAspect<IWorkItem> 
{
	public WorkItemInitializerAspect()
	{
		super(IWorkItem.class);
	}
}