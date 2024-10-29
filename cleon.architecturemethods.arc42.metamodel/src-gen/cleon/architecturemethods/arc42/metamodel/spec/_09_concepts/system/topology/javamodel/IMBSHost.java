package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMBSHost extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSingleHost, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractNumberAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7d5ed092-57c9-11ea-bd7a-4baf1bc87b3c");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ILocation selectBbu();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7d5ed092-57c9-11ea-bd7a-4baf1bc87b3c,gdmSD67FsUjRSadPY3MAt4w2FWA=] */
