package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.javamodel;

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

  public SegmentationConcept setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public SegmentationConcept setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.javamodel.IDomains selectDomains() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.javamodel.IDomains.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.Network_segmentationPackage.SegmentationConcept_domains);
  }

  public SegmentationConcept setDomains(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.javamodel.IDomains domains) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.Network_segmentationPackage.SegmentationConcept_domains, domains);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public SegmentationConcept setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISegmentation selectSegmentation() {
    return _getSingle(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISegmentation.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.Network_segmentationPackage.SegmentationConcept_segmentation);
  }

  public SegmentationConcept setSegmentation(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISegmentation segmentation) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.Network_segmentationPackage.SegmentationConcept_segmentation, segmentation);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.subzonepolicy.javamodel.ISubZonePolicies selectSubzonePolicies() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.subzonepolicy.javamodel.ISubZonePolicies.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.Network_segmentationPackage.SegmentationConcept_subzonePolicies);
  }

  public SegmentationConcept setSubzonePolicies(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.subzonepolicy.javamodel.ISubZonePolicies subzonePolicies) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.Network_segmentationPackage.SegmentationConcept_subzonePolicies, subzonePolicies);
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
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterPath, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.javamodel.IDomains.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.Network_segmentationPackage.SegmentationConcept_domains, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISegmentation.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.Network_segmentationPackage.SegmentationConcept_segmentation, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.subzonepolicy.javamodel.ISubZonePolicies.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.Network_segmentationPackage.SegmentationConcept_subzonePolicies, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.javamodel.ISegmentationConcept selectToMeSegmentation(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISegmentation object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.javamodel.ISegmentationConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.Network_segmentationPackage.SegmentationConcept_segmentation, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.javamodel.ISegmentationConcept selectToMeSubzonePolicies(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.subzonepolicy.javamodel.ISubZonePolicies object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.javamodel.ISegmentationConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.Network_segmentationPackage.SegmentationConcept_subzonePolicies, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.javamodel.ISegmentationConcept selectToMeDomains(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.javamodel.IDomains object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.javamodel.ISegmentationConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.Network_segmentationPackage.SegmentationConcept_domains, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d56c10bc-04ed-11e9-8ff2-6313785a338c,D5tPyYHYiW9NETAsidcsuDRBJvc=] */
