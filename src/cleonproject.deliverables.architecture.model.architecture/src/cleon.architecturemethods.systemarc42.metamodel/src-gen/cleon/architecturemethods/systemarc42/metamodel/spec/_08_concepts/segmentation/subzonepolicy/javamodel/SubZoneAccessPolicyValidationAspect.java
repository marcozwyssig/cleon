package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.javamodel;

import ch.actifsource.core.Statement;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.SingleStatementInconsistency;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.FunctionSpace_SubzonePolicy.ISubZoneAccessPolicyFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.SubzonepolicyPackage;

import java.util.List;

public class SubZoneAccessPolicyValidationAspect  implements IResourceValidationAspect {
	@Override
	public void validate(ValidationContext validationContext, List<IResourceInconsistency> validationList) {
		final ITypeSystem typeSystem = TypeSystem.create(validationContext.getReadJobExecutor());
		final IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		final ISubZoneAccessPolicy subZoneAccessPolicy = resourceRepository.getResource(ISubZoneAccessPolicy.class, validationContext.getResource());
		final ISourceSubZone sourceSubZone = SourceSubZone.selectToMeDestinationSubZonePolicy(subZoneAccessPolicy);

		final ISubZoneAccessPolicyFunctions functions = subZoneAccessPolicy.extension(ISubZoneAccessPolicyFunctions.class);
		if( sourceSubZone.selectSourceSecuritySubZone().equals(subZoneAccessPolicy.selectPolicyForDestinationSecuritySubZone())) {
			return;
		}

		if( !functions.HasSources() ) {

			final Statement targetSubZone = Select.relationStatementOrNull(validationContext.getReadJobExecutor(), SubzonepolicyPackage.SourceSubZone_destinationSubZonePolicy, SourceSubZone.selectToMeDestinationSubZonePolicy(subZoneAccessPolicy).getResource());
			validationList.add(new SingleStatementInconsistency(targetSubZone, String.format("no communication to this subzone")));
		}

	}	

}
