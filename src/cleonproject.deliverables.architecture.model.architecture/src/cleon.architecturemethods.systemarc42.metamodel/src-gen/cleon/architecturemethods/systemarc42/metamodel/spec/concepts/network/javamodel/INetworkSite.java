package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface INetworkSite extends cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractLogicalNetwork, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("398f37f2-928a-11e9-959e-8115c2f9e41e");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ISite selectNetdomain();
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.network.metamodel.spec.javamodel.INetworkSubZone> selectNetworkSubZone();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,398f37f2-928a-11e9-959e-8115c2f9e41e,VWW9T3G4RyF/egWN8Ncn5e40XpQ=] */
