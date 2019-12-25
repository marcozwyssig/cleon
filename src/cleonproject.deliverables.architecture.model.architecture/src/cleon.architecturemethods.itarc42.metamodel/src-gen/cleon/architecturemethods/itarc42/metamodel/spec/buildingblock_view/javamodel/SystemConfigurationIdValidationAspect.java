package cleon.architecturemethods.itarc42.metamodel.spec.buildingblock_view.javamodel;

import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class SystemConfigurationIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<ISystemConfiguration> 
{
	public SystemConfigurationIdValidationAspect()
	{
		super(ISystemConfiguration.class);
	}
}