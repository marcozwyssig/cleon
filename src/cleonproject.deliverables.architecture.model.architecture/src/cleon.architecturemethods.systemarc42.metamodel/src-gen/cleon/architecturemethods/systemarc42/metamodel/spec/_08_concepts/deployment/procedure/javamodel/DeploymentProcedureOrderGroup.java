package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DeploymentProcedureOrderGroup extends DynamicResource implements IDeploymentProcedureOrderGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentProcedureOrderGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentProcedureOrderGroup>() {
    
    @Override
    public IDeploymentProcedureOrderGroup create() {
      return new DeploymentProcedureOrderGroup();
    }
    
    @Override
    public IDeploymentProcedureOrderGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DeploymentProcedureOrderGroup(resourceRepository, resource);
    }
  
  };

  public DeploymentProcedureOrderGroup() {
    super(IDeploymentProcedureOrderGroup.TYPE_ID);
  }
  
  public DeploymentProcedureOrderGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeploymentProcedureOrderGroup.TYPE_ID);
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

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.OnlyStandardElementsChapter_chapters);
  }

  public DeploymentProcedureOrderGroup setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.OnlyStandardElementsChapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel.IDeploymentProcedureOrder> selectDeploymentOrder() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel.IDeploymentProcedureOrder.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.ProcedurePackage.DeploymentProcedureOrderGroup_deploymentOrder);
  }

  public DeploymentProcedureOrderGroup setDeploymentOrder(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel.IDeploymentProcedureOrder> deploymentOrder) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.ProcedurePackage.DeploymentProcedureOrderGroup_deploymentOrder, deploymentOrder);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public DeploymentProcedureOrderGroup setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public DeploymentProcedureOrderGroup setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IStandardParagraph> selectStandardParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IStandardParagraph.class, cleon.common.doc.metamodel.spec.SpecPackage.OnlyStandardElementsChapter_standardParagraphs);
  }

  public DeploymentProcedureOrderGroup setStandardParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IStandardParagraph> standardParagraphs) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.OnlyStandardElementsChapter_standardParagraphs, standardParagraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DeploymentProcedureOrderGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.OnlyStandardElementsChapter_chapters, visitor);
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel.IDeploymentProcedureOrder.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.ProcedurePackage.DeploymentProcedureOrderGroup_deploymentOrder, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IStandardParagraph.class, cleon.common.doc.metamodel.spec.SpecPackage.OnlyStandardElementsChapter_standardParagraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel.IDeploymentProcedureOrderGroup selectToMeDeploymentOrder(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel.IDeploymentProcedureOrder object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel.IDeploymentProcedureOrderGroup.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.ProcedurePackage.DeploymentProcedureOrderGroup_deploymentOrder, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a610bc88-0e84-11ed-992a-279da38c72c5,YwTLC72sOUk4eX2NKLe+WonMRsQ=] */
