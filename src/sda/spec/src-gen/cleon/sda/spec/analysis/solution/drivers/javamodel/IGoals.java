package cleon.sda.spec.analysis.solution.drivers.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IGoals extends cleon.doc.spec.chapter.javamodel.IChapter, cleon.doc.spec.chapter.javamodel.INoChapters, cleon.doc.spec.paragraph.javamodel.INoParagraph {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f6187db1-3c48-11e5-871f-6beac6a7c24b");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.analysis.solution.drivers.javamodel.IGoal> selectGoals();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f6187db1-3c48-11e5-871f-6beac6a7c24b,yudj1iG9HHvMF5B0XV5rv+kYiOQ=] */
