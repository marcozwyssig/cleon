package cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel;

import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.impl.AbstractAllInstancesRefactorerAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.IModifiable;
import cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage;
import cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement;

public class ChangeRequirementsAllToAlignedRefactoringAspect extends AbstractAllInstancesRefactorerAspect {

	public ChangeRequirementsAllToAlignedRefactoringAspect() {
		super("1.0", 2018, 11, 15, "Change all to 'aligned'", RequirementPackage.Requirement);
	}

	@Override
	protected void refactor(IModifiable executor, Package paramPackage, INode paramINode) {
		ITypeSystem typeSystem = TypeSystem.create(executor);
		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();

		IRequirement requirement = resourceRepository.getResource(IRequirement.class, paramINode);

		if (requirement.selectState().isIdentified()) {
			Update.createOrModifyStatement(executor, paramPackage, paramINode,
					RequirementPackage.Requirement_state, RequirementPackage.RequirementState_Aligned);
		}
	}
}