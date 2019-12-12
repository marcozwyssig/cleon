package cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SegmentationSystemConfigurationComponentConcept extends DynamicResource implements ISegmentationSystemConfigurationComponentConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISegmentationSystemConfigurationComponentConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISegmentationSystemConfigurationComponentConcept>() {
    
    @Override
    public ISegmentationSystemConfigurationComponentConcept create() {
      return new SegmentationSystemConfigurationComponentConcept();
    }
    
    @Override
    public ISegmentationSystemConfigurationComponentConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SegmentationSystemConfigurationComponentConcept(resourceRepository, resource);
    }
  
  };

  public SegmentationSystemConfigurationComponentConcept() {
    super(ISegmentationSystemConfigurationComponentConcept.TYPE_ID);
  }
  
  public SegmentationSystemConfigurationComponentConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISegmentationSystemConfigurationComponentConcept.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters);
  }

  public SegmentationSystemConfigurationComponentConcept setChapters(java.util.List<? extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.doc.spec.javamodel.IDocumentElement.class, cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public SegmentationSystemConfigurationComponentConcept setDocumentElements(java.util.List<? extends cleon.common.doc.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public SegmentationSystemConfigurationComponentConcept setParagraphs(java.util.List<? extends cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecuritySubZone> selectSecuritySubZones() {
    return _getList(cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecuritySubZone.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.SegmentationPackage.SegmentationSystemConfigurationComponentConcept_securitySubZones);
  }

  public SegmentationSystemConfigurationComponentConcept setSecuritySubZones(java.util.List<? extends cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecuritySubZone> securitySubZones) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.SegmentationPackage.SegmentationSystemConfigurationComponentConcept_securitySubZones, securitySubZones);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemConfiguration selectSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.ConceptsPackage.SystemConfigurationComponentConcept_systemConfiguration);
  }

  public SegmentationSystemConfigurationComponentConcept setSystemConfiguration(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemConfiguration systemConfiguration) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.ConceptsPackage.SystemConfigurationComponentConcept_systemConfiguration, systemConfiguration);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public SegmentationSystemConfigurationComponentConcept setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SegmentationSystemConfigurationComponentConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptList(cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecuritySubZone.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.SegmentationPackage.SegmentationSystemConfigurationComponentConcept_securitySubZones, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.ConceptsPackage.SystemConfigurationComponentConcept_systemConfiguration, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.ISegmentationSystemConfigurationComponentConcept> selectToMeSecuritySubZones(cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecuritySubZone object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.ISegmentationSystemConfigurationComponentConcept.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.SegmentationPackage.SegmentationSystemConfigurationComponentConcept_securitySubZones, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,be4cba9f-0c2a-11e9-83ba-4d57b06560a2,4PGrNGYkcV3GOeJ0TsFoVEBOvy4=] */
