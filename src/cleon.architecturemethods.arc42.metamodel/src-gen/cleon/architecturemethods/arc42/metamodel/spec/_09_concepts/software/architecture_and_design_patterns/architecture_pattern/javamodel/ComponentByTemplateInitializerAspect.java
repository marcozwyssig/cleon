package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.javamodel;

import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.AbstractInitializationAspect;
import ch.actifsource.core.patch.IStatementPosition;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import ch.actifsource.util.log.Logger;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.Architecture_patternPackage;
import cleon.common.language.metamodel.spec.translation.description.DescriptionPackage;
import cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.SprintsPackage;

public class ComponentByTemplateInitializerAspect extends AbstractInitializationAspect {

	
	@Override
	public void initialize(IModifiable modifiable, INode clazz, Package pkg, INode newInstance) {
		
		try
		{
			final var typeSystem = TypeSystem.create(modifiable);
			final var resourceRepository = typeSystem.getResourceRepository();
			final var componentByTemplate = resourceRepository.getResource(IComponentByTemplate.class, newInstance);
			
			final var componentTemplate = componentByTemplate.selectComponentTemplate();
			if( componentTemplate == null) {
				return;
			}
			
			for( final var componentTemplateChild : componentTemplate.selectComponentTemplates())
			{
				var component = componentByTemplate.selectComponents().get(componentTemplateChild.getResource());				
				if (component == null) { 
					Logger.instance().logInfo("Empty component");
					if ( componentTemplateChild.selectComponentType() == null) {
						var componentChild = Update.createAndInitializeResource(modifiable, pkg, Architecture_patternPackage.ComponentByTemplate, newInstance, Architecture_patternPackage.ComponentByTemplate_components, IStatementPosition.AT_END);
						Update.createOrModifyStatement(modifiable, pkg, componentChild, Architecture_patternPackage.ComponentByTemplate_componentTemplate, componentTemplateChild.getResource());
					} else {
						var componentChild = Update.createAndInitializeResource(modifiable, pkg, componentTemplateChild.selectComponentType().getResource(), newInstance, Architecture_patternPackage.ComponentByTemplate_components, IStatementPosition.AT_END);						
						Update.createOrModifyStatement(modifiable, pkg, componentChild, Architecture_patternPackage.ComponentByTemplate_componentTemplate, componentTemplateChild.getResource());
						
					}
				}
			}				
		}
		catch(Exception e)
		{
			Update.createStatement(modifiable, pkg, newInstance, DescriptionsPackage.SimpleDescription_descriptions, LiteralUtil.create(e.toString()));						
		}
	}
}
