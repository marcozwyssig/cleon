package cleon.modelinglanguages.uml.template.xmi.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IXmiAssociation extends ch.actifsource.core.javamodel.INamedResource, cleon.modelinglanguages.uml.template.xmi.javamodel.IXmiClass {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f868af21-6c90-11e7-8bc1-2fb13127901b");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.uml.template.xmi.javamodel.IXmiClass> selectAssociations();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f868af21-6c90-11e7-8bc1-2fb13127901b,GhQHI3FmzZzq6yLX5x/p1zp69yQ=] */
