package cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel;

import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class WorkItemIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<IWorkItem> 
{
	public WorkItemIdValidationAspect()
	{
		super(IWorkItem.class);
	}
}