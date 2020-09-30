package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.role.javamodel;

import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.validation.ValidationContext;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.role.FunctionSpace_Role.IRoleActorResponsibilityFunctions;
import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class RoleActorResponsibilityIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<IRoleActorResponsibility> {
	public RoleActorResponsibilityIdValidationAspect()
	{
		super(IRoleActorResponsibility.class);
	}

	@Override
	protected List<IRoleActorResponsibility> getResources(IDynamicResourceRepository resourceRepository, ValidationContext context) 
	{
		final IRoleActorResponsibility component = resourceRepository.getResource(IRoleActorResponsibility.class, context.getResource());
		final IRoleActorResponsibilityFunctions functions = component.extension(IRoleActorResponsibilityFunctions.class);
		return functions.AllRoleActorResponsibilityInDomain();
	}

}