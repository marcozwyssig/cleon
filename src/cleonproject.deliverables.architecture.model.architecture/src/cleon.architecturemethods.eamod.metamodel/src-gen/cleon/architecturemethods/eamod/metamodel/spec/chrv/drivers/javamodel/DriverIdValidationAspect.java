package cleon.architecturemethods.eamod.metamodel.spec.chrv.drivers.javamodel;

import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class DriverIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<IDriver> 
{
	public DriverIdValidationAspect()
	{
		super(IDriver.class);
	}
}