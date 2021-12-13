package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel;

import java.util.List;

import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.RolePackage;

public class RoleSystemComponentConsistentExcludeActivities implements IResourceValidationAspect 
{
	@Override
	public void validate(ValidationContext context, List<IResourceInconsistency> inconsistencyList) {
		final var typeSystem = context.getTypeSystem();
		final var resourceRepository = typeSystem.getResourceRepository();
		final var roleSystemComponent = resourceRepository.getResource(IRoleSystemComponent.class,
				context.getResource());
		
		var roles = RoleSystemComponent.selectToMeSystemComponentRoleTemplate(roleSystemComponent.selectSystemComponentRoleTemplate());
		var countExcludeActivities = roleSystemComponent.selectExcludeActivities().size();
		roles.forEach( x -> {
			if (x.selectExcludeActivities().size() != countExcludeActivities ) {
				final String errormessage = String.format(
						"The size of the excluded activities is not the same");
				inconsistencyList.add(new PredicateInconsistency(context.getPackage(), context.getResource(),
						RolePackage.RoleSystemComponent, errormessage));				
			}
		});
	}
}