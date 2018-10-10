package cleon.architecturemethods.arc42.spec.ddd.repository.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRepository extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.interfaces.javamodel.IInterfaceService {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("5e627f84-10c2-11e3-b60e-ab478a3e1eca");
  
  // relations
  
  public cleon.architecturemethods.arc42.spec.ddd.entities.javamodel.IEntity selectSearch();
  
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod> selectSearchBy();
  
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod> selectGetBy();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,5e627f84-10c2-11e3-b60e-ab478a3e1eca,hrfJBV7+2xmJokJNCmDeqFnfBaw=] */
