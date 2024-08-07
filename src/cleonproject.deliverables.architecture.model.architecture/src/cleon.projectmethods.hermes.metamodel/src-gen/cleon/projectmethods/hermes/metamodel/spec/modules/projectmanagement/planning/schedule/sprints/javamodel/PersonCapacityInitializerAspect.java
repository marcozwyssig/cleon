package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel;

import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.Resource;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.AbstractInitializationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import cleon.common.calendar.metamodel.spec.javamodel.IDay;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.SprintsPackage;

public class PersonCapacityInitializerAspect extends AbstractInitializationAspect {

	
	@Override
	public void initialize(IModifiable modifiable, INode clazz, Package pkg, INode newInstance) {
		
		try
		{
			ITypeSystem typeSystem = TypeSystem.create(modifiable);
			IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
			IPersonCapacity personCapacity = resourceRepository.getResource(IPersonCapacity.class, newInstance);

			

			for( IDay day : SelectDateForCapacityDecorator.getDays(personCapacity))
			{

				Resource capacityPerDay = Update.createResourceNoDefaults(modifiable, pkg, SprintsPackage.CapacityPerDay);
				ICapacityPerDay capacityPerDayTyped = resourceRepository.getResource(ICapacityPerDay.class, capacityPerDay);
				Update.createStatement(modifiable, pkg, capacityPerDay, SprintsPackage.CapacityPerDay_day, day.getResource());
				Update.createStatement(modifiable, pkg, personCapacity.getResource(), SprintsPackage.PersonCapacity_capacityPerDay, capacityPerDay);
				Update.createStatement(modifiable, pkg, capacityPerDay, SprintsPackage.CapacityPerDay_capacity, LiteralUtil.create(CapacityPerDayInitializerAspect.getCapacity(capacityPerDayTyped)));	

			}				
		}
		catch(Exception e)
		{
			Update.createStatement(modifiable, pkg, newInstance, SprintsPackage.PersonCapacity_capacityPerDay, LiteralUtil.create(e.toString()));			
			
		}

	}
}
