package cleon.conception.architecture.spec.eamod.chrv.motivation.sources.javamodel;

import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency.NodeRole;
import ch.actifsource.core.validation.inconsistency.SingleResourceInconsistency;
import cleon.conception.architecture.spec.eamod.chrv.motivation.sources.FunctionSpace_Source.ISourceFunctions;

public class SourceIsUsedValidationAspect implements IResourceValidationAspect
{
	
	@Override
	public void validate(ValidationContext context, List<IResourceInconsistency> inconsistencyList) {
		ITypeSystem typeSystem = context.getTypeSystem();
		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();

		ISource source = resourceRepository.getResource(ISource.class, context.getResource());
		List<ISourceAware> sourceAwares = source.extension(ISourceFunctions.class).GetAllUsedSourceAware();
		if (sourceAwares.isEmpty()) {
			String name = Select.simpleName(context.getReadJobExecutor(), context.getResource());
			String errormessage = String.format("Resource %1$s with id %2$d is not used in any other objects (like requirements, driver, etc.)", name,
					source.selectIdentifier());
			inconsistencyList.add(new SingleResourceInconsistency(context.getPackage(), context.getResource(), NodeRole.Subject, errormessage));
		}

	}
	
}