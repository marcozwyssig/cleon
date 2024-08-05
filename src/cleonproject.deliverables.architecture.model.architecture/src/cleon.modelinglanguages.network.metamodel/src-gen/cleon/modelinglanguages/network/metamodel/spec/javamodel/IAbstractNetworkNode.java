package cleon.modelinglanguages.network.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractNetworkNode extends ch.actifsource.core.javamodel.IDecorator, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d8caf2bc-0930-11e9-8c40-11db3668c0c9");
  
  // attributes
  
  public java.lang.Boolean selectExportDNSRecord();
  
  public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D selectIp();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d8caf2bc-0930-11e9-8c40-11db3668c0c9,0DvBXgPFlrFiEJz2qiwrtyFLN/w=] */
