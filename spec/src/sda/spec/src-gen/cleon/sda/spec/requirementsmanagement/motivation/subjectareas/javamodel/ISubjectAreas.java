package cleon.sda.spec.requirementsmanagement.motivation.subjectareas.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISubjectAreas extends cleon.doc.spec.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fd0ef3a1-bf5c-11e5-a56a-35b34376b412");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.subjectareas.javamodel.ISubjectArea> selectSubjectAreas();
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.subjectareas.javamodel.ISubjectAreas> selectAggregation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fd0ef3a1-bf5c-11e5-a56a-35b34376b412,aBzmNiRbW5bPtgwAKnqHsIDYE0A=] */
