package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ResourceBuildingBlockSystemConcept extends DynamicResource implements IResourceBuildingBlockSystemConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResourceBuildingBlockSystemConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResourceBuildingBlockSystemConcept>() {
    
    @Override
    public IResourceBuildingBlockSystemConcept create() {
      return new ResourceBuildingBlockSystemConcept();
    }
    
    @Override
    public IResourceBuildingBlockSystemConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ResourceBuildingBlockSystemConcept(resourceRepository, resource);
    }
  
  };

  public ResourceBuildingBlockSystemConcept() {
    super(IResourceBuildingBlockSystemConcept.TYPE_ID);
  }
  
  public ResourceBuildingBlockSystemConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IResourceBuildingBlockSystemConcept.TYPE_ID);
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

  public ResourceBuildingBlockSystemConcept setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public ResourceBuildingBlockSystemConcept setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public ResourceBuildingBlockSystemConcept setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConfigurationConcept> selectResourceBuildingSystemConfigurationConcept() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConfigurationConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockSystemConcept_resourceBuildingSystemConfigurationConcept);
  }

  public ResourceBuildingBlockSystemConcept setResourceBuildingSystemConfigurationConcept(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConfigurationConcept> resourceBuildingSystemConfigurationConcept) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockSystemConcept_resourceBuildingSystemConfigurationConcept, resourceBuildingSystemConfigurationConcept);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAbstractSystem selectSystem() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAbstractSystem.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemConcept_system);
  }

  public ResourceBuildingBlockSystemConcept setSystem(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAbstractSystem system) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemConcept_system, system);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ResourceBuildingBlockSystemConcept setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ResourceBuildingBlockSystemConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConfigurationConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockSystemConcept_resourceBuildingSystemConfigurationConcept, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAbstractSystem.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemConcept_system, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConcept selectToMeResourceBuildingSystemConfigurationConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConfigurationConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockSystemConcept_resourceBuildingSystemConfigurationConcept, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,83876064-c93c-11eb-adc4-d18d1353eb6e,70ehNXZaTjOE6pFwrI/FAJjoYf8=] */
