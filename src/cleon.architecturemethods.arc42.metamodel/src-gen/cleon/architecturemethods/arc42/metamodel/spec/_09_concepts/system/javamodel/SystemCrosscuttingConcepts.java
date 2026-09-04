package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SystemCrosscuttingConcepts extends DynamicResource implements ISystemCrosscuttingConcepts {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemCrosscuttingConcepts> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemCrosscuttingConcepts>() {
    
    @Override
    public ISystemCrosscuttingConcepts create() {
      return new SystemCrosscuttingConcepts();
    }
    
    @Override
    public ISystemCrosscuttingConcepts create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SystemCrosscuttingConcepts(resourceRepository, resource);
    }
  
  };

  public SystemCrosscuttingConcepts() {
    super(ISystemCrosscuttingConcepts.TYPE_ID);
  }
  
  public SystemCrosscuttingConcepts(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystemCrosscuttingConcepts.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectChapterLevel() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterLevel);
  }
    
  public void setChapterLevel(java.lang.Integer chapterLevel) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterLevel, chapterLevel);
  }

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

  @Override
  public java.lang.String selectNoChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapterPath_noChapterPath);
  }
    
  public void setNoChapterPath(java.lang.String noChapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapterPath_noChapterPath, noChapterPath);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConcept selectAccessConcept() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_accessConcept);
  }

  public SystemCrosscuttingConcepts setAccessConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConcept accessConcept) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_accessConcept, accessConcept);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.javamodel.IBusinessContinuityConcept selectBusinessContinuityConcept() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.javamodel.IBusinessContinuityConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_businessContinuityConcept);
  }

  public SystemCrosscuttingConcepts setBusinessContinuityConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.javamodel.IBusinessContinuityConcept businessContinuityConcept) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_businessContinuityConcept, businessContinuityConcept);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.INamedChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.INamedChapter.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_chapters);
  }

  public SystemCrosscuttingConcepts setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.INamedChapter> chapters) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.javamodel.IAbstractConcept> selectConcepts() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.javamodel.IAbstractConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts._09_conceptsPackage.CrosscuttingConcepts_concepts);
  }

  public SystemCrosscuttingConcepts setConcepts(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.javamodel.IAbstractConcept> concepts) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts._09_conceptsPackage.CrosscuttingConcepts_concepts, concepts);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.javamodel.IDeploymentConcept selectDeploymentConcept() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.javamodel.IDeploymentConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_deploymentConcept);
  }

  public SystemCrosscuttingConcepts setDeploymentConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.javamodel.IDeploymentConcept deploymentConcept) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_deploymentConcept, deploymentConcept);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> selectDescriptionTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation);
  }

  public SystemCrosscuttingConcepts setDescriptionTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> descriptionTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, descriptionTranslation);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.javamodel.IDNSConcept selectDnsConcept() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.javamodel.IDNSConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_dnsConcept);
  }

  public SystemCrosscuttingConcepts setDnsConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.javamodel.IDNSConcept dnsConcept) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_dnsConcept, dnsConcept);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public SystemCrosscuttingConcepts setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.IIPNetworkConcept selectNetworkConcept() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.IIPNetworkConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_networkConcept);
  }

  public SystemCrosscuttingConcepts setNetworkConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.IIPNetworkConcept networkConcept) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_networkConcept, networkConcept);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph selectNoParagraphs() {
    return _getSingle(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs);
  }

  public SystemCrosscuttingConcepts setNoParagraphs(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph noParagraphs) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs, noParagraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.orchestration.javamodel.IOrchestrationConcept selectOrchestrationConcept() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.orchestration.javamodel.IOrchestrationConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_orchestrationConcept);
  }

  public SystemCrosscuttingConcepts setOrchestrationConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.orchestration.javamodel.IOrchestrationConcept orchestrationConcept) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_orchestrationConcept, orchestrationConcept);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public SystemCrosscuttingConcepts setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IPortServices selectPortServiceConcept() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IPortServices.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_portServiceConcept);
  }

  public SystemCrosscuttingConcepts setPortServiceConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IPortServices portServiceConcept) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_portServiceConcept, portServiceConcept);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IBandwithAndQoSConcept selectQosConcept() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IBandwithAndQoSConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_qosConcept);
  }

  public SystemCrosscuttingConcepts setQosConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IBandwithAndQoSConcept qosConcept) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_qosConcept, qosConcept);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.javamodel.IResourceConcept selectResourceConcept() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.javamodel.IResourceConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_resourceConcept);
  }

  public SystemCrosscuttingConcepts setResourceConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.javamodel.IResourceConcept resourceConcept) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_resourceConcept, resourceConcept);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.javamodel.ISecurityConcept selectSecurityConcept() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.javamodel.ISecurityConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_securityConcept);
  }

  public SystemCrosscuttingConcepts setSecurityConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.javamodel.ISecurityConcept securityConcept) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_securityConcept, securityConcept);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.time_synchronization.javamodel.ITimeSynchronizationConcept selectTimeSynchronizationConcept() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.time_synchronization.javamodel.ITimeSynchronizationConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_timeSynchronizationConcept);
  }

  public SystemCrosscuttingConcepts setTimeSynchronizationConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.time_synchronization.javamodel.ITimeSynchronizationConcept timeSynchronizationConcept) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_timeSynchronizationConcept, timeSynchronizationConcept);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopology selectTopologyConcept() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopology.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_topologyConcept);
  }

  public SystemCrosscuttingConcepts setTopologyConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopology topologyConcept) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_topologyConcept, topologyConcept);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SystemCrosscuttingConcepts setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterLevel, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_accessConcept, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.javamodel.IBusinessContinuityConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_businessContinuityConcept, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.INamedChapter.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_chapters, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.javamodel.IDeploymentConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_deploymentConcept, visitor);
    _acceptMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.javamodel.IDNSConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_dnsConcept, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.IIPNetworkConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_networkConcept, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.orchestration.javamodel.IOrchestrationConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_orchestrationConcept, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IPortServices.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_portServiceConcept, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IBandwithAndQoSConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_qosConcept, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.javamodel.IResourceConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_resourceConcept, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.javamodel.ISecurityConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_securityConcept, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.time_synchronization.javamodel.ITimeSynchronizationConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_timeSynchronizationConcept, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopology.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_topologyConcept, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemCrosscuttingConcepts selectToMeTopologyConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopology object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemCrosscuttingConcepts.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_topologyConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemCrosscuttingConcepts selectToMeSecurityConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.javamodel.ISecurityConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemCrosscuttingConcepts.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_securityConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemCrosscuttingConcepts selectToMeBusinessContinuityConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.javamodel.IBusinessContinuityConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemCrosscuttingConcepts.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_businessContinuityConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemCrosscuttingConcepts selectToMeResourceConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.javamodel.IResourceConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemCrosscuttingConcepts.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_resourceConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemCrosscuttingConcepts selectToMeDeploymentConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.javamodel.IDeploymentConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemCrosscuttingConcepts.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_deploymentConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemCrosscuttingConcepts selectToMeOrchestrationConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.orchestration.javamodel.IOrchestrationConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemCrosscuttingConcepts.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_orchestrationConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemCrosscuttingConcepts selectToMeAccessConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemCrosscuttingConcepts.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_accessConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemCrosscuttingConcepts selectToMeTimeSynchronizationConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.time_synchronization.javamodel.ITimeSynchronizationConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemCrosscuttingConcepts.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_timeSynchronizationConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemCrosscuttingConcepts selectToMeNetworkConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.IIPNetworkConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemCrosscuttingConcepts.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_networkConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemCrosscuttingConcepts selectToMeDnsConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.javamodel.IDNSConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemCrosscuttingConcepts.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_dnsConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemCrosscuttingConcepts selectToMeQosConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IBandwithAndQoSConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemCrosscuttingConcepts.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_qosConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemCrosscuttingConcepts selectToMeChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.INamedChapter object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemCrosscuttingConcepts.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_chapters, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemCrosscuttingConcepts selectToMePortServiceConcept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IPortServices object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.ISystemCrosscuttingConcepts.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.SystemPackage.SystemCrosscuttingConcepts_portServiceConcept, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6e1a6c6b-f190-11e8-b3e7-15e2dd8d9b05,hNWgNe3f/IkVZiBx2292U3F67wQ=] */
