package cleon.architecturemethods.hermes.metamodel.solution_concept.spec.requirements.javamodel;

import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class RequirementIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<IRequirement> 
{
	public RequirementIdValidationAspect()
	{
		super(IRequirement.class);
	}
}