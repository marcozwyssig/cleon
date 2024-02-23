package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ResourcePlanningEnvironmentConcept extends DynamicResource implements IResourcePlanningEnvironmentConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResourcePlanningEnvironmentConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResourcePlanningEnvironmentConcept>() {
    
    @Override
    public IResourcePlanningEnvironmentConcept create() {
      return new ResourcePlanningEnvironmentConcept();
    }
    
    @Override
    public IResourcePlanningEnvironmentConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ResourcePlanningEnvironmentConcept(resourceRepository, resource);
    }
  
  };

  public ResourcePlanningEnvironmentConcept() {
    super(IResourcePlanningEnvironmentConcept.TYPE_ID);
  }
  
  public ResourcePlanningEnvironmentConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IResourcePlanningEnvironmentConcept.TYPE_ID);
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

  public ResourcePlanningEnvironmentConcept setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public ResourcePlanningEnvironmentConcept setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public ResourcePlanningEnvironmentConcept setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IEnvironment selectResourcePlanningForEnvironment() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.PlanningPackage.ResourcePlanningEnvironmentConcept_resourcePlanningForEnvironment);
  }

  public ResourcePlanningEnvironmentConcept setResourcePlanningForEnvironment(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IEnvironment resourcePlanningForEnvironment) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.PlanningPackage.ResourcePlanningEnvironmentConcept_resourcePlanningForEnvironment, resourcePlanningForEnvironment);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.javamodel.IResourcePlanningNodeConcept> selectResourcePlanningNode() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.javamodel.IResourcePlanningNodeConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.PlanningPackage.ResourcePlanningEnvironmentConcept_resourcePlanningNode);
  }

  public ResourcePlanningEnvironmentConcept setResourcePlanningNode(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.javamodel.IResourcePlanningNodeConcept> resourcePlanningNode) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.PlanningPackage.ResourcePlanningEnvironmentConcept_resourcePlanningNode, resourcePlanningNode);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ResourcePlanningEnvironmentConcept setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ResourcePlanningEnvironmentConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.PlanningPackage.ResourcePlanningEnvironmentConcept_resourcePlanningForEnvironment, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.javamodel.IResourcePlanningNodeConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.PlanningPackage.ResourcePlanningEnvironmentConcept_resourcePlanningNode, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.javamodel.IResourcePlanningEnvironmentConcept> selectToMeResourcePlanningForEnvironment(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IEnvironment object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.javamodel.IResourcePlanningEnvironmentConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.PlanningPackage.ResourcePlanningEnvironmentConcept_resourcePlanningForEnvironment, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.javamodel.IResourcePlanningEnvironmentConcept selectToMeResourcePlanningNode(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.javamodel.IResourcePlanningNodeConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.javamodel.IResourcePlanningEnvironmentConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.PlanningPackage.ResourcePlanningEnvironmentConcept_resourcePlanningNode, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fb10b059-dfed-11eb-aeba-a92c9a2e1772,VNGyqfVeYpJ6sEMwlN04kktac0U=] */
