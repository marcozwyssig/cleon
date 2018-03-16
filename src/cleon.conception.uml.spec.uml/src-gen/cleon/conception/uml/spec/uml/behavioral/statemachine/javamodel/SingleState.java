package cleon.conception.uml.spec.uml.behavioral.statemachine.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SingleState extends DynamicResource implements ISingleState {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISingleState> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISingleState>() {
    
    @Override
    public ISingleState create() {
      return new SingleState();
    }
    
    @Override
    public ISingleState create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SingleState(resourceRepository, resource);
    }
  
  };

  public SingleState() {
    super(ISingleState.TYPE_ID);
  }
  
  public SingleState(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISingleState.TYPE_ID);
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
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Boolean selectIsAbstract() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.conception.uml.spec.uml.structural.classes.ClassesPackage.IsAbstract_isAbstract);
  }
    
  public void setIsAbstract(java.lang.Boolean isAbstract) {
     _setSingleAttribute(cleon.conception.uml.spec.uml.structural.classes.ClassesPackage.IsAbstract_isAbstract, isAbstract);
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
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public SingleState setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.uml.spec.uml.behavioral.statemachine.javamodel.IStateInheritance> selectInherits() {
    return _getList(cleon.conception.uml.spec.uml.behavioral.statemachine.javamodel.IStateInheritance.class, cleon.conception.uml.spec.uml.behavioral.statemachine.StatemachinePackage.SingleState_inherits);
  }

  public SingleState setInherits(java.util.List<? extends cleon.conception.uml.spec.uml.behavioral.statemachine.javamodel.IStateInheritance> inherits) {
    _setList(cleon.conception.uml.spec.uml.behavioral.statemachine.StatemachinePackage.SingleState_inherits, inherits);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.uml.spec.uml.behavioral.statemachine.javamodel.ITransition> selectTransition() {
    return _getMap(cleon.conception.uml.spec.uml.behavioral.statemachine.javamodel.ITransition.class, cleon.conception.uml.spec.uml.behavioral.statemachine.StatemachinePackage.SingleState_transition);
  }

  public SingleState setTransition(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.uml.spec.uml.behavioral.statemachine.javamodel.ITransition> transition) {
    _setMap(cleon.conception.uml.spec.uml.behavioral.statemachine.StatemachinePackage.SingleState_transition, transition);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SingleState setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.conception.uml.spec.uml.structural.classes.ClassesPackage.IsAbstract_isAbstract, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.conception.uml.spec.uml.behavioral.statemachine.javamodel.IStateInheritance.class, cleon.conception.uml.spec.uml.behavioral.statemachine.StatemachinePackage.SingleState_inherits, visitor);
    _acceptMap(cleon.conception.uml.spec.uml.behavioral.statemachine.javamodel.ITransition.class, cleon.conception.uml.spec.uml.behavioral.statemachine.StatemachinePackage.SingleState_transition, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.uml.spec.uml.behavioral.statemachine.javamodel.ISingleState selectToMeTransition(cleon.conception.uml.spec.uml.behavioral.statemachine.javamodel.ITransition object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.uml.spec.uml.behavioral.statemachine.javamodel.ISingleState.class, cleon.conception.uml.spec.uml.behavioral.statemachine.StatemachinePackage.SingleState_transition, object.getResource());
  }
  
  public static cleon.conception.uml.spec.uml.behavioral.statemachine.javamodel.ISingleState selectToMeInherits(cleon.conception.uml.spec.uml.behavioral.statemachine.javamodel.IStateInheritance object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.uml.spec.uml.behavioral.statemachine.javamodel.ISingleState.class, cleon.conception.uml.spec.uml.behavioral.statemachine.StatemachinePackage.SingleState_inherits, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7f13ba82-b07c-11e4-bca8-71d5b3e72cd6,FgHJ1TeCRxKqXLxLdo7ro6NQnZ4=] */
