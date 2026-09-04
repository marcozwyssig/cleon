package cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ConductingAndSupervisingSystemConfiguration extends DynamicResource implements IConductingAndSupervisingSystemConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IConductingAndSupervisingSystemConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IConductingAndSupervisingSystemConfiguration>() {
    
    @Override
    public IConductingAndSupervisingSystemConfiguration create() {
      return new ConductingAndSupervisingSystemConfiguration();
    }
    
    @Override
    public IConductingAndSupervisingSystemConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ConductingAndSupervisingSystemConfiguration(resourceRepository, resource);
    }
  
  };

  public ConductingAndSupervisingSystemConfiguration() {
    super(IConductingAndSupervisingSystemConfiguration.TYPE_ID);
  }
  
  public ConductingAndSupervisingSystemConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IConductingAndSupervisingSystemConfiguration.TYPE_ID);
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

  // relations
  
  @Override
  public java.util.List<? extends cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.javamodel.IActivitySystemConfiguration> selectActivitySystemConfiguration() {
    return _getList(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.javamodel.IActivitySystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.ProcessPackage.ProcessSystemConfiguration_activitySystemConfiguration);
  }

  public ConductingAndSupervisingSystemConfiguration setActivitySystemConfiguration(java.util.List<? extends cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.javamodel.IActivitySystemConfiguration> activitySystemConfiguration) {
    _setList(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.ProcessPackage.ProcessSystemConfiguration_activitySystemConfiguration, activitySystemConfiguration);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public ConductingAndSupervisingSystemConfiguration setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IDataProtection selectDataProtection() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IDataProtection.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.ConductingPackage.ConductingAndSupervisingSystemConfiguration_dataProtection);
  }

  public ConductingAndSupervisingSystemConfiguration setDataProtection(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IDataProtection dataProtection) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.ConductingPackage.ConductingAndSupervisingSystemConfiguration_dataProtection, dataProtection);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IDataSecurity selectDataSecurity() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IDataSecurity.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.ConductingPackage.ConductingAndSupervisingSystemConfiguration_dataSecurity);
  }

  public ConductingAndSupervisingSystemConfiguration setDataSecurity(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IDataSecurity dataSecurity) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.ConductingPackage.ConductingAndSupervisingSystemConfiguration_dataSecurity, dataSecurity);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> selectDescriptionTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation);
  }

  public ConductingAndSupervisingSystemConfiguration setDescriptionTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> descriptionTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, descriptionTranslation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public ConductingAndSupervisingSystemConfiguration setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.monitoring.javamodel.IMonitoring selectMonitoring() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.monitoring.javamodel.IMonitoring.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.ConductingPackage.ConductingAndSupervisingSystemConfiguration_monitoring);
  }

  public ConductingAndSupervisingSystemConfiguration setMonitoring(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.monitoring.javamodel.IMonitoring monitoring) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.ConductingPackage.ConductingAndSupervisingSystemConfiguration_monitoring, monitoring);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph selectNoParagraphs() {
    return _getSingle(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs);
  }

  public ConductingAndSupervisingSystemConfiguration setNoParagraphs(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph noParagraphs) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs, noParagraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public ConductingAndSupervisingSystemConfiguration setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IErrorAnalysis selectProcedure() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IErrorAnalysis.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.ConductingPackage.ConductingAndSupervisingSystemConfiguration_procedure);
  }

  public ConductingAndSupervisingSystemConfiguration setProcedure(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IErrorAnalysis procedure) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.ConductingPackage.ConductingAndSupervisingSystemConfiguration_procedure, procedure);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IStatistics selectStatistics() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IStatistics.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.ConductingPackage.ConductingAndSupervisingSystemConfiguration_statistics);
  }

  public ConductingAndSupervisingSystemConfiguration setStatistics(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IStatistics statistics) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.ConductingPackage.ConductingAndSupervisingSystemConfiguration_statistics, statistics);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.supervising.javamodel.ISupervising selectSupervising() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.supervising.javamodel.ISupervising.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.ConductingPackage.ConductingAndSupervisingSystemConfiguration_supervising);
  }

  public ConductingAndSupervisingSystemConfiguration setSupervising(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.supervising.javamodel.ISupervising supervising) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.ConductingPackage.ConductingAndSupervisingSystemConfiguration_supervising, supervising);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ConductingAndSupervisingSystemConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterLevel, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IDataProtection.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.ConductingPackage.ConductingAndSupervisingSystemConfiguration_dataProtection, visitor);
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IDataSecurity.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.ConductingPackage.ConductingAndSupervisingSystemConfiguration_dataSecurity, visitor);
    _acceptMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, visitor);
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.monitoring.javamodel.IMonitoring.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.ConductingPackage.ConductingAndSupervisingSystemConfiguration_monitoring, visitor);
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IErrorAnalysis.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.ConductingPackage.ConductingAndSupervisingSystemConfiguration_procedure, visitor);
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IStatistics.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.ConductingPackage.ConductingAndSupervisingSystemConfiguration_statistics, visitor);
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.supervising.javamodel.ISupervising.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.ConductingPackage.ConductingAndSupervisingSystemConfiguration_supervising, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IConductingAndSupervisingSystemConfiguration selectToMeSupervising(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.supervising.javamodel.ISupervising object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IConductingAndSupervisingSystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.ConductingPackage.ConductingAndSupervisingSystemConfiguration_supervising, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IConductingAndSupervisingSystemConfiguration selectToMeMonitoring(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.monitoring.javamodel.IMonitoring object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IConductingAndSupervisingSystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.ConductingPackage.ConductingAndSupervisingSystemConfiguration_monitoring, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IConductingAndSupervisingSystemConfiguration selectToMeDataSecurity(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IDataSecurity object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IConductingAndSupervisingSystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.ConductingPackage.ConductingAndSupervisingSystemConfiguration_dataSecurity, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IConductingAndSupervisingSystemConfiguration selectToMeDataProtection(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IDataProtection object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IConductingAndSupervisingSystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.ConductingPackage.ConductingAndSupervisingSystemConfiguration_dataProtection, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IConductingAndSupervisingSystemConfiguration selectToMeStatistics(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IStatistics object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IConductingAndSupervisingSystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.ConductingPackage.ConductingAndSupervisingSystemConfiguration_statistics, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IConductingAndSupervisingSystemConfiguration selectToMeProcedure(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IErrorAnalysis object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IConductingAndSupervisingSystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.ConductingPackage.ConductingAndSupervisingSystemConfiguration_procedure, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7103cea2-1a63-11e9-b1cd-355f2e2f05a9,z2EroT6iSioAlDTaN5FJJTmj1eg=] */
