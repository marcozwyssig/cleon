package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRN extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSiteWithHosts, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSiteComposition {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3615fdfa-936d-11e9-8139-e76b19cfb4bf");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IRN_LogicalSite> selectLogicalSites();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3615fdfa-936d-11e9-8139-e76b19cfb4bf,qOcdBMYKJsMGiXDjltRz671GHuI=] */
