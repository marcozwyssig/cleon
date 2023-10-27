package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.javamodel;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import ch.actifsource.util.log.Logger;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.AuthnPackage;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authn.javamodel.IRealmConnection;

public class RealmForDependentSysCfgValidation implements IResourceValidationAspect {

	@Override
	public void validate(ValidationContext validationContext, List<IResourceInconsistency> inconsistencyList) {
		final var start = Instant.now();
		try {

			final var typeSystem = validationContext.getTypeSystem();
			final var resourceRepository = typeSystem.getResourceRepository();
			final var directoryServiceForSystemConfiguration = resourceRepository.getResource(IRealmConnection.class, validationContext.getResource());
			if( directoryServiceForSystemConfiguration.selectUsage().isEmpty()) {
				inconsistencyList.add(new PredicateInconsistency(validationContext.getPackage(), validationContext.getResource(),
						AuthnPackage.RealmConnection_usage, "at least one usage needs to be specfied"));
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
