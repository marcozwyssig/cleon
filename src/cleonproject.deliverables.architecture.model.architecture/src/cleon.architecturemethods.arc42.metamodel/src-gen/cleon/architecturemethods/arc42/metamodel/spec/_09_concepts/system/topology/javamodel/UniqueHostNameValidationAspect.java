package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import ch.actifsource.util.log.Logger;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.FunctionSpace_Topology.IAbstractHostFunctions;
import cleon.common.resources.metamodel.spec.id.IdPackage;

public class UniqueHostNameValidationAspect implements IResourceValidationAspect {

	private static String getHostname( final IAbstractHost abstractHost ) {
		return Select.simpleName(abstractHost.getReadJobExecutor(), abstractHost.getResource());
	}
	
	@Override
	public void validate(final ValidationContext context, final List<IResourceInconsistency> inconsistencyList) {
		final var start = Instant.now();
		try {
			final var typeSystem = context.getTypeSystem();
			final var resourceRepository = typeSystem.getResourceRepository();
			final var abstractHost = resourceRepository.getResource(IAbstractHost.class, context.getResource());
			final var abstractHostFunctions = abstractHost.extension(IAbstractHostFunctions.class);
			final var allHosts = abstractHostFunctions.AllHosts();
			
			final var duplicateItems = allHosts.stream()
					.filter(x -> getHostname(x).equals(getHostname(abstractHost)))
					.collect(Collectors.toList());
			
			if (!duplicateItems.isEmpty() && duplicateItems.size() != 1) {
				final var errormessage = String.format("Hostname is not unique.");
				inconsistencyList.add(new PredicateInconsistency(context.getPackage(), context.getResource(),
						IdPackage.IntegerBusinessObjectId_identifier, errormessage));
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
