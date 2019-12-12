package cleon.common.doc.doc.spec.documentlanguage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class DocumentLanguage extends DynamicResource implements IDocumentLanguage {

  // abstract implementation, only used for static method calls
  private DocumentLanguage() {
    super(IDocumentLanguage.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e106709e-2234-11e9-a054-db6d80fba790,CLHDvPscAiMb3qd51eJf26IrH5s=] */
