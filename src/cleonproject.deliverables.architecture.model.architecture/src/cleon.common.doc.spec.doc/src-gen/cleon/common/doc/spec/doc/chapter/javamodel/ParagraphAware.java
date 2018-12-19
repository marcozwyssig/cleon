package cleon.common.doc.spec.doc.chapter.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ParagraphAware extends DynamicResource implements IParagraphAware {

  // abstract implementation, only used for static method calls
  private ParagraphAware() {
    super(IParagraphAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.doc.spec.doc.chapter.javamodel.IParagraphAware selectToMeParagraphs(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph object) {
    return _getToMeSingle(object.getRepository(), cleon.common.doc.spec.doc.chapter.javamodel.IParagraphAware.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f83f65a4-0397-11e9-bcaf-399800b0eeb7,+iaxYI6YT6l7g8gpfpk7ruQQPk4=] */
