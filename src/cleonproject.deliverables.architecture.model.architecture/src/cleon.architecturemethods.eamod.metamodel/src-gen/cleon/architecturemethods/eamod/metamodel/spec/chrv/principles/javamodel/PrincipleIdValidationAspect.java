package cleon.architecturemethods.eamod.metamodel.spec.chrv.principles.javamodel;

import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class PrincipleIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<IPrinciple> 
{
	public PrincipleIdValidationAspect()
	{
		super(IPrinciple.class);
	}
}