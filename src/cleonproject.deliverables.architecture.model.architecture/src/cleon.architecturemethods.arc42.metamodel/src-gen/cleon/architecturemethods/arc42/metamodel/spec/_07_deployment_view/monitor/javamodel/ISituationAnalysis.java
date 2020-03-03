package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISituationAnalysis extends cleon.common.doc.metamodel.spec.document.javamodel.INamedDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8412f1bf-8990-11e8-8250-d9b67f7d5f7f");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IComponentView selectComponentView();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.deploymentview.javamodel.IDeploymentView selectDeploymentView();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.javamodel.IMonitoringView selectMonitoringView();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8412f1bf-8990-11e8-8250-d9b67f7d5f7f,WGh/3OmILlzmxpJkVQvgHbDQ3yE=] */
