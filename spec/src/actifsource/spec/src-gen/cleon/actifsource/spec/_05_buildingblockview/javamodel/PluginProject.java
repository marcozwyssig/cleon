package cleon.actifsource.spec._05_buildingblockview.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class PluginProject extends DynamicResource implements IPluginProject {

  // abstract implementation, only used for static method calls
  private PluginProject() {
    super(IPluginProject.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.actifsource.spec._05_buildingblockview.javamodel.IPluginProject selectToMeDependsOn(cleon.actifsource.spec._05_buildingblockview.javamodel.IProjectDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.actifsource.spec._05_buildingblockview.javamodel.IPluginProject.class, cleon.actifsource.spec._05_buildingblockview._05_buildingblockviewPackage.PluginProject_dependsOn, object.getResource());
  }
  
  public static cleon.actifsource.spec._05_buildingblockview.javamodel.IPluginProject selectToMeResources(cleon.actifsource.spec._05_buildingblockview.javamodel.IResource object) {
    return _getToMeSingle(object.getRepository(), cleon.actifsource.spec._05_buildingblockview.javamodel.IPluginProject.class, cleon.actifsource.spec._05_buildingblockview._05_buildingblockviewPackage.PluginProject_resources, object.getResource());
  }
  
  public static cleon.actifsource.spec._05_buildingblockview.javamodel.IPluginProject selectToMeTargetPaths(cleon.actifsource.spec._05_buildingblockview.javamodel.ITargetPath object) {
    return _getToMeSingle(object.getRepository(), cleon.actifsource.spec._05_buildingblockview.javamodel.IPluginProject.class, cleon.actifsource.spec._05_buildingblockview._05_buildingblockviewPackage.PluginProject_targetPaths, object.getResource());
  }
  
  public static cleon.actifsource.spec._05_buildingblockview.javamodel.IPluginProject selectToMeExportPackage(cleon.actifsource.spec._05_buildingblockview.javamodel.IPackage object) {
    return _getToMeSingle(object.getRepository(), cleon.actifsource.spec._05_buildingblockview.javamodel.IPluginProject.class, cleon.actifsource.spec._05_buildingblockview._05_buildingblockviewPackage.PluginProject_exportPackage, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,04a544de-11e9-11e5-b568-55f5f05bd6f6,gy5HYoGHzRTBhNfVFuzkE20lbv0=] */
