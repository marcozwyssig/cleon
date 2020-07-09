package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Level extends DynamicResource implements ILevel {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILevel> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILevel>() {
    
    @Override
    public ILevel create() {
      return new Level();
    }
    
    @Override
    public ILevel create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Level(resourceRepository, resource);
    }
  
  };

  public Level() {
    super(ILevel.TYPE_ID);
  }
  
  public Level(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ILevel.TYPE_ID);
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
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAuditing selectAuditing() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAuditing.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_auditing);
  }

  public Level setAuditing(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAuditing auditing) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_auditing, auditing);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAuthentication selectAuthn() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAuthentication.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_authn);
  }

  public Level setAuthn(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAuthentication authn) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_authn, authn);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAutorization selectAuthz() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAutorization.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_authz);
  }

  public Level setAuthz(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAutorization authz) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_authz, authz);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAvailability selectAvailability() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAvailability.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_availability);
  }

  public Level setAvailability(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAvailability availability) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_availability, availability);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBackup_and_Recovery> selectBackup() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBackup_and_Recovery.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_backup);
  }

  public Level setBackup(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBackup_and_Recovery> backup) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_backup, backup);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBlackbox> selectBlackboxes() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBlackbox.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_blackboxes);
  }

  public Level setBlackboxes(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBlackbox> blackboxes) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_blackboxes, blackboxes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_chapters);
  }

  public Level setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IConfidentiality selectConfidentialy() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IConfidentiality.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_confidentialy);
  }

  public Level setConfidentialy(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IConfidentiality confidentialy) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_confidentialy, confidentialy);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IDeployment selectDeployment() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IDeployment.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_deployment);
  }

  public Level setDeployment(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IDeployment deployment) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_deployment, deployment);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Level setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IFunctionality selectFunctionality() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IFunctionality.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_functionality);
  }

  public Level setFunctionality(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IFunctionality functionality) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_functionality, functionality);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IIntegrity selectIntegrity() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IIntegrity.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_integrity);
  }

  public Level setIntegrity(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IIntegrity integrity) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_integrity, integrity);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILicencing selectLicensing() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILicencing.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_licensing);
  }

  public Level setLicensing(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILicencing licensing) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_licensing, licensing);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IManagement selectManagement() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IManagement.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_management);
  }

  public Level setManagement(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IManagement management) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_management, management);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IMonitoring> selectMonitoring() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IMonitoring.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_monitoring);
  }

  public Level setMonitoring(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IMonitoring> monitoring) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_monitoring, monitoring);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Level setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Level setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Level setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock selectWhitebox() {
    return _getSingle(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_whitebox);
  }

  public Level setWhitebox(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock whitebox) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_whitebox, whitebox);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAuditing.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_auditing, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAuthentication.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_authn, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAutorization.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_authz, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAvailability.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_availability, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBackup_and_Recovery.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_backup, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBlackbox.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_blackboxes, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_chapters, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IConfidentiality.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_confidentialy, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IDeployment.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_deployment, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IFunctionality.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_functionality, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IIntegrity.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_integrity, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILicencing.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_licensing, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IManagement.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_management, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IMonitoring.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_monitoring, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_whitebox, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel selectToMeWhitebox(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_whitebox, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel selectToMeFunctionality(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IFunctionality object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_functionality, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel selectToMeDeployment(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IDeployment object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_deployment, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel selectToMeAvailability(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAvailability object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_availability, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel selectToMeAuthn(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAuthentication object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_authn, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel selectToMeAuthz(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAutorization object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_authz, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel selectToMeConfidentialy(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IConfidentiality object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_confidentialy, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel selectToMeIntegrity(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IIntegrity object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_integrity, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel selectToMeAuditing(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAuditing object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_auditing, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel selectToMeMonitoring(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IMonitoring object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_monitoring, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel selectToMeBackup(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBackup_and_Recovery object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_backup, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel selectToMeManagement(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IManagement object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_management, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel selectToMeLicensing(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILicencing object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_licensing, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel selectToMeChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_chapters, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel selectToMeBlackboxes(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBlackbox object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Level_blackboxes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1551fb66-2857-11e8-9af4-b7d7a3bbddc1,af5/GWhceXNphPiO7lBfsrI2Z0E=] */
