package cleon.doc.spec.document.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface INoChaptersInDocument extends cleon.doc.spec.document.javamodel.IDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ff2107cf-3479-11e5-909a-4bcced25d7ee");
  
  // relations
  
  public cleon.doc.spec.chapter.javamodel.IChapter selectNoChapters();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ff2107cf-3479-11e5-909a-4bcced25d7ee,Op/TiegLPRE/e49F8jZgQodkhA4=] */
