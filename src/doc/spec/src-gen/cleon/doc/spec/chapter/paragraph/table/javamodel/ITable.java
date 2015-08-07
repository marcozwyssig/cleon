package cleon.doc.spec.chapter.paragraph.table.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITable extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fd7635ee-3c49-11e5-871f-6beac6a7c24b");
  
  // relations
  
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.table.javamodel.IColumn> selectColumns();
  
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.table.javamodel.IRow> selectRows();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fd7635ee-3c49-11e5-871f-6beac6a7c24b,w5sYjtbdQNC8B4icsBMyNXZeXBs=] */
