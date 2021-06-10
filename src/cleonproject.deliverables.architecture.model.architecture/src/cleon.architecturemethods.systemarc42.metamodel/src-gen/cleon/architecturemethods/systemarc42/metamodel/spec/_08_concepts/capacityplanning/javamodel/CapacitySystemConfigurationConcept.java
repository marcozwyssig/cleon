package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CapacitySystemConfigurationConcept extends DynamicResource implements ICapacitySystemConfigurationConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICapacitySystemConfigurationConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICapacitySystemConfigurationConcept>() {
    
    @Override
    public ICapacitySystemConfigurationConcept create() {
      return new CapacitySystemConfigurationConcept();
    }
    
    @Override
    public ICapacitySystemConfigurationConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CapacitySystemConfigurationConcept(resourceRepository, resource);
    }
  
  };

  public CapacitySystemConfigurationConcept() {
    super(ICapacitySystemConfigurationConcept.TYPE_ID);
  }
  
  public CapacitySystemConfigurationConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICapacitySystemConfigurationConcept.TYPE_ID);
  }

  // attributes
  
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

  public CapacitySystemConfigurationConcept setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICore> selectCoreUsage() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICore.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacitySystemConfigurationConcept_coreUsage);
  }

  public CapacitySystemConfigurationConcept setCoreUsage(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICore> coreUsage) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacitySystemConfigurationConcept_coreUsage, coreUsage);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.IDisk> selectDiskUsage() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.IDisk.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacitySystemConfigurationConcept_diskUsage);
  }

  public CapacitySystemConfigurationConcept setDiskUsage(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.IDisk> diskUsage) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacitySystemConfigurationConcept_diskUsage, diskUsage);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public CapacitySystemConfigurationConcept setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.IMemory> selectMemoryUsage() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.IMemory.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacitySystemConfigurationConcept_memoryUsage);
  }

  public CapacitySystemConfigurationConcept setMemoryUsage(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.IMemory> memoryUsage) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacitySystemConfigurationConcept_memoryUsage, memoryUsage);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public CapacitySystemConfigurationConcept setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public CapacitySystemConfigurationConcept setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration selectSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacitySystemConfigurationConcept_systemConfiguration);
  }

  public CapacitySystemConfigurationConcept setSystemConfiguration(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration systemConfiguration) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacitySystemConfigurationConcept_systemConfiguration, systemConfiguration);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public CapacitySystemConfigurationConcept setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public CapacitySystemConfigurationConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICore.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacitySystemConfigurationConcept_coreUsage, visitor);
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.IDisk.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacitySystemConfigurationConcept_diskUsage, visitor);
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.IMemory.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacitySystemConfigurationConcept_memoryUsage, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacitySystemConfigurationConcept_systemConfiguration, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICapacitySystemConfigurationConcept> selectToMeSystemConfiguration(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICapacitySystemConfigurationConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacitySystemConfigurationConcept_systemConfiguration, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICapacitySystemConfigurationConcept> selectToMeCoreUsage(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICore object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICapacitySystemConfigurationConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacitySystemConfigurationConcept_coreUsage, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICapacitySystemConfigurationConcept> selectToMeMemoryUsage(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.IMemory object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICapacitySystemConfigurationConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacitySystemConfigurationConcept_memoryUsage, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICapacitySystemConfigurationConcept> selectToMeDiskUsage(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.IDisk object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICapacitySystemConfigurationConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacitySystemConfigurationConcept_diskUsage, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,467d3cb7-c93e-11eb-adc4-d18d1353eb6e,Hvxuh+vjZx3lO11y2QDnlPQmb7w=] */
