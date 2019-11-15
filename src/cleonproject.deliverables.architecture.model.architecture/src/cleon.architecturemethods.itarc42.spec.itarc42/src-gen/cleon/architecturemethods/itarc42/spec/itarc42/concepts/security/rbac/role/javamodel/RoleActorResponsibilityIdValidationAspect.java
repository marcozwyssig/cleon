package cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel;

import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.validation.ValidationContext;
import cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.FunctionSpace_Role.IRoleActorResponsibilityFunctions;
import cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.FunctionSpace_Role.IRoleSystemComponentFunctions;
import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class RoleActorResponsibilityIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<IRoleActorResponsibility> {
	public RoleActorResponsibilityIdValidationAspect()
	{
		super(IRoleActorResponsibility.class);
	}
	
	protected List<IRoleActorResponsibility> getResources(IDynamicResourceRepository resourceRepository, ValidationContext context) 
	{
		IRoleActorResponsibility component = resourceRepository.getResource(IRoleActorResponsibility.class, context.getResource());
		IRoleActorResponsibilityFunctions functions = component.extension(IRoleActorResponsibilityFunctions.class);
		return functions.AllRoleActorResponsibilityInDomain();
	}
		
}