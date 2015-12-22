package cleon.doc.spec.chapter.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IChapterOwnDocumentElementComposite extends cleon.doc.spec.javamodel.IOwnDocumentElementComposite {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("dddb0a30-466c-11e5-ba74-cb2e95044e1c");
  
  // relations
  
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,dddb0a30-466c-11e5-ba74-cb2e95044e1c,hxSrnkCSZ2GIQaEFEI9jBE2yWcE=] */
