package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.repository.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRepository extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.interfaces.javamodel.IAbstractInterface {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("5e627f84-10c2-11e3-b60e-ab478a3e1eca");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.entities.javamodel.IEntity selectSearch();
  
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.javamodel.IMethod> selectSearchBy();
  
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.javamodel.IMethod> selectGetBy();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,5e627f84-10c2-11e3-b60e-ab478a3e1eca,IvTCU33orGeA8YG8a//EQVjZBrw=] */
