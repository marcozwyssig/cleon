package cleon.sda.spec.requirementsmanagement.requirements.requirement.template.environment.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class EnvironmentTemplate extends DynamicResource implements IEnvironmentTemplate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnvironmentTemplate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnvironmentTemplate>() {
    
    @Override
    public IEnvironmentTemplate create() {
      return new EnvironmentTemplate();
    }
    
    @Override
    public IEnvironmentTemplate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new EnvironmentTemplate(resourceRepository, resource);
    }
  
  };

  public EnvironmentTemplate() {
    super(IEnvironmentTemplate.TYPE_ID);
  }
  
  public EnvironmentTemplate(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEnvironmentTemplate.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.environment.javamodel.IComponentOfSubjectMatter selectComponentOfSubjectMatter() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.environment.javamodel.IComponentOfSubjectMatter.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.environment.EnvironmentPackage.ComponentOfSubjectMatterAware_componentOfSubjectMatter);
  }

  public EnvironmentTemplate setComponentOfSubjectMatter(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.environment.javamodel.IComponentOfSubjectMatter componentOfSubjectMatter) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.environment.EnvironmentPackage.ComponentOfSubjectMatterAware_componentOfSubjectMatter, componentOfSubjectMatter);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.condition.javamodel.ICondition selectCondition() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.condition.javamodel.ICondition.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.condition.ConditionPackage.ConditionAware_condition);
  }

  public EnvironmentTemplate setCondition(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.condition.javamodel.ICondition condition) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.condition.ConditionPackage.ConditionAware_condition, condition);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.expression.javamodel.IExpression selectExpression() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.expression.javamodel.IExpression.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.expression.ExpressionPackage.ExpressionAware_expression);
  }

  public EnvironmentTemplate setExpression(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.expression.javamodel.IExpression expression) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.expression.ExpressionPackage.ExpressionAware_expression, expression);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.importance.javamodel.IImportance selectImportance() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.importance.javamodel.IImportance.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.importance.ImportancePackage.ImportanceAware_importance);
  }

  public EnvironmentTemplate setImportance(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.importance.javamodel.IImportance importance) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.importance.ImportancePackage.ImportanceAware_importance, importance);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.property.javamodel.IProperty selectProperty() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.property.javamodel.IProperty.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.property.PropertyPackage.PropertyAware_property);
  }

  public EnvironmentTemplate setProperty(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.property.javamodel.IProperty property) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.property.PropertyPackage.PropertyAware_property, property);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.subjectmatter.javamodel.ISubjectMatter selectSubjectMatter() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.subjectmatter.javamodel.ISubjectMatter.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.subjectmatter.SubjectmatterPackage.SubjectMatterAware_subjectMatter);
  }

  public EnvironmentTemplate setSubjectMatter(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.subjectmatter.javamodel.ISubjectMatter subjectMatter) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.subjectmatter.SubjectmatterPackage.SubjectMatterAware_subjectMatter, subjectMatter);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public EnvironmentTemplate setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.value.javamodel.IValue selectValue() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.value.javamodel.IValue.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.value.ValuePackage.ValueAware_value);
  }

  public EnvironmentTemplate setValue(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.value.javamodel.IValue value) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.value.ValuePackage.ValueAware_value, value);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.environment.javamodel.IComponentOfSubjectMatter.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.environment.EnvironmentPackage.ComponentOfSubjectMatterAware_componentOfSubjectMatter, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.condition.javamodel.ICondition.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.condition.ConditionPackage.ConditionAware_condition, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.expression.javamodel.IExpression.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.expression.ExpressionPackage.ExpressionAware_expression, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.importance.javamodel.IImportance.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.importance.ImportancePackage.ImportanceAware_importance, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.property.javamodel.IProperty.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.property.PropertyPackage.PropertyAware_property, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.subjectmatter.javamodel.ISubjectMatter.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.subjectmatter.SubjectmatterPackage.SubjectMatterAware_subjectMatter, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.value.javamodel.IValue.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.value.ValuePackage.ValueAware_value, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7ac55000-d64f-11e5-beff-c5494779b7d9,NxLnq2K6PHEP6F3FMO8DhvghEeU=] */
