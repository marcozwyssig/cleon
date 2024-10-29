package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel;

import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdInitializerAspect;

public class WorkItemInitializerAspect extends BusinessObjectIdInitializerAspect<IWorkItem> 
{
	public WorkItemInitializerAspect()
	{
		super(IWorkItem.class);
	}
}