package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractSiteWithZone extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ISite {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fd112c3e-ec15-11e9-8e1e-d59e76bdbf06");
  
  public java.lang.String selectOwner();
  
  // relations
  
  public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INetDomainZone selectZone();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fd112c3e-ec15-11e9-8e1e-d59e76bdbf06,qaPUvEMKOFC82z1xIM5FO61CzjE=] */
