package cleon.conception.uml.spec.uml.structural.classes.method.parameter.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Parameter extends DynamicResource implements IParameter {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IParameter> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IParameter>() {
    
    @Override
    public IParameter create() {
      return new Parameter();
    }
    
    @Override
    public IParameter create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Parameter(resourceRepository, resource);
    }
  
  };

  public Parameter() {
    super(IParameter.TYPE_ID);
  }
  
  public Parameter(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IParameter.TYPE_ID);
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

  public Parameter setConstraint(cleon.conception.uml.spec.uml.structural.classes.constraint.javamodel.IConstraint constraint) {
    _setSingle(cleon.conception.uml.spec.uml.structural.classes.method.parameter.ParameterPackage.Parameter_constraint, constraint);
    return this;
  }
    
  @Override
  public cleon.conception.uml.spec.uml.structural.classes.association.javamodel.ICollectionType selectParameterAsCollection() {
    return _getSingle(cleon.conception.uml.spec.uml.structural.classes.association.javamodel.ICollectionType.class, cleon.conception.uml.spec.uml.structural.classes.method.parameter.ParameterPackage.Parameter_parameterAsCollection);
  }

  public Parameter setParameterAsCollection(cleon.conception.uml.spec.uml.structural.classes.association.javamodel.ICollectionType parameterAsCollection) {
    _setSingle(cleon.conception.uml.spec.uml.structural.classes.method.parameter.ParameterPackage.Parameter_parameterAsCollection, parameterAsCollection);
    return this;
  }
    
  @Override
  public cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier selectType() {
    return _getSingle(cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier.class, cleon.conception.uml.spec.uml.structural.classes.method.parameter.ParameterPackage.Parameter_type);
  }

  public Parameter setType(cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier type) {
    _setSingle(cleon.conception.uml.spec.uml.structural.classes.method.parameter.ParameterPackage.Parameter_type, type);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Parameter setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.conception.uml.spec.uml.structural.classes.association.javamodel.ICollectionType.class, cleon.conception.uml.spec.uml.structural.classes.method.parameter.ParameterPackage.Parameter_parameterAsCollection, visitor);
    _acceptSingle(cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier.class, cleon.conception.uml.spec.uml.structural.classes.method.parameter.ParameterPackage.Parameter_type, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.conception.uml.spec.uml.structural.classes.method.parameter.javamodel.IParameter> selectToMeType(cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier object) {
    return _getToMeList(object.getRepository(), cleon.conception.uml.spec.uml.structural.classes.method.parameter.javamodel.IParameter.class, cleon.conception.uml.spec.uml.structural.classes.method.parameter.ParameterPackage.Parameter_type, object.getResource());
  }
  
  public static java.util.List<cleon.conception.uml.spec.uml.structural.classes.method.parameter.javamodel.IParameter> selectToMeConstraint(cleon.conception.uml.spec.uml.structural.classes.constraint.javamodel.IConstraint object) {
    return _getToMeList(object.getRepository(), cleon.conception.uml.spec.uml.structural.classes.method.parameter.javamodel.IParameter.class, cleon.conception.uml.spec.uml.structural.classes.method.parameter.ParameterPackage.Parameter_constraint, object.getResource());
  }
  
  public static java.util.List<cleon.conception.uml.spec.uml.structural.classes.method.parameter.javamodel.IParameter> selectToMeParameterAsCollection(cleon.conception.uml.spec.uml.structural.classes.association.javamodel.ICollectionType object) {
    return _getToMeList(object.getRepository(), cleon.conception.uml.spec.uml.structural.classes.method.parameter.javamodel.IParameter.class, cleon.conception.uml.spec.uml.structural.classes.method.parameter.ParameterPackage.Parameter_parameterAsCollection, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a3776ddf-e3f2-11e2-845f-2b181f80a373,+SBFDsObaORmoR1z0Zn7xN2Q0ZQ=] */
