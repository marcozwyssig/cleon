package cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.javamodel;

import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class RequirementIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<IRequirement> 
{
	public RequirementIdValidationAspect()
	{
		super(IRequirement.class);
	}
}