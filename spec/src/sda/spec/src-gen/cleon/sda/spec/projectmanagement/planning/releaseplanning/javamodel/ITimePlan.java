package cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITimePlan extends cleon.doc.spec.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3c633cfe-3761-11e5-95d9-2b04d7ab02d9");
  
  // relations
  
  public cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay selectStart();
  
  public cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay selectEnd();
  
  public cleon.sda.spec.javamodel.IWorkState selectState();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3c633cfe-3761-11e5-95d9-2b04d7ab02d9,X3nWJnr8xfgEOGabVlgUwOVrp6w=] */
