package cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel;

import java.util.List;

import cleon.architecturemethods.eamod.spec.eamod.chrv.issues.javamodel.IIssue;
import cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;

public class RequirementAlignedValidationAspect implements
		IResourceValidationAspect {

	@Override
	public void validate(ValidationContext context,
			List<IResourceInconsistency> inconsistencyList) {
		ITypeSystem typeSystem = context.getTypeSystem();
		IDynamicResourceRepository resourceRepository = typeSystem
				.getResourceRepository();

		IRequirement requirement = resourceRepository.getResource(
				IRequirement.class, context.getResource());
		if (IsAlignedAndAbove(requirement.selectState())
				&& IsIssueOpen(requirement)) {
			inconsistencyList.add(new PredicateInconsistency(context
					.getPackage(), context.getResource(),
					RequirementPackage.Requirement_state,
					"State is not allowed, because there are open issues"));
		}

	}

	private boolean IsIssueOpen(IRequirement requirement) {
		if (requirement.selectIssues() == null) {
			return false;
		}

		for (IIssue issue : requirement.selectIssues()) {
			if (!issue.selectState().isDone()) {
				return true;
			}
		}
		return false;
	}

	private boolean IsAlignedAndAbove(IRequirementState state) {
		return state.isAligned() || state.isApproved()
				|| state.isApproved__F___N_By__F_Supplier__O_()
				|| state.isFulfilled() || state.isImplemented();
	}
}
