package cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel;

import cleon.sda.spec.javamodel.BusinessObjectIdInitializerAspect;

public class DriverInitializationAspect extends BusinessObjectIdInitializerAspect<IDriver> 
{
	public DriverInitializationAspect()
	{
		super(IDriver.class);
	}
}