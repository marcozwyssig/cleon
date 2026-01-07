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
	
	private static final Logger LOG = Logger.instance();
	
	@Override
	public void initialize(IModifiable modifiable, INode clazz, Package pkg, INode newInstance) {
		LOG.logInfo("=== ComponentByTemplateInitializerAspect.initialize START ===");
		LOG.logInfo("Method: initialize()");
		LOG.logInfo("Parameters - clazz: " + (clazz != null ? clazz.toString() : "null") + 
		            ", pkg: " + (pkg != null ? pkg.getName() : "null") + 
		            ", newInstance: " + (newInstance != null ? newInstance.toString() : "null"));
		
		try {
			LOG.logInfo("Step 1: Creating TypeSystem from modifiable");
			final var typeSystem = TypeSystem.create(modifiable);
			LOG.logInfo("TypeSystem created successfully");
			
			LOG.logInfo("Step 2: Getting ResourceRepository from TypeSystem");
			final var resourceRepository = typeSystem.getResourceRepository();
			LOG.logInfo("ResourceRepository obtained successfully");
			
			LOG.logInfo("Step 3: Getting ComponentByTemplate resource for newInstance");
			final var componentByTemplate = resourceRepository.getResource(IComponentByTemplate.class, newInstance);
			LOG.logInfo("ComponentByTemplate resource obtained: " + 
			            (componentByTemplate != null ? componentByTemplate.toString() : "null"));
			
			LOG.logInfo("Step 4: Selecting ComponentTemplate from ComponentByTemplate");
			final var componentTemplate = componentByTemplate.selectComponentTemplate();
			LOG.logInfo("ComponentTemplate selected: " + 
			            (componentTemplate != null ? componentTemplate.toString() : "null"));
			
			LOG.logInfo("Step 5: Iterating through ComponentTemplate children");
			final var templateChildren = componentTemplate.selectComponentTemplates();
			LOG.logInfo("Number of ComponentTemplate children: " + 
			            (templateChildren != null ? templateChildren.size() : 0));
			
			int childIndex = 0;
			for (final var componentTemplateChild : templateChildren) {
				childIndex++;
				LOG.logInfo("--- Processing child " + childIndex + " ---");
				LOG.logInfo("ComponentTemplateChild: " + componentTemplateChild.getResource());
				
				LOG.logInfo("Step 5." + childIndex + ".1: Getting existing component for template child");
				var component = componentByTemplate.selectComponents().get(componentTemplateChild.getResource());
				LOG.logInfo("Existing component: " + (component != null ? component.toString() : "null"));
				
					
				LOG.logInfo("Step 5." + childIndex + ".2: Checking ComponentType of template child");
				final var componentType = componentTemplateChild.selectComponentType();
				LOG.logInfo("ComponentType: " + (componentType != null ? componentType.toString() : "null"));
				
				if (componentType == null) {
					LOG.logInfo("ComponentType is null - creating default ComponentByTemplate");
					LOG.logInfo("Method call: Update.createResourceNoDefaults(modifiable, pkg, Architecture_patternPackage.ComponentByTemplate)");
					
					var componentChild = Update.createResourceNoDefaults(modifiable, pkg, Architecture_patternPackage.ComponentByTemplate);
					LOG.logInfo("ComponentChild created: " + componentChild);
					
					LOG.logInfo("Method call: Update.createStatement() - linking component to parent");
					Update.createStatement(modifiable, pkg, newInstance, Architecture_patternPackage.ComponentByTemplate_components, componentChild);
					LOG.logInfo("Component linked to parent successfully");
					
					LOG.logInfo("Method call: Update.createOrModifyStatement() - setting componentTemplate reference");
					Update.createOrModifyStatement(modifiable, pkg, componentChild, Architecture_patternPackage.ComponentByTemplate_componentTemplate, componentTemplateChild.getResource());
					LOG.logInfo("ComponentTemplate reference set successfully");
					
				} else {
					LOG.logInfo("ComponentType exists - creating typed component"); 
					LOG.logInfo("Method call: Update.createResourceNoDefaults() with type: " + componentType.getResource());
					
					var componentChild = Update.createResourceNoDefaults(modifiable, pkg, componentType.getResource());
					LOG.logInfo("Typed ComponentChild created: " + componentChild);
					
					LOG.logInfo("Method call: Update.createStatement() - linking component to parent");
					Update.createStatement(modifiable, pkg, newInstance, Architecture_patternPackage.ComponentByTemplate_components, componentChild);
					LOG.logInfo("Component linked to parent successfully");
					
					LOG.logInfo("Method call: Update.createOrModifyStatement() - setting componentTemplate reference");
					Update.createOrModifyStatement(modifiable, pkg, componentChild, Architecture_patternPackage.ComponentByTemplate_componentTemplate, componentTemplateChild.getResource());
					LOG.logInfo("ComponentTemplate reference set successfully");
				}
				
				LOG.logInfo("--- Finished processing child " + childIndex + " ---");
			}
			
			LOG.logInfo("Step 6: All ComponentTemplate children processed successfully");
			LOG.logInfo("=== ComponentByTemplateInitializerAspect.initialize COMPLETED SUCCESSFULLY ===");
			
		} catch (Exception e) {
			LOG.logError("=== EXCEPTION in ComponentByTemplateInitializerAspect.initialize ===");
			LOG.logError("Exception type: " + e.getClass().getName());
			LOG.logError("Exception message: " + e.getMessage());
			LOG.logError("Stack trace:");
			for (StackTraceElement element : e.getStackTrace()) {
				LOG.logError("  at " + element.toString());
			}
			
			LOG.logInfo("Method call: Update.createStatement() - creating error description");
			Update.createStatement(modifiable, pkg, newInstance, DescriptionsPackage.SimpleDescription_descriptions, LiteralUtil.create(e.toString()));
			LOG.logInfo("Error description created successfully");
			
			LOG.logError("=== ComponentByTemplateInitializerAspect.initialize FAILED ===");
		}
	}
}