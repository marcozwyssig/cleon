package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class InstallIIS extends DynamicResource implements IInstallIIS {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInstallIIS> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInstallIIS>() {
    
    @Override
    public IInstallIIS create() {
      return new InstallIIS();
    }
    
    @Override
    public IInstallIIS create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new InstallIIS(resourceRepository, resource);
    }
  
  };

  public InstallIIS() {
    super(IInstallIIS.TYPE_ID);
  }
  
  public InstallIIS(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInstallIIS.TYPE_ID);
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
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  @Override
  public java.lang.String selectLogpath() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.Win_polycom_iisPackage.InstallIIS_logpath);
  }
    
  public void setLogpath(java.lang.String logpath) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.Win_polycom_iisPackage.InstallIIS_logpath, logpath);
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

  public InstallIIS setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> selectDescriptionTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation);
  }

  public InstallIIS setDescriptionTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> descriptionTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, descriptionTranslation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public InstallIIS setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration> selectExtends() {
    return _getList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.PuppetPackage.PuppetConfiguration_extends);
  }

  public InstallIIS setExtends(java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration> extends_) {
    _setList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.PuppetPackage.PuppetConfiguration_extends, extends_);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.javamodel.IIISPool> selectIISPools() {
    return _getList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.javamodel.IIISPool.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.Win_polycom_iisPackage.InstallIIS_iISPools);
  }

  public InstallIIS setIISPools(java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.javamodel.IIISPool> iISPools) {
    _setList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.Win_polycom_iisPackage.InstallIIS_iISPools, iISPools);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.javamodel.IIISShare> selectIISShares() {
    return _getList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.javamodel.IIISShare.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.Win_polycom_iisPackage.InstallIIS_iISShares);
  }

  public InstallIIS setIISShares(java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.javamodel.IIISShare> iISShares) {
    _setList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.Win_polycom_iisPackage.InstallIIS_iISShares, iISShares);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public InstallIIS setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public InstallIIS setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration selectSpecifictionForSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.ConfigurationPackage.AbstractConfiguration_specifictionForSystemConfiguration);
  }

  public InstallIIS setSpecifictionForSystemConfiguration(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration specifictionForSystemConfiguration) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.ConfigurationPackage.AbstractConfiguration_specifictionForSystemConfiguration, specifictionForSystemConfiguration);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public InstallIIS setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.PuppetPackage.PuppetConfiguration_className, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.Win_polycom_iisPackage.InstallIIS_logpath, visitor);
    // relations
    _acceptMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, visitor);
    _acceptList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.PuppetPackage.PuppetConfiguration_extends, visitor);
    _acceptList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.javamodel.IIISPool.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.Win_polycom_iisPackage.InstallIIS_iISPools, visitor);
    _acceptList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.javamodel.IIISShare.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.Win_polycom_iisPackage.InstallIIS_iISShares, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.ConfigurationPackage.AbstractConfiguration_specifictionForSystemConfiguration, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.javamodel.IInstallIIS selectToMeIISPools(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.javamodel.IIISPool object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.javamodel.IInstallIIS.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.Win_polycom_iisPackage.InstallIIS_iISPools, object.getResource());
  }
  
  public static cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.javamodel.IInstallIIS selectToMeIISShares(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.javamodel.IIISShare object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.javamodel.IInstallIIS.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.Win_polycom_iisPackage.InstallIIS_iISShares, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,83d10e71-115a-11f0-a4f9-b5f995a9e0fe,22fNE/eJ8EunEPi3ttDGN4eTOJg=] */
