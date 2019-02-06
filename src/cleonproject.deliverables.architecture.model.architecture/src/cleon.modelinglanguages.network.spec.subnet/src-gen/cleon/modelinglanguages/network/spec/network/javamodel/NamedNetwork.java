package cleon.modelinglanguages.network.spec.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NamedNetwork extends DynamicResource implements INamedNetwork {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedNetwork> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedNetwork>() {
    
    @Override
    public INamedNetwork create() {
      return new NamedNetwork();
    }
    
    @Override
    public INamedNetwork create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NamedNetwork(resourceRepository, resource);
    }
  
  };

  public NamedNetwork() {
    super(INamedNetwork.TYPE_ID);
  }
  
  public NamedNetwork(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INamedNetwork.TYPE_ID);
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
  public java.util.List<? extends cleon.modelinglanguages.network.spec.network.javamodel.IGroup> selectGroups() {
    return _getList(cleon.modelinglanguages.network.spec.network.javamodel.IGroup.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.GroupAware_groups);
  }

  public NamedNetwork setGroups(java.util.List<? extends cleon.modelinglanguages.network.spec.network.javamodel.IGroup> groups) {
    _setList(cleon.modelinglanguages.network.spec.network.NetworkPackage.GroupAware_groups, groups);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.ip.javamodel.IIPv4_Mask selectIPv4_Mask() {
    return _getSingle(cleon.common.resources.spec.resources.ip.javamodel.IIPv4_Mask.class, cleon.common.resources.spec.resources.ip.IpPackage.IPv4_aE_Mask_aE_Aware_iPv4_aE_Mask);
  }

  public NamedNetwork setIPv4_Mask(cleon.common.resources.spec.resources.ip.javamodel.IIPv4_Mask iPv4_Mask) {
    _setSingle(cleon.common.resources.spec.resources.ip.IpPackage.IPv4_aE_Mask_aE_Aware_iPv4_aE_Mask, iPv4_Mask);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.spec.network.javamodel.INamedNetworkNode> selectNetworkNodes() {
    return _getList(cleon.modelinglanguages.network.spec.network.javamodel.INamedNetworkNode.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.NamedNetwork_networkNodes);
  }

  public NamedNetwork setNetworkNodes(java.util.List<? extends cleon.modelinglanguages.network.spec.network.javamodel.INamedNetworkNode> networkNodes) {
    _setList(cleon.modelinglanguages.network.spec.network.NetworkPackage.NamedNetwork_networkNodes, networkNodes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NamedNetwork setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.modelinglanguages.network.spec.network.javamodel.IGroup.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.GroupAware_groups, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.ip.javamodel.IIPv4_Mask.class, cleon.common.resources.spec.resources.ip.IpPackage.IPv4_aE_Mask_aE_Aware_iPv4_aE_Mask, visitor);
    _acceptList(cleon.modelinglanguages.network.spec.network.javamodel.INamedNetworkNode.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.NamedNetwork_networkNodes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.modelinglanguages.network.spec.network.javamodel.INamedNetwork selectToMeNetworkNodes(cleon.modelinglanguages.network.spec.network.javamodel.INamedNetworkNode object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.network.spec.network.javamodel.INamedNetwork.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.NamedNetwork_networkNodes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b7c5323f-054f-11e9-b814-a133e521728c,GImzGHZPblF5qHlPpViBTsGfTSI=] */
