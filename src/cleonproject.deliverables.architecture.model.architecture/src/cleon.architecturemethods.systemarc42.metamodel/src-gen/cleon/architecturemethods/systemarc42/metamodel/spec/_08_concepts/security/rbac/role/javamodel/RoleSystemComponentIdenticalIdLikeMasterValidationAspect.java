package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel;

import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.FunctionSpace_RBAC.IAbstractGroupFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.FunctionSpace_RBAC.IEnvironmentRBACFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IEnvironmentRBAC;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.FunctionSpace_Role.IRoleSystemComponentFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.RolePackage;

public class RoleSystemComponentIdenticalIdLikeMasterValidationAspect implements IResourceValidationAspect {
	@Override
	public void validate(ValidationContext context, List<IResourceInconsistency> inconsistencyList) {
		ITypeSystem typeSystem = context.getTypeSystem();
		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		IRoleSystemComponent roleSystemComponent = resourceRepository.getResource(IRoleSystemComponent.class,
				context.getResource());
		IAbstractGroupFunctions abstractGroupFunctions = roleSystemComponent.extension(IAbstractGroupFunctions.class);
		IRoleSystemComponentFunctions roleSystemComponentFunctions = roleSystemComponent
				.extension(IRoleSystemComponentFunctions.class);
		IEnvironmentRBAC master = abstractGroupFunctions.GetRBAC().selectMaster();
		if (master == null) {
			return;
		}
		
		IEnvironmentRBACFunctions environmentRBACFunctions = master.extension(IEnvironmentRBACFunctions.class);

		IRoleSystemComponent masterRoleSystemComponent = environmentRBACFunctions.GetRoleSystemComponent(
				roleSystemComponentFunctions.Site().selectNetdomain(),
				roleSystemComponentFunctions.Actor().selectActor(),
				roleSystemComponentFunctions.Responsibility().selectResponsibility(),
				roleSystemComponent.selectSystemComponent());
		if (!(roleSystemComponent.selectIdentifier().equals(masterRoleSystemComponent.selectIdentifier()))) {
			String errormessage = String.format(
					"Id of role system component is different than the master (%1$d != %2$d)",
					roleSystemComponent.selectIdentifier(), masterRoleSystemComponent.selectIdentifier());
			inconsistencyList.add(new PredicateInconsistency(context.getPackage(), context.getResource(),
					RolePackage.RoleSystemComponent, errormessage));
		}
	}
}