package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authn.javamodel;

import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authn.AuthnPackage;

public class RealmForDependentSysCfgValidation implements IResourceValidationAspect {

	@Override
	public void validate(ValidationContext validationContext, List<IResourceInconsistency> inconsistencyList) {
		final ITypeSystem typeSystem = validationContext.getTypeSystem();
		final IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();	
		final IRealmUsageForDependentSystemConfiguration directoryServiceForSystemConfiguration = resourceRepository.getResource(IRealmUsageForDependentSystemConfiguration.class, validationContext.getResource());
		if( directoryServiceForSystemConfiguration.selectUsage().isEmpty()) {
			inconsistencyList.add(new PredicateInconsistency(validationContext.getPackage(), validationContext.getResource(),
					AuthnPackage.RealmUsageForDependentSystemConfiguration_usage, "at least one usage needs to be specfied"));
		}
	}
}
