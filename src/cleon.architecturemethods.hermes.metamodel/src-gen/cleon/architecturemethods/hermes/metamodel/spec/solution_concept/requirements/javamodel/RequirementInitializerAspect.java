package cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.javamodel;

import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdInitializerAspect;

public class RequirementInitializerAspect extends BusinessObjectIdInitializerAspect<IRequirement> 
{
	public RequirementInitializerAspect()
	{
		super(IRequirement.class);
	}
}