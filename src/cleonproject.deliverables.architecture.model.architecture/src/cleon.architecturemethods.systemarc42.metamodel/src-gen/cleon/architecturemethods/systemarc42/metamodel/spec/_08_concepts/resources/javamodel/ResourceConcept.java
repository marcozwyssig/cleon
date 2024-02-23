package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ResourceConcept extends DynamicResource implements IResourceConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResourceConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResourceConcept>() {
    
    @Override
    public IResourceConcept create() {
      return new ResourceConcept();
    }
    
    @Override
    public IResourceConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ResourceConcept(resourceRepository, resource);
    }
  
  };

  public ResourceConcept() {
    super(IResourceConcept.TYPE_ID);
  }
  
  public ResourceConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IResourceConcept.TYPE_ID);
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

  public ResourceConcept setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public ResourceConcept setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public ResourceConcept setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.buildingblock.javamodel.IResourceBuildingBlockConcept selectResourceBuildingBlockConcept() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.buildingblock.javamodel.IResourceBuildingBlockConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.ResourcesPackage.ResourceConcept_resourceBuildingBlockConcept);
  }

  public ResourceConcept setResourceBuildingBlockConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.buildingblock.javamodel.IResourceBuildingBlockConcept resourceBuildingBlockConcept) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.ResourcesPackage.ResourceConcept_resourceBuildingBlockConcept, resourceBuildingBlockConcept);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.javamodel.IResourcePlanningConcept selectResourcePlanningConcept() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.javamodel.IResourcePlanningConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.ResourcesPackage.ResourceConcept_resourcePlanningConcept);
  }

  public ResourceConcept setResourcePlanningConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.javamodel.IResourcePlanningConcept resourcePlanningConcept) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.ResourcesPackage.ResourceConcept_resourcePlanningConcept, resourcePlanningConcept);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ResourceConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.buildingblock.javamodel.IResourceBuildingBlockConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.ResourcesPackage.ResourceConcept_resourceBuildingBlockConcept, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.javamodel.IResourcePlanningConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.ResourcesPackage.ResourceConcept_resourcePlanningConcept, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.javamodel.IResourceConcept selectToMeResourceBuildingBlockConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.buildingblock.javamodel.IResourceBuildingBlockConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.javamodel.IResourceConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.ResourcesPackage.ResourceConcept_resourceBuildingBlockConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.javamodel.IResourceConcept selectToMeResourcePlanningConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.javamodel.IResourcePlanningConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.javamodel.IResourceConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.ResourcesPackage.ResourceConcept_resourcePlanningConcept, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,76b15515-dfe5-11eb-9a61-ab419054c47d,Ee6VwzDnC8hQNoBUc8HXzrIHwiM=] */
