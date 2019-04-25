package cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBuildNode extends cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.ISupplyAndBuildNodeDecomposite, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.ICustomerAware, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("853a8e37-ef41-11e8-be8a-b748ff8f0a75");
  
  // relations
  
  public cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.systemconfiguration.javamodel.IAbstractSystemConfiguration selectSystemConfiguration();
  
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> selectBuildNodes();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductVariant> selectProductVariants();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.ICPU_Configuration> selectCpu();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.IMemory_Configuration> selectMemory();
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.IDisk_Configuration> selectDisk();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,853a8e37-ef41-11e8-be8a-b748ff8f0a75,LiLKh61xKUPOLrbQFeQCssotiZw=] */
