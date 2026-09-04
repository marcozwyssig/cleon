package cleon.common.doc.metamodel.spec.paragraph.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IChapterReference extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IStandardParagraph {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("5c6eca85-dd88-11ef-9ced-81351e97716a");
  
  // relations
  
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapterRef();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,5c6eca85-dd88-11ef-9ced-81351e97716a,GyHkCE2mdOh9wUb8iZlU+ED9OqM=] */
