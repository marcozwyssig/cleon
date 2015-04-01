package cleon.doc.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDocument extends cleon.doc.spec.javamodel.IDocumentElementComposite, ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3e870b86-d86d-11e4-aa2f-c11242a92b60");
  
  // relations
  
  public java.util.List<? extends cleon.doc.spec.javamodel.IChapter> selectChapters();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3e870b86-d86d-11e4-aa2f-c11242a92b60,DcDC5KMCQdApBQr4z0/rqO79okw=] */
