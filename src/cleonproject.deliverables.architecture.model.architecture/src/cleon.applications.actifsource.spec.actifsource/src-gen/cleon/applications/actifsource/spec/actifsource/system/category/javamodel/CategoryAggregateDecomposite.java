package cleon.applications.actifsource.spec.actifsource.system.category.javamodel;

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
  public cleon.applications.actifsource.spec.actifsource.system.category.javamodel.ICategory selectInto() {
    return _getSingle(cleon.applications.actifsource.spec.actifsource.system.category.javamodel.ICategory.class, cleon.applications.actifsource.spec.actifsource.system.category.CategoryPackage.CategoryAggregateDecomposite_into);
  }

  public CategoryAggregateDecomposite setInto(cleon.applications.actifsource.spec.actifsource.system.category.javamodel.ICategory into) {
    _setSingle(cleon.applications.actifsource.spec.actifsource.system.category.CategoryPackage.CategoryAggregateDecomposite_into, into);
    return this;
  }
    
  @Override
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public CategoryAggregateDecomposite setIntoBuildingBlock(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent selectIntoComponent() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent);
  }

  public CategoryAggregateDecomposite setIntoComponent(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent intoComponent) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, intoComponent);
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
    _acceptSingle(cleon.applications.actifsource.spec.actifsource.system.category.javamodel.ICategory.class, cleon.applications.actifsource.spec.actifsource.system.category.CategoryPackage.CategoryAggregateDecomposite_into, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.applications.actifsource.spec.actifsource.system.category.javamodel.ICategoryAggregateDecomposite selectToMeInto(cleon.applications.actifsource.spec.actifsource.system.category.javamodel.ICategory object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.spec.actifsource.system.category.javamodel.ICategoryAggregateDecomposite.class, cleon.applications.actifsource.spec.actifsource.system.category.CategoryPackage.CategoryAggregateDecomposite_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,27c04266-3c6a-11e6-aafa-bd565efc0ead,lvyPYZe9F/WC7qu0Z4RCwcgYxa8=] */
