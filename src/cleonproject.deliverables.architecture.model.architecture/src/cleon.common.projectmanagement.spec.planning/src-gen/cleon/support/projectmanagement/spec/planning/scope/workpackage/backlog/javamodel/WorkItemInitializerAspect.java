package cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel;

import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdInitializerAspect;
import cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItem;

public class WorkItemInitializerAspect extends BusinessObjectIdInitializerAspect<IWorkItem> 
{
	public WorkItemInitializerAspect()
	{
		super(IWorkItem.class);
	}
}