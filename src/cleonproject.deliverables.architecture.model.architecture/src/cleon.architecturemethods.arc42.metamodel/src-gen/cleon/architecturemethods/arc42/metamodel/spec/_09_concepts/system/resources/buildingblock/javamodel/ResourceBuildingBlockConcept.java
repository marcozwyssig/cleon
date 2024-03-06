package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ResourceBuildingBlockConcept extends DynamicResource implements IResourceBuildingBlockConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResourceBuildingBlockConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResourceBuildingBlockConcept>() {
    
    @Override
    public IResourceBuildingBlockConcept create() {
      return new ResourceBuildingBlockConcept();
    }
    
    @Override
    public IResourceBuildingBlockConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ResourceBuildingBlockConcept(resourceRepository, resource);
    }
  
  };

  public ResourceBuildingBlockConcept() {
    super(IResourceBuildingBlockConcept.TYPE_ID);
  }
  
  public ResourceBuildingBlockConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IResourceBuildingBlockConcept.TYPE_ID);
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
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.ICPU> selectCPUs() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.ICPU.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockConcept_cPUs);
  }

  public ResourceBuildingBlockConcept setCPUs(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.ICPU> cPUs) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockConcept_cPUs, cPUs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public ResourceBuildingBlockConcept setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IDisk> selectDisks() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IDisk.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockConcept_disks);
  }

  public ResourceBuildingBlockConcept setDisks(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IDisk> disks) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockConcept_disks, disks);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public ResourceBuildingBlockConcept setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IMemory> selectMemory() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IMemory.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockConcept_memory);
  }

  public ResourceBuildingBlockConcept setMemory(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IMemory> memory) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockConcept_memory, memory);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public ResourceBuildingBlockConcept setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConcept> selectResourceBuildingBlockSystemConcept() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockConcept_resourceBuildingBlockSystemConcept);
  }

  public ResourceBuildingBlockConcept setResourceBuildingBlockSystemConcept(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConcept> resourceBuildingBlockSystemConcept) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockConcept_resourceBuildingBlockSystemConcept, resourceBuildingBlockSystemConcept);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemConcept> selectSystemConcept() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.ConceptForSystem_systemConcept);
  }

  public ResourceBuildingBlockConcept setSystemConcept(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemConcept> systemConcept) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.ConceptForSystem_systemConcept, systemConcept);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ResourceBuildingBlockConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.ICPU.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockConcept_cPUs, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IDisk.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockConcept_disks, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IMemory.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockConcept_memory, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockConcept_resourceBuildingBlockSystemConcept, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockConcept selectToMeResourceBuildingBlockSystemConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockConcept_resourceBuildingBlockSystemConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockConcept selectToMeCPUs(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.ICPU object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockConcept_cPUs, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockConcept selectToMeDisks(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IDisk object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockConcept_disks, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockConcept selectToMeMemory(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IMemory object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockConcept_memory, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0a49b292-c93a-11eb-adc4-d18d1353eb6e,QXh3HdODI7fzdJ+GVeJvue6GZvU=] */
