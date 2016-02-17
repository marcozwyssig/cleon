package cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class PluginDependency extends DynamicResource implements IPluginDependency {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPluginDependency> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPluginDependency>() {
    
    @Override
    public IPluginDependency create() {
      return new PluginDependency();
    }
    
    @Override
    public IPluginDependency create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new PluginDependency(resourceRepository, resource);
    }
  
  };

  public PluginDependency() {
    super(IPluginDependency.TYPE_ID);
  }
  
  public PluginDependency(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPluginDependency.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IPlugin> selectTo() {
    return _getList(cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IPlugin.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.PluginPackage.PluginDependency_to);
  }

  public PluginDependency setTo(java.util.List<? extends cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IPlugin> to) {
    _setList(cleon.actifsource.spec._05_buildingblockview.feature.plugin.PluginPackage.PluginDependency_to, to);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public PluginDependency setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IPlugin.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.PluginPackage.PluginDependency_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IPluginDependency> selectToMeTo(cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IPlugin object) {
    return _getToMeList(object.getRepository(), cleon.actifsource.spec._05_buildingblockview.feature.plugin.javamodel.IPluginDependency.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.PluginPackage.PluginDependency_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d8688469-4260-11e5-8a2d-599443ec8ff4,DcNBq8sYc/EnHKDZmrbv/a8i8p4=] */
