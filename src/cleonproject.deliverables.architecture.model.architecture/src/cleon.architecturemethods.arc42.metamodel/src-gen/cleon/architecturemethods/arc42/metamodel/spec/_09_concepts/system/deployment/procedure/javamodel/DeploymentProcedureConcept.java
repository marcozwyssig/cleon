package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DeploymentProcedureConcept extends DynamicResource implements IDeploymentProcedureConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentProcedureConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentProcedureConcept>() {
    
    @Override
    public IDeploymentProcedureConcept create() {
      return new DeploymentProcedureConcept();
    }
    
    @Override
    public IDeploymentProcedureConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DeploymentProcedureConcept(resourceRepository, resource);
    }
  
  };

  public DeploymentProcedureConcept() {
    super(IDeploymentProcedureConcept.TYPE_ID);
  }
  
  public DeploymentProcedureConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeploymentProcedureConcept.TYPE_ID);
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

  public DeploymentProcedureConcept setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel.IDeploymentProcedureOrderGroup> selectDeploymentProcedureOrderGroup() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel.IDeploymentProcedureOrderGroup.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.ProcedurePackage.DeploymentProcedureConcept_deploymentProcedureOrderGroup);
  }

  public DeploymentProcedureConcept setDeploymentProcedureOrderGroup(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel.IDeploymentProcedureOrderGroup> deploymentProcedureOrderGroup) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.ProcedurePackage.DeploymentProcedureConcept_deploymentProcedureOrderGroup, deploymentProcedureOrderGroup);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel.IDeploymentProcedureStage> selectDeploymentStages() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel.IDeploymentProcedureStage.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.ProcedurePackage.DeploymentProcedureConcept_deploymentStages);
  }

  public DeploymentProcedureConcept setDeploymentStages(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel.IDeploymentProcedureStage> deploymentStages) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.ProcedurePackage.DeploymentProcedureConcept_deploymentStages, deploymentStages);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public DeploymentProcedureConcept setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel.IDeploymentProcedureExclude> selectExcludeInInstallationOrder() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel.IDeploymentProcedureExclude.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.ProcedurePackage.DeploymentProcedureConcept_excludeInInstallationOrder);
  }

  public DeploymentProcedureConcept setExcludeInInstallationOrder(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel.IDeploymentProcedureExclude> excludeInInstallationOrder) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.ProcedurePackage.DeploymentProcedureConcept_excludeInInstallationOrder, excludeInInstallationOrder);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public DeploymentProcedureConcept setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DeploymentProcedureConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel.IDeploymentProcedureOrderGroup.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.ProcedurePackage.DeploymentProcedureConcept_deploymentProcedureOrderGroup, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel.IDeploymentProcedureStage.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.ProcedurePackage.DeploymentProcedureConcept_deploymentStages, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel.IDeploymentProcedureExclude.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.ProcedurePackage.DeploymentProcedureConcept_excludeInInstallationOrder, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel.IDeploymentProcedureConcept selectToMeDeploymentStages(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel.IDeploymentProcedureStage object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel.IDeploymentProcedureConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.ProcedurePackage.DeploymentProcedureConcept_deploymentStages, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel.IDeploymentProcedureConcept selectToMeExcludeInInstallationOrder(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel.IDeploymentProcedureExclude object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel.IDeploymentProcedureConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.ProcedurePackage.DeploymentProcedureConcept_excludeInInstallationOrder, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel.IDeploymentProcedureConcept selectToMeDeploymentProcedureOrderGroup(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel.IDeploymentProcedureOrderGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel.IDeploymentProcedureConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.ProcedurePackage.DeploymentProcedureConcept_deploymentProcedureOrderGroup, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,160aafe5-7e82-11ec-b55c-f5ca121c82b7,277rOtPaBTVMpPT0qQqoLusTkfg=] */
