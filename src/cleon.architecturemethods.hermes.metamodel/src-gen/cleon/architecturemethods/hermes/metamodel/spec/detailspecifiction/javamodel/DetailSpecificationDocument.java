package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DetailSpecificationDocument extends DynamicResource implements IDetailSpecificationDocument {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDetailSpecificationDocument> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDetailSpecificationDocument>() {
    
    @Override
    public IDetailSpecificationDocument create() {
      return new DetailSpecificationDocument();
    }
    
    @Override
    public IDetailSpecificationDocument create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DetailSpecificationDocument(resourceRepository, resource);
    }
  
  };

  public DetailSpecificationDocument() {
    super(IDetailSpecificationDocument.TYPE_ID);
  }
  
  public DetailSpecificationDocument(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDetailSpecificationDocument.TYPE_ID);
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
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.DetailspecifictionPackage.DetailSpecificationDocument_about);
  }

  public DetailSpecificationDocument setAbout(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout about) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.DetailspecifictionPackage.DetailSpecificationDocument_about, about);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public DetailSpecificationDocument setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscmp.javamodel.IAbstractListOfSysCmpSpecifications selectComponentSpecification() {
    return _getSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscmp.javamodel.IAbstractListOfSysCmpSpecifications.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.DetailspecifictionPackage.DetailSpecificationDocument_componentSpecification);
  }

  public DetailSpecificationDocument setComponentSpecification(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscmp.javamodel.IAbstractListOfSysCmpSpecifications componentSpecification) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.DetailspecifictionPackage.DetailSpecificationDocument_componentSpecification, componentSpecification);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public DetailSpecificationDocument setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.javamodel.IEnvironment selectEnvironment() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.javamodel.IEnvironment.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.DetailspecifictionPackage.DetailSpecificationDocument_environment);
  }

  public DetailSpecificationDocument setEnvironment(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.javamodel.IEnvironment environment) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.DetailspecifictionPackage.DetailSpecificationDocument_environment, environment);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.javamodel.IEnvironmentSpecifications selectEnvironmentSpecification() {
    return _getSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.javamodel.IEnvironmentSpecifications.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.DetailspecifictionPackage.DetailSpecificationDocument_environmentSpecification);
  }

  public DetailSpecificationDocument setEnvironmentSpecification(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.javamodel.IEnvironmentSpecifications environmentSpecification) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.DetailspecifictionPackage.DetailSpecificationDocument_environmentSpecification, environmentSpecification);
    return this;
  }
    
  @Override
  public cleon.common.glossary.metamodel.spec.javamodel.IGlossary selectGlossary() {
    return _getSingle(cleon.common.glossary.metamodel.spec.javamodel.IGlossary.class, cleon.common.glossary.metamodel.spec.SpecPackage.GlossaryAware_glossary);
  }

  public DetailSpecificationDocument setGlossary(cleon.common.glossary.metamodel.spec.javamodel.IGlossary glossary) {
    _setSingle(cleon.common.glossary.metamodel.spec.SpecPackage.GlossaryAware_glossary, glossary);
    return this;
  }
    
  @Override
  public cleon.common.language.metamodel.spec.language_settings.javamodel.ILanguageSettings selectLanguageSettings() {
    return _getSingle(cleon.common.language.metamodel.spec.language_settings.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_languageSettings);
  }

  public DetailSpecificationDocument setLanguageSettings(cleon.common.language.metamodel.spec.language_settings.javamodel.ILanguageSettings languageSettings) {
    _setSingle(cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_languageSettings, languageSettings);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.name.javamodel.ILanguageNameTranslation> selectNameTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.name.javamodel.ILanguageNameTranslation.class, cleon.common.language.metamodel.spec.translation.name.NamePackage.MultilingualName_nameTranslation);
  }

  public DetailSpecificationDocument setNameTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.name.javamodel.ILanguageNameTranslation> nameTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.name.NamePackage.MultilingualName_nameTranslation, nameTranslation);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties);
  }

  public DetailSpecificationDocument setProperties(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style);
  }

  public DetailSpecificationDocument setStyle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec.javamodel.ISystemArc42Document selectSystemArchitecture() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec.javamodel.ISystemArc42Document.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.DetailspecifictionPackage.DetailSpecificationDocument_systemArchitecture);
  }

  public DetailSpecificationDocument setSystemArchitecture(cleon.architecturemethods.arc42.metamodel.spec.javamodel.ISystemArc42Document systemArchitecture) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.DetailspecifictionPackage.DetailSpecificationDocument_systemArchitecture, systemArchitecture);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DetailSpecificationDocument setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DetailSpecificationDocument setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.DetailspecifictionPackage.DetailSpecificationDocument_about, visitor);
    _acceptSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscmp.javamodel.IAbstractListOfSysCmpSpecifications.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.DetailspecifictionPackage.DetailSpecificationDocument_componentSpecification, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.javamodel.IEnvironment.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.DetailspecifictionPackage.DetailSpecificationDocument_environment, visitor);
    _acceptSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.javamodel.IEnvironmentSpecifications.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.DetailspecifictionPackage.DetailSpecificationDocument_environmentSpecification, visitor);
    _acceptSingle(cleon.common.glossary.metamodel.spec.javamodel.IGlossary.class, cleon.common.glossary.metamodel.spec.SpecPackage.GlossaryAware_glossary, visitor);
    _acceptSingle(cleon.common.language.metamodel.spec.language_settings.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_languageSettings, visitor);
    _acceptMap(cleon.common.language.metamodel.spec.translation.name.javamodel.ILanguageNameTranslation.class, cleon.common.language.metamodel.spec.translation.name.NamePackage.MultilingualName_nameTranslation, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec.javamodel.ISystemArc42Document.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.DetailspecifictionPackage.DetailSpecificationDocument_systemArchitecture, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.javamodel.IDetailSpecificationDocument selectToMeAbout(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.javamodel.IDetailSpecificationDocument.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.DetailspecifictionPackage.DetailSpecificationDocument_about, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.javamodel.IDetailSpecificationDocument> selectToMeEnvironment(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.javamodel.IEnvironment object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.javamodel.IDetailSpecificationDocument.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.DetailspecifictionPackage.DetailSpecificationDocument_environment, object.getResource());
  }
  
  public static cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.javamodel.IDetailSpecificationDocument selectToMeComponentSpecification(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscmp.javamodel.IAbstractListOfSysCmpSpecifications object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.javamodel.IDetailSpecificationDocument.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.DetailspecifictionPackage.DetailSpecificationDocument_componentSpecification, object.getResource());
  }
  
  public static cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.javamodel.IDetailSpecificationDocument selectToMeEnvironmentSpecification(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.javamodel.IEnvironmentSpecifications object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.javamodel.IDetailSpecificationDocument.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.DetailspecifictionPackage.DetailSpecificationDocument_environmentSpecification, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.javamodel.IDetailSpecificationDocument> selectToMeSystemArchitecture(cleon.architecturemethods.arc42.metamodel.spec.javamodel.ISystemArc42Document object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.javamodel.IDetailSpecificationDocument.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.DetailspecifictionPackage.DetailSpecificationDocument_systemArchitecture, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4663eec9-e64b-11e8-9ed8-5f22de89d1df,OQSk+JSzyjQEmPo0LVrwDcVqH6I=] */
