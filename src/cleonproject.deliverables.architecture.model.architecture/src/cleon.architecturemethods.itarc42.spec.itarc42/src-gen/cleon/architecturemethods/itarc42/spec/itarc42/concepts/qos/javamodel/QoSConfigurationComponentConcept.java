package cleon.architecturemethods.itarc42.spec.itarc42.concepts.qos.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class QoSConfigurationComponentConcept extends DynamicResource implements IQoSConfigurationComponentConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IQoSConfigurationComponentConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IQoSConfigurationComponentConcept>() {
    
    @Override
    public IQoSConfigurationComponentConcept create() {
      return new QoSConfigurationComponentConcept();
    }
    
    @Override
    public IQoSConfigurationComponentConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new QoSConfigurationComponentConcept(resourceRepository, resource);
    }
  
  };

  public QoSConfigurationComponentConcept() {
    super(IQoSConfigurationComponentConcept.TYPE_ID);
  }
  
  public QoSConfigurationComponentConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IQoSConfigurationComponentConcept.TYPE_ID);
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

  @Override
  public java.lang.Integer selectEstimateMean_KBits() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.qos.QosPackage.QoSConfigurationComponentConcept_estimateMean_aE_KBits);
  }
    
  public void setEstimateMean_KBits(java.lang.Integer estimateMean_KBits) {
     _setSingleAttribute(cleon.architecturemethods.itarc42.spec.itarc42.concepts.qos.QosPackage.QoSConfigurationComponentConcept_estimateMean_aE_KBits, estimateMean_KBits);
  }

  @Override
  public java.lang.Integer selectEstimate_KBits() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.qos.QosPackage.QoSConfigurationComponentConcept_estimate_aE_KBits);
  }
    
  public void setEstimate_KBits(java.lang.Integer estimate_KBits) {
     _setSingleAttribute(cleon.architecturemethods.itarc42.spec.itarc42.concepts.qos.QosPackage.QoSConfigurationComponentConcept_estimate_aE_KBits, estimate_KBits);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters);
  }

  public QoSConfigurationComponentConcept setChapters(java.util.List<? extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.doc.spec.javamodel.IDocumentElement.class, cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public QoSConfigurationComponentConcept setDocumentElements(java.util.List<? extends cleon.common.doc.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public QoSConfigurationComponentConcept setParagraphs(java.util.List<? extends cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42.concepts.qos.javamodel.IServiceClass selectServiceClass() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.qos.javamodel.IServiceClass.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.qos.QosPackage.QoSConfigurationComponentConcept_serviceClass);
  }

  public QoSConfigurationComponentConcept setServiceClass(cleon.architecturemethods.itarc42.spec.itarc42.concepts.qos.javamodel.IServiceClass serviceClass) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.qos.QosPackage.QoSConfigurationComponentConcept_serviceClass, serviceClass);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemConfiguration selectSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.ConceptsPackage.SystemConfigurationComponentConcept_systemConfiguration);
  }

  public QoSConfigurationComponentConcept setSystemConfiguration(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemConfiguration systemConfiguration) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.ConceptsPackage.SystemConfigurationComponentConcept_systemConfiguration, systemConfiguration);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public QoSConfigurationComponentConcept setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public QoSConfigurationComponentConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.qos.QosPackage.QoSConfigurationComponentConcept_estimateMean_aE_KBits, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.qos.QosPackage.QoSConfigurationComponentConcept_estimate_aE_KBits, visitor);
    // relations
    _acceptList(cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.qos.javamodel.IServiceClass.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.qos.QosPackage.QoSConfigurationComponentConcept_serviceClass, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.ConceptsPackage.SystemConfigurationComponentConcept_systemConfiguration, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42.concepts.qos.javamodel.IQoSConfigurationComponentConcept> selectToMeServiceClass(cleon.architecturemethods.itarc42.spec.itarc42.concepts.qos.javamodel.IServiceClass object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.concepts.qos.javamodel.IQoSConfigurationComponentConcept.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.qos.QosPackage.QoSConfigurationComponentConcept_serviceClass, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,39818d2e-1d88-11e9-b601-db75aa6f89a4,XlKx8I/CyIEM91B3lwRVUv7vG2w=] */
