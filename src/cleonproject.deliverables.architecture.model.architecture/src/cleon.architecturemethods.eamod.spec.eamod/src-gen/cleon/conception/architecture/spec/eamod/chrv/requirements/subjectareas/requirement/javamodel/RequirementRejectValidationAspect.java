package cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel;

import java.util.List;

import cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;

public class RequirementRejectValidationAspect implements IResourceValidationAspect {

	@Override
	public void validate(ValidationContext context,
			List<IResourceInconsistency> inconsistencyList) {
		ITypeSystem typeSystem = context.getTypeSystem();
		IDynamicResourceRepository resourceRepository = typeSystem
				.getResourceRepository();

		IRequirement requirement = resourceRepository.getResource(
				IRequirement.class, context.getResource());
		if (isRejected(requirement.selectState())
				&& IsRejectReasonEmpty(requirement)) {
			inconsistencyList.add(new PredicateInconsistency(context
					.getPackage(), context.getResource(),
					RequirementPackage.Requirement_rejectReason, "Empty 'RejectReason' not allowed"));
		}
		
		if(!isRejected(requirement.selectState()) && !IsRejectReasonEmpty(requirement))
		{
			inconsistencyList.add(new PredicateInconsistency(context
					.getPackage(), context.getResource(),
					RequirementPackage.Requirement_rejectReason, "'RejectReason' for not rejected states is not allowed"));
			
		}
	}

	private boolean IsRejectReasonEmpty(IRequirement requirement) {
		if (requirement.selectRejectReason() == null) {
			return true;
		}
		return requirement.selectRejectReason().isEmpty();
	}

	private boolean isRejected(IRequirementState state) {
		return state.isRejected(); 
	}
}
