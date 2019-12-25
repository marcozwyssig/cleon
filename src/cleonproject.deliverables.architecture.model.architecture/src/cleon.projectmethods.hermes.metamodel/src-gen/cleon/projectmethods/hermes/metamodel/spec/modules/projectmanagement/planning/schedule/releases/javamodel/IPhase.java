package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPhase extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractNamedChapter, cleon.common.resources.metamodel.spec.workstate.javamodel.IWorkStateAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("bcd1f820-d719-11e6-a422-8b5491da3f30");
  
  // relations
  
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IRelease> selectReleases();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,bcd1f820-d719-11e6-a422-8b5491da3f30,0uGBZsn6WZyVYQdkbmV+saJxyAU=] */
