package cleon.doc.spec.chapter.paragraph.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAdmonition extends ch.actifsource.core.javamodel.INamedResource, cleon.doc.spec.chapter.paragraph.javamodel.IParagraph, cleon.doc.spec.javamodel.IOwnDocumentElementComposite {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6e2a6478-308a-11e5-8cdc-d5b441c8c3df");
  
  // relations
  
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> selectPararaphs();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6e2a6478-308a-11e5-8cdc-d5b441c8c3df,AN2ydNMlbqnmNKmz2jXfjRwNLyA=] */
