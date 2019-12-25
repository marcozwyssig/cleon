package cleon.architecturemethods.itarc42.metamodel.spec.concepts.network.javamodel;

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

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D selectIPv4_D() {
    return _getSingle(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractNetworkNode_iPv4_aE_D);
  }

  public NetworkNode setIPv4_D(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D iPv4_D) {
    _setSingle(cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractNetworkNode_iPv4_aE_D, iPv4_D);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.metamodel.spec.deployment_view.environment.node.javamodel.INode selectNode() {
    return _getSingle(cleon.architecturemethods.itarc42.metamodel.spec.deployment_view.environment.node.javamodel.INode.class, cleon.architecturemethods.itarc42.metamodel.spec.concepts.network.NetworkPackage.NetworkNode_node);
  }

  public NetworkNode setNode(cleon.architecturemethods.itarc42.metamodel.spec.deployment_view.environment.node.javamodel.INode node) {
    _setSingle(cleon.architecturemethods.itarc42.metamodel.spec.concepts.network.NetworkPackage.NetworkNode_node, node);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public NetworkNode setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
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
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractNetworkNode_iPv4_aE_D, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.metamodel.spec.deployment_view.environment.node.javamodel.INode.class, cleon.architecturemethods.itarc42.metamodel.spec.concepts.network.NetworkPackage.NetworkNode_node, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.itarc42.metamodel.spec.concepts.network.javamodel.INetworkNode> selectToMeNode(cleon.architecturemethods.itarc42.metamodel.spec.deployment_view.environment.node.javamodel.INode object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.metamodel.spec.concepts.network.javamodel.INetworkNode.class, cleon.architecturemethods.itarc42.metamodel.spec.concepts.network.NetworkPackage.NetworkNode_node, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,eb84db3b-7ae6-11e9-a70f-4dc03941a024,3FeaytlTI2hnG80JuBbUA2vp9HQ=] */
