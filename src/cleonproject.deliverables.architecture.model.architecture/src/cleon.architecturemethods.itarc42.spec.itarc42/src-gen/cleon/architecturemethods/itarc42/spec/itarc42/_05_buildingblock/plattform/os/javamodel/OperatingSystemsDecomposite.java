package cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class OperatingSystemsDecomposite extends DynamicResource implements IOperatingSystemsDecomposite {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOperatingSystemsDecomposite> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOperatingSystemsDecomposite>() {
    
    @Override
    public IOperatingSystemsDecomposite create() {
      return new OperatingSystemsDecomposite();
    }
    
    @Override
    public IOperatingSystemsDecomposite create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new OperatingSystemsDecomposite(resourceRepository, resource);
    }
  
  };

  public OperatingSystemsDecomposite() {
    super(IOperatingSystemsDecomposite.TYPE_ID);
  }
  
  public OperatingSystemsDecomposite(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOperatingSystemsDecomposite.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public OperatingSystemsDecomposite setIntoBuildingBlock(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent selectIntoComponent() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent);
  }

  public OperatingSystemsDecomposite setIntoComponent(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent intoComponent) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, intoComponent);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.javamodel.IOperatingSystems selectIntoOs() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.javamodel.IOperatingSystems.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.OsPackage.OperatingSystemsDecomposite_intoOs);
  }

  public OperatingSystemsDecomposite setIntoOs(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.javamodel.IOperatingSystems intoOs) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.OsPackage.OperatingSystemsDecomposite_intoOs, intoOs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public OperatingSystemsDecomposite setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, visitor);
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.javamodel.IOperatingSystems.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.OsPackage.OperatingSystemsDecomposite_intoOs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.javamodel.IOperatingSystemsDecomposite selectToMeIntoOs(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.javamodel.IOperatingSystems object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.javamodel.IOperatingSystemsDecomposite.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.OsPackage.OperatingSystemsDecomposite_intoOs, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,53a4bd4d-99ac-11e8-8f58-219af2c5d6d9,chretvWaoTWsqvwIZLWlf2jozjE=] */
