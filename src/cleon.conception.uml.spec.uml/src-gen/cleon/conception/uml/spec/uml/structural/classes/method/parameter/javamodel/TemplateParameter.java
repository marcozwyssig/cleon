package cleon.conception.uml.spec.uml.structural.classes.method.parameter.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TemplateParameter extends DynamicResource implements ITemplateParameter {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITemplateParameter> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITemplateParameter>() {
    
    @Override
    public ITemplateParameter create() {
      return new TemplateParameter();
    }
    
    @Override
    public ITemplateParameter create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TemplateParameter(resourceRepository, resource);
    }
  
  };

  public TemplateParameter() {
    super(ITemplateParameter.TYPE_ID);
  }
  
  public TemplateParameter(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITemplateParameter.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
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
  public cleon.conception.uml.spec.uml.structural.classes.constraint.javamodel.IConstraint selectConstraint() {
    return _getSingle(cleon.conception.uml.spec.uml.structural.classes.constraint.javamodel.IConstraint.class, cleon.conception.uml.spec.uml.structural.classes.method.parameter.ParameterPackage.Parameter_constraint);
  }

  public TemplateParameter setConstraint(cleon.conception.uml.spec.uml.structural.classes.constraint.javamodel.IConstraint constraint) {
    _setSingle(cleon.conception.uml.spec.uml.structural.classes.method.parameter.ParameterPackage.Parameter_constraint, constraint);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.uml.spec.uml.structural.classes.template.javamodel.ITemplate> selectParam() {
    return _getMap(cleon.conception.uml.spec.uml.structural.classes.template.javamodel.ITemplate.class, cleon.conception.uml.spec.uml.structural.classes.method.parameter.ParameterPackage.TemplateParameter_param);
  }

  public TemplateParameter setParam(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.uml.spec.uml.structural.classes.template.javamodel.ITemplate> param) {
    _setMap(cleon.conception.uml.spec.uml.structural.classes.method.parameter.ParameterPackage.TemplateParameter_param, param);
    return this;
  }
    
  @Override
  public cleon.conception.uml.spec.uml.structural.classes.association.javamodel.ICollectionType selectParameterAsCollection() {
    return _getSingle(cleon.conception.uml.spec.uml.structural.classes.association.javamodel.ICollectionType.class, cleon.conception.uml.spec.uml.structural.classes.method.parameter.ParameterPackage.Parameter_parameterAsCollection);
  }

  public TemplateParameter setParameterAsCollection(cleon.conception.uml.spec.uml.structural.classes.association.javamodel.ICollectionType parameterAsCollection) {
    _setSingle(cleon.conception.uml.spec.uml.structural.classes.method.parameter.ParameterPackage.Parameter_parameterAsCollection, parameterAsCollection);
    return this;
  }
    
  @Override
  public cleon.conception.uml.spec.uml.structural.classes.template.javamodel.ITemplateClass selectType() {
    return _getSingle(cleon.conception.uml.spec.uml.structural.classes.template.javamodel.ITemplateClass.class, cleon.conception.uml.spec.uml.structural.classes.method.parameter.ParameterPackage.TemplateParameter_type);
  }

  public TemplateParameter setType(cleon.conception.uml.spec.uml.structural.classes.template.javamodel.ITemplateClass type) {
    _setSingle(cleon.conception.uml.spec.uml.structural.classes.method.parameter.ParameterPackage.TemplateParameter_type, type);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TemplateParameter setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.conception.uml.spec.uml.structural.classes.constraint.javamodel.IConstraint.class, cleon.conception.uml.spec.uml.structural.classes.method.parameter.ParameterPackage.Parameter_constraint, visitor);
    _acceptMap(cleon.conception.uml.spec.uml.structural.classes.template.javamodel.ITemplate.class, cleon.conception.uml.spec.uml.structural.classes.method.parameter.ParameterPackage.TemplateParameter_param, visitor);
    _acceptSingle(cleon.conception.uml.spec.uml.structural.classes.association.javamodel.ICollectionType.class, cleon.conception.uml.spec.uml.structural.classes.method.parameter.ParameterPackage.Parameter_parameterAsCollection, visitor);
    _acceptSingle(cleon.conception.uml.spec.uml.structural.classes.template.javamodel.ITemplateClass.class, cleon.conception.uml.spec.uml.structural.classes.method.parameter.ParameterPackage.TemplateParameter_type, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.conception.uml.spec.uml.structural.classes.method.parameter.javamodel.ITemplateParameter> selectToMeType(cleon.conception.uml.spec.uml.structural.classes.template.javamodel.ITemplateClass object) {
    return _getToMeList(object.getRepository(), cleon.conception.uml.spec.uml.structural.classes.method.parameter.javamodel.ITemplateParameter.class, cleon.conception.uml.spec.uml.structural.classes.method.parameter.ParameterPackage.TemplateParameter_type, object.getResource());
  }
  
  public static cleon.conception.uml.spec.uml.structural.classes.method.parameter.javamodel.ITemplateParameter selectToMeParam(cleon.conception.uml.spec.uml.structural.classes.template.javamodel.ITemplate object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.uml.spec.uml.structural.classes.method.parameter.javamodel.ITemplateParameter.class, cleon.conception.uml.spec.uml.structural.classes.method.parameter.ParameterPackage.TemplateParameter_param, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d944e6c4-a3bb-11e3-8095-f11af53ab806,JtHA8qlKZRGjREeCKstyVAGXUlo=] */
