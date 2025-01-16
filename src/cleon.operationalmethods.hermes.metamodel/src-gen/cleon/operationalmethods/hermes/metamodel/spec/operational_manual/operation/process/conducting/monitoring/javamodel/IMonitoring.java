package cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.monitoring.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMonitoring extends cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.javamodel.IActivitySystemConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a4b23a82-1a6a-11e9-b1cd-355f2e2f05a9");
  
  // relations
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.monitoring.javamodel.ISensorData selectSensorData();
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.monitoring.javamodel.IEventing selectEventing();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a4b23a82-1a6a-11e9-b1cd-355f2e2f05a9,TI37BJdAwiNt17hJZ5wh6Mheu50=] */
