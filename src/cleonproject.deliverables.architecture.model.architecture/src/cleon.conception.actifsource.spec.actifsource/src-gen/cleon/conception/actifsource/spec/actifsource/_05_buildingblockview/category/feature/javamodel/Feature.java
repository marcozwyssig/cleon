package cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Feature extends DynamicResource implements IFeature {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFeature> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFeature>() {
    
    @Override
    public IFeature create() {
      return new Feature();
    }
    
    @Override
    public IFeature create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Feature(resourceRepository, resource);
    }
  
  };

  public Feature() {
    super(IFeature.TYPE_ID);
  }
  
  public Feature(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFeature.TYPE_ID);
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
  public java.util.List<? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPluginAggregateDecomposite> selectDecompose() {
    return _getList(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPluginAggregateDecomposite.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.FeaturePackage.Feature_decompose);
  }

  public Feature setDecompose(java.util.List<? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPluginAggregateDecomposite> decompose) {
    _setList(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.FeaturePackage.Feature_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentCompositionDecomposite> selectDecomposeComponent() {
    return _getList(cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentCompositionDecomposite.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent);
  }

  public Feature setDecomposeComponent(java.util.List<? extends cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentCompositionDecomposite> decomposeComponent) {
    _setList(cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent, decomposeComponent);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Feature setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.javamodel.IFeatureDependency> selectHasDependency() {
    return _getList(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.javamodel.IFeatureDependency.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.FeaturePackage.Feature_hasDependency);
  }

  public Feature setHasDependency(java.util.List<? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.javamodel.IFeatureDependency> hasDependency) {
    _setList(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.FeaturePackage.Feature_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Feature setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPluginAggregateDecomposite.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.FeaturePackage.Feature_decompose, visitor);
    _acceptList(cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentCompositionDecomposite.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.javamodel.IFeatureDependency.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.FeaturePackage.Feature_hasDependency, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.javamodel.IFeature selectToMeHasDependency(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.javamodel.IFeatureDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.javamodel.IFeature.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.FeaturePackage.Feature_hasDependency, object.getResource());
  }
  
  public static cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.javamodel.IFeature selectToMeDecompose(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPluginAggregateDecomposite object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.javamodel.IFeature.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.FeaturePackage.Feature_decompose, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,98431561-d40b-11e5-8556-8f55ceb91287,g0cxK3LyY9wvUjJFPhrAKdM7KkI=] */
