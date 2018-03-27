package cleon.conception.architecture.spec.uml.structural.classes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IClass extends ch.actifsource.core.javamodel.INamedResource, cleon.conception.architecture.spec.uml.structural.classes.javamodel.IAssociationClass, cleon.conception.architecture.spec.uml.structural.classes.method.javamodel.IMethodClass, cleon.conception.architecture.spec.uml.structural.classes.javamodel.IFieldClass, cleon.conception.architecture.spec.uml.structural.classes.javamodel.IIsAbstract, cleon.conception.architecture.spec.uml.structural.classes.javamodel.IEventClass {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("accc5089-2f5a-11e3-b966-57aab741cf17");
  
  // relations
  
  public cleon.conception.architecture.spec.uml.structural.classes.javamodel.IClass selectExtends();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.architecture.spec.uml.structural.classes.events.javamodel.IEventForField> selectFieldEvents();
  
  public java.util.List<? extends cleon.conception.architecture.spec.uml.structural.classes.events.javamodel.ICustomEvent> selectCustomEvents();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,accc5089-2f5a-11e3-b966-57aab741cf17,a5CShVZfN3bKG1ea4Rcxjj2/DnQ=] */
