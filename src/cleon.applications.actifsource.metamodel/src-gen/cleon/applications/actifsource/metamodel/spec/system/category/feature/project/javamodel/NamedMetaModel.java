package cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NamedMetaModel extends DynamicResource implements INamedMetaModel {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedMetaModel> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedMetaModel>() {
    
    @Override
    public INamedMetaModel create() {
      return new NamedMetaModel();
    }
    
    @Override
    public INamedMetaModel create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NamedMetaModel(resourceRepository, resource);
    }
  
  };

  public NamedMetaModel() {
    super(INamedMetaModel.TYPE_ID);
  }
  
  public NamedMetaModel(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INamedMetaModel.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
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
  public cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.actifsource.javamodel.IActifsource selectActifsource() {
    return _getSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.actifsource.javamodel.IActifsource.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.AbstractProject_actifsource);
  }

  public NamedMetaModel setActifsource(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.actifsource.javamodel.IActifsource actifsource) {
    _setSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.AbstractProject_actifsource, actifsource);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> selectDecompose() {
    return _getList(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.common.modularity.metamodel.spec.SpecPackage.DecompositionBuildingBlock_decompose);
  }

  public NamedMetaModel setDecompose(java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> decompose) {
    _setList(cleon.common.modularity.metamodel.spec.SpecPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage> selectDecomposePackages() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages);
  }

  public NamedMetaModel setDecomposePackages(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage> decomposePackages) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages, decomposePackages);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponentDependency> selectDepends() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponentDependency.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_depends);
  }

  public NamedMetaModel setDepends(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponentDependency> depends) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_depends, depends);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IDependency> selectDependsOn() {
    return _getList(cleon.common.modularity.metamodel.spec.javamodel.IDependency.class, cleon.common.modularity.metamodel.spec.SpecPackage.DependentBuildingBlock_dependsOn);
  }

  public NamedMetaModel setDependsOn(java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IDependency> dependsOn) {
    _setList(cleon.common.modularity.metamodel.spec.SpecPackage.DependentBuildingBlock_dependsOn, dependsOn);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IPluginBuiltinDependency> selectDependsOnBuiltin() {
    return _getList(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IPluginBuiltinDependency.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.AbstractProject_dependsOnBuiltin);
  }

  public NamedMetaModel setDependsOnBuiltin(java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IPluginBuiltinDependency> dependsOnBuiltin) {
    _setList(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.AbstractProject_dependsOnBuiltin, dependsOnBuiltin);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IPluginProjectDependency> selectDependsOnProject() {
    return _getList(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IPluginProjectDependency.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.AbstractProject_dependsOnProject);
  }

  public NamedMetaModel setDependsOnProject(java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IPluginProjectDependency> dependsOnProject) {
    _setList(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.AbstractProject_dependsOnProject, dependsOnProject);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> selectDescriptionTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation);
  }

  public NamedMetaModel setDescriptionTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> descriptionTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, descriptionTranslation);
    return this;
  }
    
  @Override
  public cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.IGradle selectGradle() {
    return _getSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.IGradle.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.AbstractProject_gradle);
  }

  public NamedMetaModel setGradle(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.IGradle gradle) {
    _setSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.AbstractProject_gradle, gradle);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IInteraction> selectInteracts() {
    return _getList(cleon.common.modularity.metamodel.spec.javamodel.IInteraction.class, cleon.common.modularity.metamodel.spec.SpecPackage.InteractiveBuildingBlock_interacts);
  }

  public NamedMetaModel setInteracts(java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IInteraction> interacts) {
    _setList(cleon.common.modularity.metamodel.spec.SpecPackage.InteractiveBuildingBlock_interacts, interacts);
    return this;
  }
    
  @Override
  public cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.IJava selectJava() {
    return _getSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.IJava.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.AbstractProject_java);
  }

  public NamedMetaModel setJava(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.IJava java) {
    _setSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.AbstractProject_java, java);
    return this;
  }
    
  @Override
  public cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.IPlugin selectPlugin() {
    return _getSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.IPlugin.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.AbstractProject_plugin);
  }

  public NamedMetaModel setPlugin(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.IPlugin plugin) {
    _setSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.AbstractProject_plugin, plugin);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required> selectPorts_In() {
    return _getMultiMap(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In);
  }

  public NamedMetaModel setPorts_In(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required> ports_In) {
    _setMultiMap(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In, ports_In);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider> selectPorts_Out() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out);
  }

  public NamedMetaModel setPorts_Out(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider> ports_Out) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out, ports_Out);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel.IAbstractEclipseResource> selectResources() {
    return _getList(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel.IAbstractEclipseResource.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.AbstractProject_resources);
  }

  public NamedMetaModel setResources(java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel.IAbstractEclipseResource> resources) {
    _setList(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.AbstractProject_resources, resources);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NamedMetaModel setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.actifsource.javamodel.IActifsource.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.AbstractProject_actifsource, visitor);
    _acceptList(cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages, visitor);
    _acceptList(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IPluginBuiltinDependency.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.AbstractProject_dependsOnBuiltin, visitor);
    _acceptList(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IPluginProjectDependency.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.AbstractProject_dependsOnProject, visitor);
    _acceptMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, visitor);
    _acceptSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.IGradle.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.AbstractProject_gradle, visitor);
    _acceptSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.IJava.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.AbstractProject_java, visitor);
    _acceptSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.IPlugin.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.AbstractProject_plugin, visitor);
    _acceptMultiMap(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In, visitor);
    _acceptList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out, visitor);
    _acceptList(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel.IAbstractEclipseResource.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.project.ProjectPackage.AbstractProject_resources, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1e7fabc7-2703-11ea-8c59-871562e3b5c4,KOjVHuJPfD0ltzKn0380mKDXTgI=] */
