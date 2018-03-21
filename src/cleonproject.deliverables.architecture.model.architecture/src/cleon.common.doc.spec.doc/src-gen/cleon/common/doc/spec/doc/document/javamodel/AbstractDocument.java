package cleon.common.doc.spec.doc.document.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractDocument extends DynamicResource implements IAbstractDocument {

  // abstract implementation, only used for static method calls
  private AbstractDocument() {
    super(IAbstractDocument.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.doc.spec.doc.document.javamodel.IAbstractDocument selectToMeDocumentElements(cleon.common.doc.spec.doc.javamodel.IDocumentElement object) {
    return _getToMeSingle(object.getRepository(), cleon.common.doc.spec.doc.document.javamodel.IAbstractDocument.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6d2b5eb0-47cb-11e5-9568-fbe9ec4a688c,AxsyZVgq4onvI+pT9ulsLtwvAUE=] */