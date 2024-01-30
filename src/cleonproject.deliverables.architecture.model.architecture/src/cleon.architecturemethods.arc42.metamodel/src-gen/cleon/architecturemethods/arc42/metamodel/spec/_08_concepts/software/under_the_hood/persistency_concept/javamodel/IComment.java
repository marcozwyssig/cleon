package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IComment extends ch.actifsource.solution.datatype.generic.datatype.javamodel.IComment {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("dfa83c82-bf44-11ee-ae98-9d32d1b90e58");
  
  public java.util.Date selectWhen();
  
  public java.lang.String selectWhat();
  
  // relations
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson selectWho();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,dfa83c82-bf44-11ee-ae98-9d32d1b90e58,e9xL2/jVC/2GTewM6DItaT4R5Z8=] */
