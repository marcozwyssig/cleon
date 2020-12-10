package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DeploymentMethodConcept extends DynamicResource implements IDeploymentMethodConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentMethodConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentMethodConcept>() {
    
    @Override
    public IDeploymentMethodConcept create() {
      return new DeploymentMethodConcept();
    }
    
    @Override
    public IDeploymentMethodConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DeploymentMethodConcept(resourceRepository, resource);
    }
  
  };

  public DeploymentMethodConcept() {
    super(IDeploymentMethodConcept.TYPE_ID);
  }
  
  public DeploymentMethodConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeploymentMethodConcept.TYPE_ID);
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

  public DeploymentMethodConcept setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentMethodForSystem> selectDeploymentForSystems() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentMethodForSystem.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.MethodPackage.DeploymentMethodConcept_deploymentForSystems);
  }

  public DeploymentMethodConcept setDeploymentForSystems(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentMethodForSystem> deploymentForSystems) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.MethodPackage.DeploymentMethodConcept_deploymentForSystems, deploymentForSystems);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentMethod> selectDeploymentMethods() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentMethod.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.MethodPackage.DeploymentMethodConcept_deploymentMethods);
  }

  public DeploymentMethodConcept setDeploymentMethods(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentMethod> deploymentMethods) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.MethodPackage.DeploymentMethodConcept_deploymentMethods, deploymentMethods);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public DeploymentMethodConcept setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public DeploymentMethodConcept setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DeploymentMethodConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentMethodForSystem.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.MethodPackage.DeploymentMethodConcept_deploymentForSystems, visitor);
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentMethod.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.MethodPackage.DeploymentMethodConcept_deploymentMethods, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentMethodConcept selectToMeDeploymentMethods(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentMethod object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentMethodConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.MethodPackage.DeploymentMethodConcept_deploymentMethods, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentMethodConcept selectToMeDeploymentForSystems(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentMethodForSystem object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentMethodConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.MethodPackage.DeploymentMethodConcept_deploymentForSystems, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,64eef162-fe49-11ea-892b-df291bae18c5,pFjQG0ICjPXyPfVNbDBiPEjRBZk=] */
