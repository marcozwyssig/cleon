package cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMemory_Configuration extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7b0d2a12-2b02-11e9-9692-65766bc2daa5");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.machine.javamodel.IMachineSystemConfiguration selectMachineConfiguration();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.buildingblock.javamodel.IMemory selectMemory();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7b0d2a12-2b02-11e9-9692-65766bc2daa5,pR3yaX0Rl65Vn4nkLaSK0nXd2/U=] */
