package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel;

import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.FunctionSpace_AuthZ_Deployment.IAbstractGroupFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.FunctionSpace_AuthZ_Deployment.IEnvironmentRBACFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.javamodel.IEnvironmentRBAC;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.FunctionSpace_Role.IRoleSystemComponentFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.RolePackage;

public class RoleSystemComponentIdenticalIdLikeMasterValidationAspect implements IResourceValidationAspect {
	@Override
	public void validate(final ValidationContext context, final List<IResourceInconsistency> inconsistencyList) {
		final ITypeSystem typeSystem = context.getTypeSystem();
		final IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		final IRoleSystemComponent roleSystemComponent = resourceRepository.getResource(IRoleSystemComponent.class,
				context.getResource());
		final IAbstractGroupFunctions abstractGroupFunctions = roleSystemComponent.extension(IAbstractGroupFunctions.class);
		final IRoleSystemComponentFunctions roleSystemComponentFunctions = roleSystemComponent
				.extension(IRoleSystemComponentFunctions.class);
		final IEnvironmentRBAC master = abstractGroupFunctions.GetRBAC().selectMaster();
		if (master == null) {
			return;
		}

		final IEnvironmentRBACFunctions environmentRBACFunctions = master.extension(IEnvironmentRBACFunctions.class);
		final IRoleSystemComponent masterRoleSystemComponent = environmentRBACFunctions.GetRoleSystemComponent(
				roleSystemComponentFunctions.Site().selectSite(),
				roleSystemComponentFunctions.Actor().selectActor(),
				roleSystemComponentFunctions.Responsibility().selectResponsibility(),
				roleSystemComponent.selectSystemComponentRoleTemplate().selectSystemComponent());
		
		if (!roleSystemComponent.extension(IRoleSystemComponentFunctions.class).GetId().equals(masterRoleSystemComponent.extension(IRoleSystemComponentFunctions.class).GetId())) {
			final String errormessage = String.format(
					"Id of role system component is different than the master (%1$d != %2$d)",
					roleSystemComponent.extension(IRoleSystemComponentFunctions.class).GetId(), masterRoleSystemComponent.extension(IRoleSystemComponentFunctions.class).GetId());
			inconsistencyList.add(new PredicateInconsistency(context.getPackage(), context.getResource(),
					RolePackage.RoleSystemComponent, errormessage));
		}
	}
}