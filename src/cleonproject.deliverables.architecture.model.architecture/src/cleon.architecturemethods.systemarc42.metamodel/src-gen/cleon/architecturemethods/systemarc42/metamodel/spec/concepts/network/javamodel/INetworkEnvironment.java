package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface INetworkEnvironment extends cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworks, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7ad5fb03-7adf-11e9-a70f-4dc03941a024");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.javamodel.IEnvironment selectEnvironment();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.INetworkNetdomain> selectNetworkNetdomain();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7ad5fb03-7adf-11e9-a70f-4dc03941a024,sfaOiTrNPqnpLZLRhMsS67Fgdu0=] */
