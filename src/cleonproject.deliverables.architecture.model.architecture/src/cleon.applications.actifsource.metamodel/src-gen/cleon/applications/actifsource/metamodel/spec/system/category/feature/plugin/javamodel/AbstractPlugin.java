package cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractPlugin extends DynamicResource implements IAbstractPlugin {

  // abstract implementation, only used for static method calls
  private AbstractPlugin() {
    super(IAbstractPlugin.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IAbstractPlugin selectToMeDependsOnPlugin(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IPluginProjectDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IAbstractPlugin.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.AbstractPlugin_dependsOnPlugin, object.getResource());
  }
  
  public static cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IAbstractPlugin selectToMeDependsOnBuiltin(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IPluginBuiltinDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IAbstractPlugin.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.AbstractPlugin_dependsOnBuiltin, object.getResource());
  }
  
  public static cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IAbstractPlugin selectToMeResources(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IResource object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IAbstractPlugin.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.AbstractPlugin_resources, object.getResource());
  }
  
  public static cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IAbstractPlugin selectToMeActifsource(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.nature.actifsource.javamodel.IActifsource object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IAbstractPlugin.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.AbstractPlugin_actifsource, object.getResource());
  }
  
  public static cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IAbstractPlugin selectToMeJava(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.nature.javamodel.IJava object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IAbstractPlugin.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.AbstractPlugin_java, object.getResource());
  }
  
  public static cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IAbstractPlugin selectToMeGradle(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.nature.javamodel.IGradle object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IAbstractPlugin.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.AbstractPlugin_gradle, object.getResource());
  }
  
  public static cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IAbstractPlugin selectToMePlugin(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.nature.javamodel.IPlugin object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IAbstractPlugin.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.AbstractPlugin_plugin, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,04a544de-11e9-11e5-b568-55f5f05bd6f6,vyzKEvQbiTBts9vC8iFN2OT3Bdk=] */
