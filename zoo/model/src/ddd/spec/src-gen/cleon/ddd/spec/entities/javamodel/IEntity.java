package cleon.ddd.spec.entities.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEntity extends cleon.uml.spec.structural.classes.javamodel.IClass, cleon.uml.spec.structural.classes.interfaces.javamodel.IInterfaceData, cleon.uml.spec.structural.classes.interfaces.javamodel.IInterface {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8914497d-10c0-11e3-b60e-ab478a3e1eca");
  
  // relations
  
  public cleon.ddd.spec.entities.javamodel.IEntity selectExtends();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8914497d-10c0-11e3-b60e-ab478a3e1eca,6WlDR6F4pYgszm/5PipjWYvlab4=] */
