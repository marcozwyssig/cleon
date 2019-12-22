package cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class LayerDecomposite extends DynamicResource implements ILayerDecomposite {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILayerDecomposite> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILayerDecomposite>() {
    
    @Override
    public ILayerDecomposite create() {
      return new LayerDecomposite();
    }
    
    @Override
    public ILayerDecomposite create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new LayerDecomposite(resourceRepository, resource);
    }
  
  };

  public LayerDecomposite() {
    super(ILayerDecomposite.TYPE_ID);
  }
  
  public LayerDecomposite(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ILayerDecomposite.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public LayerDecomposite setIntoBuildingBlock(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent selectIntoComponent() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent);
  }

  public LayerDecomposite setIntoComponent(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent intoComponent) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, intoComponent);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemLayer selectIntoLayer() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemLayer.class, cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.Buildingblock_viewPackage.LayerDecomposite_intoLayer);
  }

  public LayerDecomposite setIntoLayer(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemLayer intoLayer) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.Buildingblock_viewPackage.LayerDecomposite_intoLayer, intoLayer);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public LayerDecomposite setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemLayer.class, cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.Buildingblock_viewPackage.LayerDecomposite_intoLayer, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ILayerDecomposite selectToMeIntoLayer(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemLayer object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ILayerDecomposite.class, cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.Buildingblock_viewPackage.LayerDecomposite_intoLayer, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0bcbb0b5-d0b0-11e8-b005-f7630e4c29c0,f1YYBvyBpqmb6xaSGOr2kG0TKs4=] */
