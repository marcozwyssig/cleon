package cleon.analysis.spec.drivers.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IGoal extends cleon.doc.spec.chapter.javamodel.IChapterWithDescription, cleon.doc.spec.chapter.paragraph.typedtable.javamodel.ITypedTable {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0797167b-3c15-11e5-9962-cf3035adb922");
  
  // relations
  
  public cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph selectGoalname();
  
  public cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph selectGoaldescription();
  
  public cleon.analysis.spec.drivers.javamodel.IGoalImportance selectImportance();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0797167b-3c15-11e5-9962-cf3035adb922,rcdwt2edEF8/bg1Fa6LQMPFB/OQ=] */
