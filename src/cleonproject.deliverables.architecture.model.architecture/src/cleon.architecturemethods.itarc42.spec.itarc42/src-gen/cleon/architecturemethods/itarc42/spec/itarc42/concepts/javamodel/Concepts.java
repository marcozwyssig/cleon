package cleon.architecturemethods.itarc42.spec.itarc42.concepts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Concepts extends DynamicResource implements IConcepts {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IConcepts> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IConcepts>() {
    
    @Override
    public IConcepts create() {
      return new Concepts();
    }
    
    @Override
    public IConcepts create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Concepts(resourceRepository, resource);
    }
  
  };

  public Concepts() {
    super(IConcepts.TYPE_ID);
  }
  
  public Concepts(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IConcepts.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.javamodel.IBusinessContinuityConcept selectBusinessContinuity() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.javamodel.IBusinessContinuityConcept.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.ConceptsPackage.Concepts_businessContinuity);
  }

  public Concepts setBusinessContinuity(cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.javamodel.IBusinessContinuityConcept businessContinuity) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.ConceptsPackage.Concepts_businessContinuity, businessContinuity);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters);
  }

  public Concepts setChapters(java.util.List<? extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.doc.spec.javamodel.IDocumentElement.class, cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Concepts setDocumentElements(java.util.List<? extends cleon.common.doc.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetworkConcept selectNetwork() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetworkConcept.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.ConceptsPackage.Concepts_network);
  }

  public Concepts setNetwork(cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetworkConcept network) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.ConceptsPackage.Concepts_network, network);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Concepts setParagraphs(java.util.List<? extends cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42.concepts.qos.javamodel.IQoS_Concept selectQos() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.qos.javamodel.IQoS_Concept.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.ConceptsPackage.Concepts_qos);
  }

  public Concepts setQos(cleon.architecturemethods.itarc42.spec.itarc42.concepts.qos.javamodel.IQoS_Concept qos) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.ConceptsPackage.Concepts_qos, qos);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.javamodel.ISecurityConcept selectSecurity() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.javamodel.ISecurityConcept.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.ConceptsPackage.Concepts_security);
  }

  public Concepts setSecurity(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.javamodel.ISecurityConcept security) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.ConceptsPackage.Concepts_security, security);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.ISegmentationConcept selectSegmentation() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.ISegmentationConcept.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.ConceptsPackage.Concepts_segmentation);
  }

  public Concepts setSegmentation(cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.ISegmentationConcept segmentation) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.ConceptsPackage.Concepts_segmentation, segmentation);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Concepts setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.javamodel.IBusinessContinuityConcept.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.ConceptsPackage.Concepts_businessContinuity, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetworkConcept.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.ConceptsPackage.Concepts_network, visitor);
    _acceptList(cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.qos.javamodel.IQoS_Concept.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.ConceptsPackage.Concepts_qos, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.javamodel.ISecurityConcept.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.ConceptsPackage.Concepts_security, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.ISegmentationConcept.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.ConceptsPackage.Concepts_segmentation, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.spec.itarc42.concepts.javamodel.IConcepts selectToMeSegmentation(cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.ISegmentationConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.concepts.javamodel.IConcepts.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.ConceptsPackage.Concepts_segmentation, object.getResource());
  }
  
  public static cleon.architecturemethods.itarc42.spec.itarc42.concepts.javamodel.IConcepts selectToMeQos(cleon.architecturemethods.itarc42.spec.itarc42.concepts.qos.javamodel.IQoS_Concept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.concepts.javamodel.IConcepts.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.ConceptsPackage.Concepts_qos, object.getResource());
  }
  
  public static cleon.architecturemethods.itarc42.spec.itarc42.concepts.javamodel.IConcepts selectToMeNetwork(cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetworkConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.concepts.javamodel.IConcepts.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.ConceptsPackage.Concepts_network, object.getResource());
  }
  
  public static cleon.architecturemethods.itarc42.spec.itarc42.concepts.javamodel.IConcepts selectToMeSecurity(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.javamodel.ISecurityConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.concepts.javamodel.IConcepts.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.ConceptsPackage.Concepts_security, object.getResource());
  }
  
  public static cleon.architecturemethods.itarc42.spec.itarc42.concepts.javamodel.IConcepts selectToMeBusinessContinuity(cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.javamodel.IBusinessContinuityConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.concepts.javamodel.IConcepts.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.ConceptsPackage.Concepts_businessContinuity, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6e1a6c6b-f190-11e8-b3e7-15e2dd8d9b05,GGDxwLLlyrbhmGLEFJjFMILp8BQ=] */
