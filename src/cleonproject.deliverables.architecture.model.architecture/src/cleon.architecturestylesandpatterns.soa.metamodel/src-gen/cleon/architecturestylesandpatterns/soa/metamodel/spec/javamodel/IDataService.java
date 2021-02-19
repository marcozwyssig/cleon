package cleon.architecturestylesandpatterns.soa.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDataService extends ch.actifsource.core.javamodel.INamedResource, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.interfaces.javamodel.IAbstractInterface {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d93b7c9d-13cb-11e3-bec7-f1e135382475");
  
  // relations
  
  public java.util.List<? extends cleon.architecturestylesandpatterns.soa.metamodel.spec.javamodel.IEvent> selectEvents();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d93b7c9d-13cb-11e3-bec7-f1e135382475,qH1bM6bBM2utIBpAgUgF3lA7Ewc=] */
