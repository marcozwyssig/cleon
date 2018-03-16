package cleon.common.doc.spec.doc.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class DocumentElement extends DynamicResource implements IDocumentElement {

  // abstract implementation, only used for static method calls
  private DocumentElement() {
    super(IDocumentElement.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,651f921b-d86d-11e4-aa2f-c11242a92b60,bWx+Pnm/mJzpLE/QfwsFPUM2Unc=] */
