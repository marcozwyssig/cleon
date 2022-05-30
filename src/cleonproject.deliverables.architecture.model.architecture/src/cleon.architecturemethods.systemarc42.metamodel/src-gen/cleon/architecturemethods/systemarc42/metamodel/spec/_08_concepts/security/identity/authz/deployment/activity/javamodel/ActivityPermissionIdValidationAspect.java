package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel;

import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.validation.ValidationContext;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.FunctionSpace_Activity_Deployment.IActivityPermissionFunctions;
import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class ActivityPermissionIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<IActivityPermission>
{
	public ActivityPermissionIdValidationAspect()
	{
		super(IActivityPermission.class);
	}

	@Override
	protected List<IActivityPermission> getResources(IDynamicResourceRepository resourceRepository, ValidationContext context)
	{
		final var component = resourceRepository.getResource(IActivityPermission.class, context.getResource());
		final var functions = component.extension(IActivityPermissionFunctions.class);
		return functions.AllActivityPermissionInEnvironment();
	}

	@Override
	protected Integer GetIdentifier( IActivityPermission activityPermission ) {
		return activityPermission.selectUniqueId();
	}
}