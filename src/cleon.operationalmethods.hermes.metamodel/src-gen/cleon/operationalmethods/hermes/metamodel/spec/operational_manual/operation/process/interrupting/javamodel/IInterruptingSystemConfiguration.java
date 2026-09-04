package cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IInterruptingSystemConfiguration extends cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.javamodel.IProcessSystemConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("859130fb-1a63-11e9-b1cd-355f2e2f05a9");
  
  // relations
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.ISystemStop selectStop();
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IRelaunching selectRelaunching();
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IInterruptQualityAssurance selectQualityAssurance();
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IDecommissioning selectDecomminsing();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,859130fb-1a63-11e9-b1cd-355f2e2f05a9,sItKqzg/brFIPuq2yCGZoYQ1fdU=] */
