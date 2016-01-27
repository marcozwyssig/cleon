package cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRelease extends cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.ITimePlan, cleon.doc.spec.chapter.javamodel.INamedChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2755120c-3761-11e5-95d9-2b04d7ab02d9");
  
  public java.lang.Integer selectDaysPerSprint();
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.ISprint> selectSprints();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2755120c-3761-11e5-95d9-2b04d7ab02d9,eVLpCdPsVm9K5lLRK+Hw3Zz8Atw=] */
