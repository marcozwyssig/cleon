package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBuildNode extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.javamodel.ISupplyAndBuildNodeDecomposite, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("853a8e37-ef41-11e8-be8a-b748ff8f0a75");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration selectInstanceOf();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.javamodel.IBuildNode> selectBuildNodes();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant> selectProductVariants();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.machineconfiguration.javamodel.ICPU_Configuration> selectCpu();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.machineconfiguration.javamodel.IMemory_Configuration> selectMemory();
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.machineconfiguration.javamodel.IDisk_Configuration> selectDisks();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,853a8e37-ef41-11e8-be8a-b748ff8f0a75,Ns55v8lc80hOJQBjxZZflCgF0HQ=] */
