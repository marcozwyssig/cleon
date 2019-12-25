package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITimePlan extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, cleon.common.resources.metamodel.spec.workstate.javamodel.IWorkStateAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3c633cfe-3761-11e5-95d9-2b04d7ab02d9");
  
  // relations
  
  public cleon.common.calendar.metamodel.spec.javamodel.IDay selectStart();
  
  public cleon.common.calendar.metamodel.spec.javamodel.IDay selectEnd();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3c633cfe-3761-11e5-95d9-2b04d7ab02d9,Nj5v/LSgpO0ogUpDHAVwecp5Ao8=] */
