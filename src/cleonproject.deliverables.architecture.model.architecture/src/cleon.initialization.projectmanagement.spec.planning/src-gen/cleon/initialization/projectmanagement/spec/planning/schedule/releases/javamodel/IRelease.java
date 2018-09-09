package cleon.initialization.projectmanagement.spec.planning.schedule.releases.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRelease extends cleon.common.doc.spec.doc.chapter.javamodel.INamedChapter, cleon.common.resources.spec.resources.workstate.javamodel.IWorkStateAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2755120c-3761-11e5-95d9-2b04d7ab02d9");
  
  // relations
  
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackage> selectPlannedWorkpackages();
  
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.schedule.releases.javamodel.ISprint> selectSprints();
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.initialization.projectmanagement.spec.planning.schedule.releases.workpackageplanning.javamodel.IWorkpackagePlanning> selectWorkpackagePlannings();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2755120c-3761-11e5-95d9-2b04d7ab02d9,zRvyw2eNz/TUJK/wOkMcdiK8o7M=] */
