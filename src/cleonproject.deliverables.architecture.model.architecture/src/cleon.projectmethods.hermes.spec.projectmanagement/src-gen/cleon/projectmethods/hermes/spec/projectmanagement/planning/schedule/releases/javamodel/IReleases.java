package cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IReleases extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ITimePlan {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3161251a-a7d9-11e5-82dd-3b995d9c840c");
  
  // relations
  
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.IPhase> selectPhases();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3161251a-a7d9-11e5-82dd-3b995d9c840c,u2txT6VZBC1jQaPa/4eonKUmJpA=] */
