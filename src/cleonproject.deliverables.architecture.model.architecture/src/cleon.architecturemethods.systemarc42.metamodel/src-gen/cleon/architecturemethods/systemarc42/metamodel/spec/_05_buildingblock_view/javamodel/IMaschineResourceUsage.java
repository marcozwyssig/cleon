package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMaschineResourceUsage extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("df643bd9-a9a8-11eb-80cf-abd0e6d5d574");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.machine.javamodel.IMachineSystemConfiguration selectMachineSystemConfiguration();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.machine.javamodel.ICore> selectCoreUsage();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.machine.javamodel.IMemory> selectMemoryUsage();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.machine.javamodel.IDisk> selectDiskUsage();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,df643bd9-a9a8-11eb-80cf-abd0e6d5d574,q/5J01drZiB5onfnl8QZV636kM4=] */
