package cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel;

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

  // relations
  
  @Override
  public cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel.IArchitectureLayerBuildingBlock selectTo() {
    return _getSingle(cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel.IArchitectureLayerBuildingBlock.class, cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.ArchitecturelayerbuildingblockPackage.ArchitectureLayerBuildingBlockDependency_to);
  }

  public ArchitectureLayerBuildingBlockDependency setTo(cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel.IArchitectureLayerBuildingBlock to) {
    _setSingle(cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.ArchitecturelayerbuildingblockPackage.ArchitectureLayerBuildingBlockDependency_to, to);
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
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel.IArchitectureLayerBuildingBlock.class, cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.ArchitecturelayerbuildingblockPackage.ArchitectureLayerBuildingBlockDependency_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel.IArchitectureLayerBuildingBlockDependency> selectToMeTo(cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel.IArchitectureLayerBuildingBlock object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel.IArchitectureLayerBuildingBlockDependency.class, cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.ArchitecturelayerbuildingblockPackage.ArchitectureLayerBuildingBlockDependency_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fbe96385-3a06-11e6-a354-253097f89a49,rO01Fkm2Lp356yVfcDf+b9BsUnU=] */
