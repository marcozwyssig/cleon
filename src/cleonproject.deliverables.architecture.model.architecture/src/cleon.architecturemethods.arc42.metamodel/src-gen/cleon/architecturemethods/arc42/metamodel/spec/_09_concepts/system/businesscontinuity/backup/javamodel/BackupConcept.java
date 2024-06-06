package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class BackupConcept extends DynamicResource implements IBackupConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBackupConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBackupConcept>() {
    
    @Override
    public IBackupConcept create() {
      return new BackupConcept();
    }
    
    @Override
    public IBackupConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new BackupConcept(resourceRepository, resource);
    }
  
  };

  public BackupConcept() {
    super(IBackupConcept.TYPE_ID);
  }
  
  public BackupConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBackupConcept.TYPE_ID);
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

  @Override
  public java.lang.String selectNoChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapterPath);
  }
    
  public void setNoChapterPath(java.lang.String noChapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapterPath, noChapterPath);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.IBackupBuildingBlock> selectBackupBuildingBlock() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.IBackupBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupConcept_backupBuildingBlock);
  }

  public BackupConcept setBackupBuildingBlock(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.IBackupBuildingBlock> backupBuildingBlock) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupConcept_backupBuildingBlock, backupBuildingBlock);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.IBackupConfiguration> selectBackupConfiguration() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.IBackupConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupConcept_backupConfiguration);
  }

  public BackupConcept setBackupConfiguration(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.IBackupConfiguration> backupConfiguration) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupConcept_backupConfiguration, backupConfiguration);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public BackupConcept setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public BackupConcept setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public BackupConcept setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public BackupConcept setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public BackupConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.IBackupBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupConcept_backupBuildingBlock, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.IBackupConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupConcept_backupConfiguration, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.IBackupConcept selectToMeBackupConfiguration(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.IBackupConfiguration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.IBackupConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupConcept_backupConfiguration, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.IBackupConcept selectToMeBackupBuildingBlock(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.IBackupBuildingBlock object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel.IBackupConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.BackupPackage.BackupConcept_backupBuildingBlock, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ce6a4faa-0eaf-11e9-9f19-6d15636f4ecc,zMSW2ydXnx7xAuyKOg8ylm6HGwo=] */
