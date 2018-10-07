package cleon.applications.actifsource.spec.asrc2xml.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IImportClass extends cleon.applications.actifsource.spec.asrc2xml.javamodel.IAbstractImportElement, cleon.applications.actifsource.spec.asrc2xml.javamodel.IAbstractImportClass {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9f4f0c3f-2217-11e8-8247-038452bbec5f");
  
  // relations
  
  public ch.actifsource.core.javamodel.IClass selectClass();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.applications.actifsource.spec.asrc2xml.javamodel.IAbstractImportAttribute> selectMapAttr();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9f4f0c3f-2217-11e8-8247-038452bbec5f,fjirg+lt56oAbkxtw0Zf8tTO/24=] */
