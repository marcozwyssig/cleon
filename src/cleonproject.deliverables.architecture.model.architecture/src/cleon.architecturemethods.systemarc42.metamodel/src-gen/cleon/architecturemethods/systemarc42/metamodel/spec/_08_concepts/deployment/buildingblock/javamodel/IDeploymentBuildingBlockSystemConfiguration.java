package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDeploymentBuildingBlockSystemConfiguration extends ch.actifsource.core.javamodel.IDecorator, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.javamodel.IDeployOnConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3d5f83dd-fe50-11ea-abcb-bfad67a56d79");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration selectDeployed();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3d5f83dd-fe50-11ea-abcb-bfad67a56d79,0MWM5x6ROvibim1uTpuJAAnVUlQ=] */
