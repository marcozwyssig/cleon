package cleon.sda.spec.analysis.solution.drivers.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IGoal extends cleon.doc.spec.paragraph.typedtable.javamodel.ITypedTable {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0797167b-3c15-11e5-9962-cf3035adb922");
  
  // relations
  
  public cleon.doc.spec.paragraph.javamodel.ITextParagraph selectGoalname();
  
  public cleon.doc.spec.paragraph.javamodel.ITextParagraph selectGoaldescription();
  
  public cleon.sda.spec.analysis.solution.drivers.javamodel.IGoalImportance selectImportance();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0797167b-3c15-11e5-9962-cf3035adb922,5zdtsepUNpHVc74F+Ws2YLtJ3Rw=] */
