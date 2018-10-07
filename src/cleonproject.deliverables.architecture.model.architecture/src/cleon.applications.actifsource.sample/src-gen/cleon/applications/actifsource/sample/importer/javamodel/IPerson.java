package cleon.applications.actifsource.sample.importer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPerson extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("dd7a7214-221f-11e8-8749-cb7f4d6924d3");
  
  // attributes
  
  public java.lang.Integer selectAge();
  
  public java.util.List<? extends cleon.applications.actifsource.sample.importer.javamodel.IChair> selectChair();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,dd7a7214-221f-11e8-8749-cb7f4d6924d3,wnz5tsCzSOZSCgUosEtdT8ZuRzI=] */
