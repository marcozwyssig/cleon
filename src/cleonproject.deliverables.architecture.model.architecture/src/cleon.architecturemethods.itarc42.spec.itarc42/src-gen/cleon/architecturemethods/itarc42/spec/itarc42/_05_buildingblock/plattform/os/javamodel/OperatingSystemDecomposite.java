package cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class OperatingSystemDecomposite extends DynamicResource implements IOperatingSystemDecomposite {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOperatingSystemDecomposite> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOperatingSystemDecomposite>() {
    
    @Override
    public IOperatingSystemDecomposite create() {
      return new OperatingSystemDecomposite();
    }
    
    @Override
    public IOperatingSystemDecomposite create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new OperatingSystemDecomposite(resourceRepository, resource);
    }
  
  };

  public OperatingSystemDecomposite() {
    super(IOperatingSystemDecomposite.TYPE_ID);
  }
  
  public OperatingSystemDecomposite(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOperatingSystemDecomposite.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public OperatingSystemDecomposite setIntoBuildingBlock(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent selectIntoComponent() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent);
  }

  public OperatingSystemDecomposite setIntoComponent(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent intoComponent) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, intoComponent);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.javamodel.IAbstractOperatingSystem selectIntoOs() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.javamodel.IAbstractOperatingSystem.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.OsPackage.OperatingSystemDecomposite_intoOs);
  }

  public OperatingSystemDecomposite setIntoOs(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.javamodel.IAbstractOperatingSystem intoOs) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.OsPackage.OperatingSystemDecomposite_intoOs, intoOs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public OperatingSystemDecomposite setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, visitor);
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.javamodel.IAbstractOperatingSystem.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.OsPackage.OperatingSystemDecomposite_intoOs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.javamodel.IOperatingSystemDecomposite selectToMeIntoOs(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.javamodel.IAbstractOperatingSystem object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.javamodel.IOperatingSystemDecomposite.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.OsPackage.OperatingSystemDecomposite_intoOs, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,488765c4-d0ae-11e8-b005-f7630e4c29c0,kj1psq1an1K0ierIj4NLguty06c=] */
