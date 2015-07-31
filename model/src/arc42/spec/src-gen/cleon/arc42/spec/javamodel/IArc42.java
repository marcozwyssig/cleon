package cleon.arc42.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IArc42 extends cleon.doc.spec.document.javamodel.INamedDocument, cleon.doc.spec.document.javamodel.INoChaptersInDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2cbcf671-ffcc-11e4-ac0a-959b440f987f");
  
  // relations
  
  public java.util.List<? extends cleon.arc42.spec.javamodel.IArc42_SubDocument> selectArc42_subDocuments();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2cbcf671-ffcc-11e4-ac0a-959b440f987f,agDm7+m1kn1927hT3xqYxDefQic=] */
