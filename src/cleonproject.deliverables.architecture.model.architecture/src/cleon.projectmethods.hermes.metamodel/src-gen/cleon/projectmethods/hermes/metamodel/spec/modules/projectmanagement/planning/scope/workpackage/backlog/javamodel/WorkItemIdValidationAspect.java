package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel;

import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class WorkItemIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<IWorkItem> 
{
	public WorkItemIdValidationAspect()
	{
		super(IWorkItem.class);
	}
}