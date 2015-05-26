package cleon.doc.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class DocumentElementComposite extends DynamicResource implements IDocumentElementComposite {

  // abstract implementation, only used for static method calls
  private DocumentElementComposite() {
    super(IDocumentElementComposite.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.doc.spec.javamodel.IDocumentElementComposite selectToMeDocumentElements(cleon.doc.spec.javamodel.IDocumentElement object) {
    return _getToMeSingle(object.getRepository(), cleon.doc.spec.javamodel.IDocumentElementComposite.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,95c666da-d86d-11e4-aa2f-c11242a92b60,yMBp/bP051cyget5zxdxu/+gIEo=] */
