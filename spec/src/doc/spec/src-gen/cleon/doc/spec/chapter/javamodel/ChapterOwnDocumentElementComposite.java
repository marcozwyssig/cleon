package cleon.doc.spec.chapter.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ChapterOwnDocumentElementComposite extends DynamicResource implements IChapterOwnDocumentElementComposite {

  // abstract implementation, only used for static method calls
  private ChapterOwnDocumentElementComposite() {
    super(IChapterOwnDocumentElementComposite.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite selectToMeChapters(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite object) {
    return _getToMeSingle(object.getRepository(), cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,dddb0a30-466c-11e5-ba74-cb2e95044e1c,DpPiFopI4Z4D9v5bomUJxMGWjQM=] */
