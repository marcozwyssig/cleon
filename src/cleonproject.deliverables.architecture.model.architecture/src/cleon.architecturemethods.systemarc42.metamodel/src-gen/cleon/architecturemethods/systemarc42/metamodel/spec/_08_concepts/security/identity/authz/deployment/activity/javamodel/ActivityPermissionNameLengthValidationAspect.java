package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel;

import java.util.List;

import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.ActivityPackage;

public class ActivityPermissionNameLengthValidationAspect implements IResourceValidationAspect 
{
	private final int MAX_LENGTH_AD_GROUP = 64;

	@Override
	public void validate(ValidationContext context, List<IResourceInconsistency> inconsistencyList) {
		final String name = Select.simpleName(context.getReadJobExecutor(), context.getResource());
		if (name.length() > MAX_LENGTH_AD_GROUP) {
			final String errormessage = String.format("Name of activity permission should not exceed a length of %1$d", MAX_LENGTH_AD_GROUP);
			inconsistencyList.add(new PredicateInconsistency(context.getPackage(), context.getResource(), ActivityPackage.ActivityPermission, errormessage));
		}
	}	
}