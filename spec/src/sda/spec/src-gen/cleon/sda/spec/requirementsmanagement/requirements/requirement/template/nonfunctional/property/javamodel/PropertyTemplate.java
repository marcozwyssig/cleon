package cleon.sda.spec.requirementsmanagement.requirements.requirement.template.nonfunctional.property.javamodel;

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
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.condition.javamodel.ICondition selectCondition() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.condition.javamodel.ICondition.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.TemplatePackage.Template_condition);
  }

  public PropertyTemplate setCondition(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.condition.javamodel.ICondition condition) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.TemplatePackage.Template_condition, condition);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.expression.javamodel.IExpression selectExpression() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.expression.javamodel.IExpression.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.expression.ExpressionPackage.ExpressionAware_expression);
  }

  public PropertyTemplate setExpression(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.expression.javamodel.IExpression expression) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.expression.ExpressionPackage.ExpressionAware_expression, expression);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.importance.javamodel.IImportance selectImportance() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.importance.javamodel.IImportance.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.importance.ImportancePackage.ImportanceAware_importance);
  }

  public PropertyTemplate setImportance(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.importance.javamodel.IImportance importance) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.importance.ImportancePackage.ImportanceAware_importance, importance);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IProperty selectProperty() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IProperty.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.PropertyPackage.PropertyAware_property);
  }

  public PropertyTemplate setProperty(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IProperty property) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.PropertyPackage.PropertyAware_property, property);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.subjectmatter.javamodel.ISubjectMatter selectSubjectMatter() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.subjectmatter.javamodel.ISubjectMatter.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.subjectmatter.SubjectmatterPackage.SubjectMatterAware_subjectMatter);
  }

  public PropertyTemplate setSubjectMatter(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.subjectmatter.javamodel.ISubjectMatter subjectMatter) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.subjectmatter.SubjectmatterPackage.SubjectMatterAware_subjectMatter, subjectMatter);
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
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.value.javamodel.IValue selectValue() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.value.javamodel.IValue.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.value.ValuePackage.ValueAware_value);
  }

  public PropertyTemplate setValue(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.value.javamodel.IValue value) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.value.ValuePackage.ValueAware_value, value);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.condition.javamodel.ICondition.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.TemplatePackage.Template_condition, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.expression.javamodel.IExpression.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.expression.ExpressionPackage.ExpressionAware_expression, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.importance.javamodel.IImportance.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.importance.ImportancePackage.ImportanceAware_importance, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IProperty.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.PropertyPackage.PropertyAware_property, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.subjectmatter.javamodel.ISubjectMatter.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.subjectmatter.SubjectmatterPackage.SubjectMatterAware_subjectMatter, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.value.javamodel.IValue.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.value.ValuePackage.ValueAware_value, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,584b9882-d574-11e5-89ea-2d8d86e9ef89,y7rZ4d/ZbHOqR1JBv1FxgWTKbnA=] */
