package cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel;

import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.impl.AbstractAllInstancesRefactorerAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.IModifiable;
import cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage;
import cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement;

public class ChangeRequirementsAllToImplementedRefactoringAspect extends AbstractAllInstancesRefactorerAspect {

	public ChangeRequirementsAllToImplementedRefactoringAspect() {
		super("1.0", 2019, 5, 24, "Change all to 'implemented'", RequirementPackage.Requirement);
	}

	@Override
	protected void refactor(IModifiable executor, Package paramPackage, INode paramINode) {
		ITypeSystem typeSystem = TypeSystem.create(executor);
		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();

		IRequirement requirement = resourceRepository.getResource(IRequirement.class, paramINode);

		if (requirement.selectState().isApproved()) {
			Update.createOrModifyStatement(executor, paramPackage, paramINode,
					RequirementPackage.Requirement_state, RequirementPackage.RequirementState_Approved);
		}
	}
}