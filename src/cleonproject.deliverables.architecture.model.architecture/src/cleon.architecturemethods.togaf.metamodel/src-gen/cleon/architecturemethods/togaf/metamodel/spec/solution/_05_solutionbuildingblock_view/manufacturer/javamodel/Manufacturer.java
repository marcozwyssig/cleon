package cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Manufacturer extends DynamicResource implements IManufacturer {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IManufacturer> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IManufacturer>() {
    
    @Override
    public IManufacturer create() {
      return new Manufacturer();
    }
    
    @Override
    public IManufacturer create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Manufacturer(resourceRepository, resource);
    }
  
  };

  public Manufacturer() {
    super(IManufacturer.TYPE_ID);
  }
  
  public Manufacturer(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IManufacturer.TYPE_ID);
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
  public java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> selectDecompose() {
    return _getList(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.common.modularity.metamodel.spec.SpecPackage.DecompositionBuildingBlock_decompose);
  }

  public Manufacturer setDecompose(java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> decompose) {
    _setList(cleon.common.modularity.metamodel.spec.SpecPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent> selectDecomposeComponent() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent);
  }

  public Manufacturer setDecomposeComponent(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent> decomposeComponent) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent, decomposeComponent);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlock> selectDecomposeSolutions() {
    return _getList(cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlock.class, cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.ManufacturerPackage.Manufacturer_decomposeSolutions);
  }

  public Manufacturer setDecomposeSolutions(java.util.List<? extends cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlock> decomposeSolutions) {
    _setList(cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.ManufacturerPackage.Manufacturer_decomposeSolutions, decomposeSolutions);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentCompositionDependency> selectHasDependency() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentCompositionDependency.class, cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.ManufacturerPackage.Manufacturer_hasDependency);
  }

  public Manufacturer setHasDependency(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentCompositionDependency> hasDependency) {
    _setList(cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.ManufacturerPackage.Manufacturer_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IInteraction> selectInteracts() {
    return _getList(cleon.common.modularity.metamodel.spec.javamodel.IInteraction.class, cleon.common.modularity.metamodel.spec.SpecPackage.InteractiveBuildingBlock_interacts);
  }

  public Manufacturer setInteracts(java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IInteraction> interacts) {
    _setList(cleon.common.modularity.metamodel.spec.SpecPackage.InteractiveBuildingBlock_interacts, interacts);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required> selectPorts_In() {
    return _getMultiMap(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In);
  }

  public Manufacturer setPorts_In(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required> ports_In) {
    _setMultiMap(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In, ports_In);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider> selectPorts_Out() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out);
  }

  public Manufacturer setPorts_Out(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider> ports_Out) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out, ports_Out);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Manufacturer setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlock.class, cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.ManufacturerPackage.Manufacturer_decomposeSolutions, visitor);
    _acceptMultiMap(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In, visitor);
    _acceptList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturer selectToMeHasDependency(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentCompositionDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturer.class, cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.ManufacturerPackage.Manufacturer_hasDependency, object.getResource());
  }
  
  public static cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturer selectToMeDecomposeSolutions(cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlock object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturer.class, cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.ManufacturerPackage.Manufacturer_decomposeSolutions, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,01fe9fef-2d70-11e6-959f-d1cef44ff5fd,0ifS5Ddx1Cn5r4ITR4dFI5OMfi0=] */
