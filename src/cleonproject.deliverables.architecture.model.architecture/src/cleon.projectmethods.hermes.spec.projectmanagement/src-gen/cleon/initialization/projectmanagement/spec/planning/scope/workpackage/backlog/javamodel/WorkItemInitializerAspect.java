package cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel;

import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdInitializerAspect;
import cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItem;

public class WorkItemInitializerAspect extends BusinessObjectIdInitializerAspect<IWorkItem> 
{
	public WorkItemInitializerAspect()
	{
		super(IWorkItem.class);
	}
}