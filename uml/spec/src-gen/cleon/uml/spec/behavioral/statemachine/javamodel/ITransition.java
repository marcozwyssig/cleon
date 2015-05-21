package cleon.uml.spec.behavioral.statemachine.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITransition extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("813e6228-b07c-11e4-bca8-71d5b3e72cd6");
  
  // relations
  
  public cleon.uml.spec.behavioral.statemachine.javamodel.IState selectTargetState();
  
  public cleon.uml.spec.behavioral.statemachine.javamodel.IEvent selectEvent();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,813e6228-b07c-11e4-bca8-71d5b3e72cd6,3/VV6UxxFA/5ZH0D3uwkhPTdq2k=] */
