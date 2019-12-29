package cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class PluginDependency extends DynamicResource implements IPluginDependency {

  // abstract implementation, only used for static method calls
  private PluginDependency() {
    super(IPluginDependency.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IPluginDependency> selectToMeTo(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject object) {
    return _getToMeList(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IPluginDependency.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.PluginDependency_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d8688469-4260-11e5-8a2d-599443ec8ff4,XOkVGR2jBQD9wCg9eJGkqHOlHNI=] */
