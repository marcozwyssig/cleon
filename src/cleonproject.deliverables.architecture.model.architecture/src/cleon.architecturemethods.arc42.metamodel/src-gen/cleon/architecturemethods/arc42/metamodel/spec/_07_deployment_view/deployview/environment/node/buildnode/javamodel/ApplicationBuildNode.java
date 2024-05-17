package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ApplicationBuildNode extends DynamicResource implements IApplicationBuildNode {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IApplicationBuildNode> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IApplicationBuildNode>() {
    
    @Override
    public IApplicationBuildNode create() {
      return new ApplicationBuildNode();
    }
    
    @Override
    public IApplicationBuildNode create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ApplicationBuildNode(resourceRepository, resource);
    }
  
  };

  public ApplicationBuildNode() {
    super(IApplicationBuildNode.TYPE_ID);
  }
  
  public ApplicationBuildNode(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IApplicationBuildNode.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.javamodel.IBuildNode> selectBuildNodes() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.BuildnodePackage.BuildNode_buildNodes);
  }

  public ApplicationBuildNode setBuildNodes(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.javamodel.IBuildNode> buildNodes) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.BuildnodePackage.BuildNode_buildNodes, buildNodes);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.machineconfiguration.javamodel.ICPU_Configuration> selectCpu() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.machineconfiguration.javamodel.ICPU_Configuration.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.BuildnodePackage.BuildNode_cpu);
  }

  public ApplicationBuildNode setCpu(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.machineconfiguration.javamodel.ICPU_Configuration> cpu) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.BuildnodePackage.BuildNode_cpu, cpu);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.machineconfiguration.javamodel.IDisk_Configuration> selectDisks() {
    return _getMultiMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.machineconfiguration.javamodel.IDisk_Configuration.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.BuildnodePackage.BuildNode_disks);
  }

  public ApplicationBuildNode setDisks(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.machineconfiguration.javamodel.IDisk_Configuration> disks) {
    _setMultiMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.BuildnodePackage.BuildNode_disks, disks);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration selectInstanceOf() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.BuildnodePackage.BuildNode_instanceOf);
  }

  public ApplicationBuildNode setInstanceOf(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration instanceOf) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.BuildnodePackage.BuildNode_instanceOf, instanceOf);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.machineconfiguration.javamodel.IMemory_Configuration> selectMemory() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.machineconfiguration.javamodel.IMemory_Configuration.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.BuildnodePackage.BuildNode_memory);
  }

  public ApplicationBuildNode setMemory(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.machineconfiguration.javamodel.IMemory_Configuration> memory) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.BuildnodePackage.BuildNode_memory, memory);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.javamodel.INode> selectNodes() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.javamodel.INode.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.NodePackage.Node_nodes);
  }

  public ApplicationBuildNode setNodes(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.javamodel.INode> nodes) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.NodePackage.Node_nodes, nodes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant> selectProductVariants() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.BuildnodePackage.BuildNode_productVariants);
  }

  public ApplicationBuildNode setProductVariants(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant> productVariants) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.BuildnodePackage.BuildNode_productVariants, productVariants);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConfigurationConcept selectResourceBuildingBlockForSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConfigurationConcept.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.BuildnodePackage.BuildNode_resourceBuildingBlockForSystemConfiguration);
  }

  public ApplicationBuildNode setResourceBuildingBlockForSystemConfiguration(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConfigurationConcept resourceBuildingBlockForSystemConfiguration) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.BuildnodePackage.BuildNode_resourceBuildingBlockForSystemConfiguration, resourceBuildingBlockForSystemConfiguration);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.supplynode.javamodel.ISupplyNode> selectSuppliedNodes() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.supplynode.javamodel.ISupplyNode.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes);
  }

  public ApplicationBuildNode setSuppliedNodes(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.supplynode.javamodel.ISupplyNode> suppliedNodes) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes, suppliedNodes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ApplicationBuildNode setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ApplicationBuildNode setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.BuildnodePackage.BuildNode_buildNodes, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.machineconfiguration.javamodel.ICPU_Configuration.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.BuildnodePackage.BuildNode_cpu, visitor);
    _acceptMultiMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.machineconfiguration.javamodel.IDisk_Configuration.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.BuildnodePackage.BuildNode_disks, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.BuildnodePackage.BuildNode_instanceOf, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.machineconfiguration.javamodel.IMemory_Configuration.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.BuildnodePackage.BuildNode_memory, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.BuildnodePackage.BuildNode_productVariants, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConfigurationConcept.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.BuildnodePackage.BuildNode_resourceBuildingBlockForSystemConfiguration, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.supplynode.javamodel.ISupplyNode.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7aa00b70-84d9-11ea-ade9-0f308d716192,d2b/XUFQgqR8nRPs8EJ8BfZeQGA=] */
