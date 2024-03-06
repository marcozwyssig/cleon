package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ResourceBuildingBlockSystemConfigurationConcept extends DynamicResource implements IResourceBuildingBlockSystemConfigurationConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResourceBuildingBlockSystemConfigurationConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResourceBuildingBlockSystemConfigurationConcept>() {
    
    @Override
    public IResourceBuildingBlockSystemConfigurationConcept create() {
      return new ResourceBuildingBlockSystemConfigurationConcept();
    }
    
    @Override
    public IResourceBuildingBlockSystemConfigurationConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ResourceBuildingBlockSystemConfigurationConcept(resourceRepository, resource);
    }
  
  };

  public ResourceBuildingBlockSystemConfigurationConcept() {
    super(IResourceBuildingBlockSystemConfigurationConcept.TYPE_ID);
  }
  
  public ResourceBuildingBlockSystemConfigurationConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IResourceBuildingBlockSystemConfigurationConcept.TYPE_ID);
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

  public ResourceBuildingBlockSystemConfigurationConcept setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.ICore> selectCoreUsage() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.ICore.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockSystemConfigurationConcept_coreUsage);
  }

  public ResourceBuildingBlockSystemConfigurationConcept setCoreUsage(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.ICore> coreUsage) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockSystemConfigurationConcept_coreUsage, coreUsage);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IDisk> selectDiskUsage() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IDisk.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockSystemConfigurationConcept_diskUsage);
  }

  public ResourceBuildingBlockSystemConfigurationConcept setDiskUsage(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IDisk> diskUsage) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockSystemConfigurationConcept_diskUsage, diskUsage);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public ResourceBuildingBlockSystemConfigurationConcept setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IMemory> selectMemoryUsage() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IMemory.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockSystemConfigurationConcept_memoryUsage);
  }

  public ResourceBuildingBlockSystemConfigurationConcept setMemoryUsage(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IMemory> memoryUsage) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockSystemConfigurationConcept_memoryUsage, memoryUsage);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public ResourceBuildingBlockSystemConfigurationConcept setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public ResourceBuildingBlockSystemConfigurationConcept setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration selectResourceBuildingBlockForSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockSystemConfigurationConcept_resourceBuildingBlockForSystemConfiguration);
  }

  public ResourceBuildingBlockSystemConfigurationConcept setResourceBuildingBlockForSystemConfiguration(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration resourceBuildingBlockForSystemConfiguration) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockSystemConfigurationConcept_resourceBuildingBlockForSystemConfiguration, resourceBuildingBlockForSystemConfiguration);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ResourceBuildingBlockSystemConfigurationConcept setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ResourceBuildingBlockSystemConfigurationConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.ICore.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockSystemConfigurationConcept_coreUsage, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IDisk.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockSystemConfigurationConcept_diskUsage, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IMemory.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockSystemConfigurationConcept_memoryUsage, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockSystemConfigurationConcept_resourceBuildingBlockForSystemConfiguration, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConfigurationConcept selectToMeResourceBuildingBlockForSystemConfiguration(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConfigurationConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockSystemConfigurationConcept_resourceBuildingBlockForSystemConfiguration, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConfigurationConcept> selectToMeCoreUsage(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.ICore object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConfigurationConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockSystemConfigurationConcept_coreUsage, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConfigurationConcept> selectToMeMemoryUsage(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IMemory object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConfigurationConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockSystemConfigurationConcept_memoryUsage, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConfigurationConcept> selectToMeDiskUsage(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IDisk object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConfigurationConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.ResourceBuildingBlockSystemConfigurationConcept_diskUsage, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,467d3cb7-c93e-11eb-adc4-d18d1353eb6e,/PxrPzVzsJWWcYz7bTuE0aFf2ak=] */
