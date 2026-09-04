package cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISystemConfigurationOperation extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ad4d87b3-1a61-11e9-b1cd-355f2e2f05a9");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration selectOperatingSystemConfiguration();
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.ILaunchingSystemConfiguration selectLaunchingSystemConfiguration();
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.javamodel.IChangeManagementSystemConfiguration selectChangeSystemConfiguration();
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IConductingAndSupervisingSystemConfiguration selectConductingAndSupervisingSystemConfiguration();
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IInterruptingSystemConfiguration selectInterruptingSystemConfiguration();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ad4d87b3-1a61-11e9-b1cd-355f2e2f05a9,UiVM7V6UduaYLYYgBTcMQwe1Pnk=] */
