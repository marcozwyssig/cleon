package cleon.common.building.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class BuildingPluginConfiguration extends DynamicResource implements IBuildingPluginConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBuildingPluginConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBuildingPluginConfiguration>() {
    
    @Override
    public IBuildingPluginConfiguration create() {
      return new BuildingPluginConfiguration();
    }
    
    @Override
    public IBuildingPluginConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new BuildingPluginConfiguration(resourceRepository, resource);
    }
  
  };

  public BuildingPluginConfiguration() {
    super(IBuildingPluginConfiguration.TYPE_ID);
  }
  
  public BuildingPluginConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBuildingPluginConfiguration.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.common.building.metamodel.spec.javamodel.IBuildingPlugin selectBuildPlugin() {
    return _getSingle(cleon.common.building.metamodel.spec.javamodel.IBuildingPlugin.class, cleon.common.building.metamodel.spec.SpecPackage.BuildingPluginConfiguration_buildPlugin);
  }

  public BuildingPluginConfiguration setBuildPlugin(cleon.common.building.metamodel.spec.javamodel.IBuildingPlugin buildPlugin) {
    _setSingle(cleon.common.building.metamodel.spec.SpecPackage.BuildingPluginConfiguration_buildPlugin, buildPlugin);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public BuildingPluginConfiguration setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public BuildingPluginConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.common.building.metamodel.spec.javamodel.IBuildingPlugin.class, cleon.common.building.metamodel.spec.SpecPackage.BuildingPluginConfiguration_buildPlugin, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.common.building.metamodel.spec.javamodel.IBuildingPluginConfiguration> selectToMeBuildPlugin(cleon.common.building.metamodel.spec.javamodel.IBuildingPlugin object) {
    return _getToMeList(object.getRepository(), cleon.common.building.metamodel.spec.javamodel.IBuildingPluginConfiguration.class, cleon.common.building.metamodel.spec.SpecPackage.BuildingPluginConfiguration_buildPlugin, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3619590e-2fb8-11ea-803d-cf613be59924,HyNpZhx6okoj8anWRy3DuJ+l0QI=] */
