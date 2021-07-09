package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IQoSConcept extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.IConceptForSystemConfigurationComponent {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a4426fd0-f2e5-11e8-b860-9fc163e21388");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode> selectCalculationFor();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationConcept> selectQosConfigurationConcepts();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a4426fd0-f2e5-11e8-b860-9fc163e21388,a/+cHWFhUk6G5D/+9+fF4ZB/+20=] */
