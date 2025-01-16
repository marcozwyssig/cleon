package cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Introduction extends DynamicResource implements IIntroduction {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIntroduction> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIntroduction>() {
    
    @Override
    public IIntroduction create() {
      return new Introduction();
    }
    
    @Override
    public IIntroduction create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Introduction(resourceRepository, resource);
    }
  
  };

  public Introduction() {
    super(IIntroduction.TYPE_ID);
  }
  
  public Introduction(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IIntroduction.TYPE_ID);
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
  public cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IAudience selectAudience() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IAudience.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.IntroductionPackage.Introduction_audience);
  }

  public Introduction setAudience(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IAudience audience) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.IntroductionPackage.Introduction_audience, audience);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public Introduction setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> selectDescriptionTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation);
  }

  public Introduction setDescriptionTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> descriptionTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, descriptionTranslation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Introduction setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Introduction setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IPrerequisites selectPrerequisites() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IPrerequisites.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.IntroductionPackage.Introduction_prerequisites);
  }

  public Introduction setPrerequisites(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IPrerequisites prerequisites) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.IntroductionPackage.Introduction_prerequisites, prerequisites);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IPurpose selectPurpose() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IPurpose.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.IntroductionPackage.Introduction_purpose);
  }

  public Introduction setPurpose(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IPurpose purpose) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.IntroductionPackage.Introduction_purpose, purpose);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IRemarks selectRemarks() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IRemarks.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.IntroductionPackage.Introduction_remarks);
  }

  public Introduction setRemarks(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IRemarks remarks) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.IntroductionPackage.Introduction_remarks, remarks);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Introduction setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IAudience.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.IntroductionPackage.Introduction_audience, visitor);
    _acceptMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IPrerequisites.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.IntroductionPackage.Introduction_prerequisites, visitor);
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IPurpose.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.IntroductionPackage.Introduction_purpose, visitor);
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IRemarks.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.IntroductionPackage.Introduction_remarks, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IIntroduction selectToMePurpose(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IPurpose object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IIntroduction.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.IntroductionPackage.Introduction_purpose, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IIntroduction selectToMeAudience(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IAudience object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IIntroduction.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.IntroductionPackage.Introduction_audience, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IIntroduction selectToMePrerequisites(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IPrerequisites object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IIntroduction.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.IntroductionPackage.Introduction_prerequisites, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IIntroduction selectToMeRemarks(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IRemarks object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IIntroduction.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.IntroductionPackage.Introduction_remarks, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e8bad899-23b6-11e9-81dc-3f1abd72aee7,yvienNSjqDnSitaqK8jj+9Iu274=] */
