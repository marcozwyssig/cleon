package cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel;

import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.CommunicationPackage;

public class SourceValidatorAspect implements IResourceValidationAspect {

	@Override
	public void validate(ValidationContext validationContext, List<IResourceInconsistency> validationList) {
		final ITypeSystem typeSystem = TypeSystem.create(validationContext.getReadJobExecutor());
		final IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		final ISource source = resourceRepository.getResource(ISource.class, validationContext.getResource());

		if (source.selectAccessAllowed().values().isEmpty()) {
			validationList.add(new PredicateInconsistency(validationContext.getPackage(), source.getResource(),
					CommunicationPackage.Source_accessAllowed, "at least one allowed connection is required"));			
		}

	}
}
