package cleon.doc.spec.chapter.paragraph.table.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICell extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("37a450a4-3c4a-11e5-871f-6beac6a7c24b");
  
  // relations
  
  public cleon.doc.spec.chapter.paragraph.table.javamodel.IColumn selectColumn();
  
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> selectParagraph();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,37a450a4-3c4a-11e5-871f-6beac6a7c24b,UIEPA1MAk+dKrgAMxw253iAOz9o=] */
