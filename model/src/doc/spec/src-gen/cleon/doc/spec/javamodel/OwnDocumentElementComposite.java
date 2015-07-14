package cleon.doc.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;


public abstract class OwnDocumentElementComposite extends DynamicResource implements IOwnDocumentElementComposite {

  // abstract implementation, only used for static method calls
  private OwnDocumentElementComposite() {
    super(IOwnDocumentElementComposite.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.doc.spec.javamodel.IOwnDocumentElementComposite selectToMeOwnDocumentElements(cleon.doc.spec.javamodel.IDocumentElement object) {
    return _getToMeSingle(object.getRepository(), cleon.doc.spec.javamodel.IOwnDocumentElementComposite.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,822fffdf-28ba-11e5-bdaf-69a48f49df43,1ToUPG5df03VSAHTU+U8qh/DQ8w=] */
