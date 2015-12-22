package cleon.doc.spec.document.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractDocument extends DynamicResource implements IAbstractDocument {

  // abstract implementation, only used for static method calls
  private AbstractDocument() {
    super(IAbstractDocument.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.doc.spec.document.javamodel.IAbstractDocument selectToMeDocuments(cleon.doc.spec.document.javamodel.ISubDocument object) {
    return _getToMeSingle(object.getRepository(), cleon.doc.spec.document.javamodel.IAbstractDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6d2b5eb0-47cb-11e5-9568-fbe9ec4a688c,TokWkV1HxelFfASIK6z8gLuriiw=] */
