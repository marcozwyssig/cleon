package cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.javamodel;

import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.FunctionSpace_Requirements.IRequirementFunctions;
import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdInitializerAspect;

public class RequirementInitializerAspect extends BusinessObjectIdInitializerAspect<IRequirement> 
{
	public RequirementInitializerAspect()
	{
		super(IRequirement.class);
	}
	
	@Override
	protected List<IRequirement> selectRessources(final IDynamicResourceRepository resourceRepository, final IRequirement newInstance) {
		return newInstance.extension(IRequirementFunctions.class).AllRequirements();

	}

}