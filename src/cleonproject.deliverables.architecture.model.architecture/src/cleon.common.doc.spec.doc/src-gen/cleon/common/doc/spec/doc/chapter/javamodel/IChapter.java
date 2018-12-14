package cleon.common.doc.spec.doc.chapter.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IChapter extends cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription, cleon.common.doc.spec.doc.javamodel.IDocumentElementComposite {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("44b08026-d86d-11e4-aa2f-c11242a92b60");
  
  // relations
  
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs();
  
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter> selectChapters();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,44b08026-d86d-11e4-aa2f-c11242a92b60,cE2yc9fCzpse7ub/c9veXwGkQmc=] */
