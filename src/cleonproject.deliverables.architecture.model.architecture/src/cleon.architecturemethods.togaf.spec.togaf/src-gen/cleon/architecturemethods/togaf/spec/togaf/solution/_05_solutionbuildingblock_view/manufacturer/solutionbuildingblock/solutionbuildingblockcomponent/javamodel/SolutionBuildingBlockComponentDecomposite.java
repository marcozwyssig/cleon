package cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SolutionBuildingBlockComponentDecomposite extends DynamicResource implements ISolutionBuildingBlockComponentDecomposite {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISolutionBuildingBlockComponentDecomposite> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISolutionBuildingBlockComponentDecomposite>() {
    
    @Override
    public ISolutionBuildingBlockComponentDecomposite create() {
      return new SolutionBuildingBlockComponentDecomposite();
    }
    
    @Override
    public ISolutionBuildingBlockComponentDecomposite create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SolutionBuildingBlockComponentDecomposite(resourceRepository, resource);
    }
  
  };

  public SolutionBuildingBlockComponentDecomposite() {
    super(ISolutionBuildingBlockComponentDecomposite.TYPE_ID);
  }
  
  public SolutionBuildingBlockComponentDecomposite(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISolutionBuildingBlockComponentDecomposite.TYPE_ID);
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
  public cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel.ISolutionBuildingBlockComponent selectInto() {
    return _getSingle(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel.ISolutionBuildingBlockComponent.class, cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.SolutionbuildingblockcomponentPackage.SolutionBuildingBlockComponentDecomposite_into);
  }

  public SolutionBuildingBlockComponentDecomposite setInto(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel.ISolutionBuildingBlockComponent into) {
    _setSingle(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.SolutionbuildingblockcomponentPackage.SolutionBuildingBlockComponentDecomposite_into, into);
    return this;
  }
    
  @Override
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public SolutionBuildingBlockComponentDecomposite setIntoBuildingBlock(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent selectIntoComponent() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent);
  }

  public SolutionBuildingBlockComponentDecomposite setIntoComponent(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent intoComponent) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, intoComponent);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SolutionBuildingBlockComponentDecomposite setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Decomposite_purpose, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel.ISolutionBuildingBlockComponent.class, cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.SolutionbuildingblockcomponentPackage.SolutionBuildingBlockComponentDecomposite_into, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel.ISolutionBuildingBlockComponentDecomposite selectToMeInto(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel.ISolutionBuildingBlockComponent object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel.ISolutionBuildingBlockComponentDecomposite.class, cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.SolutionbuildingblockcomponentPackage.SolutionBuildingBlockComponentDecomposite_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6437681b-33a2-11e6-94cd-fbf6c8ccd08d,nO3mw31hvHPHX8F/JuJhzox9714=] */
