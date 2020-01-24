package cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel;

import java.util.List;

import cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel.IIssue;
import cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;

public class RequirementStateValidation implements IResourceValidationAspect {

	@Override
	public void validate(ValidationContext context, List<IResourceInconsistency> inconsistencyList) {
		ITypeSystem typeSystem = context.getTypeSystem();
		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();

		IRequirement requirement = resourceRepository.getResource(IRequirement.class, context.getResource());

		if (requirement.selectState().isFulfilled()) {
			if (!(validateFulfillState(requirement))) {
				inconsistencyList.add(new PredicateInconsistency(context.getPackage(), context.getResource(),
						RequirementPackage.Requirement_state,
						"State is not allowed, because the concretized requirements are in not valid state"));
			}
		}
	}

	private boolean validateFulfillState(IRequirement requirement) {
		List<? extends IRequirement> concretizes = requirement.selectConcretizes();
		if( concretizes.isEmpty() ) {
			return true;
		}
		return concretizes.stream().allMatch(x -> x.selectState().isFulfilled() || x.selectState().isRejected() || x.selectState().isRejected__F___N_QS__O_());
	}
}
