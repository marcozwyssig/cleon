package cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel;

import java.util.List;

import cleon.sda.spec.SpecPackage;
import cleon.sda.spec.requirementsmanagement.requirements.RequirementsPackage;
import cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage;
import ch.actifsource.core.Statement;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import ch.actifsource.core.validation.inconsistency.SingleResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.SingleStatementInconsistency;
import ch.actifsource.core.validation.inconsistency.ValidationExceptionInconsistency;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;

public class RequirementRejectAspect implements IResourceValidationAspect {

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

	private boolean isRejected(IState state) {
		return state.isRejected__F___N_Beistellung__O_()
				|| state.isRejected__F___N_Out__S_Of__S_Scope__O_()
				|| state.isRejected__F___N_QS__O_();
	}
}
