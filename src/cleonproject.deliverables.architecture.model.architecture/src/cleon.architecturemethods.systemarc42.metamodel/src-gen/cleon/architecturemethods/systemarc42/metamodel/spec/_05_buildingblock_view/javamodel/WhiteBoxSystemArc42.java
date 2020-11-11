package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class WhiteBoxSystemArc42 extends DynamicResource implements IWhiteBoxSystemArc42 {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWhiteBoxSystemArc42> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWhiteBoxSystemArc42>() {
    
    @Override
    public IWhiteBoxSystemArc42 create() {
      return new WhiteBoxSystemArc42();
    }
    
    @Override
    public IWhiteBoxSystemArc42 create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new WhiteBoxSystemArc42(resourceRepository, resource);
    }
  
  };

  public WhiteBoxSystemArc42() {
    super(IWhiteBoxSystemArc42.TYPE_ID);
  }
  
  public WhiteBoxSystemArc42(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWhiteBoxSystemArc42.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAccess selectAccess() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAccess.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_access);
  }

  public WhiteBoxSystemArc42 setAccess(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAccess access) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_access, access);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAuditing selectAuditing() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAuditing.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_auditing);
  }

  public WhiteBoxSystemArc42 setAuditing(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAuditing auditing) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_auditing, auditing);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAuthenticationSystemArc42 selectAuthn() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAuthenticationSystemArc42.class, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.WhiteBoxSystemArc42_authn);
  }

  public WhiteBoxSystemArc42 setAuthn(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAuthenticationSystemArc42 authn) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.WhiteBoxSystemArc42_authn, authn);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAutorizationSystemArc42 selectAuthz() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAutorizationSystemArc42.class, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.WhiteBoxSystemArc42_authz);
  }

  public WhiteBoxSystemArc42 setAuthz(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAutorizationSystemArc42 authz) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.WhiteBoxSystemArc42_authz, authz);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAvailabilitySystemArc42 selectAvailability() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAvailabilitySystemArc42.class, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.WhiteBoxSystemArc42_availability);
  }

  public WhiteBoxSystemArc42 setAvailability(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAvailabilitySystemArc42 availability) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.WhiteBoxSystemArc42_availability, availability);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBackup_and_Recovery> selectBackup() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBackup_and_Recovery.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_backup);
  }

  public WhiteBoxSystemArc42 setBackup(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBackup_and_Recovery> backup) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_backup, backup);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBlackbox> selectBlackboxes() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBlackbox.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_blackboxes);
  }

  public WhiteBoxSystemArc42 setBlackboxes(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBlackbox> blackboxes) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_blackboxes, blackboxes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_chapters);
  }

  public WhiteBoxSystemArc42 setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IConfidentiality selectConfidentialy() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IConfidentiality.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_confidentialy);
  }

  public WhiteBoxSystemArc42 setConfidentialy(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IConfidentiality confidentialy) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_confidentialy, confidentialy);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IDeploymentSystemArc42 selectDeployment() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IDeploymentSystemArc42.class, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.WhiteBoxSystemArc42_deployment);
  }

  public WhiteBoxSystemArc42 setDeployment(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IDeploymentSystemArc42 deployment) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.WhiteBoxSystemArc42_deployment, deployment);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public WhiteBoxSystemArc42 setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IFunctionality selectFunctionality() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IFunctionality.class, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.WhiteBoxSystemArc42_functionality);
  }

  public WhiteBoxSystemArc42 setFunctionality(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IFunctionality functionality) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.WhiteBoxSystemArc42_functionality, functionality);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IIntegrity selectIntegrity() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IIntegrity.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_integrity);
  }

  public WhiteBoxSystemArc42 setIntegrity(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IIntegrity integrity) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_integrity, integrity);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILicencing selectLicensing() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILicencing.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_licensing);
  }

  public WhiteBoxSystemArc42 setLicensing(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILicencing licensing) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_licensing, licensing);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IMonitoring> selectMonitoring() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IMonitoring.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_monitoring);
  }

  public WhiteBoxSystemArc42 setMonitoring(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IMonitoring> monitoring) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_monitoring, monitoring);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph selectNoParagraphs() {
    return _getSingle(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs);
  }

  public WhiteBoxSystemArc42 setNoParagraphs(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph noParagraphs) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs, noParagraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public WhiteBoxSystemArc42 setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public WhiteBoxSystemArc42 setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public WhiteBoxSystemArc42 setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock selectWhitebox() {
    return _getSingle(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_whitebox);
  }

  public WhiteBoxSystemArc42 setWhitebox(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock whitebox) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_whitebox, whitebox);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAccess.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_access, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAuditing.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_auditing, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAuthenticationSystemArc42.class, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.WhiteBoxSystemArc42_authn, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAutorizationSystemArc42.class, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.WhiteBoxSystemArc42_authz, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAvailabilitySystemArc42.class, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.WhiteBoxSystemArc42_availability, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBackup_and_Recovery.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_backup, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBlackbox.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_blackboxes, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_chapters, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IConfidentiality.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_confidentialy, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IDeploymentSystemArc42.class, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.WhiteBoxSystemArc42_deployment, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IFunctionality.class, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.WhiteBoxSystemArc42_functionality, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IIntegrity.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_integrity, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILicencing.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_licensing, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IMonitoring.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_monitoring, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.Whitebox_whitebox, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IWhiteBoxSystemArc42 selectToMeFunctionality(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IFunctionality object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IWhiteBoxSystemArc42.class, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.WhiteBoxSystemArc42_functionality, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IWhiteBoxSystemArc42 selectToMeDeployment(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IDeploymentSystemArc42 object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IWhiteBoxSystemArc42.class, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.WhiteBoxSystemArc42_deployment, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IWhiteBoxSystemArc42 selectToMeAvailability(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAvailabilitySystemArc42 object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IWhiteBoxSystemArc42.class, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.WhiteBoxSystemArc42_availability, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IWhiteBoxSystemArc42 selectToMeAuthn(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAuthenticationSystemArc42 object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IWhiteBoxSystemArc42.class, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.WhiteBoxSystemArc42_authn, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IWhiteBoxSystemArc42 selectToMeAuthz(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAutorizationSystemArc42 object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IWhiteBoxSystemArc42.class, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.WhiteBoxSystemArc42_authz, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a296733a-fe57-11ea-abcb-bfad67a56d79,wIsBwBTdusMQW8R+hDzlD+P5U84=] */
