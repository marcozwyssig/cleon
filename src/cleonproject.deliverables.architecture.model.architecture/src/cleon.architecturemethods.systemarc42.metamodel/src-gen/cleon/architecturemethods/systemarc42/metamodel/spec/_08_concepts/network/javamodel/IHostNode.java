package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IHostNode extends cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1580b55d-92a0-11e9-b2b4-f340ae70802c");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost selectHost();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.domain.javamodel.IDomain> selectRestrictToDomains();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1580b55d-92a0-11e9-b2b4-f340ae70802c,havi4+wGKgS2YQEuDESqYTZXwEg=] */
