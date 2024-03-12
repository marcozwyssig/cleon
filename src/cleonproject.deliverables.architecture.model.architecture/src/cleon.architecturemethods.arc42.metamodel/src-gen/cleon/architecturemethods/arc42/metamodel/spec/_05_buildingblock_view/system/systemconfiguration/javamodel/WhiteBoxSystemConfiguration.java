package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class WhiteBoxSystemConfiguration extends DynamicResource implements IWhiteBoxSystemConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWhiteBoxSystemConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWhiteBoxSystemConfiguration>() {
    
    @Override
    public IWhiteBoxSystemConfiguration create() {
      return new WhiteBoxSystemConfiguration();
    }
    
    @Override
    public IWhiteBoxSystemConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new WhiteBoxSystemConfiguration(resourceRepository, resource);
    }
  
  };

  public WhiteBoxSystemConfiguration() {
    super(IWhiteBoxSystemConfiguration.TYPE_ID);
  }
  
  public WhiteBoxSystemConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWhiteBoxSystemConfiguration.TYPE_ID);
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
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAccess selectAccess() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAccess.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_access);
  }

  public WhiteBoxSystemConfiguration setAccess(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAccess access) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_access, access);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAuthenticationSystemArc42 selectAuthn() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAuthenticationSystemArc42.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.WhiteBoxSystemConfiguration_authn);
  }

  public WhiteBoxSystemConfiguration setAuthn(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAuthenticationSystemArc42 authn) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.WhiteBoxSystemConfiguration_authn, authn);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAutorizationSystemArc42 selectAuthz() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAutorizationSystemArc42.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.WhiteBoxSystemConfiguration_authz);
  }

  public WhiteBoxSystemConfiguration setAuthz(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAutorizationSystemArc42 authz) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.WhiteBoxSystemConfiguration_authz, authz);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAvailabilitySystemArc42 selectAvailability() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAvailabilitySystemArc42.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.WhiteBoxSystemConfiguration_availability);
  }

  public WhiteBoxSystemConfiguration setAvailability(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAvailabilitySystemArc42 availability) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.WhiteBoxSystemConfiguration_availability, availability);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBackup_and_Recovery> selectBackup() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBackup_and_Recovery.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_backup);
  }

  public WhiteBoxSystemConfiguration setBackup(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBackup_and_Recovery> backup) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_backup, backup);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBlackbox> selectBlackboxes() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBlackbox.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_blackboxes);
  }

  public WhiteBoxSystemConfiguration setBlackboxes(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBlackbox> blackboxes) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_blackboxes, blackboxes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_chapters);
  }

  public WhiteBoxSystemConfiguration setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IConfidentiality selectConfidentialy() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IConfidentiality.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_confidentialy);
  }

  public WhiteBoxSystemConfiguration setConfidentialy(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IConfidentiality confidentialy) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_confidentialy, confidentialy);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IDeploymentSystemArc42 selectDeployment() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IDeploymentSystemArc42.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.WhiteBoxSystemConfiguration_deployment);
  }

  public WhiteBoxSystemConfiguration setDeployment(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IDeploymentSystemArc42 deployment) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.WhiteBoxSystemConfiguration_deployment, deployment);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public WhiteBoxSystemConfiguration setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IFunctionality selectFunctionality() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IFunctionality.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.WhiteBoxSystemConfiguration_functionality);
  }

  public WhiteBoxSystemConfiguration setFunctionality(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IFunctionality functionality) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.WhiteBoxSystemConfiguration_functionality, functionality);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IIntegrity selectIntegrity() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IIntegrity.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_integrity);
  }

  public WhiteBoxSystemConfiguration setIntegrity(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IIntegrity integrity) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_integrity, integrity);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IMonitoring> selectMonitoring() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IMonitoring.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_monitoring);
  }

  public WhiteBoxSystemConfiguration setMonitoring(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IMonitoring> monitoring) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_monitoring, monitoring);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph selectNoParagraphs() {
    return _getSingle(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs);
  }

  public WhiteBoxSystemConfiguration setNoParagraphs(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph noParagraphs) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs, noParagraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.INonRepudiation selectNonRepudiation() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.INonRepudiation.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_nonRepudiation);
  }

  public WhiteBoxSystemConfiguration setNonRepudiation(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.INonRepudiation nonRepudiation) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_nonRepudiation, nonRepudiation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public WhiteBoxSystemConfiguration setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public WhiteBoxSystemConfiguration setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public WhiteBoxSystemConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IUsedProduct> selectUsedProducts() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IUsedProduct.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_usedProducts);
  }

  public WhiteBoxSystemConfiguration setUsedProducts(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IUsedProduct> usedProducts) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_usedProducts, usedProducts);
    return this;
  }
    
  @Override
  public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock selectWhitebox() {
    return _getSingle(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_whitebox);
  }

  public WhiteBoxSystemConfiguration setWhitebox(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock whitebox) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_whitebox, whitebox);
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
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAccess.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_access, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAuthenticationSystemArc42.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.WhiteBoxSystemConfiguration_authn, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAutorizationSystemArc42.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.WhiteBoxSystemConfiguration_authz, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAvailabilitySystemArc42.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.WhiteBoxSystemConfiguration_availability, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBackup_and_Recovery.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_backup, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBlackbox.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_blackboxes, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_chapters, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IConfidentiality.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_confidentialy, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IDeploymentSystemArc42.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.WhiteBoxSystemConfiguration_deployment, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IFunctionality.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.WhiteBoxSystemConfiguration_functionality, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IIntegrity.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_integrity, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IMonitoring.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_monitoring, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.INonRepudiation.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_nonRepudiation, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IUsedProduct.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_usedProducts, visitor);
    _acceptSingle(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_whitebox, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IWhiteBoxSystemConfiguration selectToMeFunctionality(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IFunctionality object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IWhiteBoxSystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.WhiteBoxSystemConfiguration_functionality, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IWhiteBoxSystemConfiguration selectToMeDeployment(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IDeploymentSystemArc42 object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IWhiteBoxSystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.WhiteBoxSystemConfiguration_deployment, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IWhiteBoxSystemConfiguration selectToMeAvailability(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAvailabilitySystemArc42 object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IWhiteBoxSystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.WhiteBoxSystemConfiguration_availability, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IWhiteBoxSystemConfiguration selectToMeAuthn(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAuthenticationSystemArc42 object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IWhiteBoxSystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.WhiteBoxSystemConfiguration_authn, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IWhiteBoxSystemConfiguration selectToMeAuthz(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAutorizationSystemArc42 object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IWhiteBoxSystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.WhiteBoxSystemConfiguration_authz, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a296733a-fe57-11ea-abcb-bfad67a56d79,6NuezKS5Bt3XG5kqp+/cRG6RQj8=] */
