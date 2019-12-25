package cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.principles.javamodel;

import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class PrincipleIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<IPrinciple> 
{
	public PrincipleIdValidationAspect()
	{
		super(IPrinciple.class);
	}
}