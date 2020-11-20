package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAccessConcept extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d821c95b-19c0-11eb-8585-65084a06c07f");
  
  // relations
  
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.INamedChapter> selectCustomChapters();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessCommunicationType> selectAccessCommunicationType();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.ISystemConfigurationAccessFrom> selectAccessFrom();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d821c95b-19c0-11eb-8585-65084a06c07f,EzzVzS4kzi7pl3XrP3hbn2gXryY=] */
