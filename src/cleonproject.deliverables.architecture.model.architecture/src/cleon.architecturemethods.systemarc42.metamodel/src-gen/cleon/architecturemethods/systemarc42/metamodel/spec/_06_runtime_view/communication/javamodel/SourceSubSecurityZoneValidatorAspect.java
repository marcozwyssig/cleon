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
import cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.FunctionSpace_Communication.ISourceSubSecurityZoneFunctions;

public class SourceSubSecurityZoneValidatorAspect implements IResourceValidationAspect {

	@Override
	public void validate(ValidationContext validationContext, List<IResourceInconsistency> validationList) {
		final ITypeSystem typeSystem = TypeSystem.create(validationContext.getReadJobExecutor());
		final IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		final ISourceSubSecurityZone sourceSubSecurityZone = resourceRepository.getResource(ISourceSubSecurityZone.class, validationContext.getResource());
		final ISourceSubSecurityZoneFunctions sourceSubSecurityZoneFunctions = sourceSubSecurityZone.extension(ISourceSubSecurityZoneFunctions.class);

		if (sourceSubSecurityZoneFunctions.IsAny()) {
			if( sourceSubSecurityZone.selectThreatMitigations().isEmpty()) {
				validationList.add(new PredicateInconsistency(validationContext.getPackage(), sourceSubSecurityZone.getResource(),
						CommunicationPackage.SourceSubSecurityZone_threatMitigations, "on any connection there is at least one threat mitigation required"));
			}
		}		
	}
}
