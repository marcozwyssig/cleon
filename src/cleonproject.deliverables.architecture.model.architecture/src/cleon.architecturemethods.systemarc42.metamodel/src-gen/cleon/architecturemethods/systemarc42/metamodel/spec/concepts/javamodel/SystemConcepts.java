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
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.businesscontinuity.javamodel.IBusinessContinuityConcept selectBusinessContinuity() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.businesscontinuity.javamodel.IBusinessContinuityConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_businessContinuity);
  }

  public SystemConcepts setBusinessContinuity(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.businesscontinuity.javamodel.IBusinessContinuityConcept businessContinuity) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_businessContinuity, businessContinuity);
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
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.INetworkConcept selectNetwork() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.INetworkConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_network);
  }

  public SystemConcepts setNetwork(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.INetworkConcept network) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_network, network);
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
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.javamodel.IQoS_Concept selectQos() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.javamodel.IQoS_Concept.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_qos);
  }

  public SystemConcepts setQos(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.javamodel.IQoS_Concept qos) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_qos, qos);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.javamodel.ISecurityConcept selectSecurity() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.javamodel.ISecurityConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_security);
  }

  public SystemConcepts setSecurity(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.javamodel.ISecurityConcept security) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_security, security);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.javamodel.ISegmentationConcept selectSegmentation() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.javamodel.ISegmentationConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_segmentation);
  }

  public SystemConcepts setSegmentation(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.javamodel.ISegmentationConcept segmentation) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_segmentation, segmentation);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.services.javamodel.IServices selectServices() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.services.javamodel.IServices.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_services);
  }

  public SystemConcepts setServices(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.services.javamodel.IServices services) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_services, services);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITopology selectTopology() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITopology.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_topology);
  }

  public SystemConcepts setTopology(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITopology topology) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_topology, topology);
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
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.businesscontinuity.javamodel.IBusinessContinuityConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_businessContinuity, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.INetworkConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_network, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.javamodel.IQoS_Concept.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_qos, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.javamodel.ISecurityConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_security, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.javamodel.ISegmentationConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_segmentation, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.services.javamodel.IServices.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_services, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITopology.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_topology, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConcepts selectToMeSegmentation(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.javamodel.ISegmentationConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConcepts.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_segmentation, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConcepts selectToMeQos(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.javamodel.IQoS_Concept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConcepts.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_qos, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConcepts selectToMeNetwork(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.INetworkConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConcepts.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_network, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConcepts selectToMeSecurity(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.javamodel.ISecurityConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConcepts.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_security, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConcepts selectToMeBusinessContinuity(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.businesscontinuity.javamodel.IBusinessContinuityConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConcepts.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_businessContinuity, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConcepts selectToMeTopology(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITopology object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConcepts.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_topology, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConcepts selectToMeServices(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.services.javamodel.IServices object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConcepts.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemConcepts_services, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6e1a6c6b-f190-11e8-b3e7-15e2dd8d9b05,mOIggHXEdP16MHI3qg9kv0NWtdo=] */
