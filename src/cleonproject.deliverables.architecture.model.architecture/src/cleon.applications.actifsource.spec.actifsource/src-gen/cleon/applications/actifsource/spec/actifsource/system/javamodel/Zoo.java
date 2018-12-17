package cleon.applications.actifsource.spec.actifsource.system.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Zoo extends DynamicResource implements IZoo {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IZoo> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IZoo>() {
    
    @Override
    public IZoo create() {
      return new Zoo();
    }
    
    @Override
    public IZoo create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Zoo(resourceRepository, resource);
    }
  
  };

  public Zoo() {
    super(IZoo.TYPE_ID);
  }
  
  public Zoo(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IZoo.TYPE_ID);
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
  public java.util.List<? extends cleon.applications.actifsource.spec.actifsource.system.category.javamodel.ICategoryAggregateDecomposite> selectCategories() {
    return _getList(cleon.applications.actifsource.spec.actifsource.system.category.javamodel.ICategoryAggregateDecomposite.class, cleon.applications.actifsource.spec.actifsource.system.SystemPackage.Zoo_categories);
  }

  public Zoo setCategories(java.util.List<? extends cleon.applications.actifsource.spec.actifsource.system.category.javamodel.ICategoryAggregateDecomposite> categories) {
    _setList(cleon.applications.actifsource.spec.actifsource.system.SystemPackage.Zoo_categories, categories);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose);
  }

  public Zoo setDecompose(java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite> decompose) {
    _setList(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IDependency> selectHasDependency() {
    return _getList(cleon.common.modularity.spec.buildingblock.javamodel.IDependency.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.SoftwareSystem_hasDependency);
  }

  public Zoo setHasDependency(java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IDependency> hasDependency) {
    _setList(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.SoftwareSystem_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.versions.javamodel.ISystemStage selectSystemStage() {
    return _getSingle(cleon.common.resources.spec.resources.versions.javamodel.ISystemStage.class, cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_systemStage);
  }

  public Zoo setSystemStage(cleon.common.resources.spec.resources.versions.javamodel.ISystemStage systemStage) {
    _setSingle(cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_systemStage, systemStage);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Zoo setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion selectVersion() {
    return _getSingle(cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion.class, cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_version);
  }

  public Zoo setVersion(cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion version) {
    _setSingle(cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_version, version);
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
    _acceptList(cleon.applications.actifsource.spec.actifsource.system.category.javamodel.ICategoryAggregateDecomposite.class, cleon.applications.actifsource.spec.actifsource.system.SystemPackage.Zoo_categories, visitor);
    _acceptList(cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, visitor);
    _acceptList(cleon.common.modularity.spec.buildingblock.javamodel.IDependency.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.SoftwareSystem_hasDependency, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.versions.javamodel.ISystemStage.class, cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_systemStage, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion.class, cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_version, visitor);
  }

  // toMeRelations
  
  public static cleon.applications.actifsource.spec.actifsource.system.javamodel.IZoo selectToMeCategories(cleon.applications.actifsource.spec.actifsource.system.category.javamodel.ICategoryAggregateDecomposite object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.spec.actifsource.system.javamodel.IZoo.class, cleon.applications.actifsource.spec.actifsource.system.SystemPackage.Zoo_categories, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7b6b4712-f986-11e5-a7fd-010f93305101,GhTwGEgQLo8b/JnuoNIy3kDNzbk=] */
