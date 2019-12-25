package cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEventClass extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IClassifier, ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b7660a2e-7fc5-11e4-842a-1924f269f20b");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.events.javamodel.IEvent> selectEvents();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b7660a2e-7fc5-11e4-842a-1924f269f20b,5ouIMfEjGyV1dDwxnrq5VXrL2z0=] */
