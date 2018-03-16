package cleon.conception.togaf.spec.acf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ArchitectureLayerBuildingBlockDependency extends DynamicResource implements IArchitectureLayerBuildingBlockDependency {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IArchitectureLayerBuildingBlockDependency> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IArchitectureLayerBuildingBlockDependency>() {
    
    @Override
    public IArchitectureLayerBuildingBlockDependency create() {
      return new ArchitectureLayerBuildingBlockDependency();
    }
    
    @Override
    public IArchitectureLayerBuildingBlockDependency create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ArchitectureLayerBuildingBlockDependency(resourceRepository, resource);
    }
  
  };

  public ArchitectureLayerBuildingBlockDependency() {
    super(IArchitectureLayerBuildingBlockDependency.TYPE_ID);
  }
  
  public ArchitectureLayerBuildingBlockDependency(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IArchitectureLayerBuildingBlockDependency.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.conception.togaf.spec.acf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel.IArchitectureLayerBuildingBlock> selectTo() {
    return _getList(cleon.conception.togaf.spec.acf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel.IArchitectureLayerBuildingBlock.class, cleon.conception.togaf.spec.acf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.ArchitecturelayerbuildingblockPackage.ArchitectureLayerBuildingBlockDependency_to);
  }

  public ArchitectureLayerBuildingBlockDependency setTo(java.util.List<? extends cleon.conception.togaf.spec.acf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel.IArchitectureLayerBuildingBlock> to) {
    _setList(cleon.conception.togaf.spec.acf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.ArchitecturelayerbuildingblockPackage.ArchitectureLayerBuildingBlockDependency_to, to);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ArchitectureLayerBuildingBlockDependency setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.conception.togaf.spec.acf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel.IArchitectureLayerBuildingBlock.class, cleon.conception.togaf.spec.acf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.ArchitecturelayerbuildingblockPackage.ArchitectureLayerBuildingBlockDependency_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.conception.togaf.spec.acf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel.IArchitectureLayerBuildingBlockDependency> selectToMeTo(cleon.conception.togaf.spec.acf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel.IArchitectureLayerBuildingBlock object) {
    return _getToMeList(object.getRepository(), cleon.conception.togaf.spec.acf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel.IArchitectureLayerBuildingBlockDependency.class, cleon.conception.togaf.spec.acf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.ArchitecturelayerbuildingblockPackage.ArchitectureLayerBuildingBlockDependency_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fbe96385-3a06-11e6-a354-253097f89a49,3icEI0oalc09m6Bf/IRkoLzX8R8=] */
