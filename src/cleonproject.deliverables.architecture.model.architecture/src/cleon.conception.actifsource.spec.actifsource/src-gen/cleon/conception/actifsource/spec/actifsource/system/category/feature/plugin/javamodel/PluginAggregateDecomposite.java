package cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class PluginAggregateDecomposite extends DynamicResource implements IPluginAggregateDecomposite {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPluginAggregateDecomposite> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPluginAggregateDecomposite>() {
    
    @Override
    public IPluginAggregateDecomposite create() {
      return new PluginAggregateDecomposite();
    }
    
    @Override
    public IPluginAggregateDecomposite create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new PluginAggregateDecomposite(resourceRepository, resource);
    }
  
  };

  public PluginAggregateDecomposite() {
    super(IPluginAggregateDecomposite.TYPE_ID);
  }
  
  public PluginAggregateDecomposite(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPluginAggregateDecomposite.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPlugin selectInto() {
    return _getSingle(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPlugin.class, cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.PluginAggregateDecomposite_into);
  }

  public PluginAggregateDecomposite setInto(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPlugin into) {
    _setSingle(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.PluginAggregateDecomposite_into, into);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.conception.architecture.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public PluginAggregateDecomposite setIntoBuildingBlock(cleon.conception.architecture.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.uml.structural.components.javamodel.IAbstractComponent selectIntoComponent() {
    return _getSingle(cleon.conception.architecture.spec.uml.structural.components.javamodel.IAbstractComponent.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent);
  }

  public PluginAggregateDecomposite setIntoComponent(cleon.conception.architecture.spec.uml.structural.components.javamodel.IAbstractComponent intoComponent) {
    _setSingle(cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, intoComponent);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public PluginAggregateDecomposite setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPlugin.class, cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.PluginAggregateDecomposite_into, visitor);
    _acceptSingle(cleon.conception.architecture.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, visitor);
    _acceptSingle(cleon.conception.architecture.spec.uml.structural.components.javamodel.IAbstractComponent.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPluginAggregateDecomposite selectToMeInto(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPlugin object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPluginAggregateDecomposite.class, cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.PluginAggregateDecomposite_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,17a9b7ab-a7d1-11e5-82dd-3b995d9c840c,iQwOzjBt3waLpzbciwLqlWlXB8A=] */
