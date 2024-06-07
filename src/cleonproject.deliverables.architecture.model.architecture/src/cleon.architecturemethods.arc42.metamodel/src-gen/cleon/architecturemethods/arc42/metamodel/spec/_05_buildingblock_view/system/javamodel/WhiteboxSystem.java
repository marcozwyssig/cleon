package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class WhiteboxSystem extends DynamicResource implements IWhiteboxSystem {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWhiteboxSystem> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWhiteboxSystem>() {
    
    @Override
    public IWhiteboxSystem create() {
      return new WhiteboxSystem();
    }
    
    @Override
    public IWhiteboxSystem create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new WhiteboxSystem(resourceRepository, resource);
    }
  
  };

  public WhiteboxSystem() {
    super(IWhiteboxSystem.TYPE_ID);
  }
  
  public WhiteboxSystem(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWhiteboxSystem.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectNoDescriptions() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.NoDescription_NoDescriptions);
  }
    
  public void setNoDescriptions(java.lang.String noDescriptions) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.NoDescription_NoDescriptions, noDescriptions);
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

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAccess selectAccess() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAccess.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_access);
  }

  public WhiteboxSystem setAccess(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAccess access) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_access, access);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAuthentication selectAuthn() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAuthentication.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_authn);
  }

  public WhiteboxSystem setAuthn(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAuthentication authn) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_authn, authn);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAutorization selectAuthz() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAutorization.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_authz);
  }

  public WhiteboxSystem setAuthz(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAutorization authz) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_authz, authz);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAvailability selectAvailability() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAvailability.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_availability);
  }

  public WhiteboxSystem setAvailability(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAvailability availability) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_availability, availability);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBackup_and_Recovery> selectBackup() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBackup_and_Recovery.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_backup);
  }

  public WhiteboxSystem setBackup(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBackup_and_Recovery> backup) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_backup, backup);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBlackbox> selectBlackboxes() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBlackbox.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_blackboxes);
  }

  public WhiteboxSystem setBlackboxes(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBlackbox> blackboxes) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_blackboxes, blackboxes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_chapters);
  }

  public WhiteboxSystem setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IConfidentiality selectConfidentialy() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IConfidentiality.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_confidentialy);
  }

  public WhiteboxSystem setConfidentialy(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IConfidentiality confidentialy) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_confidentialy, confidentialy);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IDeployment selectDeployment() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IDeployment.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_deployment);
  }

  public WhiteboxSystem setDeployment(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IDeployment deployment) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_deployment, deployment);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public WhiteboxSystem setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IFunctionality selectFunctionality() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IFunctionality.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_functionality);
  }

  public WhiteboxSystem setFunctionality(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IFunctionality functionality) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_functionality, functionality);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IIntegrity selectIntegrity() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IIntegrity.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_integrity);
  }

  public WhiteboxSystem setIntegrity(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IIntegrity integrity) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_integrity, integrity);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IMonitoring> selectMonitoring() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IMonitoring.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_monitoring);
  }

  public WhiteboxSystem setMonitoring(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IMonitoring> monitoring) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_monitoring, monitoring);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph selectNoParagraphs() {
    return _getSingle(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs);
  }

  public WhiteboxSystem setNoParagraphs(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph noParagraphs) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs, noParagraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.INonRepudiation selectNonRepudiation() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.INonRepudiation.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_nonRepudiation);
  }

  public WhiteboxSystem setNonRepudiation(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.INonRepudiation nonRepudiation) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_nonRepudiation, nonRepudiation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public WhiteboxSystem setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public WhiteboxSystem setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public WhiteboxSystem setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IUsedProduct> selectUsedProducts() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IUsedProduct.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_usedProducts);
  }

  public WhiteboxSystem setUsedProducts(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IUsedProduct> usedProducts) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_usedProducts, usedProducts);
    return this;
  }
    
  @Override
  public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock selectWhitebox() {
    return _getSingle(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_whitebox);
  }

  public WhiteboxSystem setWhitebox(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock whitebox) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_whitebox, whitebox);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAccess.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_access, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAuthentication.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_authn, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAutorization.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_authz, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAvailability.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_availability, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBackup_and_Recovery.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_backup, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBlackbox.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_blackboxes, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_chapters, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IConfidentiality.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_confidentialy, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IDeployment.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_deployment, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IFunctionality.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_functionality, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IIntegrity.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_integrity, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IMonitoring.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_monitoring, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.INonRepudiation.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_nonRepudiation, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IUsedProduct.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_usedProducts, visitor);
    _acceptSingle(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_whitebox, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IWhiteboxSystem selectToMeFunctionality(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IFunctionality object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IWhiteboxSystem.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_functionality, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IWhiteboxSystem selectToMeDeployment(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IDeployment object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IWhiteboxSystem.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_deployment, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IWhiteboxSystem selectToMeAvailability(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAvailability object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IWhiteboxSystem.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_availability, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IWhiteboxSystem selectToMeAuthn(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAuthentication object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IWhiteboxSystem.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_authn, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IWhiteboxSystem selectToMeAuthz(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAutorization object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IWhiteboxSystem.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_authz, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IWhiteboxSystem selectToMeConfidentialy(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IConfidentiality object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IWhiteboxSystem.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_confidentialy, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IWhiteboxSystem selectToMeIntegrity(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IIntegrity object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IWhiteboxSystem.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_integrity, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IWhiteboxSystem selectToMeNonRepudiation(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.INonRepudiation object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IWhiteboxSystem.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_nonRepudiation, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IWhiteboxSystem selectToMeMonitoring(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IMonitoring object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IWhiteboxSystem.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_monitoring, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IWhiteboxSystem selectToMeBackup(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBackup_and_Recovery object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IWhiteboxSystem.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_backup, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IWhiteboxSystem selectToMeAccess(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAccess object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IWhiteboxSystem.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_access, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IWhiteboxSystem selectToMeUsedProducts(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IUsedProduct object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IWhiteboxSystem.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.SystemPackage.WhiteboxSystem_usedProducts, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1551fb66-2857-11e8-9af4-b7d7a3bbddc1,5cZbpIMPLheBUPlwVKO/H7vwSwY=] */
