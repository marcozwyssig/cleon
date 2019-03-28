package cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._static.javamodel;

import java.util.List;

import cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage;
import cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._static.FunctionSpace_StaticTests.IStaticTestFunctions;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;

public class TestRejectValidationAspect implements IResourceValidationAspect {

	@Override
	public void validate(ValidationContext context,
			List<IResourceInconsistency> inconsistencyList) {
		ITypeSystem typeSystem = context.getTypeSystem();
		IDynamicResourceRepository resourceRepository = typeSystem
				.getResourceRepository();

		IStaticTest staticTest = resourceRepository.getResource(
				IStaticTest.class, context.getResource());
		
				
		boolean allTestArePassed = staticTest.extension(IStaticTestFunctions.class).AllTestArePassed();
		if(allTestArePassed)
		{		
			if( staticTest.selectRequirement().selectState().isRejected__F___N_QS__O_())
			{
				inconsistencyList.add(new PredicateInconsistency(staticTest.selectRequirement().getPackage(), staticTest.selectRequirement().getResource(), RequirementPackage.Requirement_state, "Rejected (QS) is not allowed, because all tests are passed"));				
			}
		}
		else
		{
			if( !staticTest.selectRequirement().selectState().isRejected__F___N_QS__O_())
			{
				inconsistencyList.add(new PredicateInconsistency(staticTest.selectRequirement().getPackage(), staticTest.selectRequirement().getResource(), RequirementPackage.Requirement_state, "Rejected (QS) must be set, because some tests have failed"));								
			}
		}	
	}
}
