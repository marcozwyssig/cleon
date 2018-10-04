package cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.environment.javamodel;

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

  // attributes
  
  @Override
  public java.lang.String selectComponentOfSubjectMatter() {
    return _getSingleAttribute(java.lang.String.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.environment.EnvironmentPackage.ComponentOfSubjectMatterAware_componentOfSubjectMatter);
  }
    
  public void setComponentOfSubjectMatter(java.lang.String componentOfSubjectMatter) {
     _setSingleAttribute(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.environment.EnvironmentPackage.ComponentOfSubjectMatterAware_componentOfSubjectMatter, componentOfSubjectMatter);
  }

  @Override
  public java.lang.String selectExpression() {
    return _getSingleAttribute(java.lang.String.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.templatepart.expression.ExpressionPackage.ExpressionAware_expression);
  }
    
  public void setExpression(java.lang.String expression) {
     _setSingleAttribute(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.templatepart.expression.ExpressionPackage.ExpressionAware_expression, expression);
  }

  @Override
  public java.lang.String selectProperty() {
    return _getSingleAttribute(java.lang.String.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.templatepart.property.PropertyPackage.PropertyAware_property);
  }
    
  public void setProperty(java.lang.String property) {
     _setSingleAttribute(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.templatepart.property.PropertyPackage.PropertyAware_property, property);
  }

  @Override
  public java.lang.String selectSubjectMatter() {
    return _getSingleAttribute(java.lang.String.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.templatepart.subjectmatter.SubjectmatterPackage.SubjectMatterAware_subjectMatter);
  }
    
  public void setSubjectMatter(java.lang.String subjectMatter) {
     _setSingleAttribute(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.templatepart.subjectmatter.SubjectmatterPackage.SubjectMatterAware_subjectMatter, subjectMatter);
  }

  @Override
  public java.lang.String selectValue() {
    return _getSingleAttribute(java.lang.String.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.templatepart.value.ValuePackage.ValueAware_value);
  }
    
  public void setValue(java.lang.String value) {
     _setSingleAttribute(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.templatepart.value.ValuePackage.ValueAware_value, value);
  }

  // relations
  
  @Override
  public cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.templatepart.condition.javamodel.ICondition selectCondition() {
    return _getSingle(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.templatepart.condition.javamodel.ICondition.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.templatepart.condition.ConditionPackage.ConditionAware_condition);
  }

  public EnvironmentTemplate setCondition(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.templatepart.condition.javamodel.ICondition condition) {
    _setSingle(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.templatepart.condition.ConditionPackage.ConditionAware_condition, condition);
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
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.environment.EnvironmentPackage.ComponentOfSubjectMatterAware_componentOfSubjectMatter, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.templatepart.expression.ExpressionPackage.ExpressionAware_expression, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.templatepart.property.PropertyPackage.PropertyAware_property, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.templatepart.subjectmatter.SubjectmatterPackage.SubjectMatterAware_subjectMatter, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.templatepart.value.ValuePackage.ValueAware_value, visitor);
    // relations
    _acceptSingle(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.templatepart.condition.javamodel.ICondition.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.templatepart.condition.ConditionPackage.ConditionAware_condition, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7ac55000-d64f-11e5-beff-c5494779b7d9,nf646BWZNUQEFxlpIF0P8d95dRY=] */
