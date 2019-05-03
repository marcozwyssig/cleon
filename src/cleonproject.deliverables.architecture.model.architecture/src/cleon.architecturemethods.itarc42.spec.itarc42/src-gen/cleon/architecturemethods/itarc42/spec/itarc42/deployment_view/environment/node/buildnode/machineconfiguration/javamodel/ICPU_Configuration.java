package cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.buildnode.machineconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICPU_Configuration extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8afbac91-2afe-11e9-9692-65766bc2daa5");
  
  // relations
  
  public cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.systemconfiguration.machinesystemconfiguration.javamodel.IMachineSystemConfiguration selectMachineConfiguration();
  
  public cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.systemconfiguration.machinesystemconfiguration.javamodel.ICPU selectCpu();
  
  public cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.systemconfiguration.machinesystemconfiguration.javamodel.ICore selectCore();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8afbac91-2afe-11e9-9692-65766bc2daa5,t0t1mSRZycqgdMKyu9ZXWdqSij8=] */
