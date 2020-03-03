package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel;

import java.util.List;
import java.util.OptionalInt;

import ch.actifsource.core.INode;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.FunctionSpace_RBAC.IAbstractGroupFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.activity.FunctionSpace_Activity.IActivityPermissionFunctions;
import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdInitializerAspect;

public class SystemConfigurationIdInitializerAspect extends BusinessObjectIdInitializerAspect<ISystemConfiguration> 
{
	public SystemConfigurationIdInitializerAspect()
	{
		super(ISystemConfiguration.class);
	}
	
}
