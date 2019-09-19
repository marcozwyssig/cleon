package cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SolutionBuildingBlock extends DynamicResource implements ISolutionBuildingBlock {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISolutionBuildingBlock> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISolutionBuildingBlock>() {
    
    @Override
    public ISolutionBuildingBlock create() {
      return new SolutionBuildingBlock();
    }
    
    @Override
    public ISolutionBuildingBlock create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SolutionBuildingBlock(resourceRepository, resource);
    }
  
  };

  public SolutionBuildingBlock() {
    super(ISolutionBuildingBlock.TYPE_ID);
  }
  
  public SolutionBuildingBlock(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISolutionBuildingBlock.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectRequiredShortName() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.RequiredShortName_RequiredShortName);
  }
    
  public void setRequiredShortName(java.lang.String requiredShortName) {
     _setSingleAttribute(cleon.common.resources.spec.resources.naming.NamingPackage.RequiredShortName_RequiredShortName, requiredShortName);
  }

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
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
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

  @Override
  public java.lang.String selectVersion() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.versions.VersionsPackage.Version_version);
  }
    
  public void setVersion(java.lang.String version) {
     _setSingleAttribute(cleon.common.resources.spec.resources.versions.VersionsPackage.Version_version, version);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ICpuArchitecture selectCpu() {
    return _getSingle(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ICpuArchitecture.class, cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.SolutionBuildingBlock_cpu);
  }

  public SolutionBuildingBlock setCpu(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ICpuArchitecture cpu) {
    _setSingle(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.SolutionBuildingBlock_cpu, cpu);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel.ISolutionBuildingBlockComponentDecomposite> selectDecompose() {
    return _getList(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel.ISolutionBuildingBlockComponentDecomposite.class, cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.SolutionBuildingBlock_decompose);
  }

  public SolutionBuildingBlock setDecompose(java.util.List<? extends cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel.ISolutionBuildingBlockComponentDecomposite> decompose) {
    _setList(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.SolutionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentCompositionDecomposite> selectDecomposeComponent() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentCompositionDecomposite.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent);
  }

  public SolutionBuildingBlock setDecomposeComponent(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentCompositionDecomposite> decomposeComponent) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent, decomposeComponent);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.IDeploymentArtefact selectDeploymentArtefact() {
    return _getSingle(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.IDeploymentArtefact.class, cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.SolutionBuildingBlock_deploymentArtefact);
  }

  public SolutionBuildingBlock setDeploymentArtefact(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.IDeploymentArtefact deploymentArtefact) {
    _setSingle(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.SolutionBuildingBlock_deploymentArtefact, deploymentArtefact);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentCompositionDependency> selectHasDependency() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentCompositionDependency.class, cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.SolutionBuildingBlock_hasDependency);
  }

  public SolutionBuildingBlock setHasDependency(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentCompositionDependency> hasDependency) {
    _setList(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.SolutionBuildingBlock_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IInteraction> selectInteracts() {
    return _getList(cleon.common.modularity.spec.buildingblock.javamodel.IInteraction.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.InteractiveBuildingBlock_interacts);
  }

  public SolutionBuildingBlock setInteracts(java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IInteraction> interacts) {
    _setList(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.InteractiveBuildingBlock_interacts, interacts);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Required> selectPorts_In() {
    return _getMultiMap(cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Required.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In);
  }

  public SolutionBuildingBlock setPorts_In(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Required> ports_In) {
    _setMultiMap(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In, ports_In);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Provider> selectPorts_Out() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out);
  }

  public SolutionBuildingBlock setPorts_Out(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Provider> ports_Out) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out, ports_Out);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SolutionBuildingBlock setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.RequiredShortName_RequiredShortName, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.versions.VersionsPackage.Version_version, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ICpuArchitecture.class, cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.SolutionBuildingBlock_cpu, visitor);
    _acceptList(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel.ISolutionBuildingBlockComponentDecomposite.class, cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.SolutionBuildingBlock_decompose, visitor);
    _acceptSingle(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.IDeploymentArtefact.class, cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.SolutionBuildingBlock_deploymentArtefact, visitor);
    _acceptMultiMap(cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Required.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlock> selectToMeCpu(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ICpuArchitecture object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlock.class, cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.SolutionBuildingBlock_cpu, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlock> selectToMeDeploymentArtefact(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.IDeploymentArtefact object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlock.class, cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.SolutionBuildingBlock_deploymentArtefact, object.getResource());
  }
  
  public static cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlock selectToMeHasDependency(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentCompositionDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlock.class, cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.SolutionBuildingBlock_hasDependency, object.getResource());
  }
  
  public static cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlock selectToMeDecompose(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel.ISolutionBuildingBlockComponentDecomposite object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlock.class, cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.SolutionBuildingBlock_decompose, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,280ce792-2d70-11e6-959f-d1cef44ff5fd,E5nqAzz4ouqqF+yApfmrKmv9SDE=] */
