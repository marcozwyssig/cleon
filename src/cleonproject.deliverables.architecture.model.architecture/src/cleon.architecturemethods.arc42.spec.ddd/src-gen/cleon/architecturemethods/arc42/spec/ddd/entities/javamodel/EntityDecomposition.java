package cleon.architecturemethods.arc42.spec.ddd.entities.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class EntityDecomposition extends DynamicResource implements IEntityDecomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEntityDecomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEntityDecomposition>() {
    
    @Override
    public IEntityDecomposition create() {
      return new EntityDecomposition();
    }
    
    @Override
    public IEntityDecomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new EntityDecomposition(resourceRepository, resource);
    }
  
  };

  public EntityDecomposition() {
    super(IEntityDecomposition.TYPE_ID);
  }
  
  public EntityDecomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEntityDecomposition.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.spec.ddd.entities.javamodel.IEntity selectInto() {
    return _getSingle(cleon.architecturemethods.arc42.spec.ddd.entities.javamodel.IEntity.class, cleon.architecturemethods.arc42.spec.ddd.entities.EntitiesPackage.EntityDecomposition_into);
  }

  public EntityDecomposition setInto(cleon.architecturemethods.arc42.spec.ddd.entities.javamodel.IEntity into) {
    _setSingle(cleon.architecturemethods.arc42.spec.ddd.entities.EntitiesPackage.EntityDecomposition_into, into);
    return this;
  }
    
  @Override
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public EntityDecomposition setIntoBuildingBlock(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public EntityDecomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.spec.ddd.entities.javamodel.IEntity.class, cleon.architecturemethods.arc42.spec.ddd.entities.EntitiesPackage.EntityDecomposition_into, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.spec.ddd.entities.javamodel.IEntityDecomposition selectToMeInto(cleon.architecturemethods.arc42.spec.ddd.entities.javamodel.IEntity object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.ddd.entities.javamodel.IEntityDecomposition.class, cleon.architecturemethods.arc42.spec.ddd.entities.EntitiesPackage.EntityDecomposition_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,59da4c30-266c-11e5-95dc-8f1cdbd9db54,YuSGCRcq18kEwNSLXGbJX+ethkM=] */
