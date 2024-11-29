package cleon.architecturemethods.togaf.metamodel.spec.reference.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ReferenceArc42 extends DynamicResource implements IReferenceArc42 {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IReferenceArc42> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IReferenceArc42>() {
    
    @Override
    public IReferenceArc42 create() {
      return new ReferenceArc42();
    }
    
    @Override
    public IReferenceArc42 create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ReferenceArc42(resourceRepository, resource);
    }
  
  };

  public ReferenceArc42() {
    super(IReferenceArc42.TYPE_ID);
  }
  
  public ReferenceArc42(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IReferenceArc42.TYPE_ID);
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
  public cleon.architecturemethods.togaf.metamodel.spec.reference._05_architecturebuildingblock_view.javamodel.I__V_5_aE_ArchitectureBuildingBlockView select__V_5_aE_architecturebuildingblockview() {
    return _getSingle(cleon.architecturemethods.togaf.metamodel.spec.reference._05_architecturebuildingblock_view.javamodel.I__V_5_aE_ArchitectureBuildingBlockView.class, cleon.architecturemethods.togaf.metamodel.spec.reference.ReferencePackage.ReferenceArc42___V_5_aE_architecturebuildingblockview);
  }

  public ReferenceArc42 set__V_5_aE_architecturebuildingblockview(cleon.architecturemethods.togaf.metamodel.spec.reference._05_architecturebuildingblock_view.javamodel.I__V_5_aE_ArchitectureBuildingBlockView __V_5_aE_architecturebuildingblockview) {
    _setSingle(cleon.architecturemethods.togaf.metamodel.spec.reference.ReferencePackage.ReferenceArc42___V_5_aE_architecturebuildingblockview, __V_5_aE_architecturebuildingblockview);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout selectAbout() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout.class, cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.AboutAware_about);
  }

  public ReferenceArc42 setAbout(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout about) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.AboutAware_about, about);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public ReferenceArc42 setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable selectDeliverable() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_deliverable);
  }

  public ReferenceArc42 setDeliverable(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable deliverable) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_deliverable, deliverable);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public ReferenceArc42 setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.glossary.metamodel.spec.javamodel.IGlossary selectGlossary() {
    return _getSingle(cleon.common.glossary.metamodel.spec.javamodel.IGlossary.class, cleon.common.glossary.metamodel.spec.SpecPackage.GlossaryAware_glossary);
  }

  public ReferenceArc42 setGlossary(cleon.common.glossary.metamodel.spec.javamodel.IGlossary glossary) {
    _setSingle(cleon.common.glossary.metamodel.spec.SpecPackage.GlossaryAware_glossary, glossary);
    return this;
  }
    
  @Override
  public cleon.common.language.metamodel.spec.language_settings.javamodel.ILanguageSettings selectLanguageSettings() {
    return _getSingle(cleon.common.language.metamodel.spec.language_settings.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_languageSettings);
  }

  public ReferenceArc42 setLanguageSettings(cleon.common.language.metamodel.spec.language_settings.javamodel.ILanguageSettings languageSettings) {
    _setSingle(cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_languageSettings, languageSettings);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning selectPlanning() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_planning);
  }

  public ReferenceArc42 setPlanning(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning planning) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_planning, planning);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties);
  }

  public ReferenceArc42 setProperties(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style);
  }

  public ReferenceArc42 setStyle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ReferenceArc42 setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.architecturemethods.togaf.metamodel.spec.reference._05_architecturebuildingblock_view.javamodel.I__V_5_aE_ArchitectureBuildingBlockView.class, cleon.architecturemethods.togaf.metamodel.spec.reference.ReferencePackage.ReferenceArc42___V_5_aE_architecturebuildingblockview, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout.class, cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.AboutAware_about, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_deliverable, visitor);
    _acceptSingle(cleon.common.glossary.metamodel.spec.javamodel.IGlossary.class, cleon.common.glossary.metamodel.spec.SpecPackage.GlossaryAware_glossary, visitor);
    _acceptSingle(cleon.common.language.metamodel.spec.language_settings.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_languageSettings, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_planning, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.togaf.metamodel.spec.reference.javamodel.IReferenceArc42 selectToMe__V_5_aE_architecturebuildingblockview(cleon.architecturemethods.togaf.metamodel.spec.reference._05_architecturebuildingblock_view.javamodel.I__V_5_aE_ArchitectureBuildingBlockView object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.togaf.metamodel.spec.reference.javamodel.IReferenceArc42.class, cleon.architecturemethods.togaf.metamodel.spec.reference.ReferencePackage.ReferenceArc42___V_5_aE_architecturebuildingblockview, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0813a879-2d6d-11e6-959f-d1cef44ff5fd,fz9mLz4wmG28Fxw3bnJx/i+/nCc=] */
