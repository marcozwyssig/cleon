package cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOutcomes extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fdf40175-b53c-11e5-bc0c-f35b68c3609a");
  
  // relations
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.ISystemOutcome> selectSystemOutcomes();
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IDocumentOutcome> selectDocumentOutcomes();
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IManagementOutcome> selectManagementOutcomes();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fdf40175-b53c-11e5-bc0c-f35b68c3609a,3TjIfZE1MTrqHKNudR1Bx7hHpIA=] */
