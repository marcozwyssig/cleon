package cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISubjectAreaCoverage extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("92347cca-ece1-11e8-8149-8542373915bf");
  
  // relations
  
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.javamodel.ISubjectArea selectSubjectArea();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.javamodel.IRequirementCoverage> selectRequirementCoverage();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,92347cca-ece1-11e8-8149-8542373915bf,d222feL5Wz0vkIz8FPcvL6YH2jk=] */
