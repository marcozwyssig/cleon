package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_git.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class GitLab extends DynamicResource implements IGitLab {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGitLab> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGitLab>() {
    
    @Override
    public IGitLab create() {
      return new GitLab();
    }
    
    @Override
    public IGitLab create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new GitLab(resourceRepository, resource);
    }
  
  };

  public GitLab() {
    super(IGitLab.TYPE_ID);
  }
  
  public GitLab(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IGitLab.TYPE_ID);
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
  public java.lang.String selectClassName() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.PuppetPackage.PuppetConfiguration_className);
  }
    
  public void setClassName(java.lang.String className) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.PuppetPackage.PuppetConfiguration_className, className);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectExternal_url() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_git.Lin_polycom_gitPackage.GitLab_external_aE_url);
  }
    
  public void setExternal_url(java.lang.String external_url) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_git.Lin_polycom_gitPackage.GitLab_external_aE_url, external_url);
  }

  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  @Override
  public java.lang.Boolean selectLetsencrypt_enable() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_git.Lin_polycom_gitPackage.GitLab_letsencrypt_aE_enable);
  }
    
  public void setLetsencrypt_enable(java.lang.Boolean letsencrypt_enable) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_git.Lin_polycom_gitPackage.GitLab_letsencrypt_aE_enable, letsencrypt_enable);
  }

  @Override
  public java.lang.String selectManage_upstream_edition() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_git.Lin_polycom_gitPackage.GitLab_manage_aE_upstream_aE_edition);
  }
    
  public void setManage_upstream_edition(java.lang.String manage_upstream_edition) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_git.Lin_polycom_gitPackage.GitLab_manage_aE_upstream_aE_edition, manage_upstream_edition);
  }

  @Override
  public java.lang.Boolean selectNginx_redirect_http_to_https() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_git.Lin_polycom_gitPackage.GitLab_nginx_aE_redirect_aE_http_aE_to_aE_https);
  }
    
  public void setNginx_redirect_http_to_https(java.lang.Boolean nginx_redirect_http_to_https) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_git.Lin_polycom_gitPackage.GitLab_nginx_aE_redirect_aE_http_aE_to_aE_https, nginx_redirect_http_to_https);
  }

  @Override
  public java.lang.String selectNoChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapterPath_noChapterPath);
  }
    
  public void setNoChapterPath(java.lang.String noChapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapterPath_noChapterPath, noChapterPath);
  }

  @Override
  public java.lang.String selectPackage_name() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_git.Lin_polycom_gitPackage.GitLab_package_aE_name);
  }
    
  public void setPackage_name(java.lang.String package_name) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_git.Lin_polycom_gitPackage.GitLab_package_aE_name, package_name);
  }

  @Override
  public java.lang.Boolean selectPrometheus_monitoring_enable() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_git.Lin_polycom_gitPackage.GitLab_prometheus_aE_monitoring_aE_enable);
  }
    
  public void setPrometheus_monitoring_enable(java.lang.Boolean prometheus_monitoring_enable) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_git.Lin_polycom_gitPackage.GitLab_prometheus_aE_monitoring_aE_enable, prometheus_monitoring_enable);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public GitLab setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> selectDescriptionTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation);
  }

  public GitLab setDescriptionTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> descriptionTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, descriptionTranslation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public GitLab setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration> selectExtends() {
    return _getList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.PuppetPackage.PuppetConfiguration_extends);
  }

  public GitLab setExtends(java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration> extends_) {
    _setList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.PuppetPackage.PuppetConfiguration_extends, extends_);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost selectGitlab_host() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_git.Lin_polycom_gitPackage.GitLab_gitlab_aE_host);
  }

  public GitLab setGitlab_host(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost gitlab_host) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_git.Lin_polycom_gitPackage.GitLab_gitlab_aE_host, gitlab_host);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public GitLab setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public GitLab setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration selectSpecificationForSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.ConfigurationPackage.AbstractConfiguration_specificationForSystemConfiguration);
  }

  public GitLab setSpecificationForSystemConfiguration(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration specificationForSystemConfiguration) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.ConfigurationPackage.AbstractConfiguration_specificationForSystemConfiguration, specificationForSystemConfiguration);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public GitLab setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.PuppetPackage.PuppetConfiguration_className, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_git.Lin_polycom_gitPackage.GitLab_external_aE_url, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_git.Lin_polycom_gitPackage.GitLab_letsencrypt_aE_enable, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_git.Lin_polycom_gitPackage.GitLab_manage_aE_upstream_aE_edition, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_git.Lin_polycom_gitPackage.GitLab_nginx_aE_redirect_aE_http_aE_to_aE_https, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_git.Lin_polycom_gitPackage.GitLab_package_aE_name, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_git.Lin_polycom_gitPackage.GitLab_prometheus_aE_monitoring_aE_enable, visitor);
    // relations
    _acceptMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, visitor);
    _acceptList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.PuppetPackage.PuppetConfiguration_extends, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_git.Lin_polycom_gitPackage.GitLab_gitlab_aE_host, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.ConfigurationPackage.AbstractConfiguration_specificationForSystemConfiguration, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_git.javamodel.IGitLab> selectToMeGitlab_host(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_git.javamodel.IGitLab.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_git.Lin_polycom_gitPackage.GitLab_gitlab_aE_host, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1ccfe941-ba46-11f0-9349-73cfbb54b949,OpnzZkyDYs4qMAdMYgpR+2d8xeo=] */
