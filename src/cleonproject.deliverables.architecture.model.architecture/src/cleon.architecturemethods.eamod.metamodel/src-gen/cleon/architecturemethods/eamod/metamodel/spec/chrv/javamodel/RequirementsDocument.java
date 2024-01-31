package cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RequirementsDocument extends DynamicResource implements IRequirementsDocument {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirementsDocument> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirementsDocument>() {
    
    @Override
    public IRequirementsDocument create() {
      return new RequirementsDocument();
    }
    
    @Override
    public IRequirementsDocument create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RequirementsDocument(resourceRepository, resource);
    }
  
  };

  public RequirementsDocument() {
    super(IRequirementsDocument.TYPE_ID);
  }
  
  public RequirementsDocument(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRequirementsDocument.TYPE_ID);
  }

  // attributes
  
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
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.about.javamodel.IEAMod_About selectAbout() {
    return _getSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.about.javamodel.IEAMod_About.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_about);
  }

  public RequirementsDocument setAbout(cleon.architecturemethods.eamod.metamodel.spec.chrv.about.javamodel.IEAMod_About about) {
    _setSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_about, about);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public RequirementsDocument setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable selectDeliverable() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_deliverable);
  }

  public RequirementsDocument setDeliverable(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable deliverable) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_deliverable, deliverable);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.distinction.javamodel.IDistinctions selectDestinctions() {
    return _getSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.distinction.javamodel.IDistinctions.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_destinctions);
  }

  public RequirementsDocument setDestinctions(cleon.architecturemethods.eamod.metamodel.spec.chrv.distinction.javamodel.IDistinctions destinctions) {
    _setSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_destinctions, destinctions);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public RequirementsDocument setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.drivers.javamodel.IDrivers selectDrivers() {
    return _getSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.drivers.javamodel.IDrivers.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_drivers);
  }

  public RequirementsDocument setDrivers(cleon.architecturemethods.eamod.metamodel.spec.chrv.drivers.javamodel.IDrivers drivers) {
    _setSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_drivers, drivers);
    return this;
  }
    
  @Override
  public cleon.common.glossary.metamodel.spec.javamodel.IGlossary selectGlossary() {
    return _getSingle(cleon.common.glossary.metamodel.spec.javamodel.IGlossary.class, cleon.common.glossary.metamodel.spec.SpecPackage.GlossaryAware_glossary);
  }

  public RequirementsDocument setGlossary(cleon.common.glossary.metamodel.spec.javamodel.IGlossary glossary) {
    _setSingle(cleon.common.glossary.metamodel.spec.SpecPackage.GlossaryAware_glossary, glossary);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.goals.javamodel.IGoals selectGoals() {
    return _getSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.goals.javamodel.IGoals.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_goals);
  }

  public RequirementsDocument setGoals(cleon.architecturemethods.eamod.metamodel.spec.chrv.goals.javamodel.IGoals goals) {
    _setSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_goals, goals);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.introduction.javamodel.IIntroduction selectIntroduction() {
    return _getSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.introduction.javamodel.IIntroduction.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_introduction);
  }

  public RequirementsDocument setIntroduction(cleon.architecturemethods.eamod.metamodel.spec.chrv.introduction.javamodel.IIntroduction introduction) {
    _setSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_introduction, introduction);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel.IIssues selectIssues() {
    return _getSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel.IIssues.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_issues);
  }

  public RequirementsDocument setIssues(cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel.IIssues issues) {
    _setSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_issues, issues);
    return this;
  }
    
  @Override
  public cleon.common.language.metamodel.spec.javamodel.ILanguageSettings selectLanguageSettings() {
    return _getSingle(cleon.common.language.metamodel.spec.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.LanguageSettingsAware_languageSettings);
  }

  public RequirementsDocument setLanguageSettings(cleon.common.language.metamodel.spec.javamodel.ILanguageSettings languageSettings) {
    _setSingle(cleon.common.language.metamodel.spec.SpecPackage.LanguageSettingsAware_languageSettings, languageSettings);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.javamodel.ILanguageName> selectNames() {
    return _getMap(cleon.common.language.metamodel.spec.javamodel.ILanguageName.class, cleon.common.language.metamodel.spec.SpecPackage.MultilingualName_names);
  }

  public RequirementsDocument setNames(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.javamodel.ILanguageName> names) {
    _setMap(cleon.common.language.metamodel.spec.SpecPackage.MultilingualName_names, names);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public RequirementsDocument setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning selectPlanning() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_planning);
  }

  public RequirementsDocument setPlanning(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning planning) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_planning, planning);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.principles.javamodel.IPrinciples selectPrinciples() {
    return _getSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.principles.javamodel.IPrinciples.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_principles);
  }

  public RequirementsDocument setPrinciples(cleon.architecturemethods.eamod.metamodel.spec.chrv.principles.javamodel.IPrinciples principles) {
    _setSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_principles, principles);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties);
  }

  public RequirementsDocument setProperties(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.javamodel.IProjectSubjectArea selectRequirements() {
    return _getSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.javamodel.IProjectSubjectArea.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_requirements);
  }

  public RequirementsDocument setRequirements(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.javamodel.IProjectSubjectArea requirements) {
    _setSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_requirements, requirements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISources selectSources() {
    return _getSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISources.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_sources);
  }

  public RequirementsDocument setSources(cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISources sources) {
    _setSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_sources, sources);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.stakeholder.javamodel.IStakeholders selectStakeholders() {
    return _getSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.stakeholder.javamodel.IStakeholders.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_stakeholders);
  }

  public RequirementsDocument setStakeholders(cleon.architecturemethods.eamod.metamodel.spec.chrv.stakeholder.javamodel.IStakeholders stakeholders) {
    _setSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_stakeholders, stakeholders);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style);
  }

  public RequirementsDocument setStyle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RequirementsDocument setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_imgDir, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.about.javamodel.IEAMod_About.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_about, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_deliverable, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.distinction.javamodel.IDistinctions.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_destinctions, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.drivers.javamodel.IDrivers.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_drivers, visitor);
    _acceptSingle(cleon.common.glossary.metamodel.spec.javamodel.IGlossary.class, cleon.common.glossary.metamodel.spec.SpecPackage.GlossaryAware_glossary, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.goals.javamodel.IGoals.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_goals, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.introduction.javamodel.IIntroduction.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_introduction, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel.IIssues.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_issues, visitor);
    _acceptSingle(cleon.common.language.metamodel.spec.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.LanguageSettingsAware_languageSettings, visitor);
    _acceptMap(cleon.common.language.metamodel.spec.javamodel.ILanguageName.class, cleon.common.language.metamodel.spec.SpecPackage.MultilingualName_names, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_planning, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.principles.javamodel.IPrinciples.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_principles, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.javamodel.IProjectSubjectArea.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_requirements, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISources.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_sources, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.stakeholder.javamodel.IStakeholders.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_stakeholders, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument selectToMeAbout(cleon.architecturemethods.eamod.metamodel.spec.chrv.about.javamodel.IEAMod_About object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_about, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument selectToMeIntroduction(cleon.architecturemethods.eamod.metamodel.spec.chrv.introduction.javamodel.IIntroduction object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_introduction, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument selectToMeDrivers(cleon.architecturemethods.eamod.metamodel.spec.chrv.drivers.javamodel.IDrivers object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_drivers, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument selectToMeGoals(cleon.architecturemethods.eamod.metamodel.spec.chrv.goals.javamodel.IGoals object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_goals, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument selectToMePrinciples(cleon.architecturemethods.eamod.metamodel.spec.chrv.principles.javamodel.IPrinciples object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_principles, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument selectToMeStakeholders(cleon.architecturemethods.eamod.metamodel.spec.chrv.stakeholder.javamodel.IStakeholders object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_stakeholders, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument selectToMeRequirements(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.javamodel.IProjectSubjectArea object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_requirements, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument selectToMeDestinctions(cleon.architecturemethods.eamod.metamodel.spec.chrv.distinction.javamodel.IDistinctions object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_destinctions, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument selectToMeSources(cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISources object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_sources, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument selectToMeIssues(cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel.IIssues object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.RequirementsDocument_issues, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4bcb71bd-a950-11e5-bda2-a7fc3bd7c783,ykUsqj3qukGpfqwkDScqSfCL1HE=] */
