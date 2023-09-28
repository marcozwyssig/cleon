package cleon.architecturemethods.togaf.metamodel.spec.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.architecturesolutionbuildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ArchitectureSolutionBuildingBlockDependency extends DynamicResource implements IArchitectureSolutionBuildingBlockDependency {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IArchitectureSolutionBuildingBlockDependency> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IArchitectureSolutionBuildingBlockDependency>() {
    
    @Override
    public IArchitectureSolutionBuildingBlockDependency create() {
      return new ArchitectureSolutionBuildingBlockDependency();
    }
    
    @Override
    public IArchitectureSolutionBuildingBlockDependency create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ArchitectureSolutionBuildingBlockDependency(resourceRepository, resource);
    }
  
  };

  public ArchitectureSolutionBuildingBlockDependency() {
    super(IArchitectureSolutionBuildingBlockDependency.TYPE_ID);
  }
  
  public ArchitectureSolutionBuildingBlockDependency(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IArchitectureSolutionBuildingBlockDependency.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectAllowRecursiveDependency() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.modularity.metamodel.spec.SpecPackage.Dependency_allowRecursiveDependency);
  }
    
  public void setAllowRecursiveDependency(java.lang.Boolean allowRecursiveDependency) {
     _setSingleAttribute(cleon.common.modularity.metamodel.spec.SpecPackage.Dependency_allowRecursiveDependency, allowRecursiveDependency);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.togaf.metamodel.spec.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.architecturesolutionbuildingblock.javamodel.IArchitectureSolutionBuildingBlock selectTo() {
    return _getSingle(cleon.architecturemethods.togaf.metamodel.spec.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.architecturesolutionbuildingblock.javamodel.IArchitectureSolutionBuildingBlock.class, cleon.architecturemethods.togaf.metamodel.spec.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.architecturesolutionbuildingblock.ArchitecturesolutionbuildingblockPackage.ArchitectureSolutionBuildingBlockDependency_to);
  }

  public ArchitectureSolutionBuildingBlockDependency setTo(cleon.architecturemethods.togaf.metamodel.spec.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.architecturesolutionbuildingblock.javamodel.IArchitectureSolutionBuildingBlock to) {
    _setSingle(cleon.architecturemethods.togaf.metamodel.spec.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.architecturesolutionbuildingblock.ArchitecturesolutionbuildingblockPackage.ArchitectureSolutionBuildingBlockDependency_to, to);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ArchitectureSolutionBuildingBlockDependency setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.modularity.metamodel.spec.SpecPackage.Dependency_allowRecursiveDependency, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.togaf.metamodel.spec.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.architecturesolutionbuildingblock.javamodel.IArchitectureSolutionBuildingBlock.class, cleon.architecturemethods.togaf.metamodel.spec.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.architecturesolutionbuildingblock.ArchitecturesolutionbuildingblockPackage.ArchitectureSolutionBuildingBlockDependency_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.togaf.metamodel.spec.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.architecturesolutionbuildingblock.javamodel.IArchitectureSolutionBuildingBlockDependency> selectToMeTo(cleon.architecturemethods.togaf.metamodel.spec.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.architecturesolutionbuildingblock.javamodel.IArchitectureSolutionBuildingBlock object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.togaf.metamodel.spec.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.architecturesolutionbuildingblock.javamodel.IArchitectureSolutionBuildingBlockDependency.class, cleon.architecturemethods.togaf.metamodel.spec.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.architecturesolutionbuildingblock.ArchitecturesolutionbuildingblockPackage.ArchitectureSolutionBuildingBlockDependency_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5b960874-3a07-11e6-a354-253097f89a49,7sxHH5rwGoih/eop9PCLpv/P8so=] */
