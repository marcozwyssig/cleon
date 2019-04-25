package cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NetworkNode extends DynamicResource implements INetworkNode {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetworkNode> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetworkNode>() {
    
    @Override
    public INetworkNode create() {
      return new NetworkNode();
    }
    
    @Override
    public INetworkNode create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NetworkNode(resourceRepository, resource);
    }
  
  };

  public NetworkNode() {
    super(INetworkNode.TYPE_ID);
  }
  
  public NetworkNode(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INetworkNode.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.resources.spec.resources.ip.javamodel.IIPv4> selectIPv4s() {
    return _getList(cleon.common.resources.spec.resources.ip.javamodel.IIPv4.class, cleon.common.resources.spec.resources.ip.IpPackage.IPv4_aE_Addresses_aE_Aware_iPv4s);
  }

  public NetworkNode setIPv4s(java.util.List<? extends cleon.common.resources.spec.resources.ip.javamodel.IIPv4> iPv4s) {
    _setList(cleon.common.resources.spec.resources.ip.IpPackage.IPv4_aE_Addresses_aE_Aware_iPv4s, iPv4s);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode selectNode() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.network.NetworkPackage.NetworkNode_node);
  }

  public NetworkNode setNode(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode node) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.network.NetworkPackage.NetworkNode_node, node);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NetworkNode setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.common.resources.spec.resources.ip.javamodel.IIPv4.class, cleon.common.resources.spec.resources.ip.IpPackage.IPv4_aE_Addresses_aE_Aware_iPv4s, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.network.NetworkPackage.NetworkNode_node, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.network.javamodel.INetworkNode> selectToMeNode(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.network.javamodel.INetworkNode.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.network.NetworkPackage.NetworkNode_node, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,91d106aa-4b2c-11e9-8338-41c203971ecb,UKWpDI/6gLidKlcgQOcFaYFMUpc=] */
