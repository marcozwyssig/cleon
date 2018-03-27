package cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.model.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Model extends DynamicResource implements IModel {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModel> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModel>() {
    
    @Override
    public IModel create() {
      return new Model();
    }
    
    @Override
    public IModel create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Model(resourceRepository, resource);
    }
  
  };

  public Model() {
    super(IModel.TYPE_ID);
  }
  
  public Model(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IModel.TYPE_ID);
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
  public java.lang.Boolean selectGeneratedJavaModel() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.Plugin_generatedJavaModel);
  }
    
  public void setGeneratedJavaModel(java.lang.Boolean generatedJavaModel) {
     _setSingleAttribute(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.Plugin_generatedJavaModel, generatedJavaModel);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectPluginActivationClassName() {
    return _getSingleAttribute(java.lang.String.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.Plugin_pluginActivationClassName);
  }
    
  public void setPluginActivationClassName(java.lang.String pluginActivationClassName) {
     _setSingleAttribute(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.Plugin_pluginActivationClassName, pluginActivationClassName);
  }

  @Override
  public java.lang.String selectShortName() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName);
  }
    
  public void setShortName(java.lang.String shortName) {
     _setSingleAttribute(cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName, shortName);
  }

  @Override
  public java.lang.Boolean selectUseSimpleNameForBinding() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.Plugin_useSimpleNameForBinding);
  }
    
  public void setUseSimpleNameForBinding(java.lang.Boolean useSimpleNameForBinding) {
     _setSingleAttribute(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.Plugin_useSimpleNameForBinding, useSimpleNameForBinding);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.buildingblock.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.conception.architecture.spec.buildingblock.javamodel.IDecomposite.class, cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose);
  }

  public Model setDecompose(java.util.List<? extends cleon.conception.architecture.spec.buildingblock.javamodel.IDecomposite> decompose) {
    _setList(cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackageDecomposition> selectDecomposePackages() {
    return _getList(cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackageDecomposition.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages);
  }

  public Model setDecomposePackages(java.util.List<? extends cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackageDecomposition> decomposePackages) {
    _setList(cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages, decomposePackages);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPluginDependency> selectDependsOn() {
    return _getList(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPluginDependency.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.Plugin_dependsOn);
  }

  public Model setDependsOn(java.util.List<? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPluginDependency> dependsOn) {
    _setList(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.Plugin_dependsOn, dependsOn);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Model setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPackage> selectExportPackage() {
    return _getList(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPackage.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.Plugin_exportPackage);
  }

  public Model setExportPackage(java.util.List<? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPackage> exportPackage) {
    _setList(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.Plugin_exportPackage, exportPackage);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentDependency> selectHasDependency() {
    return _getList(cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentDependency.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency);
  }

  public Model setHasDependency(java.util.List<? extends cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentDependency> hasDependency) {
    _setList(cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackageDecomposition selectNoPackages() {
    return _getSingle(cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackageDecomposition.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.Component_noPackages);
  }

  public Model setNoPackages(cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackageDecomposition noPackages) {
    _setSingle(cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.Component_noPackages, noPackages);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IResource> selectResources() {
    return _getList(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IResource.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.Plugin_resources);
  }

  public Model setResources(java.util.List<? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IResource> resources) {
    _setList(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.Plugin_resources, resources);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.ITargetPath> selectTargetPaths() {
    return _getMap(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.ITargetPath.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.Plugin_targetPaths);
  }

  public Model setTargetPaths(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.ITargetPath> targetPaths) {
    _setMap(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.Plugin_targetPaths, targetPaths);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Model setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.Plugin_generatedJavaModel, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.Plugin_pluginActivationClassName, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.Plugin_useSimpleNameForBinding, visitor);
    // relations
    _acceptList(cleon.conception.architecture.spec.buildingblock.javamodel.IDecomposite.class, cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, visitor);
    _acceptList(cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackageDecomposition.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages, visitor);
    _acceptList(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPluginDependency.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.Plugin_dependsOn, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPackage.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.Plugin_exportPackage, visitor);
    _acceptList(cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentDependency.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency, visitor);
    _acceptSingle(cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackageDecomposition.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.Component_noPackages, visitor);
    _acceptList(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IResource.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.Plugin_resources, visitor);
    _acceptMap(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.ITargetPath.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.Plugin_targetPaths, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,eab1ce0a-1005-11e5-865e-55f33dbc76dc,AjYWpn8QCqZqZfgkPWvWjQCakQQ=] */
