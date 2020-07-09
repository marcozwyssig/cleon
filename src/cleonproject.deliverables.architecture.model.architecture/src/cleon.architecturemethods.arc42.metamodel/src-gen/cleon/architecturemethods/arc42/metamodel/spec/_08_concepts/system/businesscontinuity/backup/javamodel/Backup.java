package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Backup extends DynamicResource implements IBackup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBackup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBackup>() {
    
    @Override
    public IBackup create() {
      return new Backup();
    }
    
    @Override
    public IBackup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Backup(resourceRepository, resource);
    }
  
  };

  public Backup() {
    super(IBackup.TYPE_ID);
  }
  
  public Backup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBackup.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel.IBackupBuildingBlock> selectBackupBuildingBlock() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel.IBackupBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.BackupPackage.Backup_backupBuildingBlock);
  }

  public Backup setBackupBuildingBlock(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel.IBackupBuildingBlock> backupBuildingBlock) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.BackupPackage.Backup_backupBuildingBlock, backupBuildingBlock);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel.IBackupConfiguration> selectBackupConfiguration() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel.IBackupConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.BackupPackage.Backup_backupConfiguration);
  }

  public Backup setBackupConfiguration(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel.IBackupConfiguration> backupConfiguration) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.BackupPackage.Backup_backupConfiguration, backupConfiguration);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public Backup setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Backup setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public Backup setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Backup setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Backup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel.IBackupBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.BackupPackage.Backup_backupBuildingBlock, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel.IBackupConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.BackupPackage.Backup_backupConfiguration, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel.IBackup selectToMeBackupConfiguration(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel.IBackupConfiguration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel.IBackup.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.BackupPackage.Backup_backupConfiguration, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel.IBackup selectToMeBackupBuildingBlock(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel.IBackupBuildingBlock object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel.IBackup.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.BackupPackage.Backup_backupBuildingBlock, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ce6a4faa-0eaf-11e9-9f19-6d15636f4ecc,qvog6t4wY+g46klqeyEizbXWok8=] */
