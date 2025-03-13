package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class InterfaceResource extends DynamicResource implements IInterfaceResource {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInterfaceResource> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInterfaceResource>() {
    
    @Override
    public IInterfaceResource create() {
      return new InterfaceResource();
    }
    
    @Override
    public IInterfaceResource create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new InterfaceResource(resourceRepository, resource);
    }
  
  };

  public InterfaceResource() {
    super(IInterfaceResource.TYPE_ID);
  }
  
  public InterfaceResource(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInterfaceResource.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectAccess_vlan() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceResource_access_aE_vlan);
  }
    
  public void setAccess_vlan(java.lang.String access_vlan) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceResource_access_aE_vlan, access_vlan);
  }

  @Override
  public java.lang.String selectAllowed_trunk_vlans() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceResource_allowed_aE_trunk_aE_vlans);
  }
    
  public void setAllowed_trunk_vlans(java.lang.String allowed_trunk_vlans) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceResource_allowed_aE_trunk_aE_vlans, allowed_trunk_vlans);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectGateway() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceResource_gateway);
  }
    
  public void setGateway(java.lang.String gateway) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceResource_gateway, gateway);
  }

  @Override
  public java.util.List<java.lang.String> selectIPv4s() {
    return _getListAttribute(java.lang.String.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_Addresses_aE_Aware_iPv4s);
  }
    
  public void setIPv4s(java.util.List<java.lang.String> iPv4s) {
     _setListAttribute(cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_Addresses_aE_Aware_iPv4s, iPv4s);
  }

  @Override
  public java.lang.String selectIpaddress() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceResource_ipaddress);
  }
    
  public void setIpaddress(java.lang.String ipaddress) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceResource_ipaddress, ipaddress);
  }

  @Override
  public java.lang.String selectNetmask() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceResource_netmask);
  }
    
  public void setNetmask(java.lang.String netmask) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceResource_netmask, netmask);
  }

  @Override
  public java.lang.String selectPreferred__F_dns__F_server() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceResource_preferred__F_dns__F_server);
  }
    
  public void setPreferred__F_dns__F_server(java.lang.String preferred__F_dns__F_server) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceResource_preferred__F_dns__F_server, preferred__F_dns__F_server);
  }

  @Override
  public java.lang.String selectTitle() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.SyscfgPackage.CfgResource_title);
  }
    
  public void setTitle(java.lang.String title) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.SyscfgPackage.CfgResource_title, title);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.javamodel.IDuplex selectDuplex() {
    return _getSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.javamodel.IDuplex.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceResource_duplex);
  }

  public InterfaceResource setDuplex(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.javamodel.IDuplex duplex) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceResource_duplex, duplex);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.javamodel.IInterfaceState selectEnsure() {
    return _getSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.javamodel.IInterfaceState.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceResource_ensure);
  }

  public InterfaceResource setEnsure(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.javamodel.IInterfaceState ensure) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceResource_ensure, ensure);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public InterfaceResource setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceResource_access_aE_vlan, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceResource_allowed_aE_trunk_aE_vlans, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceResource_gateway, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceResource_ipaddress, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceResource_netmask, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceResource_preferred__F_dns__F_server, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.SyscfgPackage.CfgResource_title, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.javamodel.IDuplex.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceResource_duplex, visitor);
    _acceptSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.javamodel.IInterfaceState.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceResource_ensure, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.javamodel.IInterfaceResource> selectToMeEnsure(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.javamodel.IInterfaceState object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.javamodel.IInterfaceResource.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceResource_ensure, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.javamodel.IInterfaceResource> selectToMeDuplex(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.javamodel.IDuplex object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.javamodel.IInterfaceResource.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.IfcPackage.InterfaceResource_duplex, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f2d0c966-f17f-11e8-b3e7-15e2dd8d9b05,CtfTkqiF7c00yFWLxfk0nxizmRo=] */
