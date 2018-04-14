package cleon.conception.architecture.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ArchitectureBuildingBlockDecomposite extends DynamicResource implements IArchitectureBuildingBlockDecomposite {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IArchitectureBuildingBlockDecomposite> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IArchitectureBuildingBlockDecomposite>() {
    
    @Override
    public IArchitectureBuildingBlockDecomposite create() {
      return new ArchitectureBuildingBlockDecomposite();
    }
    
    @Override
    public IArchitectureBuildingBlockDecomposite create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ArchitectureBuildingBlockDecomposite(resourceRepository, resource);
    }
  
  };

  public ArchitectureBuildingBlockDecomposite() {
    super(IArchitectureBuildingBlockDecomposite.TYPE_ID);
  }
  
  public ArchitectureBuildingBlockDecomposite(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IArchitectureBuildingBlockDecomposite.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.conception.architecture.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.javamodel.IArchitectureBuildingBlock selectInto() {
    return _getSingle(cleon.conception.architecture.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.javamodel.IArchitectureBuildingBlock.class, cleon.conception.architecture.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.ArchitecturebuildingblockPackage.ArchitectureBuildingBlockDecomposite_into);
  }

  public ArchitectureBuildingBlockDecomposite setInto(cleon.conception.architecture.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.javamodel.IArchitectureBuildingBlock into) {
    _setSingle(cleon.conception.architecture.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.ArchitecturebuildingblockPackage.ArchitectureBuildingBlockDecomposite_into, into);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ArchitectureBuildingBlockDecomposite setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.conception.architecture.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.javamodel.IArchitectureBuildingBlock.class, cleon.conception.architecture.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.ArchitecturebuildingblockPackage.ArchitectureBuildingBlockDecomposite_into, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.architecture.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.javamodel.IArchitectureBuildingBlockDecomposite selectToMeInto(cleon.conception.architecture.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.javamodel.IArchitectureBuildingBlock object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.javamodel.IArchitectureBuildingBlockDecomposite.class, cleon.conception.architecture.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.ArchitecturebuildingblockPackage.ArchitectureBuildingBlockDecomposite_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1a0f6f95-3a07-11e6-a354-253097f89a49,DmNpfftDX4OLM9ZQ9tari96qfE4=] */
