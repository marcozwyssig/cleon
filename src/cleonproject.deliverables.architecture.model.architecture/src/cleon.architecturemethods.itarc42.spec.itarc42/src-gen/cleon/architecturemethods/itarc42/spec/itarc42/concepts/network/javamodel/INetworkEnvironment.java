package cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface INetworkEnvironment extends cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetworks, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7ad5fb03-7adf-11e9-a70f-4dc03941a024");
  
  // relations
  
  public cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.javamodel.IEnvironment selectEnvironment();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetworkNetdomain> selectNetworkNetdomain();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7ad5fb03-7adf-11e9-a70f-4dc03941a024,acNY9FMi2L4fWNOFAlNRDMWmGD0=] */
