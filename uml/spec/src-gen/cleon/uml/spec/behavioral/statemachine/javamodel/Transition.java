package cleon.uml.spec.behavioral.statemachine.javamodel;

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

  // relations
  
  @Override
  public cleon.uml.spec.behavioral.statemachine.javamodel.IEvent selectEvent() {
    return _getSingle(cleon.uml.spec.behavioral.statemachine.javamodel.IEvent.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.Transition_event);
  }

  public Transition setEvent(cleon.uml.spec.behavioral.statemachine.javamodel.IEvent event) {
    _setSingle(cleon.uml.spec.behavioral.statemachine.StatemachinePackage.Transition_event, event);
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
  public cleon.uml.spec.behavioral.statemachine.javamodel.IState selectTargetState() {
    return _getSingle(cleon.uml.spec.behavioral.statemachine.javamodel.IState.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.Transition_targetState);
  }

  public Transition setTargetState(cleon.uml.spec.behavioral.statemachine.javamodel.IState targetState) {
    _setSingle(cleon.uml.spec.behavioral.statemachine.StatemachinePackage.Transition_targetState, targetState);
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
    // relations
    _acceptSingle(cleon.uml.spec.behavioral.statemachine.javamodel.IEvent.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.Transition_event, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(cleon.uml.spec.behavioral.statemachine.javamodel.IState.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.Transition_targetState, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.uml.spec.behavioral.statemachine.javamodel.ITransition> selectToMeTargetState(cleon.uml.spec.behavioral.statemachine.javamodel.IState object) {
    return _getToMeList(object.getRepository(), cleon.uml.spec.behavioral.statemachine.javamodel.ITransition.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.Transition_targetState, object.getResource());
  }
  
  public static java.util.List<cleon.uml.spec.behavioral.statemachine.javamodel.ITransition> selectToMeEvent(cleon.uml.spec.behavioral.statemachine.javamodel.IEvent object) {
    return _getToMeList(object.getRepository(), cleon.uml.spec.behavioral.statemachine.javamodel.ITransition.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.Transition_event, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,813e6228-b07c-11e4-bca8-71d5b3e72cd6,laXoPIN6OOWKs1zoX20fwCGbKxE=] */
