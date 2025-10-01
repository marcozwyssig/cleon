package cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.javamodel;

import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.validation.ValidationContext;
import cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.FunctionSpace_Requirements.IRequirementFunctions;
import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class RequirementIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<IRequirement> 
{
	public RequirementIdValidationAspect()
	{
		super(IRequirement.class);
	}
	
	@Override
	protected List<IRequirement> getResources(final IDynamicResourceRepository resourceRepository, final ValidationContext context) {
		final var resource = resourceRepository.getResource(IRequirement.class, context.getResource());
		return resource.extension(IRequirementFunctions.class).AllRequirements();
	}
}