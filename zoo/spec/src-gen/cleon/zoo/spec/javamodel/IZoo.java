package cleon.zoo.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IZoo extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("28f43850-e9ba-11e4-848b-0509e3792151");
  
  // relations
  
  public java.util.List<? extends cleon.zoo.spec.javamodel.ISpecification> selectSpecifications();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,28f43850-e9ba-11e4-848b-0509e3792151,ha7qLa6DQCQR8mRk5PAA0QxDrKg=] */
