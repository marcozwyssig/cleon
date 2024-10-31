package cleon.common.doc.metamodel.spec.paragraph.table.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICell extends ch.actifsource.core.javamodel.IDecorator, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription, cleon.common.doc.metamodel.spec.chapter.javamodel.IParagraphAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("37a450a4-3c4a-11e5-871f-6beac6a7c24b");
  
  // relations
  
  public cleon.common.doc.metamodel.spec.paragraph.table.javamodel.IColumn selectColumn();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,37a450a4-3c4a-11e5-871f-6beac6a7c24b,Qmw2/Mt/5EygOe3BAoYmDLN1d9o=] */
