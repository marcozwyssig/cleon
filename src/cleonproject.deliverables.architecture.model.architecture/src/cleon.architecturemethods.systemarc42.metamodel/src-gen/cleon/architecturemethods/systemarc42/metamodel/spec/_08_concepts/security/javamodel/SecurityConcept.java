package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SecurityConcept extends DynamicResource implements ISecurityConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISecurityConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISecurityConcept>() {
    
    @Override
    public ISecurityConcept create() {
      return new SecurityConcept();
    }
    
    @Override
    public ISecurityConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SecurityConcept(resourceRepository, resource);
    }
  
  };

  public SecurityConcept() {
    super(ISecurityConcept.TYPE_ID);
  }
  
  public SecurityConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISecurityConcept.TYPE_ID);
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

  public SecurityConcept setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public SecurityConcept setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.javamodel.IIdentityConcept selectIdentifyConcept() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.javamodel.IIdentityConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.SecurityPackage.SecurityConcept_identifyConcept);
  }

  public SecurityConcept setIdentifyConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.javamodel.IIdentityConcept identifyConcept) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.SecurityPackage.SecurityConcept_identifyConcept, identifyConcept);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public SecurityConcept setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.javamodel.ISegmentationConcept selectSegmentationConcept() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.javamodel.ISegmentationConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.SecurityPackage.SecurityConcept_segmentationConcept);
  }

  public SecurityConcept setSegmentationConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.javamodel.ISegmentationConcept segmentationConcept) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.SecurityPackage.SecurityConcept_segmentationConcept, segmentationConcept);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SecurityConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.javamodel.IIdentityConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.SecurityPackage.SecurityConcept_identifyConcept, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.javamodel.ISegmentationConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.SecurityPackage.SecurityConcept_segmentationConcept, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.javamodel.ISecurityConcept selectToMeIdentifyConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.javamodel.IIdentityConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.javamodel.ISecurityConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.SecurityPackage.SecurityConcept_identifyConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.javamodel.ISecurityConcept selectToMeSegmentationConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.javamodel.ISegmentationConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.javamodel.ISecurityConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.SecurityPackage.SecurityConcept_segmentationConcept, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9515e875-0eae-11e9-9f19-6d15636f4ecc,9SZyuVjoZ43p7OMyLCvMss0Qr5Y=] */
