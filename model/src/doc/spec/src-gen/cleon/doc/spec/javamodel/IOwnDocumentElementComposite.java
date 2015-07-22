package cleon.doc.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOwnDocumentElementComposite extends cleon.doc.spec.javamodel.IDocumentElementComposite {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("822fffdf-28ba-11e5-bdaf-69a48f49df43");
  
  // relations
  
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,822fffdf-28ba-11e5-bdaf-69a48f49df43,WvAXLzXrFe6VX4ozy+wvmozUCJs=] */
