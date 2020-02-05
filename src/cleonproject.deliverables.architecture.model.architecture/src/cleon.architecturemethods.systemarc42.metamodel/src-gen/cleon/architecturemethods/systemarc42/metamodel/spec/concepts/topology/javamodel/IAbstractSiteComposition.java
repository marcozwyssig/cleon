package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractSiteComposition extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ISite {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f40a942e-3632-11ea-b5c2-e3e297a45d39");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ISite> selectSubsite();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f40a942e-3632-11ea-b5c2-e3e297a45d39,xeAP/JgFw5+reqtIu7/zSiHiRXA=] */
