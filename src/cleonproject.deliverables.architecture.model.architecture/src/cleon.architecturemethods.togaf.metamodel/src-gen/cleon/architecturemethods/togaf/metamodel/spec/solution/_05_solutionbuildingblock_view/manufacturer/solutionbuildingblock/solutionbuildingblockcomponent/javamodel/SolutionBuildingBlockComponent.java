package cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SolutionBuildingBlockComponent extends DynamicResource implements ISolutionBuildingBlockComponent {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISolutionBuildingBlockComponent> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISolutionBuildingBlockComponent>() {
    
    @Override
    public ISolutionBuildingBlockComponent create() {
      return new SolutionBuildingBlockComponent();
    }
    
    @Override
    public ISolutionBuildingBlockComponent create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SolutionBuildingBlockComponent(resourceRepository, resource);
    }
  
  };

  public SolutionBuildingBlockComponent() {
    super(ISolutionBuildingBlockComponent.TYPE_ID);
  }
  
  public SolutionBuildingBlockComponent(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISolutionBuildingBlockComponent.TYPE_ID);
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
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
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
  public java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> selectDecompose() {
    return _getList(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.common.modularity.metamodel.spec.SpecPackage.DecompositionBuildingBlock_decompose);
  }

  public SolutionBuildingBlockComponent setDecompose(java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> decompose) {
    _setList(cleon.common.modularity.metamodel.spec.SpecPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage> selectDecomposePackages() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages);
  }

  public SolutionBuildingBlockComponent setDecomposePackages(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage> decomposePackages) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages, decomposePackages);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentDependency> selectHasDependency() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentDependency.class, cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.SolutionbuildingblockcomponentPackage.SolutionBuildingBlockComponent_hasDependency);
  }

  public SolutionBuildingBlockComponent setHasDependency(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentDependency> hasDependency) {
    _setList(cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.SolutionbuildingblockcomponentPackage.SolutionBuildingBlockComponent_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IInteraction> selectInteracts() {
    return _getList(cleon.common.modularity.metamodel.spec.javamodel.IInteraction.class, cleon.common.modularity.metamodel.spec.SpecPackage.InteractiveBuildingBlock_interacts);
  }

  public SolutionBuildingBlockComponent setInteracts(java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IInteraction> interacts) {
    _setList(cleon.common.modularity.metamodel.spec.SpecPackage.InteractiveBuildingBlock_interacts, interacts);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage selectNoPackages() {
    return _getSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.Component_noPackages);
  }

  public SolutionBuildingBlockComponent setNoPackages(cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage noPackages) {
    _setSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.Component_noPackages, noPackages);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required> selectPorts_In() {
    return _getMultiMap(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In);
  }

  public SolutionBuildingBlockComponent setPorts_In(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required> ports_In) {
    _setMultiMap(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In, ports_In);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider> selectPorts_Out() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out);
  }

  public SolutionBuildingBlockComponent setPorts_Out(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider> ports_Out) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out, ports_Out);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SolutionBuildingBlockComponent setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptMultiMap(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In, visitor);
    _acceptList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel.ISolutionBuildingBlockComponent selectToMeHasDependency(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel.ISolutionBuildingBlockComponent.class, cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.SolutionbuildingblockcomponentPackage.SolutionBuildingBlockComponent_hasDependency, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,31890305-33a2-11e6-94cd-fbf6c8ccd08d,KVQzypBk1if6ua1/XiDsDLYZ1so=] */
