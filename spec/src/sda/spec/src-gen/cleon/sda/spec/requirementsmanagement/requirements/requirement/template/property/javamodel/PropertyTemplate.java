package cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class PropertyTemplate extends DynamicResource implements IPropertyTemplate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPropertyTemplate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPropertyTemplate>() {
    
    @Override
    public IPropertyTemplate create() {
      return new PropertyTemplate();
    }
    
    @Override
    public IPropertyTemplate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new PropertyTemplate(resourceRepository, resource);
    }
  
  };

  public PropertyTemplate() {
    super(IPropertyTemplate.TYPE_ID);
  }
  
  public PropertyTemplate(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPropertyTemplate.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IExpression selectExpression() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IExpression.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.PropertyPackage.PropertyTemplate_expression);
  }

  public PropertyTemplate setExpression(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IExpression expression) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.PropertyPackage.PropertyTemplate_expression, expression);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.importance.javamodel.IImportance selectImportance() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.importance.javamodel.IImportance.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.TemplatePackage.Template_importance);
  }

  public PropertyTemplate setImportance(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.importance.javamodel.IImportance importance) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.TemplatePackage.Template_importance, importance);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IProperty selectProperty() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IProperty.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.PropertyPackage.PropertyTemplate_property);
  }

  public PropertyTemplate setProperty(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IProperty property) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.PropertyPackage.PropertyTemplate_property, property);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.ISubjectMatter selectSubjectMatter() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.ISubjectMatter.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.PropertyPackage.PropertyTemplate_subjectMatter);
  }

  public PropertyTemplate setSubjectMatter(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.ISubjectMatter subjectMatter) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.PropertyPackage.PropertyTemplate_subjectMatter, subjectMatter);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.javamodel.ICondition selectSystem() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.javamodel.ICondition.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.TemplatePackage.Template_system);
  }

  public PropertyTemplate setSystem(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.javamodel.ICondition system) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.TemplatePackage.Template_system, system);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public PropertyTemplate setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IValue selectValue() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IValue.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.PropertyPackage.PropertyTemplate_value);
  }

  public PropertyTemplate setValue(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IValue value) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.PropertyPackage.PropertyTemplate_value, value);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IExpression.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.PropertyPackage.PropertyTemplate_expression, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.importance.javamodel.IImportance.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.TemplatePackage.Template_importance, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IProperty.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.PropertyPackage.PropertyTemplate_property, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.ISubjectMatter.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.PropertyPackage.PropertyTemplate_subjectMatter, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.javamodel.ICondition.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.TemplatePackage.Template_system, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IValue.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.PropertyPackage.PropertyTemplate_value, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IPropertyTemplate> selectToMeProperty(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IProperty object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IPropertyTemplate.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.PropertyPackage.PropertyTemplate_property, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IPropertyTemplate> selectToMeSubjectMatter(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.ISubjectMatter object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IPropertyTemplate.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.PropertyPackage.PropertyTemplate_subjectMatter, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IPropertyTemplate> selectToMeExpression(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IExpression object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IPropertyTemplate.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.PropertyPackage.PropertyTemplate_expression, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IPropertyTemplate> selectToMeValue(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IValue object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IPropertyTemplate.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.PropertyPackage.PropertyTemplate_value, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,584b9882-d574-11e5-89ea-2d8d86e9ef89,2RKhc+DeL0vxAfoYnZJTVbDihnk=] */
