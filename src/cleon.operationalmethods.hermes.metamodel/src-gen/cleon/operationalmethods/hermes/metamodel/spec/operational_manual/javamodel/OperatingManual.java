package cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class OperatingManual extends DynamicResource implements IOperatingManual {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOperatingManual> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOperatingManual>() {
    
    @Override
    public IOperatingManual create() {
      return new OperatingManual();
    }
    
    @Override
    public IOperatingManual create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new OperatingManual(resourceRepository, resource);
    }
  
  };

  public OperatingManual() {
    super(IOperatingManual.TYPE_ID);
  }
  
  public OperatingManual(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOperatingManual.TYPE_ID);
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
  public java.util.List<java.lang.String> selectImgDir() {
    return _getListAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_imgDir);
  }
    
  public void setImgDir(java.util.List<java.lang.String> imgDir) {
     _setListAttribute(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_imgDir, imgDir);
  }

  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectPrimaryLanguage() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_primaryLanguage);
  }
    
  public void setPrimaryLanguage(java.lang.String primaryLanguage) {
     _setSingleAttribute(cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_primaryLanguage, primaryLanguage);
  }

  @Override
  public java.lang.Boolean selectWithToC() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_withToC);
  }
    
  public void setWithToC(java.lang.Boolean withToC) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_withToC, withToC);
  }

  // relations
  
  @Override
  public cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout selectAbout() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_about);
  }

  public OperatingManual setAbout(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout about) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_about, about);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public OperatingManual setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public OperatingManual setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.glossary.metamodel.spec.javamodel.IGlossary selectGlossary() {
    return _getSingle(cleon.common.glossary.metamodel.spec.javamodel.IGlossary.class, cleon.common.glossary.metamodel.spec.SpecPackage.GlossaryAware_glossary);
  }

  public OperatingManual setGlossary(cleon.common.glossary.metamodel.spec.javamodel.IGlossary glossary) {
    _setSingle(cleon.common.glossary.metamodel.spec.SpecPackage.GlossaryAware_glossary, glossary);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.introduction.javamodel.IIntroduction selectIntroduction() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.introduction.javamodel.IIntroduction.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_introduction);
  }

  public OperatingManual setIntroduction(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.introduction.javamodel.IIntroduction introduction) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_introduction, introduction);
    return this;
  }
    
  @Override
  public cleon.common.language.metamodel.spec.language_settings.javamodel.ILanguageSettings selectLanguageSettings() {
    return _getSingle(cleon.common.language.metamodel.spec.language_settings.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_languageSettings);
  }

  public OperatingManual setLanguageSettings(cleon.common.language.metamodel.spec.language_settings.javamodel.ILanguageSettings languageSettings) {
    _setSingle(cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_languageSettings, languageSettings);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.name.javamodel.ILanguageNameTranslation> selectNameTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.name.javamodel.ILanguageNameTranslation.class, cleon.common.language.metamodel.spec.translation.name.NamePackage.MultilingualName_nameTranslation);
  }

  public OperatingManual setNameTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.name.javamodel.ILanguageNameTranslation> nameTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.name.NamePackage.MultilingualName_nameTranslation, nameTranslation);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.javamodel.IOperation> selectOperations() {
    return _getMap(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.javamodel.IOperation.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_operations);
  }

  public OperatingManual setOperations(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.javamodel.IOperation> operations) {
    _setMap(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_operations, operations);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties);
  }

  public OperatingManual setProperties(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.coverage.javamodel.IOperationRequirementsCoverages selectRequirementsCoverage() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.coverage.javamodel.IOperationRequirementsCoverages.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_requirementsCoverage);
  }

  public OperatingManual setRequirementsCoverage(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.coverage.javamodel.IOperationRequirementsCoverages requirementsCoverage) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_requirementsCoverage, requirementsCoverage);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.safety.javamodel.ISafetyRegulations selectSafetyRegulations() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.safety.javamodel.ISafetyRegulations.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_safetyRegulations);
  }

  public OperatingManual setSafetyRegulations(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.safety.javamodel.ISafetyRegulations safetyRegulations) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_safetyRegulations, safetyRegulations);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style);
  }

  public OperatingManual setStyle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel.ISupportOrganization selectSupportOrganizsation() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel.ISupportOrganization.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_supportOrganizsation);
  }

  public OperatingManual setSupportOrganizsation(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel.ISupportOrganization supportOrganizsation) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_supportOrganizsation, supportOrganizsation);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec.javamodel.ISystemArc42Document selectSystemArchitecture() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec.javamodel.ISystemArc42Document.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_systemArchitecture);
  }

  public OperatingManual setSystemArchitecture(cleon.architecturemethods.arc42.metamodel.spec.javamodel.ISystemArc42Document systemArchitecture) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_systemArchitecture, systemArchitecture);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.systemoverview.javamodel.ISystemOverview selectSystemOverview() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.systemoverview.javamodel.ISystemOverview.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_systemOverview);
  }

  public OperatingManual setSystemOverview(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.systemoverview.javamodel.ISystemOverview systemOverview) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_systemOverview, systemOverview);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public OperatingManual setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_imgDir, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_primaryLanguage, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptSingle(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_about, visitor);
    _acceptSingle(cleon.common.glossary.metamodel.spec.javamodel.IGlossary.class, cleon.common.glossary.metamodel.spec.SpecPackage.GlossaryAware_glossary, visitor);
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.introduction.javamodel.IIntroduction.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_introduction, visitor);
    _acceptSingle(cleon.common.language.metamodel.spec.language_settings.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_languageSettings, visitor);
    _acceptMap(cleon.common.language.metamodel.spec.translation.name.javamodel.ILanguageNameTranslation.class, cleon.common.language.metamodel.spec.translation.name.NamePackage.MultilingualName_nameTranslation, visitor);
    _acceptMap(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.javamodel.IOperation.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_operations, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.coverage.javamodel.IOperationRequirementsCoverages.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_requirementsCoverage, visitor);
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.safety.javamodel.ISafetyRegulations.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_safetyRegulations, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel.ISupportOrganization.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_supportOrganizsation, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec.javamodel.ISystemArc42Document.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_systemArchitecture, visitor);
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.systemoverview.javamodel.ISystemOverview.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_systemOverview, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel.IOperatingManual selectToMeAbout(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel.IOperatingManual.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_about, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel.IOperatingManual selectToMeIntroduction(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.introduction.javamodel.IIntroduction object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel.IOperatingManual.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_introduction, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel.IOperatingManual selectToMeSystemOverview(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.systemoverview.javamodel.ISystemOverview object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel.IOperatingManual.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_systemOverview, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel.IOperatingManual selectToMeOperations(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.javamodel.IOperation object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel.IOperatingManual.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_operations, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel.IOperatingManual selectToMeSupportOrganizsation(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel.ISupportOrganization object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel.IOperatingManual.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_supportOrganizsation, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel.IOperatingManual selectToMeSafetyRegulations(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.safety.javamodel.ISafetyRegulations object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel.IOperatingManual.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_safetyRegulations, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel.IOperatingManual selectToMeRequirementsCoverage(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.coverage.javamodel.IOperationRequirementsCoverages object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel.IOperatingManual.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_requirementsCoverage, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel.IOperatingManual selectToMeSystemArchitecture(cleon.architecturemethods.arc42.metamodel.spec.javamodel.ISystemArc42Document object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel.IOperatingManual.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.Operational_manualPackage.OperatingManual_systemArchitecture, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2844dfb3-1a32-11e9-b1cd-355f2e2f05a9,l6rR8SWK1LR5iH6CwKwoP91wvHQ=] */
