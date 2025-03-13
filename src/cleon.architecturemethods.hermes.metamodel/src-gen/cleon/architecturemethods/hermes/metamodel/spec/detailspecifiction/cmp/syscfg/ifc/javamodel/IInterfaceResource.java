package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IInterfaceResource extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.ICfgResource, cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Addresses_Aware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f2d0c966-f17f-11e8-b3e7-15e2dd8d9b05");
  
  // attributes
  
  public java.lang.String selectIpaddress();
  
  public java.lang.String selectNetmask();
  
  public java.lang.String selectGateway();
  
  public java.lang.String selectPreferred__F_dns__F_server();
  
  public java.lang.String selectAccess_vlan();
  
  public java.lang.String selectAllowed_trunk_vlans();
  
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.javamodel.IInterfaceState selectEnsure();
  
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.javamodel.IDuplex selectDuplex();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f2d0c966-f17f-11e8-b3e7-15e2dd8d9b05,faHk7bB5Us+SNX6+uWPHrXINXq4=] */
