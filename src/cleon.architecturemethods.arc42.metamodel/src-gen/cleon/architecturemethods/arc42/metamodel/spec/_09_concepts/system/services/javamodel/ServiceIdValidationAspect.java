package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel;

import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class ServiceIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<IService> 
{
	public ServiceIdValidationAspect()
	{
		super(IService.class);
	}

}
