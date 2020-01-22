package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface INetworkNetdomain extends cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractLogicalNetwork, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("bdcd2f91-7ade-11e9-a70f-4dc03941a024");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.supplynode.javamodel.ISupplyNetDomainNode selectNetDomainNode();
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.network.metamodel.spec.javamodel.INetworkSubZone> selectNetworkSubZone();
  
  public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone selectZone();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,bdcd2f91-7ade-11e9-a70f-4dc03941a024,ZAJRcr+vvFPGAzJ+eraiJbQj574=] */
