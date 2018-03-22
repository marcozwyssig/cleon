package cleon.conception.actifsource.spec.actifsource._03_system_scope_and_context.javamodel;

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

  @Override
  public java.lang.String selectShortName() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName);
  }
    
  public void setShortName(java.lang.String shortName) {
     _setSingleAttribute(cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName, shortName);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.javamodel.ICategoryAggregateDecomposite> selectCategories() {
    return _getList(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.javamodel.ICategoryAggregateDecomposite.class, cleon.conception.actifsource.spec.actifsource._03_system_scope_and_context._03_system_scope_and_contextPackage.Zoo_categories);
  }

  public Zoo setCategories(java.util.List<? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.javamodel.ICategoryAggregateDecomposite> categories) {
    _setList(cleon.conception.actifsource.spec.actifsource._03_system_scope_and_context._03_system_scope_and_contextPackage.Zoo_categories, categories);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IDecomposite.class, cleon.conception.framework.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_decompose);
  }

  public Zoo setDecompose(java.util.List<? extends cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IDecomposite> decompose) {
    _setList(cleon.conception.framework.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Zoo setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IDependency> selectHasDependency() {
    return _getList(cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IDependency.class, cleon.conception.software.spec.software._05_building_block._05_building_blockPackage.SoftwareSystem_hasDependency);
  }

  public Zoo setHasDependency(java.util.List<? extends cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IDependency> hasDependency) {
    _setList(cleon.conception.software.spec.software._05_building_block._05_building_blockPackage.SoftwareSystem_hasDependency, hasDependency);
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
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName, visitor);
    // relations
    _acceptList(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.javamodel.ICategoryAggregateDecomposite.class, cleon.conception.actifsource.spec.actifsource._03_system_scope_and_context._03_system_scope_and_contextPackage.Zoo_categories, visitor);
    _acceptList(cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IDecomposite.class, cleon.conception.framework.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_decompose, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IDependency.class, cleon.conception.software.spec.software._05_building_block._05_building_blockPackage.SoftwareSystem_hasDependency, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion.class, cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_version, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.actifsource.spec.actifsource._03_system_scope_and_context.javamodel.IZoo selectToMeCategories(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.javamodel.ICategoryAggregateDecomposite object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.actifsource.spec.actifsource._03_system_scope_and_context.javamodel.IZoo.class, cleon.conception.actifsource.spec.actifsource._03_system_scope_and_context._03_system_scope_and_contextPackage.Zoo_categories, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7b6b4712-f986-11e5-a7fd-010f93305101,3VnsEsjzpNNfLmSrdCVTbPy9ur4=] */
