package cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.activity.javamodel;

import java.util.List;
import java.util.OptionalInt;

import ch.actifsource.core.INode;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.FunctionSpace_RBAC.IAbstractGroupFunctions;
import cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.activity.FunctionSpace_Activity.IActivityPermissionFunctions;
import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdInitializerAspect;

public class ActivityPermissionIdInitializerAspect extends BusinessObjectIdInitializerAspect<IActivityPermission> 
{
	public ActivityPermissionIdInitializerAspect()
	{
		super(IActivityPermission.class);
	}
	
	protected List<IActivityPermission> selectRessources(IDynamicResourceRepository resourceRepository, IActivityPermission activityPermission) {
		IActivityPermissionFunctions activityPermissionFunctions = activityPermission.extension(IActivityPermissionFunctions.class); 
		return activityPermissionFunctions.AllActivityPermissionInDomain();
	}
	
	protected Integer getStartId(IActivityPermission activityPermission) {
		IAbstractGroupFunctions abstractGroupFunctions = activityPermission.extension(IAbstractGroupFunctions.class);
		return abstractGroupFunctions.GetNetdomainId();
	}		
}
