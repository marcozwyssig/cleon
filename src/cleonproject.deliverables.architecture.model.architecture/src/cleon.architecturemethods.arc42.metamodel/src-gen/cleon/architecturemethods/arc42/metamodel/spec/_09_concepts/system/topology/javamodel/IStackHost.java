package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IStackHost extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractClusterHost, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractNumberAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("28ff7b0d-ebf4-11e9-8ba8-8b1ead537e79");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.INumberedHost selectHost();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,28ff7b0d-ebf4-11e9-8ba8-8b1ead537e79,xYsUcnLZ6DAqgQLg8Um4gRwrvzw=] */
