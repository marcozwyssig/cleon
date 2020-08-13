package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel;

import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class ServiceIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<IService> 
{
	public ServiceIdValidationAspect()
	{
		super(IService.class);
	}

}
