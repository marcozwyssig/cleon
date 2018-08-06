package cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.template.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Template extends DynamicResource implements ITemplate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITemplate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITemplate>() {
    
    @Override
    public ITemplate create() {
      return new Template();
    }
    
    @Override
    public ITemplate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Template(resourceRepository, resource);
    }
  
  };

  public Template() {
    super(ITemplate.TYPE_ID);
  }
  
  public Template(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITemplate.TYPE_ID);
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
  public cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.javamodel.IActifsource selectActifsource() {
    return _getSingle(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.javamodel.IActifsource.class, cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_actifsource);
  }

  public Template setActifsource(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.javamodel.IActifsource actifsource) {
    _setSingle(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_actifsource, actifsource);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.buildingblock.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.conception.architecture.spec.buildingblock.javamodel.IDecomposite.class, cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose);
  }

  public Template setDecompose(java.util.List<? extends cleon.conception.architecture.spec.buildingblock.javamodel.IDecomposite> decompose) {
    _setList(cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackageDecomposition> selectDecomposePackages() {
    return _getList(cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackageDecomposition.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages);
  }

  public Template setDecomposePackages(java.util.List<? extends cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackageDecomposition> decomposePackages) {
    _setList(cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages, decomposePackages);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPluginDependency> selectDependsOn() {
    return _getList(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPluginDependency.class, cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_dependsOn);
  }

  public Template setDependsOn(java.util.List<? extends cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPluginDependency> dependsOn) {
    _setList(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_dependsOn, dependsOn);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPackage> selectExportPackage() {
    return _getList(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPackage.class, cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_exportPackage);
  }

  public Template setExportPackage(java.util.List<? extends cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPackage> exportPackage) {
    _setList(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_exportPackage, exportPackage);
    return this;
  }
    
  @Override
  public cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IGradle selectGradle() {
    return _getSingle(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IGradle.class, cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_gradle);
  }

  public Template setGradle(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IGradle gradle) {
    _setSingle(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_gradle, gradle);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentDependency> selectHasDependency() {
    return _getList(cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentDependency.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency);
  }

  public Template setHasDependency(java.util.List<? extends cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentDependency> hasDependency) {
    _setList(cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IJava selectJava() {
    return _getSingle(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IJava.class, cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_java);
  }

  public Template setJava(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IJava java) {
    _setSingle(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_java, java);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackageDecomposition selectNoPackages() {
    return _getSingle(cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackageDecomposition.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.Component_noPackages);
  }

  public Template setNoPackages(cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackageDecomposition noPackages) {
    _setSingle(cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.Component_noPackages, noPackages);
    return this;
  }
    
  @Override
  public cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IPlugin_Nature selectPlugin() {
    return _getSingle(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IPlugin_Nature.class, cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_plugin);
  }

  public Template setPlugin(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IPlugin_Nature plugin) {
    _setSingle(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_plugin, plugin);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IResource> selectResources() {
    return _getList(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IResource.class, cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_resources);
  }

  public Template setResources(java.util.List<? extends cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IResource> resources) {
    _setList(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_resources, resources);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Template setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.javamodel.IActifsource.class, cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_actifsource, visitor);
    _acceptList(cleon.conception.architecture.spec.buildingblock.javamodel.IDecomposite.class, cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, visitor);
    _acceptList(cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackageDecomposition.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages, visitor);
    _acceptList(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPluginDependency.class, cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_dependsOn, visitor);
    _acceptList(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPackage.class, cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_exportPackage, visitor);
    _acceptSingle(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IGradle.class, cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_gradle, visitor);
    _acceptList(cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentDependency.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency, visitor);
    _acceptSingle(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IJava.class, cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_java, visitor);
    _acceptSingle(cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackageDecomposition.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.Component_noPackages, visitor);
    _acceptSingle(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IPlugin_Nature.class, cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_plugin, visitor);
    _acceptList(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IResource.class, cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_resources, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3e687740-e9ba-11e4-848b-0509e3792151,KSkO7nm5GB7wf7cYSuT58xwaTek=] */
