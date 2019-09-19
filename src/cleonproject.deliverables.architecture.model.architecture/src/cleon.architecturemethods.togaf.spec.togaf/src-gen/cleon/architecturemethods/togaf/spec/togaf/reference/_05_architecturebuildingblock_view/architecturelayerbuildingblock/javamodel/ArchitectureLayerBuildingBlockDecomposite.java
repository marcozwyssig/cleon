package cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ArchitectureLayerBuildingBlockDecomposite extends DynamicResource implements IArchitectureLayerBuildingBlockDecomposite {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IArchitectureLayerBuildingBlockDecomposite> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IArchitectureLayerBuildingBlockDecomposite>() {
    
    @Override
    public IArchitectureLayerBuildingBlockDecomposite create() {
      return new ArchitectureLayerBuildingBlockDecomposite();
    }
    
    @Override
    public IArchitectureLayerBuildingBlockDecomposite create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ArchitectureLayerBuildingBlockDecomposite(resourceRepository, resource);
    }
  
  };

  public ArchitectureLayerBuildingBlockDecomposite() {
    super(IArchitectureLayerBuildingBlockDecomposite.TYPE_ID);
  }
  
  public ArchitectureLayerBuildingBlockDecomposite(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IArchitectureLayerBuildingBlockDecomposite.TYPE_ID);
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
  public cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel.IArchitectureLayerBuildingBlock selectInto() {
    return _getSingle(cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel.IArchitectureLayerBuildingBlock.class, cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.ArchitecturelayerbuildingblockPackage.ArchitectureLayerBuildingBlockDecomposite_into);
  }

  public ArchitectureLayerBuildingBlockDecomposite setInto(cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel.IArchitectureLayerBuildingBlock into) {
    _setSingle(cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.ArchitecturelayerbuildingblockPackage.ArchitectureLayerBuildingBlockDecomposite_into, into);
    return this;
  }
    
  @Override
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public ArchitectureLayerBuildingBlockDecomposite setIntoBuildingBlock(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent selectIntoComponent() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent);
  }

  public ArchitectureLayerBuildingBlockDecomposite setIntoComponent(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent intoComponent) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, intoComponent);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ArchitectureLayerBuildingBlockDecomposite setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Decomposite_purpose, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel.IArchitectureLayerBuildingBlock.class, cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.ArchitecturelayerbuildingblockPackage.ArchitectureLayerBuildingBlockDecomposite_into, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel.IArchitectureLayerBuildingBlockDecomposite selectToMeInto(cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel.IArchitectureLayerBuildingBlock object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel.IArchitectureLayerBuildingBlockDecomposite.class, cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.ArchitecturelayerbuildingblockPackage.ArchitectureLayerBuildingBlockDecomposite_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,23097760-3a01-11e6-a354-253097f89a49,fwjCSDOvXtQvh2wyfHr3QE86XPs=] */
