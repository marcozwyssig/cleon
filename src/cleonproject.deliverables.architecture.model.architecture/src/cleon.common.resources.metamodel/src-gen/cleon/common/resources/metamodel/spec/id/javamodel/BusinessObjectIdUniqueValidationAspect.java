package cleon.common.resources.metamodel.spec.id.javamodel;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import ch.actifsource.util.log.Logger;
import cleon.common.resources.metamodel.spec.id.IdPackage;

public class BusinessObjectIdUniqueValidationAspect<T extends IIntegerBusinessObjectId> implements IResourceValidationAspect {

	private IDynamicResourceRepository resourceRepository;

	private final Class<T> _classInstance;

	protected BusinessObjectIdUniqueValidationAspect(final Class<T> classInstance) {
		_classInstance = classInstance;
	}

	protected List<T> getResources(final IDynamicResourceRepository resourceRepository, final ValidationContext context)
	{
		return resourceRepository.getAllResources(_classInstance);
	}


	protected T getObject( final IDynamicResourceRepository resourceRepository, final ValidationContext context)
	{
		return resourceRepository.getResource(_classInstance, context.getResource());
	}

	protected Integer GetIdentifier( T businessObjectId ) {
		if( businessObjectId != null ) {
			return businessObjectId.selectIdentifier();
		}
		return -1;
	}

	@Override
	public void validate(final ValidationContext context, final List<IResourceInconsistency> inconsistencyList) {
		final var start = Instant.now();
		try {
			final var typeSystem = context.getTypeSystem();
			resourceRepository = typeSystem.getResourceRepository();

			final var resources = getResources(resourceRepository, context);
			final var businessObjectId = getObject(resourceRepository, context);

			final var duplicateItems = resources.stream()
					.filter(x -> GetIdentifier(x).equals(GetIdentifier(businessObjectId)))
					.collect(Collectors.toList());

			if (!duplicateItems.isEmpty() && duplicateItems.size() != 1) {
				final var name = Select.simpleName(context.getReadJobExecutor(), businessObjectId.getResource());
				final var errormessage = String.format("Resource %1$s with id %2$d is not unique", name,
						GetIdentifier(businessObjectId));
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
