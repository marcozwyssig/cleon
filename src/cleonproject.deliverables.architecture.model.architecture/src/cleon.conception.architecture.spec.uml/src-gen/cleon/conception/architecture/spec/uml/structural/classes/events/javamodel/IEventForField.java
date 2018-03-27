package cleon.conception.architecture.spec.uml.structural.classes.events.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEventForField extends cleon.conception.architecture.spec.uml.structural.classes.events.javamodel.IEvent, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1b6f35fa-7fc7-11e4-842a-1924f269f20b");
  
  // relations
  
  public cleon.conception.architecture.spec.uml.structural.classes.fields.javamodel.IField selectTarget();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1b6f35fa-7fc7-11e4-842a-1924f269f20b,vDxHMgVJ11FyPn4ZLmtTsDJx3D0=] */
