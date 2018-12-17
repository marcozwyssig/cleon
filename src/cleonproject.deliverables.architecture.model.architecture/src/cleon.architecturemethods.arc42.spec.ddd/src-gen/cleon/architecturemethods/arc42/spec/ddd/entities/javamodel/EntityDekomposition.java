package cleon.architecturemethods.arc42.spec.ddd.entities.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class EntityDekomposition extends DynamicResource implements IEntityDekomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEntityDekomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEntityDekomposition>() {
    
    @Override
    public IEntityDekomposition create() {
      return new EntityDekomposition();
    }
    
    @Override
    public IEntityDekomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new EntityDekomposition(resourceRepository, resource);
    }
  
  };

  public EntityDekomposition() {
    super(IEntityDekomposition.TYPE_ID);
  }
  
  public EntityDekomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEntityDekomposition.TYPE_ID);
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
  public cleon.architecturemethods.arc42.spec.ddd.entities.javamodel.IEntity selectInto() {
    return _getSingle(cleon.architecturemethods.arc42.spec.ddd.entities.javamodel.IEntity.class, cleon.architecturemethods.arc42.spec.ddd.entities.EntitiesPackage.EntityDekomposition_into);
  }

  public EntityDekomposition setInto(cleon.architecturemethods.arc42.spec.ddd.entities.javamodel.IEntity into) {
    _setSingle(cleon.architecturemethods.arc42.spec.ddd.entities.EntitiesPackage.EntityDekomposition_into, into);
    return this;
  }
    
  @Override
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public EntityDekomposition setIntoBuildingBlock(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public EntityDekomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Decomposite_purpose, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.spec.ddd.entities.javamodel.IEntity.class, cleon.architecturemethods.arc42.spec.ddd.entities.EntitiesPackage.EntityDekomposition_into, visitor);
    _acceptSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.spec.ddd.entities.javamodel.IEntityDekomposition selectToMeInto(cleon.architecturemethods.arc42.spec.ddd.entities.javamodel.IEntity object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.ddd.entities.javamodel.IEntityDekomposition.class, cleon.architecturemethods.arc42.spec.ddd.entities.EntitiesPackage.EntityDekomposition_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,59da4c30-266c-11e5-95dc-8f1cdbd9db54,XrTupIQcZbcJJVKDZobkG/qeS3I=] */
