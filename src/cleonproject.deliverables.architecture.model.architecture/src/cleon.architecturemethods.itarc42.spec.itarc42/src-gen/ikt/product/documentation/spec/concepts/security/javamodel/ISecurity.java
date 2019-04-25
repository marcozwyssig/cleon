package ikt.product.documentation.spec.concepts.security.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISecurity extends ikt.product.documentation.spec.concepts.javamodel.IConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9515e875-0eae-11e9-9f19-6d15636f4ecc");
  
  // relations
  
  public ikt.product.documentation.spec.concepts.security.realm.javamodel.IDirectoryService selectRealm();
  
  public ikt.product.documentation.spec.concepts.security.rbac.javamodel.IRBAC selectRbac();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9515e875-0eae-11e9-9f19-6d15636f4ecc,zJ3x4bCj8ls5EHc6mfzyLw6EwMM=] */
