package cleon.architecturestylesandpatterns.soa.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEvent extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3789a935-a3ba-11e3-8095-f11af53ab806");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IClassifier> selectEventType();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3789a935-a3ba-11e3-8095-f11af53ab806,WCLbyzAi9pn2XV+Q4Ps1CEzM+Vs=] */
