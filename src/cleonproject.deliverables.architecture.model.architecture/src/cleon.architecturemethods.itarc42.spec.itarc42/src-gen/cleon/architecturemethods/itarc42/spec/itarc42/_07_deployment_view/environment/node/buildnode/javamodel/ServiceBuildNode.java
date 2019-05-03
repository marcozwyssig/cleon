package cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ServiceBuildNode extends DynamicResource implements IServiceBuildNode {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceBuildNode> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceBuildNode>() {
    
    @Override
    public IServiceBuildNode create() {
      return new ServiceBuildNode();
    }
    
    @Override
    public IServiceBuildNode create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ServiceBuildNode(resourceRepository, resource);
    }
  
  };

  public ServiceBuildNode() {
    super(IServiceBuildNode.TYPE_ID);
  }
  
  public ServiceBuildNode(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IServiceBuildNode.TYPE_ID);
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

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> selectBuildNodes() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_buildNodes);
  }

  public ServiceBuildNode setBuildNodes(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> buildNodes) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_buildNodes, buildNodes);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.ICPU_Configuration> selectCpu() {
    return _getMap(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.ICPU_Configuration.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_cpu);
  }

  public ServiceBuildNode setCpu(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.ICPU_Configuration> cpu) {
    _setMap(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_cpu, cpu);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.IDisk_Configuration> selectDisk() {
    return _getMultiMap(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.IDisk_Configuration.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_disk);
  }

  public ServiceBuildNode setDisk(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.IDisk_Configuration> disk) {
    _setMultiMap(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_disk, disk);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.IMemory_Configuration> selectMemory() {
    return _getMap(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.IMemory_Configuration.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_memory);
  }

  public ServiceBuildNode setMemory(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.IMemory_Configuration> memory) {
    _setMap(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_memory, memory);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode> selectNodes() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.NodePackage.Node_nodes);
  }

  public ServiceBuildNode setNodes(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode> nodes) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.NodePackage.Node_nodes, nodes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductVariant> selectProductVariants() {
    return _getList(cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductVariant.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_productVariants);
  }

  public ServiceBuildNode setProductVariants(java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductVariant> productVariants) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_productVariants, productVariants);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNode> selectSuppliedNodes() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNode.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes);
  }

  public ServiceBuildNode setSuppliedNodes(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNode> suppliedNodes) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes, suppliedNodes);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfiguration selectSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfiguration.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_systemConfiguration);
  }

  public ServiceBuildNode setSystemConfiguration(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfiguration systemConfiguration) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_systemConfiguration, systemConfiguration);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ServiceBuildNode setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ServiceBuildNode setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    // relations
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_buildNodes, visitor);
    _acceptMap(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.ICPU_Configuration.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_cpu, visitor);
    _acceptMultiMap(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.IDisk_Configuration.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_disk, visitor);
    _acceptMap(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.IMemory_Configuration.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_memory, visitor);
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.NodePackage.Node_nodes, visitor);
    _acceptList(cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductVariant.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_productVariants, visitor);
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNode.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfiguration.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_systemConfiguration, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1c72395a-02d8-11e9-9e58-33d596257b14,/7vXOShhUsko9vzKfmHeiKgR2+U=] */
