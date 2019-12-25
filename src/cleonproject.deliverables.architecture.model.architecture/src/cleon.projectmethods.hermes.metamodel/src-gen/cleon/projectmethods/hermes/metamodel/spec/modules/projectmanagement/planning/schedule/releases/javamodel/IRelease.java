package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRelease extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractNamedChapter, cleon.common.resources.metamodel.spec.workstate.javamodel.IWorkStateAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2755120c-3761-11e5-95d9-2b04d7ab02d9");
  
  // relations
  
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.javamodel.IWorkpackage> selectPlannedWorkpackages();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2755120c-3761-11e5-95d9-2b04d7ab02d9,hMLo4kMIsNatfDjxbqZdDDCcqTc=] */
