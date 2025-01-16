package cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SystemConfigurationOperation extends DynamicResource implements ISystemConfigurationOperation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemConfigurationOperation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemConfigurationOperation>() {
    
    @Override
    public ISystemConfigurationOperation create() {
      return new SystemConfigurationOperation();
    }
    
    @Override
    public ISystemConfigurationOperation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SystemConfigurationOperation(resourceRepository, resource);
    }
  
  };

  public SystemConfigurationOperation() {
    super(ISystemConfigurationOperation.TYPE_ID);
  }
  
  public SystemConfigurationOperation(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystemConfigurationOperation.TYPE_ID);
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
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.javamodel.IChangeManagementSystemConfiguration selectChangeSystemConfiguration() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.javamodel.IChangeManagementSystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.OperationPackage.SystemConfigurationOperation_changeSystemConfiguration);
  }

  public SystemConfigurationOperation setChangeSystemConfiguration(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.javamodel.IChangeManagementSystemConfiguration changeSystemConfiguration) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.OperationPackage.SystemConfigurationOperation_changeSystemConfiguration, changeSystemConfiguration);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public SystemConfigurationOperation setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IConductingAndSupervisingSystemConfiguration selectConductingAndSupervisingSystemConfiguration() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IConductingAndSupervisingSystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.OperationPackage.SystemConfigurationOperation_conductingAndSupervisingSystemConfiguration);
  }

  public SystemConfigurationOperation setConductingAndSupervisingSystemConfiguration(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IConductingAndSupervisingSystemConfiguration conductingAndSupervisingSystemConfiguration) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.OperationPackage.SystemConfigurationOperation_conductingAndSupervisingSystemConfiguration, conductingAndSupervisingSystemConfiguration);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> selectDescriptionTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation);
  }

  public SystemConfigurationOperation setDescriptionTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> descriptionTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, descriptionTranslation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public SystemConfigurationOperation setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IInterruptingSystemConfiguration selectInterruptingSystemConfiguration() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IInterruptingSystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.OperationPackage.SystemConfigurationOperation_interruptingSystemConfiguration);
  }

  public SystemConfigurationOperation setInterruptingSystemConfiguration(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IInterruptingSystemConfiguration interruptingSystemConfiguration) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.OperationPackage.SystemConfigurationOperation_interruptingSystemConfiguration, interruptingSystemConfiguration);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.ILaunchingSystemConfiguration selectLaunchingSystemConfiguration() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.ILaunchingSystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.OperationPackage.SystemConfigurationOperation_launchingSystemConfiguration);
  }

  public SystemConfigurationOperation setLaunchingSystemConfiguration(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.ILaunchingSystemConfiguration launchingSystemConfiguration) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.OperationPackage.SystemConfigurationOperation_launchingSystemConfiguration, launchingSystemConfiguration);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration selectOperatingSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.OperationPackage.SystemConfigurationOperation_operatingSystemConfiguration);
  }

  public SystemConfigurationOperation setOperatingSystemConfiguration(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration operatingSystemConfiguration) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.OperationPackage.SystemConfigurationOperation_operatingSystemConfiguration, operatingSystemConfiguration);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public SystemConfigurationOperation setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public SystemConfigurationOperation setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SystemConfigurationOperation setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.javamodel.IChangeManagementSystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.OperationPackage.SystemConfigurationOperation_changeSystemConfiguration, visitor);
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IConductingAndSupervisingSystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.OperationPackage.SystemConfigurationOperation_conductingAndSupervisingSystemConfiguration, visitor);
    _acceptMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, visitor);
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IInterruptingSystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.OperationPackage.SystemConfigurationOperation_interruptingSystemConfiguration, visitor);
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.ILaunchingSystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.OperationPackage.SystemConfigurationOperation_launchingSystemConfiguration, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.OperationPackage.SystemConfigurationOperation_operatingSystemConfiguration, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.javamodel.ISystemConfigurationOperation> selectToMeOperatingSystemConfiguration(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.javamodel.ISystemConfigurationOperation.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.OperationPackage.SystemConfigurationOperation_operatingSystemConfiguration, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.javamodel.ISystemConfigurationOperation selectToMeLaunchingSystemConfiguration(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.ILaunchingSystemConfiguration object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.javamodel.ISystemConfigurationOperation.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.OperationPackage.SystemConfigurationOperation_launchingSystemConfiguration, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.javamodel.ISystemConfigurationOperation selectToMeChangeSystemConfiguration(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.javamodel.IChangeManagementSystemConfiguration object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.javamodel.ISystemConfigurationOperation.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.OperationPackage.SystemConfigurationOperation_changeSystemConfiguration, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.javamodel.ISystemConfigurationOperation selectToMeConductingAndSupervisingSystemConfiguration(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.javamodel.IConductingAndSupervisingSystemConfiguration object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.javamodel.ISystemConfigurationOperation.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.OperationPackage.SystemConfigurationOperation_conductingAndSupervisingSystemConfiguration, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.javamodel.ISystemConfigurationOperation selectToMeInterruptingSystemConfiguration(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IInterruptingSystemConfiguration object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.javamodel.ISystemConfigurationOperation.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.OperationPackage.SystemConfigurationOperation_interruptingSystemConfiguration, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ad4d87b3-1a61-11e9-b1cd-355f2e2f05a9,AQ6Qu9tH1VtEB8GjQV7b2MUbpzM=] */
