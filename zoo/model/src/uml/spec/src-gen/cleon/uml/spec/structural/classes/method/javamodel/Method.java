package cleon.uml.spec.structural.classes.method.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Method extends DynamicResource implements IMethod {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMethod> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMethod>() {
    
    @Override
    public IMethod create() {
      return new Method();
    }
    
    @Override
    public IMethod create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Method(resourceRepository, resource);
    }
  
  };

  public Method() {
    super(IMethod.TYPE_ID);
  }
  
  public Method(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMethod.TYPE_ID);
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
  public java.lang.Boolean selectIsObsolete() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.ClassesPackage.Obsolete_isObsolete);
  }
    
  public void setIsObsolete(java.lang.Boolean isObsolete) {
     _setSingleAttribute(cleon.uml.spec.structural.classes.ClassesPackage.Obsolete_isObsolete, isObsolete);
  }

  @Override
  public java.lang.Boolean selectIsVirtual() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.ClassesPackage.Virtual_isVirtual);
  }
    
  public void setIsVirtual(java.lang.Boolean isVirtual) {
     _setSingleAttribute(cleon.uml.spec.structural.classes.ClassesPackage.Virtual_isVirtual, isVirtual);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectResponsibility() {
    return _getSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility);
  }
    
  public void setResponsibility(java.lang.String responsibility) {
     _setSingleAttribute(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, responsibility);
  }

  @Override
  public java.lang.String selectReturnTypeDescription() {
    return _getSingleAttribute(java.lang.String.class, cleon.uml.spec.structural.classes.method.MethodPackage.Method_returnTypeDescription);
  }
    
  public void setReturnTypeDescription(java.lang.String returnTypeDescription) {
     _setSingleAttribute(cleon.uml.spec.structural.classes.method.MethodPackage.Method_returnTypeDescription, returnTypeDescription);
  }

  // relations
  
  @Override
  public cleon.uml.spec.structural.classes.method.messageExchange.javamodel.IMessageExchange selectMep() {
    return _getSingle(cleon.uml.spec.structural.classes.method.messageExchange.javamodel.IMessageExchange.class, cleon.uml.spec.structural.classes.method.MethodPackage.Method_mep);
  }

  public Method setMep(cleon.uml.spec.structural.classes.method.messageExchange.javamodel.IMessageExchange mep) {
    _setSingle(cleon.uml.spec.structural.classes.method.MethodPackage.Method_mep, mep);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.classes.method.parameter.javamodel.IParameter> selectParameters() {
    return _getList(cleon.uml.spec.structural.classes.method.parameter.javamodel.IParameter.class, cleon.uml.spec.structural.classes.method.MethodPackage.Method_parameters);
  }

  public Method setParameters(java.util.List<? extends cleon.uml.spec.structural.classes.method.parameter.javamodel.IParameter> parameters) {
    _setList(cleon.uml.spec.structural.classes.method.MethodPackage.Method_parameters, parameters);
    return this;
  }
    
  @Override
  public cleon.uml.spec.structural.classes.javamodel.IClassifier selectReturnType() {
    return _getSingle(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.classes.ClassesPackage.ReturnType_returnType);
  }

  public Method setReturnType(cleon.uml.spec.structural.classes.javamodel.IClassifier returnType) {
    _setSingle(cleon.uml.spec.structural.classes.ClassesPackage.ReturnType_returnType, returnType);
    return this;
  }
    
  @Override
  public cleon.uml.spec.structural.classes.association.javamodel.ICollectionType selectReturnTypeAsCollection() {
    return _getSingle(cleon.uml.spec.structural.classes.association.javamodel.ICollectionType.class, cleon.uml.spec.structural.classes.method.MethodPackage.Method_returnTypeAsCollection);
  }

  public Method setReturnTypeAsCollection(cleon.uml.spec.structural.classes.association.javamodel.ICollectionType returnTypeAsCollection) {
    _setSingle(cleon.uml.spec.structural.classes.method.MethodPackage.Method_returnTypeAsCollection, returnTypeAsCollection);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Method setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.ClassesPackage.Obsolete_isObsolete, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.ClassesPackage.Virtual_isVirtual, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.uml.spec.structural.classes.method.MethodPackage.Method_returnTypeDescription, visitor);
    // relations
    _acceptSingle(cleon.uml.spec.structural.classes.method.messageExchange.javamodel.IMessageExchange.class, cleon.uml.spec.structural.classes.method.MethodPackage.Method_mep, visitor);
    _acceptList(cleon.uml.spec.structural.classes.method.parameter.javamodel.IParameter.class, cleon.uml.spec.structural.classes.method.MethodPackage.Method_parameters, visitor);
    _acceptSingle(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.classes.ClassesPackage.ReturnType_returnType, visitor);
    _acceptSingle(cleon.uml.spec.structural.classes.association.javamodel.ICollectionType.class, cleon.uml.spec.structural.classes.method.MethodPackage.Method_returnTypeAsCollection, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static cleon.uml.spec.structural.classes.method.javamodel.IMethod selectToMeParameters(cleon.uml.spec.structural.classes.method.parameter.javamodel.IParameter object) {
    return _getToMeSingle(object.getRepository(), cleon.uml.spec.structural.classes.method.javamodel.IMethod.class, cleon.uml.spec.structural.classes.method.MethodPackage.Method_parameters, object.getResource());
  }
  
  public static java.util.List<cleon.uml.spec.structural.classes.method.javamodel.IMethod> selectToMeMep(cleon.uml.spec.structural.classes.method.messageExchange.javamodel.IMessageExchange object) {
    return _getToMeList(object.getRepository(), cleon.uml.spec.structural.classes.method.javamodel.IMethod.class, cleon.uml.spec.structural.classes.method.MethodPackage.Method_mep, object.getResource());
  }
  
  public static java.util.List<cleon.uml.spec.structural.classes.method.javamodel.IMethod> selectToMeReturnTypeAsCollection(cleon.uml.spec.structural.classes.association.javamodel.ICollectionType object) {
    return _getToMeList(object.getRepository(), cleon.uml.spec.structural.classes.method.javamodel.IMethod.class, cleon.uml.spec.structural.classes.method.MethodPackage.Method_returnTypeAsCollection, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,af648f48-e46c-11e2-b1e0-8de0cec58ee7,Fh1MXxYlN3LcX+/SJTxLXFLsuhE=] */
