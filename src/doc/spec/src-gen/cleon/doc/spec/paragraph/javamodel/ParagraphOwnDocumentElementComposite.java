package cleon.doc.spec.paragraph.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ParagraphOwnDocumentElementComposite extends DynamicResource implements IParagraphOwnDocumentElementComposite {

  // abstract implementation, only used for static method calls
  private ParagraphOwnDocumentElementComposite() {
    super(IParagraphOwnDocumentElementComposite.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.doc.spec.paragraph.javamodel.IParagraphOwnDocumentElementComposite selectToMeParagraphes(cleon.doc.spec.paragraph.javamodel.IParagraph object) {
    return _getToMeSingle(object.getRepository(), cleon.doc.spec.paragraph.javamodel.IParagraphOwnDocumentElementComposite.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,360e7ec0-466c-11e5-ba74-cb2e95044e1c,1t14Zq+hJ1XjZ3LmOLIxGlvrrGw=] */
