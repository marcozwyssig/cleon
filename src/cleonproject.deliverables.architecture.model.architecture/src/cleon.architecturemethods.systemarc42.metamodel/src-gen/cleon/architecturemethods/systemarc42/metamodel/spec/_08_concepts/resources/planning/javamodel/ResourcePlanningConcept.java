package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ResourcePlanningConcept extends DynamicResource implements IResourcePlanningConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResourcePlanningConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResourcePlanningConcept>() {
    
    @Override
    public IResourcePlanningConcept create() {
      return new ResourcePlanningConcept();
    }
    
    @Override
    public IResourcePlanningConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ResourcePlanningConcept(resourceRepository, resource);
    }
  
  };

  public ResourcePlanningConcept() {
    super(IResourcePlanningConcept.TYPE_ID);
  }
  
  public ResourcePlanningConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IResourcePlanningConcept.TYPE_ID);
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

  public ResourcePlanningConcept setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public ResourcePlanningConcept setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public ResourcePlanningConcept setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.javamodel.IResourcePlanningSystemConcept> selectResourcePlanningSystemConcept() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.javamodel.IResourcePlanningSystemConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.PlanningPackage.ResourcePlanningConcept_resourcePlanningSystemConcept);
  }

  public ResourcePlanningConcept setResourcePlanningSystemConcept(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.javamodel.IResourcePlanningSystemConcept> resourcePlanningSystemConcept) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.PlanningPackage.ResourcePlanningConcept_resourcePlanningSystemConcept, resourcePlanningSystemConcept);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConcept> selectSystemConcept() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.ConceptForSystem_systemConcept);
  }

  public ResourcePlanningConcept setSystemConcept(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConcept> systemConcept) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.ConceptForSystem_systemConcept, systemConcept);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ResourcePlanningConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.javamodel.IResourcePlanningSystemConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.PlanningPackage.ResourcePlanningConcept_resourcePlanningSystemConcept, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.javamodel.IResourcePlanningConcept selectToMeResourcePlanningSystemConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.javamodel.IResourcePlanningSystemConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.javamodel.IResourcePlanningConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.PlanningPackage.ResourcePlanningConcept_resourcePlanningSystemConcept, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,cfc537c0-dfe7-11eb-aeba-a92c9a2e1772,kTkenpY/hFTYRiEIG02GK7Yq9xA=] */
