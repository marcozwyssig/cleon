package cleon.common.doc.metamodel.spec.paragraph.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class TextAware extends DynamicResource implements ITextAware {

  // abstract implementation, only used for static method calls
  private TextAware() {
    super(ITextAware.TYPE_ID);
  }
  
  public static cleon.common.doc.metamodel.spec.paragraph.javamodel.ITextAware selectToMeTextTranslation(cleon.common.doc.metamodel.spec.paragraph.javamodel.ILanguageTextTranslation object) {
    return _getToMeSingle(object.getRepository(), cleon.common.doc.metamodel.spec.paragraph.javamodel.ITextAware.class, cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.TextAware_textTranslation, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1961c00f-cac4-11ec-8012-87976b97438b,NtwiF0a+B+9PM6JoFzLd2C3w2aY=] */
