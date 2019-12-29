package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SegmentationSystemComponentConcept extends DynamicResource implements ISegmentationSystemComponentConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISegmentationSystemComponentConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISegmentationSystemComponentConcept>() {
    
    @Override
    public ISegmentationSystemComponentConcept create() {
      return new SegmentationSystemComponentConcept();
    }
    
    @Override
    public ISegmentationSystemComponentConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SegmentationSystemComponentConcept(resourceRepository, resource);
    }
  
  };

  public SegmentationSystemComponentConcept() {
    super(ISegmentationSystemComponentConcept.TYPE_ID);
  }
  
  public SegmentationSystemComponentConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISegmentationSystemComponentConcept.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public SegmentationSystemComponentConcept setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public SegmentationSystemComponentConcept setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public SegmentationSystemComponentConcept setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.javamodel.ISecurityZone> selectSecurityZones() {
    return _getList(cleon.modelinglanguages.network.metamodel.spec.javamodel.ISecurityZone.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.SegmentationPackage.SegmentationSystemComponentConcept_securityZones);
  }

  public SegmentationSystemComponentConcept setSecurityZones(java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.javamodel.ISecurityZone> securityZones) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.SegmentationPackage.SegmentationSystemComponentConcept_securityZones, securityZones);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemComponent selectSystemComponent() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemComponent.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemComponentConcept_systemComponent);
  }

  public SegmentationSystemComponentConcept setSystemComponent(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemComponent systemComponent) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemComponentConcept_systemComponent, systemComponent);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public SegmentationSystemComponentConcept setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SegmentationSystemComponentConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptList(cleon.modelinglanguages.network.metamodel.spec.javamodel.ISecurityZone.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.SegmentationPackage.SegmentationSystemComponentConcept_securityZones, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemComponent.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.ConceptsPackage.SystemComponentConcept_systemComponent, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.javamodel.ISegmentationSystemComponentConcept> selectToMeSecurityZones(cleon.modelinglanguages.network.metamodel.spec.javamodel.ISecurityZone object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.javamodel.ISegmentationSystemComponentConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.SegmentationPackage.SegmentationSystemComponentConcept_securityZones, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,19f5852a-4b23-11e9-8338-41c203971ecb,SHZkeQRKzi22tB++OnF7TSRyO4c=] */
