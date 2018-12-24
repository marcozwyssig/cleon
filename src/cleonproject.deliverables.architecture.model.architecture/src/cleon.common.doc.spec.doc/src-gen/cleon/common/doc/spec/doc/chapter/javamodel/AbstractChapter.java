package cleon.common.doc.spec.doc.chapter.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractChapter extends DynamicResource implements IAbstractChapter {

  // abstract implementation, only used for static method calls
  private AbstractChapter() {
    super(IAbstractChapter.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter selectToMeChapters(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter object) {
    return _getToMeSingle(object.getRepository(), cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.AbstractChapter_chapters, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,44b08026-d86d-11e4-aa2f-c11242a92b60,NKh9cG3M6FS9hOJ0zIQNyLPNH7s=] */
