package cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SystemScopeAndContext extends DynamicResource implements ISystemScopeAndContext {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemScopeAndContext> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemScopeAndContext>() {
    
    @Override
    public ISystemScopeAndContext create() {
      return new SystemScopeAndContext();
    }
    
    @Override
    public ISystemScopeAndContext create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SystemScopeAndContext(resourceRepository, resource);
    }
  
  };

  public SystemScopeAndContext() {
    super(ISystemScopeAndContext.TYPE_ID);
  }
  
  public SystemScopeAndContext(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystemScopeAndContext.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public SystemScopeAndContext setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.deployment.javamodel.IDeploymentContext selectDeploymentContext() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.deployment.javamodel.IDeploymentContext.class, cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context._03_system_scope_and_contextPackage.SystemScopeAndContext_deploymentContext);
  }

  public SystemScopeAndContext setDeploymentContext(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.deployment.javamodel.IDeploymentContext deploymentContext) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context._03_system_scope_and_contextPackage.SystemScopeAndContext_deploymentContext, deploymentContext);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> selectDescriptionTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation);
  }

  public SystemScopeAndContext setDescriptionTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> descriptionTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, descriptionTranslation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public SystemScopeAndContext setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IDomainContext selectDomainContext() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IDomainContext.class, cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context._03_system_scope_and_contextPackage.SystemScopeAndContext_domainContext);
  }

  public SystemScopeAndContext setDomainContext(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IDomainContext domainContext) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context._03_system_scope_and_contextPackage.SystemScopeAndContext_domainContext, domainContext);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public SystemScopeAndContext setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.technical.javamodel.ITechnicalContext selectTechnicalContext() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.technical.javamodel.ITechnicalContext.class, cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context._03_system_scope_and_contextPackage.SystemScopeAndContext_technicalContext);
  }

  public SystemScopeAndContext setTechnicalContext(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.technical.javamodel.ITechnicalContext technicalContext) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context._03_system_scope_and_contextPackage.SystemScopeAndContext_technicalContext, technicalContext);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SystemScopeAndContext setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.deployment.javamodel.IDeploymentContext.class, cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context._03_system_scope_and_contextPackage.SystemScopeAndContext_deploymentContext, visitor);
    _acceptMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IDomainContext.class, cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context._03_system_scope_and_contextPackage.SystemScopeAndContext_domainContext, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.technical.javamodel.ITechnicalContext.class, cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context._03_system_scope_and_contextPackage.SystemScopeAndContext_technicalContext, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.javamodel.ISystemScopeAndContext selectToMeDomainContext(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IDomainContext object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.javamodel.ISystemScopeAndContext.class, cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context._03_system_scope_and_contextPackage.SystemScopeAndContext_domainContext, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.javamodel.ISystemScopeAndContext selectToMeTechnicalContext(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.technical.javamodel.ITechnicalContext object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.javamodel.ISystemScopeAndContext.class, cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context._03_system_scope_and_contextPackage.SystemScopeAndContext_technicalContext, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.javamodel.ISystemScopeAndContext selectToMeDeploymentContext(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.deployment.javamodel.IDeploymentContext object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.javamodel.ISystemScopeAndContext.class, cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context._03_system_scope_and_contextPackage.SystemScopeAndContext_deploymentContext, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,04cf294a-ffca-11e5-bd7b-8b0acf27d441,yCh3VM79TjcBXzta/ed2NUCU5JA=] */
