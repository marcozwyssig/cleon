package cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class IPv4_D extends DynamicResource implements IIPv4_D {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIPv4_D> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIPv4_D>() {
    
    @Override
    public IIPv4_D create() {
      return new IPv4_D();
    }
    
    @Override
    public IIPv4_D create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new IPv4_D(resourceRepository, resource);
    }
  
  };

  public IPv4_D() {
    super(IIPv4_D.TYPE_ID);
  }
  
  public IPv4_D(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IIPv4_D.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectAllowDuplicatedIP() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_D_allowDuplicatedIP);
  }
    
  public void setAllowDuplicatedIP(java.lang.Boolean allowDuplicatedIP) {
     _setSingleAttribute(cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_D_allowDuplicatedIP, allowDuplicatedIP);
  }

  @Override
  public java.lang.Integer selectIp() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.AbstractIPv4_ip);
  }
    
  public void setIp(java.lang.Integer ip) {
     _setSingleAttribute(cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.AbstractIPv4_ip, ip);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public IPv4_D setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode> selectUsed() {
    return _getList(cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_D_used);
  }

  public IPv4_D setUsed(java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode> used) {
    _setList(cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_D_used, used);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_D_allowDuplicatedIP, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.AbstractIPv4_ip, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_D_used, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D> selectToMeUsed(cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_D_used, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,baf38e44-71af-11e9-98e0-2719d32d2629,/KeFu4pn3hs808+1NDyTDnGeqnE=] */
