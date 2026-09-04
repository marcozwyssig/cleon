package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.javamodel;

import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.Resource;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.AbstractInitializationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.Architecture_patternPackage;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.FunctionSpace_Architecture_Patterns.IComponentByTemplateFunctions;
import cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage;
import cleon.common.resources.metamodel.spec.literals.Log;

public class ComponentByTemplateInitializerAspect extends AbstractInitializationAspect {

    @Override
    public void initialize(IModifiable modifiable, INode clazz, Package pkg, INode newInstance) {
        Log.info("Initializing ComponentByTemplate: %s", newInstance);
        try {
            final var typeSystem = TypeSystem.create(modifiable);
            final var componentByTemplate = typeSystem.getResourceRepository()
                    .getResource(IComponentByTemplate.class, newInstance);
            
            var objectId = componentByTemplate.extension(IComponentByTemplateFunctions.class).Object();
            var objectResource = new Resource(objectId);                    
            
            final var templateChildren = componentByTemplate.selectComponentTemplate()
                    .selectComponentTemplates();

            for (final var templateChild : templateChildren) {
                createComponentChild(modifiable, pkg, newInstance, templateChild, objectResource);
            }

            Log.info("ComponentByTemplate initialized successfully: %s", newInstance);

        } catch (Exception e) {
            Log.error("Failed to initialize ComponentByTemplate '%s': %s", newInstance, e.getMessage(), e);
            Update.createStatement(modifiable, pkg, newInstance,
                    DescriptionsPackage.SimpleDescription_descriptions,
                    LiteralUtil.create(e.toString()));
        }
    }

    private void createComponentChild(IModifiable modifiable, Package pkg, INode parent,
                                      IComponentTemplate templateChild, Resource objectResource) {  
        final var componentType = templateChild.selectComponentType();
        final var childType = (componentType != null)
                ? componentType.getResource()
                : Architecture_patternPackage.ComponentByTemplate;
        
        final var componentChild = Update.createResourceNoDefaults(modifiable, pkg, childType);

        Update.createStatement(modifiable, pkg, parent,
        		objectResource, componentChild);

        Update.createOrModifyStatement(modifiable, pkg, componentChild,
        		Architecture_patternPackage.ComponentByTemplate_componentTemplate,
                templateChild.getResource());

        Log.debug("Created component child of type '%s' for template '%s'",
                childType, templateChild.getResource());
    }
}