package cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel;

import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class AbstractRequirementIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<IAbstractRequirement> 
{
	public AbstractRequirementIdValidationAspect()
	{
		super(IAbstractRequirement.class);
	}
}