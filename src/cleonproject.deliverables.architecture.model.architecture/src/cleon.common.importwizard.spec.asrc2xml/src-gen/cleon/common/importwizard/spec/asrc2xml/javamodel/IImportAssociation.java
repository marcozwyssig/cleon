package cleon.common.importwizard.spec.asrc2xml.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IImportAssociation extends cleon.common.importwizard.spec.asrc2xml.javamodel.IAbstractImportElement {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("5bd29123-26c1-11e8-a805-991f3ff583b7");
  
  public java.lang.String selectXmlref();
  
  // relations
  
  public ch.actifsource.core.javamodel.IAssociation selectAssocation();
  
  public ch.actifsource.core.javamodel.IResource selectObject();
  
  public ch.actifsource.core.javamodel.IRelation selectSelect();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,5bd29123-26c1-11e8-a805-991f3ff583b7,FTK1hnhbnUZQisD421LRUYlgomY=] */
