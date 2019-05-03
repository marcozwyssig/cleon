package cleon.architecturemethods.itarc42.spec.itarc42.concepts.qos.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IQoS_Concept extends ch.actifsource.core.javamodel.INamedResource, cleon.architecturemethods.itarc42.spec.itarc42.concepts.javamodel.IConceptForSystemConfigurationComponent {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a4426fd0-f2e5-11e8-b860-9fc163e21388");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.qos.javamodel.IQoSConfigurationComponentConcept> selectQosConfigurationConcept();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a4426fd0-f2e5-11e8-b860-9fc163e21388,109/tg52i995XMqWovL2l3hPQxM=] */
