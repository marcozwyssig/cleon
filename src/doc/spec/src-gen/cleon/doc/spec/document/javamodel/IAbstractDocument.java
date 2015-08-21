package cleon.doc.spec.document.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractDocument extends cleon.doc.spec.javamodel.IUseDocumentElementComposite, cleon.doc.spec.paragraph.javamodel.IParagraphOwnDocumentElementComposite, cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6d2b5eb0-47cb-11e5-9568-fbe9ec4a688c");
  
  // relations
  
  public java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> selectDocuments();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6d2b5eb0-47cb-11e5-9568-fbe9ec4a688c,plOFNes48h9kyfo4DaX4qDJHzEg=] */
