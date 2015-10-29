package cleon.analysis.spec.solution.evaluation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IResult extends cleon.doc.spec.chapter.javamodel.IChapter, cleon.doc.spec.chapter.javamodel.INoChapters, cleon.doc.spec.paragraph.javamodel.INoParagraph {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("11cf7692-3c2a-11e5-9962-cf3035adb922");
  
  // relations
  
  public cleon.analysis.spec.solution.evaluation.javamodel.IBest selectBest();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,11cf7692-3c2a-11e5-9962-cf3035adb922,61FhuPxPYks8mvPERlLeNf3AlhA=] */
