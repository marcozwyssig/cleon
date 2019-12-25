package cleon.applications.actifsource.metamodel._import.xml2asrc.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractImportClass extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("5ba53fa2-327c-11e8-925e-0378e2266aa0");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.applications.actifsource.metamodel._import.xml2asrc.javamodel.IAbstractImportAttribute> selectMapAttr();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.applications.actifsource.metamodel._import.xml2asrc.javamodel.IImportOwnRelation> selectMapOwnRel();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.applications.actifsource.metamodel._import.xml2asrc.javamodel.IImportAssociation> selectMapAssoc();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,5ba53fa2-327c-11e8-925e-0378e2266aa0,u2tGAGAlSif/U27tgAr5jiFQ2YE=] */
