package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPrimaryKey extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fc12f568-b935-11ee-a0d0-e953bcbfaeef");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.javamodel.IColumn> selectColumns();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fc12f568-b935-11ee-a0d0-e953bcbfaeef,ge+0/Ti2eL0XjWNuxZwEarpv9nY=] */
