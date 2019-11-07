package cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel;

import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.validation.ValidationContext;
import cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.FunctionSpace_Role.IRoleSystemComponentFunctions;
import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class RoleSystemComponentIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<IRoleSystemComponent> {
	public RoleSystemComponentIdValidationAspect()
	{
		super(IRoleSystemComponent.class);
	}
	
	protected List<IRoleSystemComponent> getResources(IDynamicResourceRepository resourceRepository, ValidationContext context) 
	{
		IRoleSystemComponent component = resourceRepository.getResource(IRoleSystemComponent.class, context.getResource());
		IRoleSystemComponentFunctions functions = component.extension(IRoleSystemComponentFunctions.class);
		return functions.AllRoleSystemComponentInDomain();
	}
		
}