package cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CategoryAggregateDecomposite extends DynamicResource implements ICategoryAggregateDecomposite {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICategoryAggregateDecomposite> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICategoryAggregateDecomposite>() {
    
    @Override
    public ICategoryAggregateDecomposite create() {
      return new CategoryAggregateDecomposite();
    }
    
    @Override
    public ICategoryAggregateDecomposite create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CategoryAggregateDecomposite(resourceRepository, resource);
    }
  
  };

  public CategoryAggregateDecomposite() {
    super(ICategoryAggregateDecomposite.TYPE_ID);
  }
  
  public CategoryAggregateDecomposite(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICategoryAggregateDecomposite.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.javamodel.ICategory selectInto() {
    return _getSingle(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.javamodel.ICategory.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.CategoryPackage.CategoryAggregateDecomposite_into);
  }

  public CategoryAggregateDecomposite setInto(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.javamodel.ICategory into) {
    _setSingle(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.CategoryPackage.CategoryAggregateDecomposite_into, into);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.conception.architecture.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public CategoryAggregateDecomposite setIntoBuildingBlock(cleon.conception.architecture.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.uml.structural.components.javamodel.IAbstractComponent selectIntoComponent() {
    return _getSingle(cleon.conception.architecture.spec.uml.structural.components.javamodel.IAbstractComponent.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent);
  }

  public CategoryAggregateDecomposite setIntoComponent(cleon.conception.architecture.spec.uml.structural.components.javamodel.IAbstractComponent intoComponent) {
    _setSingle(cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, intoComponent);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public CategoryAggregateDecomposite setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.javamodel.ICategory.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.CategoryPackage.CategoryAggregateDecomposite_into, visitor);
    _acceptSingle(cleon.conception.architecture.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, visitor);
    _acceptSingle(cleon.conception.architecture.spec.uml.structural.components.javamodel.IAbstractComponent.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.javamodel.ICategoryAggregateDecomposite selectToMeInto(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.javamodel.ICategory object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.javamodel.ICategoryAggregateDecomposite.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.CategoryPackage.CategoryAggregateDecomposite_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,27c04266-3c6a-11e6-aafa-bd565efc0ead,/XTjugwLdML8+sWEV1AFNaVuuss=] */
