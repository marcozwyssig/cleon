package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface INetworkEnvironment extends cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworks, ch.actifsource.core.javamodel.IDecorator, cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask_Aware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8df2f5fa-053f-11ea-b1c2-9163c84d2612");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment selectEnvironmentForNetwork();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite> selectNetworkSite();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8df2f5fa-053f-11ea-b1c2-9163c84d2612,zjKre2yNgpJNZMvtegX5eUWx4nY=] */
