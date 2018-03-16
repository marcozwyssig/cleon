package cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRelease extends cleon.common.doc.spec.doc.chapter.javamodel.INamedChapter, cleon.common.resources.spec.resources.workstate.javamodel.IWorkStateAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2755120c-3761-11e5-95d9-2b04d7ab02d9");
  
  // relations
  
  public java.util.List<? extends cleon.support.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackage> selectPlannedStartWorkpackages();
  
  public java.util.List<? extends cleon.support.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackage> selectPlannedEndWorkpackages();
  
  public java.util.List<? extends cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint> selectSprints();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2755120c-3761-11e5-95d9-2b04d7ab02d9,TaI6SkBLZEdcUHyZZSeNq7u94vc=] */
