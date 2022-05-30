package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel;

import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.FunctionSpace_AuthZ_Deployment.IAbstractGroupFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.FunctionSpace_Activity_Deployment.IActivityPermissionFunctions;
import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdInitializerAspect;

public class ActivityPermissionIdInitializerAspect extends BusinessObjectIdInitializerAspect<IActivityPermission>
{
	public ActivityPermissionIdInitializerAspect()
	{
		super(IActivityPermission.class);
	}

	@Override
	protected List<IActivityPermission> selectRessources(IDynamicResourceRepository resourceRepository, IActivityPermission activityPermission) {
		final var activityPermissionFunctions = activityPermission.extension(IActivityPermissionFunctions.class);
		return activityPermissionFunctions.AllActivityPermissionInEnvironment();
	}

	@Override
	protected Integer getStartId(IActivityPermission activityPermission) {
		final var abstractGroupFunctions = activityPermission.extension(IAbstractGroupFunctions.class);
		return abstractGroupFunctions.GetSiteId();
	}
}
