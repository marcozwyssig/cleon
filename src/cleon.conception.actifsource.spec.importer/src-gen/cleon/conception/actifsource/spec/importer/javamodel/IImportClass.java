package cleon.conception.actifsource.spec.importer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IImportClass extends cleon.conception.actifsource.spec.importer.javamodel.IAbstractImportElement {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9f4f0c3f-2217-11e8-8247-038452bbec5f");
  
  // relations
  
  public ch.actifsource.core.javamodel.IClass selectClass();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.actifsource.spec.importer.javamodel.IImportAttribute> selectMapAttr();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.actifsource.spec.importer.javamodel.IImportOwnRelation> selectMapOwnRel();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.actifsource.spec.importer.javamodel.IImportAssociation> selectMapAssoc();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9f4f0c3f-2217-11e8-8247-038452bbec5f,3YVpl1+AfpppTrrc8o0mBZNvxyI=] */
