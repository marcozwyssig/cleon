package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel;

import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.validation.ValidationContext;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.FunctionSpace_Activity_Deployment.IActivityPermissionFunctions;
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
		final IActivityPermission component = resourceRepository.getResource(IActivityPermission.class, context.getResource());
		final IActivityPermissionFunctions functions = component.extension(IActivityPermissionFunctions.class);
		return functions.AllActivityPermissionInDomain();
	}	

	@Override 
	protected Integer GetIdentifier( IActivityPermission activityPermission ) {
		return activityPermission.extension(IActivityPermissionFunctions.class).GetId();
	}
}