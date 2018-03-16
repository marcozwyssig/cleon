package cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class PluginDependency extends DynamicResource implements IPluginDependency {

  // abstract implementation, only used for static method calls
  private PluginDependency() {
    super(IPluginDependency.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPluginDependency> selectToMeTo(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPlugin object) {
    return _getToMeList(object.getRepository(), cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPluginDependency.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.PluginDependency_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d8688469-4260-11e5-8a2d-599443ec8ff4,xhTHCCAGagtc7Kq6b1jJ/HSztVw=] */
