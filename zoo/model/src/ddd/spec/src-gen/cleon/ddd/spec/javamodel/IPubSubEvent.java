package cleon.ddd.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPubSubEvent extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("98ea7936-d22a-11e4-8b90-c7d981a5f2fd");
  
  // relations
  
  public cleon.uml.spec.structural.classes.events.javamodel.IEvent selectEvent();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,98ea7936-d22a-11e4-8b90-c7d981a5f2fd,6DKCNtHFnUb3is5UwUJUTHpVN9U=] */
