package cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.drivers.javamodel;

import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdInitializerAspect;

public class DriverInitializationAspect extends BusinessObjectIdInitializerAspect<IDriver> 
{
	public DriverInitializationAspect()
	{
		super(IDriver.class);
	}
}