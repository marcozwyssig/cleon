package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DatabaseView extends DynamicResource implements IDatabaseView {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDatabaseView> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDatabaseView>() {
    
    @Override
    public IDatabaseView create() {
      return new DatabaseView();
    }
    
    @Override
    public IDatabaseView create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DatabaseView(resourceRepository, resource);
    }
  
  };

  public DatabaseView() {
    super(IDatabaseView.TYPE_ID);
  }
  
  public DatabaseView(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDatabaseView.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath);
  }
    
  public void setChapterPath(java.lang.String chapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, chapterPath);
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

  public DatabaseView setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public DatabaseView setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IEnumerationMappingView selectEnumerationMappingView() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IEnumerationMappingView.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.DatabaseView_enumerationMappingView);
  }

  public DatabaseView setEnumerationMappingView(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IEnumerationMappingView enumerationMappingView) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.DatabaseView_enumerationMappingView, enumerationMappingView);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public DatabaseView setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumeration selectScope() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumeration.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.DatabaseView_scope);
  }

  public DatabaseView setScope(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumeration scope) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.DatabaseView_scope, scope);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.ISoftwareMonolithDatabase selectSoftwareMonolithDatabase() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.ISoftwareMonolithDatabase.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.DatabaseView_softwareMonolithDatabase);
  }

  public DatabaseView setSoftwareMonolithDatabase(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.ISoftwareMonolithDatabase softwareMonolithDatabase) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.DatabaseView_softwareMonolithDatabase, softwareMonolithDatabase);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITableArea> selectTableAreas() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITableArea.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.DatabaseView_tableAreas);
  }

  public DatabaseView setTableAreas(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITableArea> tableAreas) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.DatabaseView_tableAreas, tableAreas);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DatabaseView setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DatabaseView setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IEnumerationMappingView.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.DatabaseView_enumerationMappingView, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumeration.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.DatabaseView_scope, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.ISoftwareMonolithDatabase.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.DatabaseView_softwareMonolithDatabase, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITableArea.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.DatabaseView_tableAreas, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDatabaseView> selectToMeSoftwareMonolithDatabase(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.ISoftwareMonolithDatabase object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDatabaseView.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.DatabaseView_softwareMonolithDatabase, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDatabaseView selectToMeTableAreas(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITableArea object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDatabaseView.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.DatabaseView_tableAreas, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDatabaseView> selectToMeScope(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumeration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDatabaseView.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.DatabaseView_scope, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDatabaseView selectToMeEnumerationMappingView(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IEnumerationMappingView object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDatabaseView.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.DatabaseView_enumerationMappingView, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,846aa8f6-db90-11ee-bf0f-4753d26fac10,3metD2rf6bX/xqLm8McOTtRvFUc=] */
