package cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Plugin extends DynamicResource implements IPlugin {

  // abstract implementation, only used for static method calls
  private Plugin() {
    super(IPlugin.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IPlugin selectToMeDependsOn(cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IPluginDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IPlugin.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.PluginPackage.Plugin_dependsOn, object.getResource());
  }
  
  public static cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IPlugin selectToMeResources(cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IResource object) {
    return _getToMeSingle(object.getRepository(), cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IPlugin.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.PluginPackage.Plugin_resources, object.getResource());
  }
  
  public static cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IPlugin selectToMeTargetPaths(cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.ITargetPath object) {
    return _getToMeSingle(object.getRepository(), cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IPlugin.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.PluginPackage.Plugin_targetPaths, object.getResource());
  }
  
  public static cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IPlugin selectToMeExportPackage(cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IPackage object) {
    return _getToMeSingle(object.getRepository(), cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IPlugin.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.PluginPackage.Plugin_exportPackage, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,04a544de-11e9-11e5-b568-55f5f05bd6f6,i4PVs0C0WrZhFfdim9ZR+lvMxls=] */
