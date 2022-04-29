package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DeploymentConcept extends DynamicResource implements IDeploymentConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentConcept>() {
    
    @Override
    public IDeploymentConcept create() {
      return new DeploymentConcept();
    }
    
    @Override
    public IDeploymentConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DeploymentConcept(resourceRepository, resource);
    }
  
  };

  public DeploymentConcept() {
    super(IDeploymentConcept.TYPE_ID);
  }
  
  public DeploymentConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeploymentConcept.TYPE_ID);
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

  public DeploymentConcept setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.javamodel.IDeploymentBuildingBlockConcept selectDeploymentBuildingBlock() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.javamodel.IDeploymentBuildingBlockConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.DeploymentPackage.DeploymentConcept_deploymentBuildingBlock);
  }

  public DeploymentConcept setDeploymentBuildingBlock(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.javamodel.IDeploymentBuildingBlockConcept deploymentBuildingBlock) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.DeploymentPackage.DeploymentConcept_deploymentBuildingBlock, deploymentBuildingBlock);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentMethodConcept selectDeploymentMethod() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentMethodConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.DeploymentPackage.DeploymentConcept_deploymentMethod);
  }

  public DeploymentConcept setDeploymentMethod(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentMethodConcept deploymentMethod) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.DeploymentPackage.DeploymentConcept_deploymentMethod, deploymentMethod);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel.IDeploymentProcedureConcept selectDeploymentProcedure() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel.IDeploymentProcedureConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.DeploymentPackage.DeploymentConcept_deploymentProcedure);
  }

  public DeploymentConcept setDeploymentProcedure(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel.IDeploymentProcedureConcept deploymentProcedure) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.DeploymentPackage.DeploymentConcept_deploymentProcedure, deploymentProcedure);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public DeploymentConcept setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public DeploymentConcept setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DeploymentConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.update.javamodel.IUpdateConcept selectUpdateConcept() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.update.javamodel.IUpdateConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.DeploymentPackage.DeploymentConcept_updateConcept);
  }

  public DeploymentConcept setUpdateConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.update.javamodel.IUpdateConcept updateConcept) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.DeploymentPackage.DeploymentConcept_updateConcept, updateConcept);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.javamodel.IDeploymentBuildingBlockConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.DeploymentPackage.DeploymentConcept_deploymentBuildingBlock, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentMethodConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.DeploymentPackage.DeploymentConcept_deploymentMethod, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel.IDeploymentProcedureConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.DeploymentPackage.DeploymentConcept_deploymentProcedure, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.update.javamodel.IUpdateConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.DeploymentPackage.DeploymentConcept_updateConcept, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeploymentConcept selectToMeDeploymentBuildingBlock(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.javamodel.IDeploymentBuildingBlockConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeploymentConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.DeploymentPackage.DeploymentConcept_deploymentBuildingBlock, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeploymentConcept selectToMeDeploymentMethod(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentMethodConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeploymentConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.DeploymentPackage.DeploymentConcept_deploymentMethod, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeploymentConcept selectToMeDeploymentProcedure(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel.IDeploymentProcedureConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeploymentConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.DeploymentPackage.DeploymentConcept_deploymentProcedure, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeploymentConcept selectToMeUpdateConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.update.javamodel.IUpdateConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeploymentConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.DeploymentPackage.DeploymentConcept_updateConcept, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e1ea3d77-6eb2-11ea-b8e8-f1a46e0c42f7,6QVM00C5JePKrmwLytcYUzFo8Ps=] */
