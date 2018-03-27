package cleon.conception.architecture.spec.uml.behavioral.statemachine.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Transition extends DynamicResource implements ITransition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITransition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITransition>() {
    
    @Override
    public ITransition create() {
      return new Transition();
    }
    
    @Override
    public ITransition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Transition(resourceRepository, resource);
    }
  
  };

  public Transition() {
    super(ITransition.TYPE_ID);
  }
  
  public Transition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITransition.TYPE_ID);
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

  // relations
  
  @Override
  public cleon.conception.architecture.spec.uml.behavioral.statemachine.javamodel.ICondition selectCondition() {
    return _getSingle(cleon.conception.architecture.spec.uml.behavioral.statemachine.javamodel.ICondition.class, cleon.conception.architecture.spec.uml.behavioral.statemachine.StatemachinePackage.Transition_condition);
  }

  public Transition setCondition(cleon.conception.architecture.spec.uml.behavioral.statemachine.javamodel.ICondition condition) {
    _setSingle(cleon.conception.architecture.spec.uml.behavioral.statemachine.StatemachinePackage.Transition_condition, condition);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Transition setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.uml.behavioral.statemachine.javamodel.IEvent selectEvent() {
    return _getSingle(cleon.conception.architecture.spec.uml.behavioral.statemachine.javamodel.IEvent.class, cleon.conception.architecture.spec.uml.behavioral.statemachine.StatemachinePackage.Transition_event);
  }

  public Transition setEvent(cleon.conception.architecture.spec.uml.behavioral.statemachine.javamodel.IEvent event) {
    _setSingle(cleon.conception.architecture.spec.uml.behavioral.statemachine.StatemachinePackage.Transition_event, event);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Transition setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.uml.behavioral.statemachine.javamodel.IState selectTargetState() {
    return _getSingle(cleon.conception.architecture.spec.uml.behavioral.statemachine.javamodel.IState.class, cleon.conception.architecture.spec.uml.behavioral.statemachine.StatemachinePackage.Transition_targetState);
  }

  public Transition setTargetState(cleon.conception.architecture.spec.uml.behavioral.statemachine.javamodel.IState targetState) {
    _setSingle(cleon.conception.architecture.spec.uml.behavioral.statemachine.StatemachinePackage.Transition_targetState, targetState);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Transition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.conception.architecture.spec.uml.behavioral.statemachine.javamodel.ICondition.class, cleon.conception.architecture.spec.uml.behavioral.statemachine.StatemachinePackage.Transition_condition, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.conception.architecture.spec.uml.behavioral.statemachine.javamodel.IEvent.class, cleon.conception.architecture.spec.uml.behavioral.statemachine.StatemachinePackage.Transition_event, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(cleon.conception.architecture.spec.uml.behavioral.statemachine.javamodel.IState.class, cleon.conception.architecture.spec.uml.behavioral.statemachine.StatemachinePackage.Transition_targetState, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.conception.architecture.spec.uml.behavioral.statemachine.javamodel.ITransition> selectToMeTargetState(cleon.conception.architecture.spec.uml.behavioral.statemachine.javamodel.IState object) {
    return _getToMeList(object.getRepository(), cleon.conception.architecture.spec.uml.behavioral.statemachine.javamodel.ITransition.class, cleon.conception.architecture.spec.uml.behavioral.statemachine.StatemachinePackage.Transition_targetState, object.getResource());
  }
  
  public static java.util.List<cleon.conception.architecture.spec.uml.behavioral.statemachine.javamodel.ITransition> selectToMeEvent(cleon.conception.architecture.spec.uml.behavioral.statemachine.javamodel.IEvent object) {
    return _getToMeList(object.getRepository(), cleon.conception.architecture.spec.uml.behavioral.statemachine.javamodel.ITransition.class, cleon.conception.architecture.spec.uml.behavioral.statemachine.StatemachinePackage.Transition_event, object.getResource());
  }
  
  public static cleon.conception.architecture.spec.uml.behavioral.statemachine.javamodel.ITransition selectToMeCondition(cleon.conception.architecture.spec.uml.behavioral.statemachine.javamodel.ICondition object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.uml.behavioral.statemachine.javamodel.ITransition.class, cleon.conception.architecture.spec.uml.behavioral.statemachine.StatemachinePackage.Transition_condition, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,813e6228-b07c-11e4-bca8-71d5b3e72cd6,kV3epgV6j+RdKFujWu6/2XwC658=] */
