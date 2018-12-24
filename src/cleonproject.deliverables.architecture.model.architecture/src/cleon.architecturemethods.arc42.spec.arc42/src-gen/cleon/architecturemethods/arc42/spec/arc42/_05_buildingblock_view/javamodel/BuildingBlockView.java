package cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class BuildingBlockView extends DynamicResource implements IBuildingBlockView {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBuildingBlockView> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBuildingBlockView>() {
    
    @Override
    public IBuildingBlockView create() {
      return new BuildingBlockView();
    }
    
    @Override
    public IBuildingBlockView create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new BuildingBlockView(resourceRepository, resource);
    }
  
  };

  public BuildingBlockView() {
    super(IBuildingBlockView.TYPE_ID);
  }
  
  public BuildingBlockView(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBuildingBlockView.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.AbstractChapter_chapters);
  }

  public BuildingBlockView setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.AbstractChapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public BuildingBlockView setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel> selectLevel_1() {
    return _getMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_1);
  }

  public BuildingBlockView setLevel_1(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel> level_1) {
    _setMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_1, level_1);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel> selectLevel_2() {
    return _getMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_2);
  }

  public BuildingBlockView setLevel_2(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel> level_2) {
    _setMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_2, level_2);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel> selectLevel_3() {
    return _getMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_3);
  }

  public BuildingBlockView setLevel_3(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel> level_3) {
    _setMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_3, level_3);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel> selectLevel_4() {
    return _getMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_4);
  }

  public BuildingBlockView setLevel_4(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel> level_4) {
    _setMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_4, level_4);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel> selectLevel_5() {
    return _getMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_5);
  }

  public BuildingBlockView setLevel_5(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel> level_5) {
    _setMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_5, level_5);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public BuildingBlockView setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public BuildingBlockView setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.AbstractChapter_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_1, visitor);
    _acceptMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_2, visitor);
    _acceptMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_3, visitor);
    _acceptMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_4, visitor);
    _acceptMap(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_5, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.IBuildingBlockView selectToMeLevel_1(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.IBuildingBlockView.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_1, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.IBuildingBlockView selectToMeLevel_2(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.IBuildingBlockView.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_2, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.IBuildingBlockView selectToMeLevel_3(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.IBuildingBlockView.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_3, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.IBuildingBlockView selectToMeLevel_4(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.IBuildingBlockView.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_4, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.IBuildingBlockView selectToMeLevel_5(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.IBuildingBlockView.class, cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_5, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,37b55799-ffcc-11e4-ac0a-959b440f987f,gdFBiUAojChvzBbMelhV8L/jTV8=] */
