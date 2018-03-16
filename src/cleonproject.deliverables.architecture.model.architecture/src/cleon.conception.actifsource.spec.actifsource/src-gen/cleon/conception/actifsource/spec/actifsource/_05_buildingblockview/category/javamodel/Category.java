package cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.javamodel;

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

  @Override
  public java.lang.String selectShortName() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName);
  }
    
  public void setShortName(java.lang.String shortName) {
     _setSingleAttribute(cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName, shortName);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel.IDecomposite.class, cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose);
  }

  public Category setDecompose(java.util.List<? extends cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel.IDecomposite> decompose) {
    _setList(cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentCompositionDecomposite> selectDecomposeComponent() {
    return _getList(cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentCompositionDecomposite.class, cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent);
  }

  public Category setDecomposeComponent(java.util.List<? extends cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentCompositionDecomposite> decomposeComponent) {
    _setList(cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent, decomposeComponent);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Category setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.javamodel.IFeatureAggregateDecomposite> selectFeatures() {
    return _getList(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.javamodel.IFeatureAggregateDecomposite.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.CategoryPackage.Category_features);
  }

  public Category setFeatures(java.util.List<? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.javamodel.IFeatureAggregateDecomposite> features) {
    _setList(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.CategoryPackage.Category_features, features);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.javamodel.ICategoryDependency> selectHasDependency() {
    return _getList(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.javamodel.ICategoryDependency.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.CategoryPackage.Category_hasDependency);
  }

  public Category setHasDependency(java.util.List<? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.javamodel.ICategoryDependency> hasDependency) {
    _setList(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.CategoryPackage.Category_hasDependency, hasDependency);
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
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName, visitor);
    // relations
    _acceptList(cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel.IDecomposite.class, cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, visitor);
    _acceptList(cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentCompositionDecomposite.class, cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.javamodel.IFeatureAggregateDecomposite.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.CategoryPackage.Category_features, visitor);
    _acceptList(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.javamodel.ICategoryDependency.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.CategoryPackage.Category_hasDependency, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.javamodel.ICategory selectToMeHasDependency(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.javamodel.ICategoryDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.javamodel.ICategory.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.CategoryPackage.Category_hasDependency, object.getResource());
  }
  
  public static cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.javamodel.ICategory selectToMeFeatures(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.javamodel.IFeatureAggregateDecomposite object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.javamodel.ICategory.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.CategoryPackage.Category_features, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,27c04263-3c6a-11e6-aafa-bd565efc0ead,TBIy3unTciIwmBHuXN/MmBn7aAc=] */
