package cleon.doc.spec.chapter.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IChapterWithColumnDescription extends cleon.doc.spec.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3b7609c2-3cca-11e5-871f-6beac6a7c24b");
  
  // relations
  
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.ITextParagraph> selectDescription();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3b7609c2-3cca-11e5-871f-6beac6a7c24b,sxGyMqH2mn+SZWPrhxNe2Li4PB8=] */
