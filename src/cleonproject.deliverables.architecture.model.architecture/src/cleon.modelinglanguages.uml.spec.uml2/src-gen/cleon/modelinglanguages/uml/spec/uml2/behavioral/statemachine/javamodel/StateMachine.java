package cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class StateMachine extends DynamicResource implements IStateMachine {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStateMachine> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStateMachine>() {
    
    @Override
    public IStateMachine create() {
      return new StateMachine();
    }
    
    @Override
    public IStateMachine create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new StateMachine(resourceRepository, resource);
    }
  
  };

  public StateMachine() {
    super(IStateMachine.TYPE_ID);
  }
  
  public StateMachine(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IStateMachine.TYPE_ID);
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
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IEvent> selectEvents() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IEvent.class, cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachine_events);
  }

  public StateMachine setEvents(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IEvent> events) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachine_events, events);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ISingleState selectStart() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ISingleState.class, cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachine_start);
  }

  public StateMachine setStart(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ISingleState start) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachine_start, start);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ISingleState> selectStates() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ISingleState.class, cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachine_states);
  }

  public StateMachine setStates(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ISingleState> states) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachine_states, states);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateMachine> selectSubStateMachine() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateMachine.class, cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachine_subStateMachine);
  }

  public StateMachine setSubStateMachine(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateMachine> subStateMachine) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachine_subStateMachine, subStateMachine);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public StateMachine setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IEvent.class, cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachine_events, visitor);
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ISingleState.class, cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachine_start, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ISingleState.class, cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachine_states, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateMachine.class, cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachine_subStateMachine, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateMachine selectToMeStates(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ISingleState object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateMachine.class, cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachine_states, object.getResource());
  }
  
  public static cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateMachine selectToMeEvents(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IEvent object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateMachine.class, cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachine_events, object.getResource());
  }
  
  public static cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateMachine selectToMeSubStateMachine(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateMachine object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateMachine.class, cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachine_subStateMachine, object.getResource());
  }
  
  public static cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateMachine selectToMeStart(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ISingleState object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateMachine.class, cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachine_start, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6b3731f0-b07c-11e4-bca8-71d5b3e72cd6,n7jjqL8LsPNM3N3Hs4ovzUwPKDU=] */
