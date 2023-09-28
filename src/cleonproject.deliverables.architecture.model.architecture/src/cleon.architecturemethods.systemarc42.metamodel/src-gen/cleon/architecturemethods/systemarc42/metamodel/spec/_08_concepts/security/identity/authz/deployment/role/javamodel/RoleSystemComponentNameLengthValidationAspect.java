package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import ch.actifsource.util.log.Logger;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.RolePackage;

public class RoleSystemComponentNameLengthValidationAspect implements IResourceValidationAspect
{
	private final int MAX_LENGTH_AD_GROUP = 64;

	@Override
	public void validate(ValidationContext context, List<IResourceInconsistency> inconsistencyList) {
		final var start = Instant.now();
		try {			
			final var name = Select.simpleName(context.getReadJobExecutor(), context.getResource());
		    if (name.length() > MAX_LENGTH_AD_GROUP) {
		        final var errormessage = "Name of role system component should not exceed a length of " + MAX_LENGTH_AD_GROUP;
		        inconsistencyList.add(new PredicateInconsistency(context.getPackage(), context.getResource(), RolePackage.RoleSystemComponent, errormessage));
		    }
		} finally {
		    final var finish = Instant.now();
		    final var timeElapsed = Duration.between(start, finish).toMillis();
		    final var threshold = 100;
		    if (timeElapsed > threshold) {
		        Logger.instance().logInfo(String.format("Validation time for %s took %d ms", this.getClass().getSimpleName(), timeElapsed));
		    }
		}
	}
}