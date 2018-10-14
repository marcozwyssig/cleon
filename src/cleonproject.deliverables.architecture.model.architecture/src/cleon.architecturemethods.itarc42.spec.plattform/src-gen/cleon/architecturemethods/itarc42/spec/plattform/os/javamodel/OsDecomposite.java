package cleon.architecturemethods.itarc42.spec.plattform.os.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class OsDecomposite extends DynamicResource implements IOsDecomposite {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOsDecomposite> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOsDecomposite>() {
    
    @Override
    public IOsDecomposite create() {
      return new OsDecomposite();
    }
    
    @Override
    public IOsDecomposite create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new OsDecomposite(resourceRepository, resource);
    }
  
  };

  public OsDecomposite() {
    super(IOsDecomposite.TYPE_ID);
  }
  
  public OsDecomposite(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOsDecomposite.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public OsDecomposite setIntoBuildingBlock(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent selectIntoComponent() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent);
  }

  public OsDecomposite setIntoComponent(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent intoComponent) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, intoComponent);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.plattform.os.javamodel.IOperatingSystems selectIntoOs() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.plattform.os.javamodel.IOperatingSystems.class, cleon.architecturemethods.itarc42.spec.plattform.os.OsPackage.OsDecomposite_intoOs);
  }

  public OsDecomposite setIntoOs(cleon.architecturemethods.itarc42.spec.plattform.os.javamodel.IOperatingSystems intoOs) {
    _setSingle(cleon.architecturemethods.itarc42.spec.plattform.os.OsPackage.OsDecomposite_intoOs, intoOs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public OsDecomposite setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, visitor);
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.plattform.os.javamodel.IOperatingSystems.class, cleon.architecturemethods.itarc42.spec.plattform.os.OsPackage.OsDecomposite_intoOs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.spec.plattform.os.javamodel.IOsDecomposite selectToMeIntoOs(cleon.architecturemethods.itarc42.spec.plattform.os.javamodel.IOperatingSystems object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.plattform.os.javamodel.IOsDecomposite.class, cleon.architecturemethods.itarc42.spec.plattform.os.OsPackage.OsDecomposite_intoOs, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,53a4bd4d-99ac-11e8-8f58-219af2c5d6d9,8IiY0fR8wnPm/g3RyQu7xRFc5C4=] */
