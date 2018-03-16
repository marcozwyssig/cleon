package cleon.conception.eamod.spec.chrv.motivation.drivers.javamodel;

import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdInitializerAspect;

public class DriverInitializationAspect extends BusinessObjectIdInitializerAspect<IDriver> 
{
	public DriverInitializationAspect()
	{
		super(IDriver.class);
	}
}