package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.operators.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOperator extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f8726473-8fe1-11e8-85d9-314ddfdf57eb");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensors.javamodel.IMonitoringBuildingBlock> selectMonitoringTool();
  
  public cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor selectActor();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f8726473-8fe1-11e8-85d9-314ddfdf57eb,f9blknNyXWoAwNICwP9Q+Yus+2I=] */
