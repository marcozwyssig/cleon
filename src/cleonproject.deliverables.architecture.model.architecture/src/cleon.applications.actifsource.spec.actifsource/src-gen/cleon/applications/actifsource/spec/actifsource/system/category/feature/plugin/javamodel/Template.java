package cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel;

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

  // relations
  
  @Override
  public cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.javamodel.IActifsource selectActifsource() {
    return _getSingle(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.javamodel.IActifsource.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_actifsource);
  }

  public Template setActifsource(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.javamodel.IActifsource actifsource) {
    _setSingle(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_actifsource, actifsource);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose);
  }

  public Template setDecompose(java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite> decompose) {
    _setList(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition> selectDecomposePackages() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages);
  }

  public Template setDecomposePackages(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition> decomposePackages) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages, decomposePackages);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPluginBuiltinDependency> selectDependsOnBuiltin() {
    return _getList(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPluginBuiltinDependency.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_dependsOnBuiltin);
  }

  public Template setDependsOnBuiltin(java.util.List<? extends cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPluginBuiltinDependency> dependsOnBuiltin) {
    _setList(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_dependsOnBuiltin, dependsOnBuiltin);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPluginProjectDependency> selectDependsOnPlugin() {
    return _getList(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPluginProjectDependency.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_dependsOnPlugin);
  }

  public Template setDependsOnPlugin(java.util.List<? extends cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPluginProjectDependency> dependsOnPlugin) {
    _setList(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_dependsOnPlugin, dependsOnPlugin);
    return this;
  }
    
  @Override
  public cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IGradle selectGradle() {
    return _getSingle(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IGradle.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_gradle);
  }

  public Template setGradle(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IGradle gradle) {
    _setSingle(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_gradle, gradle);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentDependency> selectHasDependency() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentDependency.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency);
  }

  public Template setHasDependency(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentDependency> hasDependency) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IInteraction> selectInteracts() {
    return _getList(cleon.common.modularity.spec.buildingblock.javamodel.IInteraction.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.InteractiveBuildingBlock_interacts);
  }

  public Template setInteracts(java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IInteraction> interacts) {
    _setList(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.InteractiveBuildingBlock_interacts, interacts);
    return this;
  }
    
  @Override
  public cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IJava selectJava() {
    return _getSingle(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IJava.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_java);
  }

  public Template setJava(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IJava java) {
    _setSingle(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_java, java);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition selectNoPackages() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.Component_noPackages);
  }

  public Template setNoPackages(cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.IPackageDecomposition noPackages) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.Component_noPackages, noPackages);
    return this;
  }
    
  @Override
  public cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IPlugin_Nature selectPlugin() {
    return _getSingle(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IPlugin_Nature.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_plugin);
  }

  public Template setPlugin(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IPlugin_Nature plugin) {
    _setSingle(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_plugin, plugin);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Required> selectPorts_In() {
    return _getMultiMap(cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Required.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In);
  }

  public Template setPorts_In(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Required> ports_In) {
    _setMultiMap(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In, ports_In);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Provider> selectPorts_Out() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out);
  }

  public Template setPorts_Out(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Provider> ports_Out) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out, ports_Out);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IResource> selectResources() {
    return _getList(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IResource.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_resources);
  }

  public Template setResources(java.util.List<? extends cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IResource> resources) {
    _setList(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_resources, resources);
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
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.javamodel.IActifsource.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_actifsource, visitor);
    _acceptList(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPluginBuiltinDependency.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_dependsOnBuiltin, visitor);
    _acceptList(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPluginProjectDependency.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_dependsOnPlugin, visitor);
    _acceptSingle(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IGradle.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_gradle, visitor);
    _acceptSingle(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IJava.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_java, visitor);
    _acceptSingle(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IPlugin_Nature.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_plugin, visitor);
    _acceptMultiMap(cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Required.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out, visitor);
    _acceptList(cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IResource.class, cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_resources, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3e687740-e9ba-11e4-848b-0509e3792151,l5qhV7zGCpvK2uaQ+YrZJl1aDAk=] */
