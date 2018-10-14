package cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAssessments extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("24a6f9b1-324a-11e6-ab4d-73a9260c8088");
  
  // relations
  
  public cleon.common.resources.spec.calendar.javamodel.IDay selectDay();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.assessments.javamodel.IAssessment> selectAssessment();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,24a6f9b1-324a-11e6-ab4d-73a9260c8088,e/LvS+gWvUcLfthTsP78VLylPJo=] */
