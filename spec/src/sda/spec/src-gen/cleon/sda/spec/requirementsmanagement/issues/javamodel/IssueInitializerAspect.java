package cleon.sda.spec.requirementsmanagement.issues.javamodel;

import cleon.sda.spec.javamodel.BusinessObjectIdInitializerAspect;

public class IssueInitializerAspect extends BusinessObjectIdInitializerAspect<IIssue> 
{
	public IssueInitializerAspect()
	{
		super(IIssue.class);
	}
}
