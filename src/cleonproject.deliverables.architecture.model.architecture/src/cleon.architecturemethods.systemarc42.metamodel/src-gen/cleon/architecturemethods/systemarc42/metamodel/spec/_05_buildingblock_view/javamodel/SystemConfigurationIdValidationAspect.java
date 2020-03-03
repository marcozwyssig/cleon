package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel;

import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class SystemConfigurationIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<ISystemConfiguration> 
{
	public SystemConfigurationIdValidationAspect()
	{
		super(ISystemConfiguration.class);
	}
}