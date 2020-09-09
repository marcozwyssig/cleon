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
import cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.FunctionSpace_Communication.ISourceInSubSecurityZoneFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.domain.javamodel.IGlobalDomain;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.javamodel.IIntraSubZoneAccessPolicy;

public class SourceSubSecurityZoneValidatorAspect implements IResourceValidationAspect {

	@Override
	public void validate(ValidationContext validationContext, List<IResourceInconsistency> validationList) {
		final ITypeSystem typeSystem = TypeSystem.create(validationContext.getReadJobExecutor());
		final IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		final ISourceInSubSecurityZone sourceSubSecurityZone = resourceRepository.getResource(ISourceInSubSecurityZone.class, validationContext.getResource());
		final ISourceInSubSecurityZoneFunctions sourceSubSecurityZoneFunctions = sourceSubSecurityZone.extension(ISourceInSubSecurityZoneFunctions.class);

		if (sourceSubSecurityZoneFunctions.IsAny()) {
			if( sourceSubSecurityZone.selectThreatMitigations().isEmpty()) {
				validationList.add(new PredicateInconsistency(validationContext.getPackage(), sourceSubSecurityZone.getResource(),
						CommunicationPackage.SourceInSubSecurityZone_threatMitigations, "on any connection there is at least one threat mitigation required"));
			}
		}	

		final boolean isIntra = sourceSubSecurityZone.selectSubZoneAccessPolicy() instanceof IIntraSubZoneAccessPolicy;
		if( isIntra ) {
			if( sourceSubSecurityZone.selectUsedInDomains().stream().anyMatch(x -> x instanceof IGlobalDomain ) ) {
				validationList.add(new PredicateInconsistency(validationContext.getPackage(), sourceSubSecurityZone.getResource(),
						CommunicationPackage.SourceInSubSecurityZone_usedInDomains, "some of the domain(s) are not allowed on a intra connection"));				
			}
		}
	}
}
