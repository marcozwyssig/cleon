package cleon.common.doc.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IChapterAware extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElementComposite {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a97ec1a8-2169-11e9-a054-db6d80fba790");
  
  // relations
  
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a97ec1a8-2169-11e9-a054-db6d80fba790,l4F46UUed3h2G9M0JD53wG3Q7fo=] */
