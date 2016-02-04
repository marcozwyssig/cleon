package cleon.sda.spec.projectmanagement.planning.targetdates.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITargetDates extends cleon.doc.spec.chapter.javamodel.IChapter, cleon.doc.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("cf7f1e08-c1d4-11e5-bbf3-bdd12a9e2b3d");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.projectmanagement.planning.targetdates.javamodel.ITargetDate> selectTargetDates();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,cf7f1e08-c1d4-11e5-bbf3-bdd12a9e2b3d,uTr74p5e8mNoahWohTZQCfc+Teg=] */
