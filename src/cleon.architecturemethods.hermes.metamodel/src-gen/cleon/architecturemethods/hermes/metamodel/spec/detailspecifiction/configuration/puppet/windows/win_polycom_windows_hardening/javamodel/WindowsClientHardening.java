package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class WindowsClientHardening extends DynamicResource implements IWindowsClientHardening {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWindowsClientHardening> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWindowsClientHardening>() {
    
    @Override
    public IWindowsClientHardening create() {
      return new WindowsClientHardening();
    }
    
    @Override
    public IWindowsClientHardening create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new WindowsClientHardening(resourceRepository, resource);
    }
  
  };

  public WindowsClientHardening() {
    super(IWindowsClientHardening.TYPE_ID);
  }
  
  public WindowsClientHardening(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWindowsClientHardening.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectAuto_restart() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_auto_aE_restart);
  }
    
  public void setAuto_restart(java.lang.Boolean auto_restart) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_auto_aE_restart, auto_restart);
  }

  @Override
  public java.lang.Boolean selectCatalog_no_cache() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_catalog_aE_no_aE_cache);
  }
    
  public void setCatalog_no_cache(java.lang.Boolean catalog_no_cache) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_catalog_aE_no_aE_cache, catalog_no_cache);
  }

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
  public java.lang.String selectClassName() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.PuppetPackage.PuppetConfiguration_className);
  }
    
  public void setClassName(java.lang.String className) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.PuppetPackage.PuppetConfiguration_className, className);
  }

  @Override
  public java.lang.Boolean selectClear_temp_files() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_clear_aE_temp_aE_files);
  }
    
  public void setClear_temp_files(java.lang.Boolean clear_temp_files) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_clear_aE_temp_aE_files, clear_temp_files);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Boolean selectEnable_administrator() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_enable_aE_administrator);
  }
    
  public void setEnable_administrator(java.lang.Boolean enable_administrator) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_enable_aE_administrator, enable_administrator);
  }

  @Override
  public java.lang.Boolean selectEnable_remote_desktop() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_enable_aE_remote_aE_desktop);
  }
    
  public void setEnable_remote_desktop(java.lang.Boolean enable_remote_desktop) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_enable_aE_remote_aE_desktop, enable_remote_desktop);
  }

  @Override
  public java.lang.Boolean selectInclude_bitlocker() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_include_aE_bitlocker);
  }
    
  public void setInclude_bitlocker(java.lang.Boolean include_bitlocker) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_include_aE_bitlocker, include_bitlocker);
  }

  @Override
  public java.lang.Boolean selectInclude_hkcu() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_include_aE_hkcu);
  }
    
  public void setInclude_hkcu(java.lang.Boolean include_hkcu) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_include_aE_hkcu, include_hkcu);
  }

  @Override
  public java.lang.Boolean selectInclude_nextgen() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_include_aE_nextgen);
  }
    
  public void setInclude_nextgen(java.lang.Boolean include_nextgen) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_include_aE_nextgen, include_nextgen);
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

  @Override
  public java.lang.Boolean selectPerformance_powerscheme() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_performance_aE_powerscheme);
  }
    
  public void setPerformance_powerscheme(java.lang.Boolean performance_powerscheme) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_performance_aE_powerscheme, performance_powerscheme);
  }

  @Override
  public java.lang.Boolean selectPurge_unmanaged_users() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_purge_aE_unmanaged_aE_users);
  }
    
  public void setPurge_unmanaged_users(java.lang.Boolean purge_unmanaged_users) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_purge_aE_unmanaged_aE_users, purge_unmanaged_users);
  }

  @Override
  public java.lang.Boolean selectRemote_local_accounts() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_remote_aE_local_aE_accounts);
  }
    
  public void setRemote_local_accounts(java.lang.Boolean remote_local_accounts) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_remote_aE_local_aE_accounts, remote_local_accounts);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public WindowsClientHardening setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> selectDescriptionTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation);
  }

  public WindowsClientHardening setDescriptionTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> descriptionTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, descriptionTranslation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public WindowsClientHardening setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IWindowsCISEnforcementLevel selectEnforcement_level() {
    return _getSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IWindowsCISEnforcementLevel.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.AbstractWindowsHardening_enforcement_aE_level);
  }

  public WindowsClientHardening setEnforcement_level(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IWindowsCISEnforcementLevel enforcement_level) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.AbstractWindowsHardening_enforcement_aE_level, enforcement_level);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IRule> selectExcept_rules() {
    return _getList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IRule.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.AbstractWindowsHardening_except_aE_rules);
  }

  public WindowsClientHardening setExcept_rules(java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IRule> except_rules) {
    _setList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.AbstractWindowsHardening_except_aE_rules, except_rules);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration> selectExtends() {
    return _getList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.PuppetPackage.PuppetConfiguration_extends);
  }

  public WindowsClientHardening setExtends(java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration> extends_) {
    _setList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.PuppetPackage.PuppetConfiguration_extends, extends_);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public WindowsClientHardening setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public WindowsClientHardening setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IWindowsCISProfileType selectProfile_type() {
    return _getSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IWindowsCISProfileType.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.AbstractWindowsHardening_profile_aE_type);
  }

  public WindowsClientHardening setProfile_type(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IWindowsCISProfileType profile_type) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.AbstractWindowsHardening_profile_aE_type, profile_type);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IRuleSet selectRuleSet() {
    return _getSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IRuleSet.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.AbstractWindowsHardening_ruleSet);
  }

  public WindowsClientHardening setRuleSet(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IRuleSet ruleSet) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.AbstractWindowsHardening_ruleSet, ruleSet);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration selectSpecificationForSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.ConfigurationPackage.AbstractConfiguration_specificationForSystemConfiguration);
  }

  public WindowsClientHardening setSpecificationForSystemConfiguration(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration specificationForSystemConfiguration) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.ConfigurationPackage.AbstractConfiguration_specificationForSystemConfiguration, specificationForSystemConfiguration);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public WindowsClientHardening setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_auto_aE_restart, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_catalog_aE_no_aE_cache, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterLevel, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.PuppetPackage.PuppetConfiguration_className, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_clear_aE_temp_aE_files, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_enable_aE_administrator, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_enable_aE_remote_aE_desktop, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_include_aE_bitlocker, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_include_aE_hkcu, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_include_aE_nextgen, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_performance_aE_powerscheme, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_purge_aE_unmanaged_aE_users, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsClientHardening_remote_aE_local_aE_accounts, visitor);
    // relations
    _acceptMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, visitor);
    _acceptSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IWindowsCISEnforcementLevel.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.AbstractWindowsHardening_enforcement_aE_level, visitor);
    _acceptList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IRule.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.AbstractWindowsHardening_except_aE_rules, visitor);
    _acceptList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.PuppetPackage.PuppetConfiguration_extends, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IWindowsCISProfileType.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.AbstractWindowsHardening_profile_aE_type, visitor);
    _acceptSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IRuleSet.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.AbstractWindowsHardening_ruleSet, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.ConfigurationPackage.AbstractConfiguration_specificationForSystemConfiguration, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f8fdf221-5e42-11f0-a5db-972145eef50c,U54s4aPXQbCeW7OL/gg3Fep3bok=] */
