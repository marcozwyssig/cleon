package cleon.architecturemethods.itarc42.spec.itarc42.concepts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IConceptForSystemComponent extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.javamodel.IConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2d6d075b-0b80-11e9-a136-69d076e48ed1");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.javamodel.ISystemComponentConcept> selectSystemComponentConcept();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2d6d075b-0b80-11e9-a136-69d076e48ed1,4W+LqeTC0fhMJ7kukvxh8wNETKc=] */