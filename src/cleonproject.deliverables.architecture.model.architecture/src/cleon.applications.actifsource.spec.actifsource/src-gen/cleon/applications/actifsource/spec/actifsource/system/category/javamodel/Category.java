package cleon.applications.actifsource.spec.actifsource.system.category.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Category extends DynamicResource implements ICategory {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICategory> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICategory>() {
    
    @Override
    public ICategory create() {
      return new Category();
    }
    
    @Override
    public ICategory create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Category(resourceRepository, resource);
    }
  
  };

  public Category() {
    super(ICategory.TYPE_ID);
  }
  
  public Category(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICategory.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose);
  }

  public Category setDecompose(java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite> decompose) {
    _setList(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentCompositionDecomposite> selectDecomposeComponent() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentCompositionDecomposite.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent);
  }

  public Category setDecomposeComponent(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentCompositionDecomposite> decomposeComponent) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent, decomposeComponent);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.applications.actifsource.spec.actifsource.system.category.feature.javamodel.IFeatureAggregateDecomposite> selectFeatures() {
    return _getList(cleon.applications.actifsource.spec.actifsource.system.category.feature.javamodel.IFeatureAggregateDecomposite.class, cleon.applications.actifsource.spec.actifsource.system.category.CategoryPackage.Category_features);
  }

  public Category setFeatures(java.util.List<? extends cleon.applications.actifsource.spec.actifsource.system.category.feature.javamodel.IFeatureAggregateDecomposite> features) {
    _setList(cleon.applications.actifsource.spec.actifsource.system.category.CategoryPackage.Category_features, features);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.applications.actifsource.spec.actifsource.system.category.javamodel.ICategoryDependency> selectHasDependency() {
    return _getList(cleon.applications.actifsource.spec.actifsource.system.category.javamodel.ICategoryDependency.class, cleon.applications.actifsource.spec.actifsource.system.category.CategoryPackage.Category_hasDependency);
  }

  public Category setHasDependency(java.util.List<? extends cleon.applications.actifsource.spec.actifsource.system.category.javamodel.ICategoryDependency> hasDependency) {
    _setList(cleon.applications.actifsource.spec.actifsource.system.category.CategoryPackage.Category_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Category setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentCompositionDecomposite.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent, visitor);
    _acceptList(cleon.applications.actifsource.spec.actifsource.system.category.feature.javamodel.IFeatureAggregateDecomposite.class, cleon.applications.actifsource.spec.actifsource.system.category.CategoryPackage.Category_features, visitor);
    _acceptList(cleon.applications.actifsource.spec.actifsource.system.category.javamodel.ICategoryDependency.class, cleon.applications.actifsource.spec.actifsource.system.category.CategoryPackage.Category_hasDependency, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.applications.actifsource.spec.actifsource.system.category.javamodel.ICategory selectToMeHasDependency(cleon.applications.actifsource.spec.actifsource.system.category.javamodel.ICategoryDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.spec.actifsource.system.category.javamodel.ICategory.class, cleon.applications.actifsource.spec.actifsource.system.category.CategoryPackage.Category_hasDependency, object.getResource());
  }
  
  public static cleon.applications.actifsource.spec.actifsource.system.category.javamodel.ICategory selectToMeFeatures(cleon.applications.actifsource.spec.actifsource.system.category.feature.javamodel.IFeatureAggregateDecomposite object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.spec.actifsource.system.category.javamodel.ICategory.class, cleon.applications.actifsource.spec.actifsource.system.category.CategoryPackage.Category_features, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,27c04263-3c6a-11e6-aafa-bd565efc0ead,dnnC/WMQYJ0ZZLEoo7AambSOggo=] */
