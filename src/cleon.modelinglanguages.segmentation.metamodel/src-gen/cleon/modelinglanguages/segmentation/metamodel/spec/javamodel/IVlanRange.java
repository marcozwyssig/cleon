package cleon.modelinglanguages.segmentation.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IVlanRange extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IAbstractVlan {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7b5e4b55-f756-11ef-9619-857aad3ec118");
  
  // relations
  
  public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IVlan selectFrom_vlan();
  
  public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IVlan selectTo_vlan();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7b5e4b55-f756-11ef-9619-857aad3ec118,feMYDWLKXai8MTWcz4LVC2OyI9k=] */
