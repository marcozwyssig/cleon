package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IIPNetworkConcept extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.javamodel.IAbstractConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b4d4ca85-4b28-11e9-8338-41c203971ecb");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkEnvironment> selectNetworkEnvironment();
  
  public cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.javamodel.IDomain selectDefaultDomain();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b4d4ca85-4b28-11e9-8338-41c203971ecb,uaGPyX7DtJs/hqMTdrleozHqJhI=] */
