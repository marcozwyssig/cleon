package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel;

import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.FunctionSpace_AuthZ_Deployment.IAbstractGroupFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.FunctionSpace_Activity_Deployment.IActivityPermissionFunctions;
import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdInitializerAspect;

public class ActivityPermissionIdInitializerAspect extends BusinessObjectIdInitializerAspect<IActivityPermission> 
{
	public ActivityPermissionIdInitializerAspect()
	{
		super(IActivityPermission.class);
	}

	@Override
	protected List<IActivityPermission> selectRessources(IDynamicResourceRepository resourceRepository, IActivityPermission activityPermission) {
		final IActivityPermissionFunctions activityPermissionFunctions = activityPermission.extension(IActivityPermissionFunctions.class); 
		return activityPermissionFunctions.AllActivityPermissionInDomain();
	}

	@Override
	protected Integer getStartId(IActivityPermission activityPermission) {
		final IAbstractGroupFunctions abstractGroupFunctions = activityPermission.extension(IAbstractGroupFunctions.class);
		return abstractGroupFunctions.GetNetdomainId();
	}		
}
