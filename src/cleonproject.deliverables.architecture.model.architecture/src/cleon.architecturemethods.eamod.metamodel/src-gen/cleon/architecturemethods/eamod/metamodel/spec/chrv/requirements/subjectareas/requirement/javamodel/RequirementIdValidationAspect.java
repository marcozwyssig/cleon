package cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel;

import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class RequirementIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<IRequirement> 
{
	public RequirementIdValidationAspect()
	{
		super(IRequirement.class);
	}
}