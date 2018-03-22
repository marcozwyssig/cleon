package cleon.conception.eamod.spec.chrv.motivation.drivers.javamodel;

import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class DriverIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<IDriver> 
{
	public DriverIdValidationAspect()
	{
		super(IDriver.class);
	}
}