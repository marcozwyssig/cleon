package cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAssessments extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("24a6f9b1-324a-11e6-ab4d-73a9260c8088");
  
  // relations
  
  public cleon.common.calendar.metamodel.spec.javamodel.IDay selectDay();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.javamodel.IAssessment> selectAssessment();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,24a6f9b1-324a-11e6-ab4d-73a9260c8088,AUsmz57sJK9axFhrekaKSYJ6v3A=] */
