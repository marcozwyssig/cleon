package cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel;

import java.util.List;
import java.util.OptionalInt;

import ch.actifsource.core.INode;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.FunctionSpace_RBAC.IAbstractGroupFunctions;
import cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.activity.FunctionSpace_Activity.IActivityPermissionFunctions;
import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdInitializerAspect;

public class SystemConfigurationIdInitializerAspect extends BusinessObjectIdInitializerAspect<ISystemConfiguration> 
{
	public SystemConfigurationIdInitializerAspect()
	{
		super(ISystemConfiguration.class);
	}
	
}
