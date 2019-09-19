package cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.supplynode.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SupplyNetDomainNode extends DynamicResource implements ISupplyNetDomainNode {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISupplyNetDomainNode> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISupplyNetDomainNode>() {
    
    @Override
    public ISupplyNetDomainNode create() {
      return new SupplyNetDomainNode();
    }
    
    @Override
    public ISupplyNetDomainNode create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SupplyNetDomainNode(resourceRepository, resource);
    }
  
  };

  public SupplyNetDomainNode() {
    super(ISupplyNetDomainNode.TYPE_ID);
  }
  
  public SupplyNetDomainNode(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISupplyNetDomainNode.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Integer selectGroupId() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.supplynode.SupplynodePackage.SupplyNetDomainNode_groupId);
  }
    
  public void setGroupId(java.lang.Integer groupId) {
     _setSingleAttribute(cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.supplynode.SupplynodePackage.SupplyNetDomainNode_groupId, groupId);
  }

  @Override
  public java.lang.String selectIdentifier() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.id.IdPackage.StringBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.String identifier) {
     _setSingleAttribute(cleon.common.resources.spec.resources.id.IdPackage.StringBusinessObjectId_identifier, identifier);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectShortName() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName);
  }
    
  public void setShortName(java.lang.String shortName) {
     _setSingleAttribute(cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName, shortName);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.buildnode.javamodel.IBuildNode> selectBuildNodes() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.NodePackage.RootNode_buildNodes);
  }

  public SupplyNetDomainNode setBuildNodes(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.buildnode.javamodel.IBuildNode> buildNodes) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.NodePackage.RootNode_buildNodes, buildNodes);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.javamodel.ICustomer selectCustomer() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.javamodel.ICustomer.class, cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.NodePackage.CustomerAware_customer);
  }

  public SupplyNetDomainNode setCustomer(cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.javamodel.ICustomer customer) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.NodePackage.CustomerAware_customer, customer);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.javamodel.INode> selectNodes() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.javamodel.INode.class, cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.NodePackage.Node_nodes);
  }

  public SupplyNetDomainNode setNodes(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.javamodel.INode> nodes) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.NodePackage.Node_nodes, nodes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.supplynode.javamodel.ISupplyNode> selectSuppliedNodes() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.supplynode.javamodel.ISupplyNode.class, cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes);
  }

  public SupplyNetDomainNode setSuppliedNodes(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.supplynode.javamodel.ISupplyNode> suppliedNodes) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes, suppliedNodes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SupplyNetDomainNode setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.supplynode.SupplynodePackage.SupplyNetDomainNode_groupId, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.id.IdPackage.StringBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName, visitor);
    // relations
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.NodePackage.RootNode_buildNodes, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.javamodel.ICustomer.class, cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.NodePackage.CustomerAware_customer, visitor);
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.supplynode.javamodel.ISupplyNode.class, cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0674e77a-0aaf-11e9-a8f9-abf1763bbc53,Xzvgh8oBjH5ZXUJ3jIpa9u5CDqY=] */
