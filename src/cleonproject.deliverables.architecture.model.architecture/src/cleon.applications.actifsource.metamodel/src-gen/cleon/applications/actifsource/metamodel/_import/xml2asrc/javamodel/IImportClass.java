package cleon.applications.actifsource.metamodel._import.xml2asrc.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IImportClass extends cleon.applications.actifsource.metamodel._import.xml2asrc.javamodel.IAbstractImportElement, cleon.applications.actifsource.metamodel._import.xml2asrc.javamodel.IAbstractImportClass {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9f4f0c3f-2217-11e8-8247-038452bbec5f");
  
  // relations
  
  public ch.actifsource.core.javamodel.IClass selectClass();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.applications.actifsource.metamodel._import.xml2asrc.javamodel.IAbstractImportAttribute> selectMapAttr();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9f4f0c3f-2217-11e8-8247-038452bbec5f,rH+BHCTXQbA+tUDVDl4lA2bnPYc=] */
