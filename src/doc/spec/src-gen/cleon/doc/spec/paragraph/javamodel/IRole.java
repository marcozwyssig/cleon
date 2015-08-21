package cleon.doc.spec.paragraph.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRole extends ch.actifsource.core.javamodel.INamedResource, cleon.doc.spec.paragraph.javamodel.IParagraph, cleon.doc.spec.javamodel.IOwnDocumentElementComposite {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("06d20cec-3089-11e5-8cdc-d5b441c8c3df");
  
  // relations
  
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphs();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,06d20cec-3089-11e5-8cdc-d5b441c8c3df,RdhKhFePuKsaT+b125LpyBoL82k=] */
