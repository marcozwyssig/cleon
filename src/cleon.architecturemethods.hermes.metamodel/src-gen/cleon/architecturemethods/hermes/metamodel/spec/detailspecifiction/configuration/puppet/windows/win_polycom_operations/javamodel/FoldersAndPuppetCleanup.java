package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class FoldersAndPuppetCleanup extends DynamicResource implements IFoldersAndPuppetCleanup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFoldersAndPuppetCleanup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFoldersAndPuppetCleanup>() {
    
    @Override
    public IFoldersAndPuppetCleanup create() {
      return new FoldersAndPuppetCleanup();
    }
    
    @Override
    public IFoldersAndPuppetCleanup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new FoldersAndPuppetCleanup(resourceRepository, resource);
    }
  
  };

  public FoldersAndPuppetCleanup() {
    super(IFoldersAndPuppetCleanup.TYPE_ID);
  }
  
  public FoldersAndPuppetCleanup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFoldersAndPuppetCleanup.TYPE_ID);
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
  public java.lang.Integer selectMaxpstasktime() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.FoldersAndPuppetCleanup_maxpstasktime);
  }
    
  public void setMaxpstasktime(java.lang.Integer maxpstasktime) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.FoldersAndPuppetCleanup_maxpstasktime, maxpstasktime);
  }

  @Override
  public java.lang.String selectNoChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapterPath_noChapterPath);
  }
    
  public void setNoChapterPath(java.lang.String noChapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapterPath_noChapterPath, noChapterPath);
  }

  @Override
  public java.util.List<java.lang.String> selectPathtoclean() {
    return _getListAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.FoldersAndPuppetCleanup_pathtoclean);
  }
    
  public void setPathtoclean(java.util.List<java.lang.String> pathtoclean) {
     _setListAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.FoldersAndPuppetCleanup_pathtoclean, pathtoclean);
  }

  @Override
  public java.lang.Integer selectPuppetCacheLimitInMBytes() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.FoldersAndPuppetCleanup_puppetCacheLimitInMBytes);
  }
    
  public void setPuppetCacheLimitInMBytes(java.lang.Integer puppetCacheLimitInMBytes) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.FoldersAndPuppetCleanup_puppetCacheLimitInMBytes, puppetCacheLimitInMBytes);
  }

  @Override
  public java.lang.Integer selectPuppetStuckAfterMinutes() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.FoldersAndPuppetCleanup_puppetStuckAfterMinutes);
  }
    
  public void setPuppetStuckAfterMinutes(java.lang.Integer puppetStuckAfterMinutes) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.FoldersAndPuppetCleanup_puppetStuckAfterMinutes, puppetStuckAfterMinutes);
  }

  @Override
  public java.lang.Integer selectPuppetWaitMinutes() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.FoldersAndPuppetCleanup_puppetWaitMinutes);
  }
    
  public void setPuppetWaitMinutes(java.lang.Integer puppetWaitMinutes) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.FoldersAndPuppetCleanup_puppetWaitMinutes, puppetWaitMinutes);
  }

  @Override
  public java.lang.String selectStarttime() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.FoldersAndPuppetCleanup_starttime);
  }
    
  public void setStarttime(java.lang.String starttime) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.FoldersAndPuppetCleanup_starttime, starttime);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public FoldersAndPuppetCleanup setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> selectDescriptionTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation);
  }

  public FoldersAndPuppetCleanup setDescriptionTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> descriptionTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, descriptionTranslation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public FoldersAndPuppetCleanup setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration> selectExtends() {
    return _getList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.PuppetPackage.PuppetConfiguration_extends);
  }

  public FoldersAndPuppetCleanup setExtends(java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration> extends_) {
    _setList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.PuppetPackage.PuppetConfiguration_extends, extends_);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public FoldersAndPuppetCleanup setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public FoldersAndPuppetCleanup setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration selectSpecifictionForSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.ConfigurationPackage.AbstractConfiguration_specifictionForSystemConfiguration);
  }

  public FoldersAndPuppetCleanup setSpecifictionForSystemConfiguration(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration specifictionForSystemConfiguration) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.ConfigurationPackage.AbstractConfiguration_specifictionForSystemConfiguration, specifictionForSystemConfiguration);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public FoldersAndPuppetCleanup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.FoldersAndPuppetCleanup_maxpstasktime, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.FoldersAndPuppetCleanup_pathtoclean, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.FoldersAndPuppetCleanup_puppetCacheLimitInMBytes, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.FoldersAndPuppetCleanup_puppetStuckAfterMinutes, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.FoldersAndPuppetCleanup_puppetWaitMinutes, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.Win_polycom_operationsPackage.FoldersAndPuppetCleanup_starttime, visitor);
    // relations
    _acceptMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, visitor);
    _acceptList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.PuppetPackage.PuppetConfiguration_extends, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.ConfigurationPackage.AbstractConfiguration_specifictionForSystemConfiguration, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,617e5299-1b69-11f0-9c3a-8502b2fb88fb,PiIaXovplYTZ3vUyUWatlCJmZ+0=] */
