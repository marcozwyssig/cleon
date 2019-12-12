package cleon.architecturemethods.eamod.spec.eamod.chrv.coverage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISubjectAreaCoverage extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("92347cca-ece1-11e8-8149-8542373915bf");
  
  // relations
  
  public cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubjectArea selectSubjectArea();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.eamod.chrv.coverage.javamodel.IRequirementCoverage> selectRequirementCoverage();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,92347cca-ece1-11e8-8149-8542373915bf,nIR3Bzf0xkh82aS0I8hp82hip2I=] */
