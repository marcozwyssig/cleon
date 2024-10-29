package cleon.common.doc.metamodel.spec.paragraph.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractList extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IStandardParagraph, cleon.common.doc.metamodel.spec.chapter.javamodel.IParagraphAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("39c294a9-24f7-11ef-83a6-fdf80672957b");
  
  // relations
  
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IListItem> selectListItem();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,39c294a9-24f7-11ef-83a6-fdf80672957b,tNZnksW5QoaIj17hZtd8LJ/W/Hc=] */
