package cleon.common.doc.spec.doc.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class OnlyStandardDocumentElementComposite extends DynamicResource implements IOnlyStandardDocumentElementComposite {

  // abstract implementation, only used for static method calls
  private OnlyStandardDocumentElementComposite() {
    super(IOnlyStandardDocumentElementComposite.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.doc.spec.doc.javamodel.IOnlyStandardDocumentElementComposite selectToMeDocumentElements(cleon.common.doc.spec.doc.javamodel.IStandardDocumentElement object) {
    return _getToMeSingle(object.getRepository(), cleon.common.doc.spec.doc.javamodel.IOnlyStandardDocumentElementComposite.class, cleon.common.doc.spec.doc.DocPackage.OnlyStandardDocumentElementComposite_documentElements, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7ab7c627-e98b-11e8-af5c-a5aa9dc47205,P5QLCVcLJ1Irl+QrwV4FzEq8oqk=] */
