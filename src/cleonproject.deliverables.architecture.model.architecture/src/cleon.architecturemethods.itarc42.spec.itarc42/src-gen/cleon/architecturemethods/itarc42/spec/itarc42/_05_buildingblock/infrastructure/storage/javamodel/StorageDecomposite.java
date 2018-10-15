package cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class StorageDecomposite extends DynamicResource implements IStorageDecomposite {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStorageDecomposite> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStorageDecomposite>() {
    
    @Override
    public IStorageDecomposite create() {
      return new StorageDecomposite();
    }
    
    @Override
    public IStorageDecomposite create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new StorageDecomposite(resourceRepository, resource);
    }
  
  };

  public StorageDecomposite() {
    super(IStorageDecomposite.TYPE_ID);
  }
  
  public StorageDecomposite(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IStorageDecomposite.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public StorageDecomposite setIntoBuildingBlock(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent selectIntoComponent() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent);
  }

  public StorageDecomposite setIntoComponent(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent intoComponent) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, intoComponent);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.javamodel.IStorage selectIntoStorage() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.javamodel.IStorage.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.StoragePackage.StorageDecomposite_intoStorage);
  }

  public StorageDecomposite setIntoStorage(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.javamodel.IStorage intoStorage) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.StoragePackage.StorageDecomposite_intoStorage, intoStorage);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public StorageDecomposite setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, visitor);
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.javamodel.IStorage.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.StoragePackage.StorageDecomposite_intoStorage, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.javamodel.IStorageDecomposite selectToMeIntoStorage(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.javamodel.IStorage object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.javamodel.IStorageDecomposite.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.StoragePackage.StorageDecomposite_intoStorage, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f6da27ba-d0b5-11e8-b005-f7630e4c29c0,rTcQcSiVwS0iD9Fvsy5kAjxqxDY=] */
