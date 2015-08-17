package cleon.analysis.spec.evaluation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEvaluation extends ch.actifsource.core.javamodel.IDecorator, cleon.doc.spec.chapter.javamodel.IChapter, cleon.doc.spec.chapter.paragraph.typedtable.javamodel.ITypedTable {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7f4013d4-3c1a-11e5-9962-cf3035adb922");
  
  // relations
  
  public cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph selectAssessment();
  
  public cleon.analysis.spec.drivers.javamodel.IGoal selectGoal();
  
  public cleon.analysis.spec.evaluation.javamodel.IScore selectScore();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7f4013d4-3c1a-11e5-9962-cf3035adb922,Uwj/recLusFEp8K0M/HxNxviCpw=] */
