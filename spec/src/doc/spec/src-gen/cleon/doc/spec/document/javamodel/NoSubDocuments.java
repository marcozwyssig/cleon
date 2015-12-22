package cleon.doc.spec.document.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class NoSubDocuments extends DynamicResource implements INoSubDocuments {

  // abstract implementation, only used for static method calls
  private NoSubDocuments() {
    super(INoSubDocuments.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.doc.spec.document.javamodel.INoSubDocuments selectToMeNoDocuments(cleon.doc.spec.document.javamodel.ISubDocument object) {
    return _getToMeSingle(object.getRepository(), cleon.doc.spec.document.javamodel.INoSubDocuments.class, cleon.doc.spec.document.DocumentPackage.NoSubDocuments_noDocuments, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,78feddf5-31f7-11e5-bd99-eda9ce254b0b,YHM/nze3kh2yyBitIlUfqzwyhQo=] */
