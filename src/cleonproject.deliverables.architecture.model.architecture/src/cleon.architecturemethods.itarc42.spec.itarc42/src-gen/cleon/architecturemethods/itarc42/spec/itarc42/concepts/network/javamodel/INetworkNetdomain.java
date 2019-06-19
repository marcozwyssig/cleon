package cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface INetworkNetdomain extends cleon.modelinglanguages.network.spec.network.javamodel.IAbstractLogicalNetwork, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("bdcd2f91-7ade-11e9-a70f-4dc03941a024");
  
  // relations
  
  public cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.supplynode.javamodel.ISupplyNetDomainNode selectNetDomainNode();
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.network.spec.network.javamodel.INetworkSubZone> selectNetworkSubZone();
  
  public cleon.modelinglanguages.network.spec.segmentation.javamodel.IZone selectZone();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,bdcd2f91-7ade-11e9-a70f-4dc03941a024,lEdfe/LBRMG5SwZ69u05dHqP6M0=] */
