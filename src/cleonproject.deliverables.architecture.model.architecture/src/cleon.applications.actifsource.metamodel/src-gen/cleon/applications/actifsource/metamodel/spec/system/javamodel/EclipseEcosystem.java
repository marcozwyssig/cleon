package cleon.applications.actifsource.metamodel.spec.system.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class EclipseEcosystem extends DynamicResource implements IEclipseEcosystem {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEclipseEcosystem> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEclipseEcosystem>() {
    
    @Override
    public IEclipseEcosystem create() {
      return new EclipseEcosystem();
    }
    
    @Override
    public IEclipseEcosystem create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new EclipseEcosystem(resourceRepository, resource);
    }
  
  };

  public EclipseEcosystem() {
    super(IEclipseEcosystem.TYPE_ID);
  }
  
  public EclipseEcosystem(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEclipseEcosystem.TYPE_ID);
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
  public java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.javamodel.ICategory> selectCategories() {
    return _getList(cleon.applications.actifsource.metamodel.spec.system.category.javamodel.ICategory.class, cleon.applications.actifsource.metamodel.spec.system.SystemPackage.EclipseEcosystem_categories);
  }

  public EclipseEcosystem setCategories(java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.javamodel.ICategory> categories) {
    _setList(cleon.applications.actifsource.metamodel.spec.system.SystemPackage.EclipseEcosystem_categories, categories);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> selectDecompose() {
    return _getList(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.common.modularity.metamodel.spec.SpecPackage.DecompositionBuildingBlock_decompose);
  }

  public EclipseEcosystem setDecompose(java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> decompose) {
    _setList(cleon.common.modularity.metamodel.spec.SpecPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent> selectDecomposeComponent() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent);
  }

  public EclipseEcosystem setDecomposeComponent(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent> decomposeComponent) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent, decomposeComponent);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentCompositionDependency> selectHasDependency() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentCompositionDependency.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentComposition_hasDependency);
  }

  public EclipseEcosystem setHasDependency(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentCompositionDependency> hasDependency) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentComposition_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IInteraction> selectInteracts() {
    return _getList(cleon.common.modularity.metamodel.spec.javamodel.IInteraction.class, cleon.common.modularity.metamodel.spec.SpecPackage.InteractiveBuildingBlock_interacts);
  }

  public EclipseEcosystem setInteracts(java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IInteraction> interacts) {
    _setList(cleon.common.modularity.metamodel.spec.SpecPackage.InteractiveBuildingBlock_interacts, interacts);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required> selectPorts_In() {
    return _getMultiMap(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In);
  }

  public EclipseEcosystem setPorts_In(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required> ports_In) {
    _setMultiMap(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In, ports_In);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider> selectPorts_Out() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out);
  }

  public EclipseEcosystem setPorts_Out(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider> ports_Out) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out, ports_Out);
    return this;
  }
    
  @Override
  public cleon.applications.actifsource.metamodel.spec.system.javamodel.IPackages selectRootPackages() {
    return _getSingle(cleon.applications.actifsource.metamodel.spec.system.javamodel.IPackages.class, cleon.applications.actifsource.metamodel.spec.system.SystemPackage.EclipseEcosystem_rootPackages);
  }

  public EclipseEcosystem setRootPackages(cleon.applications.actifsource.metamodel.spec.system.javamodel.IPackages rootPackages) {
    _setSingle(cleon.applications.actifsource.metamodel.spec.system.SystemPackage.EclipseEcosystem_rootPackages, rootPackages);
    return this;
  }
    
  @Override
  public cleon.common.resources.metamodel.spec.versions.javamodel.ISystemStage selectSystemStage() {
    return _getSingle(cleon.common.resources.metamodel.spec.versions.javamodel.ISystemStage.class, cleon.common.resources.metamodel.spec.versions.VersionsPackage.SemanticVersionAware_systemStage);
  }

  public EclipseEcosystem setSystemStage(cleon.common.resources.metamodel.spec.versions.javamodel.ISystemStage systemStage) {
    _setSingle(cleon.common.resources.metamodel.spec.versions.VersionsPackage.SemanticVersionAware_systemStage, systemStage);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public EclipseEcosystem setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.common.resources.metamodel.spec.versions.javamodel.ISemanticVersion selectVersion() {
    return _getSingle(cleon.common.resources.metamodel.spec.versions.javamodel.ISemanticVersion.class, cleon.common.resources.metamodel.spec.versions.VersionsPackage.SemanticVersionAware_version);
  }

  public EclipseEcosystem setVersion(cleon.common.resources.metamodel.spec.versions.javamodel.ISemanticVersion version) {
    _setSingle(cleon.common.resources.metamodel.spec.versions.VersionsPackage.SemanticVersionAware_version, version);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.applications.actifsource.metamodel.spec.system.category.javamodel.ICategory.class, cleon.applications.actifsource.metamodel.spec.system.SystemPackage.EclipseEcosystem_categories, visitor);
    _acceptList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentCompositionDependency.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentComposition_hasDependency, visitor);
    _acceptMultiMap(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In, visitor);
    _acceptList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out, visitor);
    _acceptSingle(cleon.applications.actifsource.metamodel.spec.system.javamodel.IPackages.class, cleon.applications.actifsource.metamodel.spec.system.SystemPackage.EclipseEcosystem_rootPackages, visitor);
    _acceptSingle(cleon.common.resources.metamodel.spec.versions.javamodel.ISystemStage.class, cleon.common.resources.metamodel.spec.versions.VersionsPackage.SemanticVersionAware_systemStage, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.common.resources.metamodel.spec.versions.javamodel.ISemanticVersion.class, cleon.common.resources.metamodel.spec.versions.VersionsPackage.SemanticVersionAware_version, visitor);
  }

  // toMeRelations
  
  public static cleon.applications.actifsource.metamodel.spec.system.javamodel.IEclipseEcosystem selectToMeCategories(cleon.applications.actifsource.metamodel.spec.system.category.javamodel.ICategory object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.javamodel.IEclipseEcosystem.class, cleon.applications.actifsource.metamodel.spec.system.SystemPackage.EclipseEcosystem_categories, object.getResource());
  }
  
  public static cleon.applications.actifsource.metamodel.spec.system.javamodel.IEclipseEcosystem selectToMeRootPackages(cleon.applications.actifsource.metamodel.spec.system.javamodel.IPackages object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.javamodel.IEclipseEcosystem.class, cleon.applications.actifsource.metamodel.spec.system.SystemPackage.EclipseEcosystem_rootPackages, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7b6b4712-f986-11e5-a7fd-010f93305101,Fi57zv3/RLlqlVS3Shwf/aWuusg=] */
