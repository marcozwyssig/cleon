package cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPlugin extends cleon.conception.uml.spec.uml.structural.components.javamodel.IComponent {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("04a544de-11e9-11e5-b568-55f5f05bd6f6");
  
  public java.lang.Boolean selectGeneratedJavaModel();
  
  public java.lang.Boolean selectUseSimpleNameForBinding();
  
  public java.lang.String selectPluginActivationClassName();
  
  // relations
  
  public java.util.List<? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPluginDependency> selectDependsOn();
  
  public java.util.List<? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IResource> selectResources();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.ITargetPath> selectTargetPaths();
  
  public java.util.List<? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPackage> selectExportPackage();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,04a544de-11e9-11e5-b568-55f5f05bd6f6,+/KevFUQ3Aot/5YiFU4ghYnwj5U=] */
