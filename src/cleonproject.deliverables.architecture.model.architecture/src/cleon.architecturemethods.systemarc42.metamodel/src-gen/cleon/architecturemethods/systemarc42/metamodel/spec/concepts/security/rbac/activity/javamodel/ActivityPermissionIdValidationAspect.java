package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.activity.javamodel;

import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.validation.ValidationContext;
import cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.activity.FunctionSpace_Activity.IActivityPermissionFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.role.FunctionSpace_Role.IRoleSystemComponentFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.role.javamodel.IRoleSystemComponent;
import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class ActivityPermissionIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<IActivityPermission> 
{
	public ActivityPermissionIdValidationAspect()
	{
		super(IActivityPermission.class);
	}
	
	protected List<IActivityPermission> getResources(IDynamicResourceRepository resourceRepository, ValidationContext context) 
	{
		IActivityPermission component = resourceRepository.getResource(IActivityPermission.class, context.getResource());
		IActivityPermissionFunctions functions = component.extension(IActivityPermissionFunctions.class);
		return functions.AllActivityPermissionInDomain();
	}	
}