package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface INetworkSite extends ch.actifsource.core.javamodel.IDecorator, cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractLogicalNetwork {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("398f37f2-928a-11e9-959e-8115c2f9e41e");
  
  public java.lang.Boolean selectExportOU();
  
  public java.lang.Boolean selectExportADSite();
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite selectSite();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.network.metamodel.spec.javamodel.INetworkSubZone> selectNetworkSubZone();
  
  public java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask> selectExcludeCIDRForADSite();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,398f37f2-928a-11e9-959e-8115c2f9e41e,E3El/u+a5wGtQu6ZgLaLP6homN4=] */
