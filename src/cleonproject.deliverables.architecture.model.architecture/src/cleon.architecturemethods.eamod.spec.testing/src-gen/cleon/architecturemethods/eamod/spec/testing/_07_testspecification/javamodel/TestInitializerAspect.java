package cleon.architecturemethods.eamod.spec.testing._07_testspecification.javamodel;

import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdInitializerAspect;

public class TestInitializerAspect extends BusinessObjectIdInitializerAspect<ITest> 
{
	public TestInitializerAspect()
	{
		super(ITest.class);
	}
}