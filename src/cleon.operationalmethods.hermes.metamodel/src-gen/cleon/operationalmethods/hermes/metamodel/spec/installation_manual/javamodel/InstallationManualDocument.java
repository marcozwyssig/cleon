package cleon.operationalmethods.hermes.metamodel.spec.installation_manual.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class InstallationManualDocument extends DynamicResource implements IInstallationManualDocument {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInstallationManualDocument> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInstallationManualDocument>() {
    
    @Override
    public IInstallationManualDocument create() {
      return new InstallationManualDocument();
    }
    
    @Override
    public IInstallationManualDocument create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new InstallationManualDocument(resourceRepository, resource);
    }
  
  };

  public InstallationManualDocument() {
    super(IInstallationManualDocument.TYPE_ID);
  }
  
  public InstallationManualDocument(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInstallationManualDocument.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public InstallationManualDocument setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public InstallationManualDocument setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IInstallation selectInstallation() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IInstallation.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.Installation_manualPackage.InstallationManualDocument_installation);
  }

  public InstallationManualDocument setInstallation(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IInstallation installation) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.Installation_manualPackage.InstallationManualDocument_installation, installation);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.about.javamodel.IInstallationmanualReference selectInstallationmanualReference() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.about.javamodel.IInstallationmanualReference.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.Installation_manualPackage.InstallationManualDocument_installationmanualReference);
  }

  public InstallationManualDocument setInstallationmanualReference(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.about.javamodel.IInstallationmanualReference installationmanualReference) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.Installation_manualPackage.InstallationManualDocument_installationmanualReference, installationmanualReference);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IIntroduction selectIntroduction() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IIntroduction.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.Installation_manualPackage.InstallationManualDocument_introduction);
  }

  public InstallationManualDocument setIntroduction(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IIntroduction introduction) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.Installation_manualPackage.InstallationManualDocument_introduction, introduction);
    return this;
  }
    
  @Override
  public cleon.common.language.metamodel.spec.language_settings.javamodel.ILanguageSettings selectLanguageSettings() {
    return _getSingle(cleon.common.language.metamodel.spec.language_settings.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_languageSettings);
  }

  public InstallationManualDocument setLanguageSettings(cleon.common.language.metamodel.spec.language_settings.javamodel.ILanguageSettings languageSettings) {
    _setSingle(cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_languageSettings, languageSettings);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties);
  }

  public InstallationManualDocument setProperties(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.installation_manual.reinstallation.javamodel.IReinstallation selectReinstallation() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.reinstallation.javamodel.IReinstallation.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.Installation_manualPackage.InstallationManualDocument_reinstallation);
  }

  public InstallationManualDocument setReinstallation(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.reinstallation.javamodel.IReinstallation reinstallation) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.Installation_manualPackage.InstallationManualDocument_reinstallation, reinstallation);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style);
  }

  public InstallationManualDocument setStyle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public InstallationManualDocument setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public InstallationManualDocument setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingleAttribute(java.lang.String.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_primaryLanguage, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IInstallation.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.Installation_manualPackage.InstallationManualDocument_installation, visitor);
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.about.javamodel.IInstallationmanualReference.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.Installation_manualPackage.InstallationManualDocument_installationmanualReference, visitor);
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IIntroduction.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.Installation_manualPackage.InstallationManualDocument_introduction, visitor);
    _acceptSingle(cleon.common.language.metamodel.spec.language_settings.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_languageSettings, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.reinstallation.javamodel.IReinstallation.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.Installation_manualPackage.InstallationManualDocument_reinstallation, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.operationalmethods.hermes.metamodel.spec.installation_manual.javamodel.IInstallationManualDocument selectToMeInstallationmanualReference(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.about.javamodel.IInstallationmanualReference object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.installation_manual.javamodel.IInstallationManualDocument.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.Installation_manualPackage.InstallationManualDocument_installationmanualReference, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.installation_manual.javamodel.IInstallationManualDocument selectToMeIntroduction(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IIntroduction object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.installation_manual.javamodel.IInstallationManualDocument.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.Installation_manualPackage.InstallationManualDocument_introduction, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.installation_manual.javamodel.IInstallationManualDocument selectToMeInstallation(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IInstallation object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.installation_manual.javamodel.IInstallationManualDocument.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.Installation_manualPackage.InstallationManualDocument_installation, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.installation_manual.javamodel.IInstallationManualDocument selectToMeReinstallation(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.reinstallation.javamodel.IReinstallation object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.installation_manual.javamodel.IInstallationManualDocument.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.Installation_manualPackage.InstallationManualDocument_reinstallation, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,bfe8bdf4-23b3-11e9-9073-d1012347ccc5,OzDwt21sN9u7uqNiJ3RMm1khocY=] */
