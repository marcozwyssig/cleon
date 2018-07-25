package cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ManufacturerDecomposite extends DynamicResource implements IManufacturerDecomposite {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IManufacturerDecomposite> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IManufacturerDecomposite>() {
    
    @Override
    public IManufacturerDecomposite create() {
      return new ManufacturerDecomposite();
    }
    
    @Override
    public IManufacturerDecomposite create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ManufacturerDecomposite(resourceRepository, resource);
    }
  
  };

  public ManufacturerDecomposite() {
    super(IManufacturerDecomposite.TYPE_ID);
  }
  
  public ManufacturerDecomposite(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IManufacturerDecomposite.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturer selectInto() {
    return _getSingle(cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturer.class, cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.ManufacturerPackage.ManufacturerDecomposite_into);
  }

  public ManufacturerDecomposite setInto(cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturer into) {
    _setSingle(cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.ManufacturerPackage.ManufacturerDecomposite_into, into);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.conception.architecture.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public ManufacturerDecomposite setIntoBuildingBlock(cleon.conception.architecture.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.uml.structural.components.javamodel.IAbstractComponent selectIntoComponent() {
    return _getSingle(cleon.conception.architecture.spec.uml.structural.components.javamodel.IAbstractComponent.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent);
  }

  public ManufacturerDecomposite setIntoComponent(cleon.conception.architecture.spec.uml.structural.components.javamodel.IAbstractComponent intoComponent) {
    _setSingle(cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, intoComponent);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ManufacturerDecomposite setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturer.class, cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.ManufacturerPackage.ManufacturerDecomposite_into, visitor);
    _acceptSingle(cleon.conception.architecture.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, visitor);
    _acceptSingle(cleon.conception.architecture.spec.uml.structural.components.javamodel.IAbstractComponent.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturerDecomposite selectToMeInto(cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturer object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturerDecomposite.class, cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.ManufacturerPackage.ManufacturerDecomposite_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b830d6f8-4372-11e6-a9d7-97cf4f7c398b,LIake+9OyLTIGR/wvpPdhGvkYYU=] */
