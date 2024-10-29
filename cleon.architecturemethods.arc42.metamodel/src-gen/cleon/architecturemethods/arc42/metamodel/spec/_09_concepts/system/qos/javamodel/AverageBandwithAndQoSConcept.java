package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AverageBandwithAndQoSConcept extends DynamicResource implements IAverageBandwithAndQoSConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAverageBandwithAndQoSConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAverageBandwithAndQoSConcept>() {
    
    @Override
    public IAverageBandwithAndQoSConcept create() {
      return new AverageBandwithAndQoSConcept();
    }
    
    @Override
    public IAverageBandwithAndQoSConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AverageBandwithAndQoSConcept(resourceRepository, resource);
    }
  
  };

  public AverageBandwithAndQoSConcept() {
    super(IAverageBandwithAndQoSConcept.TYPE_ID);
  }
  
  public AverageBandwithAndQoSConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAverageBandwithAndQoSConcept.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath);
  }
    
  public void setChapterPath(java.lang.String chapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, chapterPath);
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
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode> selectCalculationFor() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.AverageBandwithAndQoSConcept_calculationFor);
  }

  public AverageBandwithAndQoSConcept setCalculationFor(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode> calculationFor) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.AverageBandwithAndQoSConcept_calculationFor, calculationFor);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public AverageBandwithAndQoSConcept setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public AverageBandwithAndQoSConcept setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public AverageBandwithAndQoSConcept setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationConcept> selectQosConfigurationConcepts() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.AverageBandwithAndQoSConcept_qosConfigurationConcepts);
  }

  public AverageBandwithAndQoSConcept setQosConfigurationConcepts(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationConcept> qosConfigurationConcepts) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.AverageBandwithAndQoSConcept_qosConfigurationConcepts, qosConfigurationConcepts);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemConfigurationComponentConcept> selectSystemConfigurationConcept() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemConfigurationComponentConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.ConceptForSystemConfigurationComponent_systemConfigurationConcept);
  }

  public AverageBandwithAndQoSConcept setSystemConfigurationConcept(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemConfigurationComponentConcept> systemConfigurationConcept) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.ConceptForSystemConfigurationComponent_systemConfigurationConcept, systemConfigurationConcept);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.ITransportNetwork> selectTransportNetworks() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.ITransportNetwork.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.AverageBandwithAndQoSConcept_transportNetworks);
  }

  public AverageBandwithAndQoSConcept setTransportNetworks(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.ITransportNetwork> transportNetworks) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.AverageBandwithAndQoSConcept_transportNetworks, transportNetworks);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AverageBandwithAndQoSConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.AverageBandwithAndQoSConcept_calculationFor, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.AverageBandwithAndQoSConcept_qosConfigurationConcepts, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.ITransportNetwork.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.AverageBandwithAndQoSConcept_transportNetworks, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IAverageBandwithAndQoSConcept> selectToMeCalculationFor(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IAverageBandwithAndQoSConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.AverageBandwithAndQoSConcept_calculationFor, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IAverageBandwithAndQoSConcept selectToMeQosConfigurationConcepts(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IAverageBandwithAndQoSConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.AverageBandwithAndQoSConcept_qosConfigurationConcepts, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IAverageBandwithAndQoSConcept selectToMeTransportNetworks(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.ITransportNetwork object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IAverageBandwithAndQoSConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage.AverageBandwithAndQoSConcept_transportNetworks, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a4426fd0-f2e5-11e8-b860-9fc163e21388,nY4zFgWk7VpoZtHJ0VWOoz6Q1i4=] */
