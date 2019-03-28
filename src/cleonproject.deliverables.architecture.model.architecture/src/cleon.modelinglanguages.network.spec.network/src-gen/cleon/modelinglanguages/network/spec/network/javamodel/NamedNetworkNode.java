package cleon.modelinglanguages.network.spec.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NamedNetworkNode extends DynamicResource implements INamedNetworkNode {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedNetworkNode> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedNetworkNode>() {
    
    @Override
    public INamedNetworkNode create() {
      return new NamedNetworkNode();
    }
    
    @Override
    public INamedNetworkNode create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NamedNetworkNode(resourceRepository, resource);
    }
  
  };

  public NamedNetworkNode() {
    super(INamedNetworkNode.TYPE_ID);
  }
  
  public NamedNetworkNode(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INamedNetworkNode.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.resources.spec.resources.ip.javamodel.IIPv4> selectIPv4s() {
    return _getList(cleon.common.resources.spec.resources.ip.javamodel.IIPv4.class, cleon.common.resources.spec.resources.ip.IpPackage.IPv4_aE_Addresses_aE_Aware_iPv4s);
  }

  public NamedNetworkNode setIPv4s(java.util.List<? extends cleon.common.resources.spec.resources.ip.javamodel.IIPv4> iPv4s) {
    _setList(cleon.common.resources.spec.resources.ip.IpPackage.IPv4_aE_Addresses_aE_Aware_iPv4s, iPv4s);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NamedNetworkNode setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.common.resources.spec.resources.ip.javamodel.IIPv4.class, cleon.common.resources.spec.resources.ip.IpPackage.IPv4_aE_Addresses_aE_Aware_iPv4s, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f896998a-0930-11e9-8c40-11db3668c0c9,0c5pbknSh5ukyF7LJiF2DDNOj90=] */
