package cleon.common.doc.metamodel.spec.paragraph.table.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRow extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2a47c140-3c4a-11e5-871f-6beac6a7c24b");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.doc.metamodel.spec.paragraph.table.javamodel.ICell> selectCell();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2a47c140-3c4a-11e5-871f-6beac6a7c24b,0qnNhCWY4LqGeb4U8UpDih+VmAE=] */
