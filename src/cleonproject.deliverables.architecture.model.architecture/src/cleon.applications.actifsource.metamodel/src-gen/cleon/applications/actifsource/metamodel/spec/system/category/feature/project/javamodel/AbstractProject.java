package cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractProject extends DynamicResource implements IAbstractProject {

  // abstract implementation, only used for static method calls
  private AbstractProject() {
    super(IAbstractProject.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject selectToMeDependsOnPlugin(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IPluginProjectDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.AbstractProject_dependsOnPlugin, object.getResource());
  }
  
  public static cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject selectToMeDependsOnBuiltin(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IPluginBuiltinDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.AbstractProject_dependsOnBuiltin, object.getResource());
  }
  
  public static cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject selectToMeResources(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IResource object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.AbstractProject_resources, object.getResource());
  }
  
  public static cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject selectToMeActifsource(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.actifsource.javamodel.IActifsource object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.AbstractProject_actifsource, object.getResource());
  }
  
  public static cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject selectToMeJava(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.IJava object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.AbstractProject_java, object.getResource());
  }
  
  public static cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject selectToMeGradle(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.IGradle object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.AbstractProject_gradle, object.getResource());
  }
  
  public static cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject selectToMePlugin(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.IPlugin object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.AbstractProject_plugin, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,04a544de-11e9-11e5-b568-55f5f05bd6f6,PI9dPx9PDgg1kmddJgTWAn1mxiY=] */
