package cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel;

import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class RequirementIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<IRequirement> 
{
	public RequirementIdValidationAspect()
	{
		super(IRequirement.class);
	}
}