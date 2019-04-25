package cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SegmentationConcept extends DynamicResource implements ISegmentationConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISegmentationConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISegmentationConcept>() {
    
    @Override
    public ISegmentationConcept create() {
      return new SegmentationConcept();
    }
    
    @Override
    public ISegmentationConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SegmentationConcept(resourceRepository, resource);
    }
  
  };

  public SegmentationConcept() {
    super(ISegmentationConcept.TYPE_ID);
  }
  
  public SegmentationConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISegmentationConcept.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public SegmentationConcept setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public SegmentationConcept setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public SegmentationConcept setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.ISegmentationSystemComponentConcept> selectSegmentationSystemComponentConcepts() {
    return _getMap(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.ISegmentationSystemComponentConcept.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.SegmentationPackage.SegmentationConcept_segmentationSystemComponentConcepts);
  }

  public SegmentationConcept setSegmentationSystemComponentConcepts(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.ISegmentationSystemComponentConcept> segmentationSystemComponentConcepts) {
    _setMap(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.SegmentationPackage.SegmentationConcept_segmentationSystemComponentConcepts, segmentationSystemComponentConcepts);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.ISegmentationSystemConfigurationComponentConcept> selectSegmentationSystemConfigurationConcepts() {
    return _getMap(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.ISegmentationSystemConfigurationComponentConcept.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.SegmentationPackage.SegmentationConcept_segmentationSystemConfigurationConcepts);
  }

  public SegmentationConcept setSegmentationSystemConfigurationConcepts(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.ISegmentationSystemConfigurationComponentConcept> segmentationSystemConfigurationConcepts) {
    _setMap(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.SegmentationPackage.SegmentationConcept_segmentationSystemConfigurationConcepts, segmentationSystemConfigurationConcepts);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.ISegmentationZone> selectSegmentationZone() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.ISegmentationZone.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.SegmentationPackage.SegmentationConcept_segmentationZone);
  }

  public SegmentationConcept setSegmentationZone(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.ISegmentationZone> segmentationZone) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.SegmentationPackage.SegmentationConcept_segmentationZone, segmentationZone);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.javamodel.ISystemComponentConcept> selectSystemComponentConcept() {
    return _getMap(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.javamodel.ISystemComponentConcept.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts._08_conceptsPackage.ConceptForSystemComponent_systemComponentConcept);
  }

  public SegmentationConcept setSystemComponentConcept(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.javamodel.ISystemComponentConcept> systemComponentConcept) {
    _setMap(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts._08_conceptsPackage.ConceptForSystemComponent_systemComponentConcept, systemComponentConcept);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.javamodel.ISystemConfigurationComponentConcept> selectSystemConfigurationConcept() {
    return _getMap(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.javamodel.ISystemConfigurationComponentConcept.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts._08_conceptsPackage.ConceptForSystemConfigurationComponent_systemConfigurationConcept);
  }

  public SegmentationConcept setSystemConfigurationConcept(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.javamodel.ISystemConfigurationComponentConcept> systemConfigurationConcept) {
    _setMap(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts._08_conceptsPackage.ConceptForSystemConfigurationComponent_systemConfigurationConcept, systemConfigurationConcept);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SegmentationConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptMap(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.ISegmentationSystemComponentConcept.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.SegmentationPackage.SegmentationConcept_segmentationSystemComponentConcepts, visitor);
    _acceptMap(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.ISegmentationSystemConfigurationComponentConcept.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.SegmentationPackage.SegmentationConcept_segmentationSystemConfigurationConcepts, visitor);
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.ISegmentationZone.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.SegmentationPackage.SegmentationConcept_segmentationZone, visitor);
    _acceptMap(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.javamodel.ISystemComponentConcept.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts._08_conceptsPackage.ConceptForSystemComponent_systemComponentConcept, visitor);
    _acceptMap(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.javamodel.ISystemConfigurationComponentConcept.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts._08_conceptsPackage.ConceptForSystemConfigurationComponent_systemConfigurationConcept, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.ISegmentationConcept selectToMeSegmentationZone(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.ISegmentationZone object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.ISegmentationConcept.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.SegmentationPackage.SegmentationConcept_segmentationZone, object.getResource());
  }
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.ISegmentationConcept selectToMeSegmentationSystemComponentConcepts(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.ISegmentationSystemComponentConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.ISegmentationConcept.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.SegmentationPackage.SegmentationConcept_segmentationSystemComponentConcepts, object.getResource());
  }
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.ISegmentationConcept selectToMeSegmentationSystemConfigurationConcepts(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.ISegmentationSystemConfigurationComponentConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.ISegmentationConcept.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.SegmentationPackage.SegmentationConcept_segmentationSystemConfigurationConcepts, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d56c10bc-04ed-11e9-8ff2-6313785a338c,vcuonZuqj3yLrDXSS/esr5pRvtM=] */
