package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel;

import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdInitializerAspect;

public class TestIdInitializerAspect extends BusinessObjectIdInitializerAspect<ITest> 
{
	public TestIdInitializerAspect()
	{
		super(ITest.class);
	}
}