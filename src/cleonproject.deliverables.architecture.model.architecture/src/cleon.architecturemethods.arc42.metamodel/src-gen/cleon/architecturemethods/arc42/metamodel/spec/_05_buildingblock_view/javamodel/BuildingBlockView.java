package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel;

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
  public java.lang.String selectChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterPath);
  }
    
  public void setChapterPath(java.lang.String chapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterPath, chapterPath);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public BuildingBlockView setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public BuildingBlockView setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox> selectLevel_1_whitebox() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_1_aE_whitebox);
  }

  public BuildingBlockView setLevel_1_whitebox(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox> level_1_whitebox) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_1_aE_whitebox, level_1_whitebox);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox> selectLevel_2_whitebox() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_2_aE_whitebox);
  }

  public BuildingBlockView setLevel_2_whitebox(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox> level_2_whitebox) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_2_aE_whitebox, level_2_whitebox);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox> selectLevel_3_whitebox() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_3_aE_whitebox);
  }

  public BuildingBlockView setLevel_3_whitebox(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox> level_3_whitebox) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_3_aE_whitebox, level_3_whitebox);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox> selectLevel_4_whitebox() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_4_aE_whitebox);
  }

  public BuildingBlockView setLevel_4_whitebox(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox> level_4_whitebox) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_4_aE_whitebox, level_4_whitebox);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox> selectLevel_5_whitebox() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_5_aE_whitebox);
  }

  public BuildingBlockView setLevel_5_whitebox(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox> level_5_whitebox) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_5_aE_whitebox, level_5_whitebox);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox> selectLevel_6_whitebox() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_6_aE_whitebox);
  }

  public BuildingBlockView setLevel_6_whitebox(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox> level_6_whitebox) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_6_aE_whitebox, level_6_whitebox);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public BuildingBlockView setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractRootSystem selectRootSystem() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractRootSystem.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_rootSystem);
  }

  public BuildingBlockView setRootSystem(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractRootSystem rootSystem) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_rootSystem, rootSystem);
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
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterPath, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_1_aE_whitebox, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_2_aE_whitebox, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_3_aE_whitebox, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_4_aE_whitebox, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_5_aE_whitebox, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_6_aE_whitebox, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractRootSystem.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_rootSystem, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBuildingBlockView selectToMeRootSystem(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractRootSystem object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBuildingBlockView.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_rootSystem, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBuildingBlockView selectToMeLevel_1_whitebox(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBuildingBlockView.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_1_aE_whitebox, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBuildingBlockView selectToMeLevel_2_whitebox(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBuildingBlockView.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_2_aE_whitebox, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBuildingBlockView selectToMeLevel_3_whitebox(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBuildingBlockView.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_3_aE_whitebox, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBuildingBlockView selectToMeLevel_4_whitebox(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBuildingBlockView.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_4_aE_whitebox, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBuildingBlockView selectToMeLevel_5_whitebox(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBuildingBlockView.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_5_aE_whitebox, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBuildingBlockView selectToMeLevel_6_whitebox(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBuildingBlockView.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.BuildingBlockView_level_aE_6_aE_whitebox, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,37b55799-ffcc-11e4-ac0a-959b440f987f,eRSqD1HJkpTQOhPWdyeNIPxyZJY=] */
