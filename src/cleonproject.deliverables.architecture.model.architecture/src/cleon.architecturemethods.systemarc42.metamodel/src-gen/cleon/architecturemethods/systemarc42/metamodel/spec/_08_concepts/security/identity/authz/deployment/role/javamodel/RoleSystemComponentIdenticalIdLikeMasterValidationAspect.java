package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.util.log.Logger;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.FunctionSpace_AuthZ_Deployment.IAbstractGroupFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.FunctionSpace_Role.IRoleSystemComponentFunctions;

public class RoleSystemComponentIdenticalIdLikeMasterValidationAspect implements IResourceValidationAspect {
	@Override
	public void validate(final ValidationContext context, final List<IResourceInconsistency> inconsistencyList) {
		final var start = Instant.now();
		try {

			final var typeSystem = context.getTypeSystem();
			final var resourceRepository = typeSystem.getResourceRepository();
			final var roleSystemComponent = resourceRepository.getResource(IRoleSystemComponent.class,
					context.getResource());
			final var abstractGroupFunctions = roleSystemComponent.extension(IAbstractGroupFunctions.class);
			final var roleSystemComponentFunctions = roleSystemComponent
					.extension(IRoleSystemComponentFunctions.class);
			final var master = abstractGroupFunctions.GetRBAC().selectMaster();
			if (master != null) {
				//				final var environmentRBACFunctions = master.extension(IEnvironmentRBACFunctions.class);
				//				final var masterRoleSystemComponent = environmentRBACFunctions.GetRoleSystemComponent(
				//						roleSystemComponentFunctions.SiteGroup().selectSite(),
				//						roleSystemComponentFunctions.Actor().selectActor(),
				//						roleSystemComponentFunctions.Responsibility().selectResponsibility(),
				//						roleSystemComponent.selectSystemComponentRoleTemplate().selectSystemComponent());
				//
				//				if (!roleSystemComponent.extension(IRoleSystemComponentFunctions.class).GetId().equals(masterRoleSystemComponent.extension(IRoleSystemComponentFunctions.class).GetId())) {
				//					final var errormessage = String.format(
				//							"Id of role system component is different than the master (%1$d != %2$d)",
				//							roleSystemComponent.extension(IRoleSystemComponentFunctions.class).GetId(), masterRoleSystemComponent.extension(IRoleSystemComponentFunctions.class).GetId());
				//					inconsistencyList.add(new PredicateInconsistency(context.getPackage(), context.getResource(),
				//							RolePackage.RoleSystemComponent, errormessage));
				//				}
			}


		} finally {
			final var finish = Instant.now();
			final var timeElapsed = Duration.between(start, finish).toMillis();
			if( timeElapsed > 100 ) {
				Logger.instance().logInfo(String.format("Validation time for %s took %d ms", this.getClass().getSimpleName(), timeElapsed));
			}

		}
	}
}