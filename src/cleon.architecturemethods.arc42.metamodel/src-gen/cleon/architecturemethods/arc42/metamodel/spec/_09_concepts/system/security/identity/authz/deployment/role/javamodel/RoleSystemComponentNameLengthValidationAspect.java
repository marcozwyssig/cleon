package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import ch.actifsource.util.log.Logger;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.RolePackage;

public class RoleSystemComponentNameLengthValidationAspect implements IResourceValidationAspect {

    private static final int MAX_LENGTH_AD_GROUP = 64;
    private static final int LOG_THRESHOLD_MS = 100; // Configurable threshold

    @Override
    public void validate(ValidationContext context, List<IResourceInconsistency> inconsistencyList) {
        final var start = Instant.now();
        try {
            final var name = Select.simpleName(context.getReadJobExecutor(), context.getResource());
            if (name.length() > MAX_LENGTH_AD_GROUP) {
                inconsistencyList.add(new PredicateInconsistency(
                        context.getPackage(), 
                        context.getResource(), 
                        RolePackage.RoleSystemComponent, 
                        String.format("Name of role system component should not exceed a length of %d", MAX_LENGTH_AD_GROUP)));
            }
        } finally {
            final var timeElapsed = Duration.between(start, Instant.now()).toMillis();
            if (timeElapsed > LOG_THRESHOLD_MS) {
                Logger.instance().logInfo(
                    String.format("Validation time for %s took %d ms", 
                        this.getClass().getSimpleName(), 
                        timeElapsed));
            }
        }
    }
}