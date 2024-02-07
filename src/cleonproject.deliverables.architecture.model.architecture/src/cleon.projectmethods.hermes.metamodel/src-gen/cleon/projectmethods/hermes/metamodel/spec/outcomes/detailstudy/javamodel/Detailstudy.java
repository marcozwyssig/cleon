package cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Detailstudy extends DynamicResource implements IDetailstudy {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDetailstudy> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDetailstudy>() {
    
    @Override
    public IDetailstudy create() {
      return new Detailstudy();
    }
    
    @Override
    public IDetailstudy create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Detailstudy(resourceRepository, resource);
    }
  
  };

  public Detailstudy() {
    super(IDetailstudy.TYPE_ID);
  }
  
  public Detailstudy(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDetailstudy.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectCurrentLanguageCode() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_currentLanguageCode);
  }
    
  public void setCurrentLanguageCode(java.lang.String currentLanguageCode) {
     _setSingleAttribute(cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_currentLanguageCode, currentLanguageCode);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
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
  public java.lang.Boolean selectWithToC() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_withToC);
  }
    
  public void setWithToC(java.lang.Boolean withToC) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_withToC, withToC);
  }

  // relations
  
  @Override
  public cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout selectAbout() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout.class, cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.AboutAware_about);
  }

  public Detailstudy setAbout(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout about) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.AboutAware_about, about);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public Detailstudy setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Detailstudy setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.javamodel.IDrivers selectDrivers() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.javamodel.IDrivers.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.DetailstudyPackage.Detailstudy_drivers);
  }

  public Detailstudy setDrivers(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.javamodel.IDrivers drivers) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.DetailstudyPackage.Detailstudy_drivers, drivers);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IEvaluations selectEvaluation() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IEvaluations.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.DetailstudyPackage.Detailstudy_evaluation);
  }

  public Detailstudy setEvaluation(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IEvaluations evaluation) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.DetailstudyPackage.Detailstudy_evaluation, evaluation);
    return this;
  }
    
  @Override
  public cleon.common.glossary.metamodel.spec.javamodel.IGlossary selectGlossary() {
    return _getSingle(cleon.common.glossary.metamodel.spec.javamodel.IGlossary.class, cleon.common.glossary.metamodel.spec.SpecPackage.GlossaryAware_glossary);
  }

  public Detailstudy setGlossary(cleon.common.glossary.metamodel.spec.javamodel.IGlossary glossary) {
    _setSingle(cleon.common.glossary.metamodel.spec.SpecPackage.GlossaryAware_glossary, glossary);
    return this;
  }
    
  @Override
  public cleon.common.language.metamodel.spec.languagesettings.javamodel.ILanguageSettings selectLanguageSettings() {
    return _getSingle(cleon.common.language.metamodel.spec.languagesettings.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_languageSettings);
  }

  public Detailstudy setLanguageSettings(cleon.common.language.metamodel.spec.languagesettings.javamodel.ILanguageSettings languageSettings) {
    _setSingle(cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_languageSettings, languageSettings);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Detailstudy setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties);
  }

  public Detailstudy setProperties(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.solutions.javamodel.ISolutions selectSolution() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.solutions.javamodel.ISolutions.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.DetailstudyPackage.Detailstudy_solution);
  }

  public Detailstudy setSolution(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.solutions.javamodel.ISolutions solution) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.DetailstudyPackage.Detailstudy_solution, solution);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style);
  }

  public Detailstudy setStyle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.name.javamodel.ILanguageNameTranslation> selectTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.name.javamodel.ILanguageNameTranslation.class, cleon.common.language.metamodel.spec.name.NamePackage.MultilingualName_translation);
  }

  public Detailstudy setTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.name.javamodel.ILanguageNameTranslation> translation) {
    _setMap(cleon.common.language.metamodel.spec.name.NamePackage.MultilingualName_translation, translation);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Detailstudy setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_currentLanguageCode, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_imgDir, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptSingle(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout.class, cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.AboutAware_about, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.javamodel.IDrivers.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.DetailstudyPackage.Detailstudy_drivers, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IEvaluations.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.DetailstudyPackage.Detailstudy_evaluation, visitor);
    _acceptSingle(cleon.common.glossary.metamodel.spec.javamodel.IGlossary.class, cleon.common.glossary.metamodel.spec.SpecPackage.GlossaryAware_glossary, visitor);
    _acceptSingle(cleon.common.language.metamodel.spec.languagesettings.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_languageSettings, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.solutions.javamodel.ISolutions.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.DetailstudyPackage.Detailstudy_solution, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style, visitor);
    _acceptMap(cleon.common.language.metamodel.spec.name.javamodel.ILanguageNameTranslation.class, cleon.common.language.metamodel.spec.name.NamePackage.MultilingualName_translation, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.javamodel.IDetailstudy selectToMeDrivers(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.javamodel.IDrivers object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.javamodel.IDetailstudy.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.DetailstudyPackage.Detailstudy_drivers, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.javamodel.IDetailstudy selectToMeSolution(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.solutions.javamodel.ISolutions object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.javamodel.IDetailstudy.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.DetailstudyPackage.Detailstudy_solution, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.javamodel.IDetailstudy selectToMeEvaluation(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IEvaluations object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.javamodel.IDetailstudy.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.DetailstudyPackage.Detailstudy_evaluation, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c647eff4-3c0e-11e5-9962-cf3035adb922,9jbvHLedMOrMR7cmZHAKLqkqsbw=] */
