package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class BuildNode extends DynamicResource implements IBuildNode {

  // abstract implementation, only used for static method calls
  private BuildNode() {
    super(IBuildNode.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.javamodel.IBuildNode> selectToMeInstanceOf(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.BuildnodePackage.BuildNode_instanceOf, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.javamodel.IBuildNode selectToMeBuildNodes(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.javamodel.IBuildNode object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.BuildnodePackage.BuildNode_buildNodes, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.javamodel.IBuildNode> selectToMeProductVariants(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.BuildnodePackage.BuildNode_productVariants, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.javamodel.IBuildNode> selectToMeResourceBuildingBlockForSystemConfiguration(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConfigurationConcept object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.BuildnodePackage.BuildNode_resourceBuildingBlockForSystemConfiguration, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.javamodel.IBuildNode selectToMeCpu(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.machineconfiguration.javamodel.ICPU_Configuration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.BuildnodePackage.BuildNode_cpu, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.javamodel.IBuildNode selectToMeMemory(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.machineconfiguration.javamodel.IMemory_Configuration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.BuildnodePackage.BuildNode_memory, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.javamodel.IBuildNode selectToMeDisks(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.machineconfiguration.javamodel.IDisk_Configuration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.BuildnodePackage.BuildNode_disks, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,853a8e37-ef41-11e8-be8a-b748ff8f0a75,FAMX5hbwQUGCj8i9PGzEe0a2S10=] */
