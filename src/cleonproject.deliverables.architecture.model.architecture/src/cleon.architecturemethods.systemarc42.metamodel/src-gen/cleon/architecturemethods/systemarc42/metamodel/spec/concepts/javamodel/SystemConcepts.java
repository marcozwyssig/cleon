package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel;

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
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.businesscontinuity.javamodel.IBusinessContinuityConcept selectBusinessContinuityConcept() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.businesscontinuity.javamodel.IBusinessContinuityConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_businessContinuityConcept);
  }

  public SystemConcepts setBusinessContinuityConcept(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.businesscontinuity.javamodel.IBusinessContinuityConcept businessContinuityConcept) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_businessContinuityConcept, businessContinuityConcept);
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
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public SystemConcepts setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.INetworkConcept selectNetworkConcept() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.INetworkConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_networkConcept);
  }

  public SystemConcepts setNetworkConcept(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.INetworkConcept networkConcept) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_networkConcept, networkConcept);
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
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.javamodel.IQoS_Concept selectQosConcept() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.javamodel.IQoS_Concept.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_qosConcept);
  }

  public SystemConcepts setQosConcept(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.javamodel.IQoS_Concept qosConcept) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_qosConcept, qosConcept);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.javamodel.ISecurityConcept selectSecurityConcept() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.javamodel.ISecurityConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_securityConcept);
  }

  public SystemConcepts setSecurityConcept(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.javamodel.ISecurityConcept securityConcept) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_securityConcept, securityConcept);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.javamodel.ISegmentationConcept selectSegmentationConcept() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.javamodel.ISegmentationConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_segmentationConcept);
  }

  public SystemConcepts setSegmentationConcept(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.javamodel.ISegmentationConcept segmentationConcept) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_segmentationConcept, segmentationConcept);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.services.javamodel.IServices selectServiceConcept() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.services.javamodel.IServices.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_serviceConcept);
  }

  public SystemConcepts setServiceConcept(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.services.javamodel.IServices serviceConcept) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_serviceConcept, serviceConcept);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITopology selectTopologyConcept() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITopology.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_topologyConcept);
  }

  public SystemConcepts setTopologyConcept(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITopology topologyConcept) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_topologyConcept, topologyConcept);
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
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.businesscontinuity.javamodel.IBusinessContinuityConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_businessContinuityConcept, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.INetworkConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_networkConcept, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.javamodel.IQoS_Concept.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_qosConcept, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.javamodel.ISecurityConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_securityConcept, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.javamodel.ISegmentationConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_segmentationConcept, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.services.javamodel.IServices.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_serviceConcept, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITopology.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_topologyConcept, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConcepts selectToMeTopologyConcept(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITopology object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConcepts.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_topologyConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConcepts selectToMeSegmentationConcept(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.javamodel.ISegmentationConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConcepts.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_segmentationConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConcepts selectToMeQosConcept(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.javamodel.IQoS_Concept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConcepts.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_qosConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConcepts selectToMeSecurityConcept(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.javamodel.ISecurityConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConcepts.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_securityConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConcepts selectToMeBusinessContinuityConcept(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.businesscontinuity.javamodel.IBusinessContinuityConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConcepts.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_businessContinuityConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConcepts selectToMeServiceConcept(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.services.javamodel.IServices object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConcepts.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_serviceConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConcepts selectToMeNetworkConcept(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.INetworkConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConcepts.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_networkConcept, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6e1a6c6b-f190-11e8-b3e7-15e2dd8d9b05,ej6q0r+jVW0Eq7GeyvCAglqM0GA=] */
