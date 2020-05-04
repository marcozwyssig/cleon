package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITN extends cleon.common.resources.metamodel.spec.naming.javamodel.IShortName, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ISite, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteComposition {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c0a851b6-9286-11e9-959e-8115c2f9e41e");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRN> selectMss();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRN> selectHss();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITDM> selectTdm();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c0a851b6-9286-11e9-959e-8115c2f9e41e,Qm3grjLpinPPHNK0QSnlrnbtJQM=] */
