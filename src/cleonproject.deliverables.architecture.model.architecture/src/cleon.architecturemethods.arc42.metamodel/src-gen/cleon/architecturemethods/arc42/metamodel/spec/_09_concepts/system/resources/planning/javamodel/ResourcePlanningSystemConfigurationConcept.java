package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ResourcePlanningSystemConfigurationConcept extends DynamicResource implements IResourcePlanningSystemConfigurationConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResourcePlanningSystemConfigurationConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResourcePlanningSystemConfigurationConcept>() {
    
    @Override
    public IResourcePlanningSystemConfigurationConcept create() {
      return new ResourcePlanningSystemConfigurationConcept();
    }
    
    @Override
    public IResourcePlanningSystemConfigurationConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ResourcePlanningSystemConfigurationConcept(resourceRepository, resource);
    }
  
  };

  public ResourcePlanningSystemConfigurationConcept() {
    super(IResourcePlanningSystemConfigurationConcept.TYPE_ID);
  }
  
  public ResourcePlanningSystemConfigurationConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IResourcePlanningSystemConfigurationConcept.TYPE_ID);
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

  public ResourcePlanningSystemConfigurationConcept setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public ResourcePlanningSystemConfigurationConcept setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public ResourcePlanningSystemConfigurationConcept setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.javamodel.IResourcePlanningEnvironmentConcept> selectResourcePlanningEnvironmentConcept() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.javamodel.IResourcePlanningEnvironmentConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningSystemConfigurationConcept_resourcePlanningEnvironmentConcept);
  }

  public ResourcePlanningSystemConfigurationConcept setResourcePlanningEnvironmentConcept(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.javamodel.IResourcePlanningEnvironmentConcept> resourcePlanningEnvironmentConcept) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningSystemConfigurationConcept_resourcePlanningEnvironmentConcept, resourcePlanningEnvironmentConcept);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration selectResourcePlanningForSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningSystemConfigurationConcept_resourcePlanningForSystemConfiguration);
  }

  public ResourcePlanningSystemConfigurationConcept setResourcePlanningForSystemConfiguration(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration resourcePlanningForSystemConfiguration) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningSystemConfigurationConcept_resourcePlanningForSystemConfiguration, resourcePlanningForSystemConfiguration);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ResourcePlanningSystemConfigurationConcept setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ResourcePlanningSystemConfigurationConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.javamodel.IResourcePlanningEnvironmentConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningSystemConfigurationConcept_resourcePlanningEnvironmentConcept, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningSystemConfigurationConcept_resourcePlanningForSystemConfiguration, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.javamodel.IResourcePlanningSystemConfigurationConcept> selectToMeResourcePlanningForSystemConfiguration(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.javamodel.IResourcePlanningSystemConfigurationConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningSystemConfigurationConcept_resourcePlanningForSystemConfiguration, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.javamodel.IResourcePlanningSystemConfigurationConcept selectToMeResourcePlanningEnvironmentConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.javamodel.IResourcePlanningEnvironmentConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.javamodel.IResourcePlanningSystemConfigurationConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.PlanningPackage.ResourcePlanningSystemConfigurationConcept_resourcePlanningEnvironmentConcept, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,cfc55eeb-dfe7-11eb-aeba-a92c9a2e1772,MLMlwPZ1W7A77l+STOAGS65jdr8=] */
