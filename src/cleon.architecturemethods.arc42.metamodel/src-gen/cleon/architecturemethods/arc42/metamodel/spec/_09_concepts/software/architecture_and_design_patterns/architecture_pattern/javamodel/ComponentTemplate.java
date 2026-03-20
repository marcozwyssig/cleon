package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ComponentTemplate extends DynamicResource implements IComponentTemplate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComponentTemplate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComponentTemplate>() {
    
    @Override
    public IComponentTemplate create() {
      return new ComponentTemplate();
    }
    
    @Override
    public IComponentTemplate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ComponentTemplate(resourceRepository, resource);
    }
  
  };

  public ComponentTemplate() {
    super(IComponentTemplate.TYPE_ID);
  }
  
  public ComponentTemplate(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IComponentTemplate.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.javamodel.IComponentTemplate> selectComponentTemplates() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.javamodel.IComponentTemplate.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.Architecture_patternPackage.ComponentTemplateAware_componentTemplates);
  }

  public ComponentTemplate setComponentTemplates(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.javamodel.IComponentTemplate> componentTemplates) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.Architecture_patternPackage.ComponentTemplateAware_componentTemplates, componentTemplates);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectComponentType() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.Architecture_patternPackage.ComponentTemplate_componentType);
  }

  public ComponentTemplate setComponentType(ch.actifsource.core.javamodel.IClass componentType) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.Architecture_patternPackage.ComponentTemplate_componentType, componentType);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ComponentTemplate setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.javamodel.IComponentTemplate.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.Architecture_patternPackage.ComponentTemplateAware_componentTemplates, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.Architecture_patternPackage.ComponentTemplate_componentType, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.javamodel.IComponentTemplate> selectToMeComponentType(ch.actifsource.core.javamodel.IClass object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.javamodel.IComponentTemplate.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.Architecture_patternPackage.ComponentTemplate_componentType, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,bba92e7b-e595-11f0-a60c-db015d172622,0Ig81eP8xWgJ+DtHstnHlAq0Ss4=] */
