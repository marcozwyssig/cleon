package cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.javamodel;

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
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public ArchitectureBuildingBlockDecomposite setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.javamodel.IArchitectureBuildingBlock selectInto() {
    return _getSingle(cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.javamodel.IArchitectureBuildingBlock.class, cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.ArchitecturebuildingblockPackage.ArchitectureBuildingBlockDecomposite_into);
  }

  public ArchitectureBuildingBlockDecomposite setInto(cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.javamodel.IArchitectureBuildingBlock into) {
    _setSingle(cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.ArchitecturebuildingblockPackage.ArchitectureBuildingBlockDecomposite_into, into);
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
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.javamodel.IArchitectureBuildingBlock.class, cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.ArchitecturebuildingblockPackage.ArchitectureBuildingBlockDecomposite_into, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.javamodel.IArchitectureBuildingBlockDecomposite selectToMeInto(cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.javamodel.IArchitectureBuildingBlock object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.javamodel.IArchitectureBuildingBlockDecomposite.class, cleon.conception.framework.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.ArchitecturebuildingblockPackage.ArchitectureBuildingBlockDecomposite_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1a0f6f95-3a07-11e6-a354-253097f89a49,nCM6CgW9OPlnc9MgAjPDOxvq0QY=] */
