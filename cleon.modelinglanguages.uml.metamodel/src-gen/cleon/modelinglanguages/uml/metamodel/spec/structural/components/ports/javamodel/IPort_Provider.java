package cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPort_Provider extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a03165a1-0513-11e9-87b8-094c52ae4c98");
  
  public java.lang.String selectProtocol();
  
  public java.lang.String selectFormat();
  
  // relations
  
  public cleon.modelinglanguages.uml.metamodel.spec.structural.classes.interfaces.javamodel.IInterface selectInterface();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a03165a1-0513-11e9-87b8-094c52ae4c98,if9/dM+R04qGPFNMwfmaBH7MINQ=] */
