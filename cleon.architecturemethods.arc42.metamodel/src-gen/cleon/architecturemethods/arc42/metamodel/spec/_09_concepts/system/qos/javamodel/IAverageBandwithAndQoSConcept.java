package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAverageBandwithAndQoSConcept extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.IConceptForSystemConfigurationComponent {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a4426fd0-f2e5-11e8-b860-9fc163e21388");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode> selectCalculationFor();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationConcept> selectQosConfigurationConcepts();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.ITransportNetwork> selectTransportNetworks();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a4426fd0-f2e5-11e8-b860-9fc163e21388,xdFgDcppVzl3xEPWR9LOHDbVyTM=] */
