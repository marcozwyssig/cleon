package cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel;

import cleon.sda.spec.javamodel.BusinessObjectIdInitializerAspect;

public class RequirementInitializerAspect extends BusinessObjectIdInitializerAspect<IRequirement> 
{
	public RequirementInitializerAspect()
	{
		super(IRequirement.class);
	}
}