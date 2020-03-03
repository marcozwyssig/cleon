package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMonitoringView extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("034484ce-8993-11e8-8250-d9b67f7d5f7f");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.javamodel.IMonitoringComponents selectMonitoringscomponents();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.javamodel.IAlarmingView selectAlarmingView();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.javamodel.IHealth selectHealth();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,034484ce-8993-11e8-8250-d9b67f7d5f7f,lGYAoz/295PDKibnNIGP4/bHQhQ=] */
