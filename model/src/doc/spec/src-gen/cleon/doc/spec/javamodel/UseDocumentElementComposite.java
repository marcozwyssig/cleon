package cleon.doc.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;


public abstract class UseDocumentElementComposite extends DynamicResource implements IUseDocumentElementComposite {

  // abstract implementation, only used for static method calls
  private UseDocumentElementComposite() {
    super(IUseDocumentElementComposite.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.doc.spec.javamodel.IUseDocumentElementComposite selectToMeUseDocumentElements(cleon.doc.spec.javamodel.IDocumentElement object) {
    return _getToMeSingle(object.getRepository(), cleon.doc.spec.javamodel.IUseDocumentElementComposite.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,95c666da-d86d-11e4-aa2f-c11242a92b60,llU2UANJwT/NB8Zr/jI81ZrwdoE=] */
