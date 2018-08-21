package cleon.common.doc.spec.doc.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class NoDocumentElementComposite extends DynamicResource implements INoDocumentElementComposite {

  // abstract implementation, only used for static method calls
  private NoDocumentElementComposite() {
    super(INoDocumentElementComposite.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.doc.spec.doc.javamodel.INoDocumentElementComposite selectToMeDocumentElements(cleon.common.doc.spec.doc.javamodel.IDocumentElement object) {
    return _getToMeSingle(object.getRepository(), cleon.common.doc.spec.doc.javamodel.INoDocumentElementComposite.class, cleon.common.doc.spec.doc.DocPackage.NoDocumentElementComposite_documentElements, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,25f3e2f2-a535-11e8-a2c4-7500fc0b7ba9,sxY3Ji3revKlYrq+dzWWuJpCXbY=] */
