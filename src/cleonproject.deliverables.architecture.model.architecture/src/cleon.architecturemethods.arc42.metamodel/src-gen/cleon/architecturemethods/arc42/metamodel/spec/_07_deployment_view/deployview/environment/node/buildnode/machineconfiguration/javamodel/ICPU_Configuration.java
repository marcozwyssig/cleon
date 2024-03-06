package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.machineconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICPU_Configuration extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8afbac91-2afe-11e9-9692-65766bc2daa5");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.machine.javamodel.IMachineSystemConfiguration selectMachineConfiguration();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.ICore selectCore();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConfigurationConcept selectResourceBuildingBlockForSystemConfiguration();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8afbac91-2afe-11e9-9692-65766bc2daa5,in4qgnXNO8bg0IBpwhdol6WuW7Y=] */
