package cleon.doc.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDocumentElementComposite extends cleon.doc.spec.javamodel.IDocumentElement {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("95c666da-d86d-11e4-aa2f-c11242a92b60");
  
  // relations
  
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectDocumentElements();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,95c666da-d86d-11e4-aa2f-c11242a92b60,cCkUcE4ZQb2FICbtv8purhFzAS8=] */
