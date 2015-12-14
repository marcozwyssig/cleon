package cleon.sda.spec.analysis.solution.drivers.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IGoals extends cleon.doc.spec.chapter.javamodel.IChapterWithDescription, cleon.doc.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f6187db1-3c48-11e5-871f-6beac6a7c24b");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.analysis.solution.drivers.javamodel.IGoal> selectGoals();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f6187db1-3c48-11e5-871f-6beac6a7c24b,yGjklDEyOegX3y5oceDNaLF5K5E=] */
