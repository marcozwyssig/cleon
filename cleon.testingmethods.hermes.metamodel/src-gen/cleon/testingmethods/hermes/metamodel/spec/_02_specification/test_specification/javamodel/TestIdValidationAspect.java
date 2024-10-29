package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel;

import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class TestIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<ITest> 
{
	public TestIdValidationAspect()
	{
		super(ITest.class);
	}
}