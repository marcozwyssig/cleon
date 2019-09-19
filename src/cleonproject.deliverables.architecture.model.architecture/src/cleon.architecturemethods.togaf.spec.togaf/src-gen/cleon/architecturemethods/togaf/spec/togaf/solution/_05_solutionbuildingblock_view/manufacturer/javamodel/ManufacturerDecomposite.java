package cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel;

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

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectPurpose() {
    return _getListAttribute(java.lang.String.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Decomposite_purpose);
  }
    
  public void setPurpose(java.util.List<java.lang.String> purpose) {
     _setListAttribute(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Decomposite_purpose, purpose);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturer selectInto() {
    return _getSingle(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturer.class, cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.ManufacturerPackage.ManufacturerDecomposite_into);
  }

  public ManufacturerDecomposite setInto(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturer into) {
    _setSingle(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.ManufacturerPackage.ManufacturerDecomposite_into, into);
    return this;
  }
    
  @Override
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public ManufacturerDecomposite setIntoBuildingBlock(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent selectIntoComponent() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent);
  }

  public ManufacturerDecomposite setIntoComponent(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent intoComponent) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, intoComponent);
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
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Decomposite_purpose, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturer.class, cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.ManufacturerPackage.ManufacturerDecomposite_into, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturerDecomposite selectToMeInto(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturer object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturerDecomposite.class, cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.ManufacturerPackage.ManufacturerDecomposite_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b830d6f8-4372-11e6-a9d7-97cf4f7c398b,0AvaquMua6GrLKD6GIby7a5xR8Q=] */
