package cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel;

import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.impl.AbstractAllInstancesRefactorerAspect;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.IModifiable;
import cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage;
import cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement;

public class ChangeRequirementsAllToApprovedRefactoringAspect extends AbstractAllInstancesRefactorerAspect {

	public ChangeRequirementsAllToApprovedRefactoringAspect() {
		super("1.0", 2019, 05, 24, "Change all to 'approved'", RequirementPackage.Requirement);
	}

	@Override
	protected void refactor(IModifiable executor, Package paramPackage, INode paramINode) {
		final var typeSystem = TypeSystem.create(executor);
		final var resourceRepository = typeSystem.getResourceRepository();

		final var requirement = resourceRepository.getResource(IRequirement.class, paramINode);

		if (requirement.selectState().isAligned() || requirement.selectState().isApproved__F___N_By__F_Supplier__O_()) {
			Update.createOrModifyStatement(executor, paramPackage, paramINode, RequirementPackage.Requirement_state,
					RequirementPackage.RequirementState_Approved);
		}
	}
}