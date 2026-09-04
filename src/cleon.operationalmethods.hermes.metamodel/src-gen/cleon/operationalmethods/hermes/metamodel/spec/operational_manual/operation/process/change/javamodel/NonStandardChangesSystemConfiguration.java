package cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NonStandardChangesSystemConfiguration extends DynamicResource implements INonStandardChangesSystemConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INonStandardChangesSystemConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INonStandardChangesSystemConfiguration>() {
    
    @Override
    public INonStandardChangesSystemConfiguration create() {
      return new NonStandardChangesSystemConfiguration();
    }
    
    @Override
    public INonStandardChangesSystemConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NonStandardChangesSystemConfiguration(resourceRepository, resource);
    }
  
  };

  public NonStandardChangesSystemConfiguration() {
    super(INonStandardChangesSystemConfiguration.TYPE_ID);
  }
  
  public NonStandardChangesSystemConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INonStandardChangesSystemConfiguration.TYPE_ID);
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
  public java.util.List<? extends cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.javamodel.IChanges> selectChanges() {
    return _getList(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.javamodel.IChanges.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.ChangePackage.ChangesSystemConfiguration_changes);
  }

  public NonStandardChangesSystemConfiguration setChanges(java.util.List<? extends cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.javamodel.IChanges> changes) {
    _setList(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.ChangePackage.ChangesSystemConfiguration_changes, changes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public NonStandardChangesSystemConfiguration setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> selectDescriptionTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation);
  }

  public NonStandardChangesSystemConfiguration setDescriptionTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> descriptionTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, descriptionTranslation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public NonStandardChangesSystemConfiguration setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.javamodel.INonStandardChanges> selectNonStandardChanges() {
    return _getList(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.javamodel.INonStandardChanges.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.ChangePackage.NonStandardChangesSystemConfiguration_nonStandardChanges);
  }

  public NonStandardChangesSystemConfiguration setNonStandardChanges(java.util.List<? extends cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.javamodel.INonStandardChanges> nonStandardChanges) {
    _setList(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.ChangePackage.NonStandardChangesSystemConfiguration_nonStandardChanges, nonStandardChanges);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public NonStandardChangesSystemConfiguration setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NonStandardChangesSystemConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, visitor);
    _acceptList(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.javamodel.INonStandardChanges.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.ChangePackage.NonStandardChangesSystemConfiguration_nonStandardChanges, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.javamodel.INonStandardChangesSystemConfiguration selectToMeNonStandardChanges(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.javamodel.INonStandardChanges object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.javamodel.INonStandardChangesSystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.ChangePackage.NonStandardChangesSystemConfiguration_nonStandardChanges, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f2fe9b30-1b26-11e9-ad9a-a143a9cb74e7,2xuvZvQ+qMzZ26zN1B6RmtzHUnI=] */
