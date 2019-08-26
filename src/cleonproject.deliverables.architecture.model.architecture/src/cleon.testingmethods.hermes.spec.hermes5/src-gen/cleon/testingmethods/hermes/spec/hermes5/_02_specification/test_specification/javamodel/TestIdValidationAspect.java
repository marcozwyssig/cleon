package cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification.javamodel;

import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class TestIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<ITest> 
{
	public TestIdValidationAspect()
	{
		super(ITest.class);
	}
}