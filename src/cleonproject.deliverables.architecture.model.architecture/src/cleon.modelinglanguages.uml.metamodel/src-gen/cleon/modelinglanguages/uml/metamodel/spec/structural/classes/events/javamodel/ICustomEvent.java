package cleon.modelinglanguages.uml.metamodel.spec.structural.classes.events.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICustomEvent extends ch.actifsource.core.javamodel.INamedResource, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.events.javamodel.IEvent {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c8ba6fcd-d30b-11e4-8b90-c7d981a5f2fd");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.events.javamodel.ICustomEventArgs> selectArgs();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c8ba6fcd-d30b-11e4-8b90-c7d981a5f2fd,SUkF2Z+TOD8C4h1wrPPrpTcsei8=] */
