package cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPlugin extends cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponent {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("04a544de-11e9-11e5-b568-55f5f05bd6f6");
  
  // relations
  
  public java.util.List<? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPluginDependency> selectDependsOn();
  
  public java.util.List<? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IResource> selectResources();
  
  public java.util.List<? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPackage> selectExportPackage();
  
  public cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.nature.actifsource.javamodel.IActifsource selectActifsource();
  
  public cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.nature.javamodel.IJava selectJava();
  
  public cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.nature.javamodel.IGradle selectGradle();
  
  public cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.nature.javamodel.IPlugin_Nature selectPlugin();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,04a544de-11e9-11e5-b568-55f5f05bd6f6,fp75SMWsySmJYYFhIoTIyh950ws=] */
