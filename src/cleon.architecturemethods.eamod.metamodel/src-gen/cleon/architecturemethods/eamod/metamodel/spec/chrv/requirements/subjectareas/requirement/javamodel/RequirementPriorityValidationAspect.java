package cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel;

import java.util.List;

import cleon.common.resources.metamodel.spec.priority.PriorityPackage;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;

public class RequirementPriorityValidationAspect implements IResourceValidationAspect {

	@Override
	public void validate(ValidationContext context,
			List<IResourceInconsistency> inconsistencyList) {
		ITypeSystem typeSystem = context.getTypeSystem();
		IDynamicResourceRepository resourceRepository = typeSystem
				.getResourceRepository();

		IRequirement requirement = resourceRepository.getResource(
				IRequirement.class, context.getResource());

		IsParentPriorityValid(requirement, Requirement.selectToMeAggregates(requirement), context, inconsistencyList);

	}

	private void IsParentPriorityValid
		( IRequirement current, 
		  IRequirement parentRequirement, 
		  ValidationContext context,		  
		  List<IResourceInconsistency> inconsistencyList) {
		
		if( parentRequirement == null)
			return;
		
		if (current.selectPriority().isMust__F_have())
		{
			if(!parentRequirement.selectPriority().isMust__F_have())
			{
				inconsistencyList.add(new PredicateInconsistency(context
						.getPackage(), context.getResource(),
						PriorityPackage.PriorityAware_priority, "Priority is not valid, because parent priority is not 'MustHave'"));				
			}
		}
		
		if( current.selectPriority().isShould__F_have())
		{
			if(parentRequirement.selectPriority().isWon__M_t__F_have() ||
			   parentRequirement.selectPriority().isNice__F_to__F_have())
			{
				inconsistencyList.add(new PredicateInconsistency(context
						.getPackage(), context.getResource(),
						PriorityPackage.PriorityAware_priority, "Priority is not valid, because parent priority is 'WontHave' or 'NiceToHave'"));								
			}			
		}
		
		if( current.selectPriority().isNice__F_to__F_have())
		{
			if(parentRequirement.selectPriority().isWon__M_t__F_have())
			{
				inconsistencyList.add(new PredicateInconsistency(context
						.getPackage(), context.getResource(),
						PriorityPackage.PriorityAware_priority, "Priority is not valid, because parent priority is 'WontHave'"));				
				
			}			
		}		
	}
}
