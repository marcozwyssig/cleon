package cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel;

import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class SystemConfigurationIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<ISystemConfiguration> 
{
	public SystemConfigurationIdValidationAspect()
	{
		super(ISystemConfiguration.class);
	}
}