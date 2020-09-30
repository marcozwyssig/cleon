package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.role.javamodel;

import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.validation.ValidationContext;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.role.FunctionSpace_Role.IRoleSystemComponentFunctions;
import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class RoleSystemComponentIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<IRoleSystemComponent> {
	public RoleSystemComponentIdValidationAspect()
	{
		super(IRoleSystemComponent.class);
	}

	@Override
	protected List<IRoleSystemComponent> getResources(final IDynamicResourceRepository resourceRepository, final ValidationContext context) 
	{
		final IRoleSystemComponent component = resourceRepository.getResource(IRoleSystemComponent.class, context.getResource());
		final IRoleSystemComponentFunctions functions = component.extension(IRoleSystemComponentFunctions.class);
		return functions.AllRoleSystemComponentInDomain();
	}		
}