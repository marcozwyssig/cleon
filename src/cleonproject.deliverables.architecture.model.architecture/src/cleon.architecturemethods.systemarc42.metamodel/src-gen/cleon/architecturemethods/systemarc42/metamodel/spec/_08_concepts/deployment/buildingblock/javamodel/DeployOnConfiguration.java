package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class DeployOnConfiguration extends DynamicResource implements IDeployOnConfiguration {

  // abstract implementation, only used for static method calls
  private DeployOnConfiguration() {
    super(IDeployOnConfiguration.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.javamodel.IDeployOnConfiguration selectToMeDeployOn(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.javamodel.IDeploymentBuildingBlockSystemConfiguration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.javamodel.IDeployOnConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.BuildingblockPackage.DeployOnConfiguration_deployOn, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e6750a38-fe50-11ea-abcb-bfad67a56d79,6fmTX2F1+/QKsOxGmu8kIJPQ8Ok=] */
