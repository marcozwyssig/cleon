package cleon.common.doc.doc.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class DocumentElementComposite extends DynamicResource implements IDocumentElementComposite {

  // abstract implementation, only used for static method calls
  private DocumentElementComposite() {
    super(IDocumentElementComposite.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.doc.doc.spec.javamodel.IDocumentElementComposite selectToMeDocumentElements(cleon.common.doc.doc.spec.javamodel.IDocumentElement object) {
    return _getToMeSingle(object.getRepository(), cleon.common.doc.doc.spec.javamodel.IDocumentElementComposite.class, cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b8a12540-307a-11e5-8cdc-d5b441c8c3df,zBMJuip0qzL3pH8Ox4axFfNae5A=] */
