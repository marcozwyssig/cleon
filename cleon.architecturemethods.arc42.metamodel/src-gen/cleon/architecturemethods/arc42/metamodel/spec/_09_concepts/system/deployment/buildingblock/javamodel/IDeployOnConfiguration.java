package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDeployOnConfiguration extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e6750a38-fe50-11ea-abcb-bfad67a56d79");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.buildingblock.javamodel.IDeploymentBuildingBlockSystemConfiguration> selectDeployOn();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e6750a38-fe50-11ea-abcb-bfad67a56d79,CZ2jIqI6EZGGBm3z5FmButpTcHM=] */
