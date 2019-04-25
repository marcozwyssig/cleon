package cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.supplynode.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SupplySoftwareNode extends DynamicResource implements ISupplySoftwareNode {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISupplySoftwareNode> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISupplySoftwareNode>() {
    
    @Override
    public ISupplySoftwareNode create() {
      return new SupplySoftwareNode();
    }
    
    @Override
    public ISupplySoftwareNode create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SupplySoftwareNode(resourceRepository, resource);
    }
  
  };

  public SupplySoftwareNode() {
    super(ISupplySoftwareNode.TYPE_ID);
  }
  
  public SupplySoftwareNode(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISupplySoftwareNode.TYPE_ID);
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

  @Override
  public java.lang.String selectType() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.supplynode.SupplynodePackage.SupplySoftwareNode_type);
  }
    
  public void setType(java.lang.String type) {
     _setSingleAttribute(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.supplynode.SupplynodePackage.SupplySoftwareNode_type, type);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> selectBuildNodes() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.NodePackage.RootNode_buildNodes);
  }

  public SupplySoftwareNode setBuildNodes(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> buildNodes) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.NodePackage.RootNode_buildNodes, buildNodes);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.javamodel.ICustomer selectCustomer() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.javamodel.ICustomer.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.NodePackage.CustomerAware_customer);
  }

  public SupplySoftwareNode setCustomer(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.javamodel.ICustomer customer) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.NodePackage.CustomerAware_customer, customer);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode> selectNodes() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.NodePackage.Node_nodes);
  }

  public SupplySoftwareNode setNodes(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode> nodes) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.NodePackage.Node_nodes, nodes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNode> selectSuppliedNodes() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNode.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes);
  }

  public SupplySoftwareNode setSuppliedNodes(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNode> suppliedNodes) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes, suppliedNodes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SupplySoftwareNode setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.supplynode.SupplynodePackage.SupplySoftwareNode_type, visitor);
    // relations
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.NodePackage.RootNode_buildNodes, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.javamodel.ICustomer.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.NodePackage.CustomerAware_customer, visitor);
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.NodePackage.Node_nodes, visitor);
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNode.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,11345063-0c32-11e9-83ba-4d57b06560a2,x6VDcpDOkzOn36a48ilM54PAX1k=] */
