package ikt.product.documentation.spec.deployment.environment.node.buildnode.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ExecutionEnvironmentBuildNode extends DynamicResource implements IExecutionEnvironmentBuildNode {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IExecutionEnvironmentBuildNode> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IExecutionEnvironmentBuildNode>() {
    
    @Override
    public IExecutionEnvironmentBuildNode create() {
      return new ExecutionEnvironmentBuildNode();
    }
    
    @Override
    public IExecutionEnvironmentBuildNode create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ExecutionEnvironmentBuildNode(resourceRepository, resource);
    }
  
  };

  public ExecutionEnvironmentBuildNode() {
    super(IExecutionEnvironmentBuildNode.TYPE_ID);
  }
  
  public ExecutionEnvironmentBuildNode(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IExecutionEnvironmentBuildNode.TYPE_ID);
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

  // relations
  
  @Override
  public java.util.List<? extends ikt.product.documentation.spec.deployment.environment.node.buildnode.javamodel.IBuildNode> selectBuildNodes() {
    return _getList(ikt.product.documentation.spec.deployment.environment.node.buildnode.javamodel.IBuildNode.class, ikt.product.documentation.spec.deployment.environment.node.buildnode.BuildnodePackage.BuildNode_buildNodes);
  }

  public ExecutionEnvironmentBuildNode setBuildNodes(java.util.List<? extends ikt.product.documentation.spec.deployment.environment.node.buildnode.javamodel.IBuildNode> buildNodes) {
    _setList(ikt.product.documentation.spec.deployment.environment.node.buildnode.BuildnodePackage.BuildNode_buildNodes, buildNodes);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends ikt.product.documentation.spec.deployment.environment.node.buildnode.machineconfiguration.javamodel.ICPU_Configuration> selectCpu() {
    return _getMap(ikt.product.documentation.spec.deployment.environment.node.buildnode.machineconfiguration.javamodel.ICPU_Configuration.class, ikt.product.documentation.spec.deployment.environment.node.buildnode.BuildnodePackage.BuildNode_cpu);
  }

  public ExecutionEnvironmentBuildNode setCpu(java.util.Map<ch.actifsource.core.Resource, ? extends ikt.product.documentation.spec.deployment.environment.node.buildnode.machineconfiguration.javamodel.ICPU_Configuration> cpu) {
    _setMap(ikt.product.documentation.spec.deployment.environment.node.buildnode.BuildnodePackage.BuildNode_cpu, cpu);
    return this;
  }
    
  @Override
  public ikt.product.documentation.spec.deployment.environment.javamodel.ICustomer selectCustomer() {
    return _getSingle(ikt.product.documentation.spec.deployment.environment.javamodel.ICustomer.class, ikt.product.documentation.spec.deployment.environment.node.NodePackage.CustomerAware_customer);
  }

  public ExecutionEnvironmentBuildNode setCustomer(ikt.product.documentation.spec.deployment.environment.javamodel.ICustomer customer) {
    _setSingle(ikt.product.documentation.spec.deployment.environment.node.NodePackage.CustomerAware_customer, customer);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends ikt.product.documentation.spec.deployment.environment.node.buildnode.machineconfiguration.javamodel.IDisk_Configuration> selectDisk() {
    return _getMultiMap(ikt.product.documentation.spec.deployment.environment.node.buildnode.machineconfiguration.javamodel.IDisk_Configuration.class, ikt.product.documentation.spec.deployment.environment.node.buildnode.BuildnodePackage.BuildNode_disk);
  }

  public ExecutionEnvironmentBuildNode setDisk(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends ikt.product.documentation.spec.deployment.environment.node.buildnode.machineconfiguration.javamodel.IDisk_Configuration> disk) {
    _setMultiMap(ikt.product.documentation.spec.deployment.environment.node.buildnode.BuildnodePackage.BuildNode_disk, disk);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends ikt.product.documentation.spec.deployment.environment.node.buildnode.machineconfiguration.javamodel.IMemory_Configuration> selectMemory() {
    return _getMap(ikt.product.documentation.spec.deployment.environment.node.buildnode.machineconfiguration.javamodel.IMemory_Configuration.class, ikt.product.documentation.spec.deployment.environment.node.buildnode.BuildnodePackage.BuildNode_memory);
  }

  public ExecutionEnvironmentBuildNode setMemory(java.util.Map<ch.actifsource.core.Resource, ? extends ikt.product.documentation.spec.deployment.environment.node.buildnode.machineconfiguration.javamodel.IMemory_Configuration> memory) {
    _setMap(ikt.product.documentation.spec.deployment.environment.node.buildnode.BuildnodePackage.BuildNode_memory, memory);
    return this;
  }
    
  @Override
  public java.util.List<? extends ikt.product.documentation.spec.deployment.environment.node.javamodel.INode> selectNodes() {
    return _getList(ikt.product.documentation.spec.deployment.environment.node.javamodel.INode.class, ikt.product.documentation.spec.deployment.environment.node.NodePackage.Node_nodes);
  }

  public ExecutionEnvironmentBuildNode setNodes(java.util.List<? extends ikt.product.documentation.spec.deployment.environment.node.javamodel.INode> nodes) {
    _setList(ikt.product.documentation.spec.deployment.environment.node.NodePackage.Node_nodes, nodes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductVariant> selectProductVariants() {
    return _getList(cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductVariant.class, ikt.product.documentation.spec.deployment.environment.node.buildnode.BuildnodePackage.BuildNode_productVariants);
  }

  public ExecutionEnvironmentBuildNode setProductVariants(java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductVariant> productVariants) {
    _setList(ikt.product.documentation.spec.deployment.environment.node.buildnode.BuildnodePackage.BuildNode_productVariants, productVariants);
    return this;
  }
    
  @Override
  public java.util.List<? extends ikt.product.documentation.spec.deployment.environment.node.supplynode.javamodel.ISupplyNode> selectSuppliedNodes() {
    return _getList(ikt.product.documentation.spec.deployment.environment.node.supplynode.javamodel.ISupplyNode.class, ikt.product.documentation.spec.deployment.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes);
  }

  public ExecutionEnvironmentBuildNode setSuppliedNodes(java.util.List<? extends ikt.product.documentation.spec.deployment.environment.node.supplynode.javamodel.ISupplyNode> suppliedNodes) {
    _setList(ikt.product.documentation.spec.deployment.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes, suppliedNodes);
    return this;
  }
    
  @Override
  public ikt.product.documentation.spec.buildingblock.systemconfiguration.javamodel.IAbstractSystemConfiguration selectSystemConfiguration() {
    return _getSingle(ikt.product.documentation.spec.buildingblock.systemconfiguration.javamodel.IAbstractSystemConfiguration.class, ikt.product.documentation.spec.deployment.environment.node.buildnode.BuildnodePackage.BuildNode_systemConfiguration);
  }

  public ExecutionEnvironmentBuildNode setSystemConfiguration(ikt.product.documentation.spec.buildingblock.systemconfiguration.javamodel.IAbstractSystemConfiguration systemConfiguration) {
    _setSingle(ikt.product.documentation.spec.deployment.environment.node.buildnode.BuildnodePackage.BuildNode_systemConfiguration, systemConfiguration);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ExecutionEnvironmentBuildNode setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ExecutionEnvironmentBuildNode setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(ikt.product.documentation.spec.deployment.environment.node.buildnode.javamodel.IBuildNode.class, ikt.product.documentation.spec.deployment.environment.node.buildnode.BuildnodePackage.BuildNode_buildNodes, visitor);
    _acceptMap(ikt.product.documentation.spec.deployment.environment.node.buildnode.machineconfiguration.javamodel.ICPU_Configuration.class, ikt.product.documentation.spec.deployment.environment.node.buildnode.BuildnodePackage.BuildNode_cpu, visitor);
    _acceptSingle(ikt.product.documentation.spec.deployment.environment.javamodel.ICustomer.class, ikt.product.documentation.spec.deployment.environment.node.NodePackage.CustomerAware_customer, visitor);
    _acceptMultiMap(ikt.product.documentation.spec.deployment.environment.node.buildnode.machineconfiguration.javamodel.IDisk_Configuration.class, ikt.product.documentation.spec.deployment.environment.node.buildnode.BuildnodePackage.BuildNode_disk, visitor);
    _acceptMap(ikt.product.documentation.spec.deployment.environment.node.buildnode.machineconfiguration.javamodel.IMemory_Configuration.class, ikt.product.documentation.spec.deployment.environment.node.buildnode.BuildnodePackage.BuildNode_memory, visitor);
    _acceptList(ikt.product.documentation.spec.deployment.environment.node.javamodel.INode.class, ikt.product.documentation.spec.deployment.environment.node.NodePackage.Node_nodes, visitor);
    _acceptList(cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductVariant.class, ikt.product.documentation.spec.deployment.environment.node.buildnode.BuildnodePackage.BuildNode_productVariants, visitor);
    _acceptList(ikt.product.documentation.spec.deployment.environment.node.supplynode.javamodel.ISupplyNode.class, ikt.product.documentation.spec.deployment.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes, visitor);
    _acceptSingle(ikt.product.documentation.spec.buildingblock.systemconfiguration.javamodel.IAbstractSystemConfiguration.class, ikt.product.documentation.spec.deployment.environment.node.buildnode.BuildnodePackage.BuildNode_systemConfiguration, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,62e7ca85-02d8-11e9-9e58-33d596257b14,qf40GsjI4dss+g2Yu0qyzxEGReA=] */
