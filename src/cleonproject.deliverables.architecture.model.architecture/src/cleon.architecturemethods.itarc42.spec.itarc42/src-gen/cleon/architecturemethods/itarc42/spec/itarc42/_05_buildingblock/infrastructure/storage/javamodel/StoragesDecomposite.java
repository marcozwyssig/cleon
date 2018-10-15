package cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class StoragesDecomposite extends DynamicResource implements IStoragesDecomposite {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStoragesDecomposite> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStoragesDecomposite>() {
    
    @Override
    public IStoragesDecomposite create() {
      return new StoragesDecomposite();
    }
    
    @Override
    public IStoragesDecomposite create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new StoragesDecomposite(resourceRepository, resource);
    }
  
  };

  public StoragesDecomposite() {
    super(IStoragesDecomposite.TYPE_ID);
  }
  
  public StoragesDecomposite(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IStoragesDecomposite.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public StoragesDecomposite setIntoBuildingBlock(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent selectIntoComponent() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent);
  }

  public StoragesDecomposite setIntoComponent(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent intoComponent) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, intoComponent);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.javamodel.IStorages selectIntoStorages() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.javamodel.IStorages.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.StoragePackage.StoragesDecomposite_intoStorages);
  }

  public StoragesDecomposite setIntoStorages(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.javamodel.IStorages intoStorages) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.StoragePackage.StoragesDecomposite_intoStorages, intoStorages);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public StoragesDecomposite setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, visitor);
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.javamodel.IStorages.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.StoragePackage.StoragesDecomposite_intoStorages, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.javamodel.IStoragesDecomposite selectToMeIntoStorages(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.javamodel.IStorages object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.javamodel.IStoragesDecomposite.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.StoragePackage.StoragesDecomposite_intoStorages, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f6da27c6-d0b5-11e8-b005-f7630e4c29c0,vGO5Pkk7USKi4xFVdI4Zm785tnc=] */
