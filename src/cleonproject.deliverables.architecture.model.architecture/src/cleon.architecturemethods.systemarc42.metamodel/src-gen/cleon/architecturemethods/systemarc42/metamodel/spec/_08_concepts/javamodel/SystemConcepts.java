package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SystemConcepts extends DynamicResource implements ISystemConcepts {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemConcepts> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemConcepts>() {
    
    @Override
    public ISystemConcepts create() {
      return new SystemConcepts();
    }
    
    @Override
    public ISystemConcepts create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SystemConcepts(resourceRepository, resource);
    }
  
  };

  public SystemConcepts() {
    super(ISystemConcepts.TYPE_ID);
  }
  
  public SystemConcepts(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystemConcepts.TYPE_ID);
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
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConcept selectAccessConcept() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_accessConcept);
  }

  public SystemConcepts setAccessConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConcept accessConcept) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_accessConcept, accessConcept);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.javamodel.IBusinessContinuityConcept selectBusinessContinuityConcept() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.javamodel.IBusinessContinuityConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_businessContinuityConcept);
  }

  public SystemConcepts setBusinessContinuityConcept(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.javamodel.IBusinessContinuityConcept businessContinuityConcept) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_businessContinuityConcept, businessContinuityConcept);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public SystemConcepts setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeploymentConcept selectDeploymentConcept() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeploymentConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_deploymentConcept);
  }

  public SystemConcepts setDeploymentConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeploymentConcept deploymentConcept) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_deploymentConcept, deploymentConcept);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public SystemConcepts setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkConcept selectNetworkConcept() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_networkConcept);
  }

  public SystemConcepts setNetworkConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkConcept networkConcept) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_networkConcept, networkConcept);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph selectNoParagraphs() {
    return _getSingle(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs);
  }

  public SystemConcepts setNoParagraphs(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph noParagraphs) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs, noParagraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public SystemConcepts setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSConcept selectQosConcept() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_qosConcept);
  }

  public SystemConcepts setQosConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSConcept qosConcept) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_qosConcept, qosConcept);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.javamodel.ISecurityConcept selectSecurityConcept() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.javamodel.ISecurityConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_securityConcept);
  }

  public SystemConcepts setSecurityConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.javamodel.ISecurityConcept securityConcept) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_securityConcept, securityConcept);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.javamodel.ISegmentationConcept selectSegmentationConcept() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.javamodel.ISegmentationConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_segmentationConcept);
  }

  public SystemConcepts setSegmentationConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.javamodel.ISegmentationConcept segmentationConcept) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_segmentationConcept, segmentationConcept);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IServices selectServiceConcept() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IServices.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_serviceConcept);
  }

  public SystemConcepts setServiceConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IServices serviceConcept) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_serviceConcept, serviceConcept);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopology selectTopologyConcept() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopology.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_topologyConcept);
  }

  public SystemConcepts setTopologyConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopology topologyConcept) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_topologyConcept, topologyConcept);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SystemConcepts setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_accessConcept, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.javamodel.IBusinessContinuityConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_businessContinuityConcept, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeploymentConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_deploymentConcept, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_networkConcept, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_qosConcept, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.javamodel.ISecurityConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_securityConcept, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.javamodel.ISegmentationConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_segmentationConcept, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IServices.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_serviceConcept, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopology.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_topologyConcept, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConcepts selectToMeTopologyConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopology object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConcepts.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_topologyConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConcepts selectToMeSegmentationConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.javamodel.ISegmentationConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConcepts.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_segmentationConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConcepts selectToMeQosConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConcepts.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_qosConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConcepts selectToMeSecurityConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.javamodel.ISecurityConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConcepts.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_securityConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConcepts selectToMeBusinessContinuityConcept(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.javamodel.IBusinessContinuityConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConcepts.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_businessContinuityConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConcepts selectToMeServiceConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IServices object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConcepts.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_serviceConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConcepts selectToMeNetworkConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConcepts.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_networkConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConcepts selectToMeDeploymentConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeploymentConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConcepts.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_deploymentConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConcepts selectToMeAccessConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConcepts.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.SystemConcepts_accessConcept, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6e1a6c6b-f190-11e8-b3e7-15e2dd8d9b05,ivY56LpyW+ATPBjLpGbumh8MDys=] */
