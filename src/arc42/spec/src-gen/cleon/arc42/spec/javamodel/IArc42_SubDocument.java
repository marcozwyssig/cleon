package cleon.arc42.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IArc42_SubDocument extends cleon.doc.spec.document.javamodel.INoSubDocuments, cleon.doc.spec.document.javamodel.ISubDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("717dfe0f-31fc-11e5-bd99-eda9ce254b0b");
  
  // relations
  
  public java.util.List<? extends cleon.arc42.spec.javamodel.IArc42_Section> selectSections();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,717dfe0f-31fc-11e5-bd99-eda9ce254b0b,P0JgT6qlw3HfnE0Oc42N6H0leoY=] */
