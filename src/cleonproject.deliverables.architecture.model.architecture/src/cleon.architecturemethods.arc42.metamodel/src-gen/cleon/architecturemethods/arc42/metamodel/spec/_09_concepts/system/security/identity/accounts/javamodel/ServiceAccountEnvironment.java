package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ServiceAccountEnvironment extends DynamicResource implements IServiceAccountEnvironment {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceAccountEnvironment> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceAccountEnvironment>() {
    
    @Override
    public IServiceAccountEnvironment create() {
      return new ServiceAccountEnvironment();
    }
    
    @Override
    public IServiceAccountEnvironment create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ServiceAccountEnvironment(resourceRepository, resource);
    }
  
  };

  public ServiceAccountEnvironment() {
    super(IServiceAccountEnvironment.TYPE_ID);
  }
  
  public ServiceAccountEnvironment(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IServiceAccountEnvironment.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public ServiceAccountEnvironment setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public ServiceAccountEnvironment setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public ServiceAccountEnvironment setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public ServiceAccountEnvironment setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccountEnvironmentSite> selectServiceAccountSite() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccountEnvironmentSite.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.ServiceAccountEnvironment_serviceAccountSite);
  }

  public ServiceAccountEnvironment setServiceAccountSite(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccountEnvironmentSite> serviceAccountSite) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.ServiceAccountEnvironment_serviceAccountSite, serviceAccountSite);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode selectSystemEnvironmentForAccounts() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.ServiceAccountEnvironment_systemEnvironmentForAccounts);
  }

  public ServiceAccountEnvironment setSystemEnvironmentForAccounts(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode systemEnvironmentForAccounts) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.ServiceAccountEnvironment_systemEnvironmentForAccounts, systemEnvironmentForAccounts);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ServiceAccountEnvironment setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ServiceAccountEnvironment setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
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
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccountEnvironmentSite.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.ServiceAccountEnvironment_serviceAccountSite, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.ServiceAccountEnvironment_systemEnvironmentForAccounts, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccountEnvironment> selectToMeSystemEnvironmentForAccounts(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccountEnvironment.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.ServiceAccountEnvironment_systemEnvironmentForAccounts, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccountEnvironment selectToMeServiceAccountSite(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccountEnvironmentSite object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccountEnvironment.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.ServiceAccountEnvironment_serviceAccountSite, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e0be5246-a1a0-11ea-886d-354b9ee6fb2d,wRWbrL+7fWgP7JkkhMyED/Vl/cU=] */
