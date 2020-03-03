package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.devicebehaviour.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IHealthParameter extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fd3fba4c-8993-11e8-8250-d9b67f7d5f7f");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.devicebehaviour.javamodel.IThreshold selectWarning();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.devicebehaviour.javamodel.IThreshold selectError();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.scripts.javamodel.IParameter selectParameter();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fd3fba4c-8993-11e8-8250-d9b67f7d5f7f,K+C5TPqmbNc95g5abGIA76Qub1c=] */
