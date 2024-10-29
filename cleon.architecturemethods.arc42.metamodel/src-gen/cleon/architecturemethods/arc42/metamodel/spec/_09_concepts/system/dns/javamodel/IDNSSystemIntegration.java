package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDNSSystemIntegration extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e74de8d8-c7ba-11ec-a6a4-0b12dcfbdf90");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.javamodel.IDNSSystemConfigurationIntegration> selectDnsSystemConfigurationIntegration();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e74de8d8-c7ba-11ec-a6a4-0b12dcfbdf90,mL8nSbRfMwbcov6SaPgVotvPdxQ=] */
