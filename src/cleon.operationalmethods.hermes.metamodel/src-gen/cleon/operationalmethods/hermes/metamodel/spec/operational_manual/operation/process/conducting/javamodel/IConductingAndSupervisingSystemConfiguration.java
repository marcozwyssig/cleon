package cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IConductingAndSupervisingSystemConfiguration extends cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.javamodel.IProcessSystemConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7103cea2-1a63-11e9-b1cd-355f2e2f05a9");
  
  // relations
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.supervising.javamodel.ISupervising selectSupervising();
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.monitoring.javamodel.IMonitoring selectMonitoring();
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IDataSecurity selectDataSecurity();
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IDataProtection selectDataProtection();
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IStatistics selectStatistics();
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IErrorAnalysis selectProcedure();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7103cea2-1a63-11e9-b1cd-355f2e2f05a9,j+BZMErPwiPFVaero4nba3RMnMs=] */
