package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel;

import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class SystemConfigurationIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<ISystemConfiguration> 
{
	public SystemConfigurationIdValidationAspect()
	{
		super(ISystemConfiguration.class);
	}
}