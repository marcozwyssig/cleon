package cleon.common.doc.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOnlyStandardElementsChapter extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, cleon.common.doc.metamodel.spec.chapter.javamodel.IParagraphAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7ab7c627-e98b-11e8-af5c-a5aa9dc47205");
  
  // relations
  
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IStandardParagraph> selectStandardParagraphs();
  
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter> selectChapters();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7ab7c627-e98b-11e8-af5c-a5aa9dc47205,WILsVvRjeH5MGX9yHI7UeDQ9p6k=] */
