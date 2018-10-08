package cleon.conception.architecture.spec.eamod.chrv.motivation.principles.javamodel;

import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class PrincipleIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<IPrinciple> 
{
	public PrincipleIdValidationAspect()
	{
		super(IPrinciple.class);
	}
}