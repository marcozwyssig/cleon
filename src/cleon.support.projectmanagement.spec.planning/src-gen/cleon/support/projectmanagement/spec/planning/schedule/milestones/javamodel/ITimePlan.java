package cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITimePlan extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter, cleon.common.resources.spec.resources.workstate.javamodel.IWorkStateAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3c633cfe-3761-11e5-95d9-2b04d7ab02d9");
  
  // relations
  
  public cleon.common.resources.spec.calendar.javamodel.IDay selectStart();
  
  public cleon.common.resources.spec.calendar.javamodel.IDay selectEnd();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3c633cfe-3761-11e5-95d9-2b04d7ab02d9,38NsomoXTwRnGlv7q9l8jbsG6rE=] */
