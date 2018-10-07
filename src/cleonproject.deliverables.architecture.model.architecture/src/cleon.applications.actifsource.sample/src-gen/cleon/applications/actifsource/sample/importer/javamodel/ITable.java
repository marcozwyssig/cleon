package cleon.applications.actifsource.sample.importer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITable extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f51318cc-221f-11e8-8749-cb7f4d6924d3");
  
  // attributes
  
  public java.lang.String selectSize();
  
  public java.lang.String selectDescription();
  
  public java.util.List<? extends cleon.applications.actifsource.sample.importer.javamodel.IPerson> selectPersons();
  
  public java.util.List<? extends cleon.applications.actifsource.sample.importer.javamodel.IChair> selectChairs();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f51318cc-221f-11e8-8749-cb7f4d6924d3,xTB2xLE4KR8Md2CsJP0MCgnODg8=] */
