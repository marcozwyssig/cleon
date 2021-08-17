package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class QoSConcept extends DynamicResource implements IQoSConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IQoSConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IQoSConcept>() {
    
    @Override
    public IQoSConcept create() {
      return new QoSConcept();
    }
    
    @Override
    public IQoSConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new QoSConcept(resourceRepository, resource);
    }
  
  };

  public QoSConcept() {
    super(IQoSConcept.TYPE_ID);
  }
  
  public QoSConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IQoSConcept.TYPE_ID);
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
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode> selectCalculationFor() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSConcept_calculationFor);
  }

  public QoSConcept setCalculationFor(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode> calculationFor) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSConcept_calculationFor, calculationFor);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public QoSConcept setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public QoSConcept setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public QoSConcept setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationConcept> selectQosConfigurationConcepts() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSConcept_qosConfigurationConcepts);
  }

  public QoSConcept setQosConfigurationConcepts(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationConcept> qosConfigurationConcepts) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSConcept_qosConfigurationConcepts, qosConfigurationConcepts);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConfigurationComponentConcept> selectSystemConfigurationConcept() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConfigurationComponentConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.ConceptForSystemConfigurationComponent_systemConfigurationConcept);
  }

  public QoSConcept setSystemConfigurationConcept(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConfigurationComponentConcept> systemConfigurationConcept) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.ConceptForSystemConfigurationComponent_systemConfigurationConcept, systemConfigurationConcept);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.ITransportNetwork> selectTransportNetworks() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.ITransportNetwork.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSConcept_transportNetworks);
  }

  public QoSConcept setTransportNetworks(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.ITransportNetwork> transportNetworks) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSConcept_transportNetworks, transportNetworks);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public QoSConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSConcept_calculationFor, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSConcept_qosConfigurationConcepts, visitor);
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.ITransportNetwork.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSConcept_transportNetworks, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSConcept> selectToMeCalculationFor(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSConcept_calculationFor, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSConcept selectToMeQosConfigurationConcepts(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSConcept_qosConfigurationConcepts, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSConcept selectToMeTransportNetworks(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.ITransportNetwork object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.QoSConcept_transportNetworks, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a4426fd0-f2e5-11e8-b860-9fc163e21388,zmXNXknJLc1VRfpLcJKMj3kvOOo=] */
