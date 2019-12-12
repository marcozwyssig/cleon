package cleon.common.doc.doc.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOnlyStandardElementsChapter extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7ab7c627-e98b-11e8-af5c-a5aa9dc47205");
  
  // relations
  
  public java.util.List<? extends cleon.common.doc.doc.spec.paragraph.javamodel.IStandardParagraph> selectParagraphs();
  
  public java.util.List<? extends cleon.common.doc.doc.spec.chapter.javamodel.IChapter> selectChapters();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7ab7c627-e98b-11e8-af5c-a5aa9dc47205,FWa2fPp0TgZ5/qBD6CTtC29Btv8=] */
