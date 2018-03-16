package cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPhase extends cleon.common.doc.spec.doc.chapter.javamodel.INamedChapter, cleon.common.resources.spec.resources.workstate.javamodel.IWorkStateAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("bcd1f820-d719-11e6-a422-8b5491da3f30");
  
  // relations
  
  public java.util.List<? extends cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.IRelease> selectReleases();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,bcd1f820-d719-11e6-a422-8b5491da3f30,hoJsU3YXb7Z/c5cOGrEAEWPI720=] */
