package cleon.conception.togaf.spec.acf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ArchitectureBuildingBlock extends DynamicResource implements IArchitectureBuildingBlock {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IArchitectureBuildingBlock> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IArchitectureBuildingBlock>() {
    
    @Override
    public IArchitectureBuildingBlock create() {
      return new ArchitectureBuildingBlock();
    }
    
    @Override
    public IArchitectureBuildingBlock create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ArchitectureBuildingBlock(resourceRepository, resource);
    }
  
  };

  public ArchitectureBuildingBlock() {
    super(IArchitectureBuildingBlock.TYPE_ID);
  }
  
  public ArchitectureBuildingBlock(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IArchitectureBuildingBlock.TYPE_ID);
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
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier, identifier);
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

  // relations
  
  @Override
  public java.util.List<? extends cleon.conception.togaf.spec.acf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.architecturesolutionbuildingblock.javamodel.IArchitectureSolutionBuildingBlockDecomposite> selectArchitecturesolutionbuildingblocks() {
    return _getList(cleon.conception.togaf.spec.acf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.architecturesolutionbuildingblock.javamodel.IArchitectureSolutionBuildingBlockDecomposite.class, cleon.conception.togaf.spec.acf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.ArchitecturebuildingblockPackage.ArchitectureBuildingBlock_architecturesolutionbuildingblocks);
  }

  public ArchitectureBuildingBlock setArchitecturesolutionbuildingblocks(java.util.List<? extends cleon.conception.togaf.spec.acf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.architecturesolutionbuildingblock.javamodel.IArchitectureSolutionBuildingBlockDecomposite> architecturesolutionbuildingblocks) {
    _setList(cleon.conception.togaf.spec.acf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.ArchitecturebuildingblockPackage.ArchitectureBuildingBlock_architecturesolutionbuildingblocks, architecturesolutionbuildingblocks);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IDecomposite.class, cleon.conception.modelinglanguage.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose);
  }

  public ArchitectureBuildingBlock setDecompose(java.util.List<? extends cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IDecomposite> decompose) {
    _setList(cleon.conception.modelinglanguage.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentCompositionDecomposite> selectDecomposeComponent() {
    return _getList(cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentCompositionDecomposite.class, cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent);
  }

  public ArchitectureBuildingBlock setDecomposeComponent(java.util.List<? extends cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentCompositionDecomposite> decomposeComponent) {
    _setList(cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent, decomposeComponent);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public ArchitectureBuildingBlock setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentCompositionDependency> selectHasDependency() {
    return _getList(cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentCompositionDependency.class, cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentComposition_hasDependency);
  }

  public ArchitectureBuildingBlock setHasDependency(java.util.List<? extends cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentCompositionDependency> hasDependency) {
    _setList(cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentComposition_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ArchitectureBuildingBlock setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName, visitor);
    // relations
    _acceptList(cleon.conception.togaf.spec.acf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.architecturesolutionbuildingblock.javamodel.IArchitectureSolutionBuildingBlockDecomposite.class, cleon.conception.togaf.spec.acf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.ArchitecturebuildingblockPackage.ArchitectureBuildingBlock_architecturesolutionbuildingblocks, visitor);
    _acceptList(cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IDecomposite.class, cleon.conception.modelinglanguage.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, visitor);
    _acceptList(cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentCompositionDecomposite.class, cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentCompositionDependency.class, cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentComposition_hasDependency, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.togaf.spec.acf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.javamodel.IArchitectureBuildingBlock selectToMeArchitecturesolutionbuildingblocks(cleon.conception.togaf.spec.acf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.architecturesolutionbuildingblock.javamodel.IArchitectureSolutionBuildingBlockDecomposite object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.togaf.spec.acf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.javamodel.IArchitectureBuildingBlock.class, cleon.conception.togaf.spec.acf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.ArchitecturebuildingblockPackage.ArchitectureBuildingBlock_architecturesolutionbuildingblocks, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1a0f6f94-3a07-11e6-a354-253097f89a49,fb/6nwJwk1BuoINj/CZIPN8TKlY=] */
