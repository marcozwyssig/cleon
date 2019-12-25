package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IReleases extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.ITimePlan {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3161251a-a7d9-11e5-82dd-3b995d9c840c");
  
  // relations
  
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IPhase> selectPhases();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3161251a-a7d9-11e5-82dd-3b995d9c840c,2+64ymgRQSGyWEvmZ45X4gqU4tc=] */
