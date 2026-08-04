package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class BackupMethod extends DynamicResource implements IBackupMethod {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBackupMethod> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBackupMethod>() {
    
    @Override
    public IBackupMethod create() {
      return new BackupMethod();
    }
    
    @Override
    public IBackupMethod create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new BackupMethod(resourceRepository, resource);
    }
  
  };

  public BackupMethod() {
    super(IBackupMethod.TYPE_ID);
  }
  
  public BackupMethod(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBackupMethod.TYPE_ID);
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
  public java.lang.Integer selectFullBackupEvery() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupMethod_fullBackupEvery);
  }
    
  public void setFullBackupEvery(java.lang.Integer fullBackupEvery) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupMethod_fullBackupEvery, fullBackupEvery);
  }

  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
  }

  @Override
  public java.lang.Integer selectIntervalBackupEvery() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupMethod_intervalBackupEvery);
  }
    
  public void setIntervalBackupEvery(java.lang.Integer intervalBackupEvery) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupMethod_intervalBackupEvery, intervalBackupEvery);
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
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupMethod_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupMethod_name, name);
  }

  @Override
  public java.lang.String selectNoChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapterPath_noChapterPath);
  }
    
  public void setNoChapterPath(java.lang.String noChapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapterPath_noChapterPath, noChapterPath);
  }

  @Override
  public java.lang.Integer selectRetention_days() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupMethod_retention_aE_days);
  }
    
  public void setRetention_days(java.lang.Integer retention_days) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupMethod_retention_aE_days, retention_days);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public BackupMethod setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> selectDescriptionTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation);
  }

  public BackupMethod setDescriptionTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> descriptionTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, descriptionTranslation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public BackupMethod setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.name.javamodel.ILanguageNameTranslation> selectNameTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.name.javamodel.ILanguageNameTranslation.class, cleon.common.language.metamodel.spec.translation.name.NamePackage.MultilingualName_nameTranslation);
  }

  public BackupMethod setNameTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.name.javamodel.ILanguageNameTranslation> nameTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.name.NamePackage.MultilingualName_nameTranslation, nameTranslation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public BackupMethod setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.ISchedule selectSchedule() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.ISchedule.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupMethod_schedule);
  }

  public BackupMethod setSchedule(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.ISchedule schedule) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupMethod_schedule, schedule);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public BackupMethod setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant selectUsingProductForBackup() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupMethod_usingProductForBackup);
  }

  public BackupMethod setUsingProductForBackup(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant usingProductForBackup) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupMethod_usingProductForBackup, usingProductForBackup);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterLevel, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupMethod_fullBackupEvery, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupMethod_intervalBackupEvery, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupMethod_name, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupMethod_retention_aE_days, visitor);
    // relations
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, visitor);
    _acceptMap(cleon.common.language.metamodel.spec.translation.name.javamodel.ILanguageNameTranslation.class, cleon.common.language.metamodel.spec.translation.name.NamePackage.MultilingualName_nameTranslation, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.ISchedule.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupMethod_schedule, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupMethod_usingProductForBackup, visitor);
  }

  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.IBackupMethod> selectToMeSchedule(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.ISchedule object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.IBackupMethod.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupMethod_schedule, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.IBackupMethod> selectToMeUsingProductForBackup(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.IBackupMethod.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupMethod_usingProductForBackup, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0713be48-1e42-11e9-865e-41ef48a95f70,nbuE2b95//Z3WNPJIkiFuFk4Rvg=] */
