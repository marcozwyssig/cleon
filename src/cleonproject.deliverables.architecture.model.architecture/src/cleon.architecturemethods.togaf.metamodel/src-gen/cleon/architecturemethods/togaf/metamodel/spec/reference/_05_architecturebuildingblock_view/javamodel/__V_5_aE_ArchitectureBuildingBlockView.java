package cleon.architecturemethods.togaf.metamodel.spec.reference._05_architecturebuildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class __V_5_aE_ArchitectureBuildingBlockView extends DynamicResource implements I__V_5_aE_ArchitectureBuildingBlockView {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__V_5_aE_ArchitectureBuildingBlockView> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__V_5_aE_ArchitectureBuildingBlockView>() {
    
    @Override
    public I__V_5_aE_ArchitectureBuildingBlockView create() {
      return new __V_5_aE_ArchitectureBuildingBlockView();
    }
    
    @Override
    public I__V_5_aE_ArchitectureBuildingBlockView create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new __V_5_aE_ArchitectureBuildingBlockView(resourceRepository, resource);
    }
  
  };

  public __V_5_aE_ArchitectureBuildingBlockView() {
    super(I__V_5_aE_ArchitectureBuildingBlockView.TYPE_ID);
  }
  
  public __V_5_aE_ArchitectureBuildingBlockView(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, I__V_5_aE_ArchitectureBuildingBlockView.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public __V_5_aE_ArchitectureBuildingBlockView setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public __V_5_aE_ArchitectureBuildingBlockView setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public __V_5_aE_ArchitectureBuildingBlockView setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractRootSystem selectRootSystem() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractRootSystem.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_rootSystem);
  }

  public __V_5_aE_ArchitectureBuildingBlockView setRootSystem(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractRootSystem rootSystem) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_rootSystem, rootSystem);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public __V_5_aE_ArchitectureBuildingBlockView setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox> selectWhitebox() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_whitebox);
  }

  public __V_5_aE_ArchitectureBuildingBlockView setWhitebox(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox> whitebox) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_whitebox, whitebox);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractRootSystem.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_rootSystem, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_whitebox, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,282f9134-2d6d-11e6-959f-d1cef44ff5fd,E5eVG5NTbwGB3vkrnFBI4kP3HFM=] */
