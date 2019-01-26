package cleon.common.doc.spec.doc.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ChapterAware extends DynamicResource implements IChapterAware {

  // abstract implementation, only used for static method calls
  private ChapterAware() {
    super(IChapterAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.doc.spec.doc.javamodel.IChapterAware selectToMeChapters(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter object) {
    return _getToMeSingle(object.getRepository(), cleon.common.doc.spec.doc.javamodel.IChapterAware.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a97ec1a8-2169-11e9-a054-db6d80fba790,hPCLfzIvsrAs3d3Hmclxvl5IyO0=] */
