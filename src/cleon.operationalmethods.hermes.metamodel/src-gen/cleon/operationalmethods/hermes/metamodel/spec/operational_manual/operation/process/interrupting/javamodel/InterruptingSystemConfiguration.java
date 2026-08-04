package cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class InterruptingSystemConfiguration extends DynamicResource implements IInterruptingSystemConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInterruptingSystemConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInterruptingSystemConfiguration>() {
    
    @Override
    public IInterruptingSystemConfiguration create() {
      return new InterruptingSystemConfiguration();
    }
    
    @Override
    public IInterruptingSystemConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new InterruptingSystemConfiguration(resourceRepository, resource);
    }
  
  };

  public InterruptingSystemConfiguration() {
    super(IInterruptingSystemConfiguration.TYPE_ID);
  }
  
  public InterruptingSystemConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInterruptingSystemConfiguration.TYPE_ID);
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
  public java.util.List<? extends cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.javamodel.IActivitySystemConfiguration> selectActivitySystemConfiguration() {
    return _getList(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.javamodel.IActivitySystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.ProcessPackage.ProcessSystemConfiguration_activitySystemConfiguration);
  }

  public InterruptingSystemConfiguration setActivitySystemConfiguration(java.util.List<? extends cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.javamodel.IActivitySystemConfiguration> activitySystemConfiguration) {
    _setList(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.ProcessPackage.ProcessSystemConfiguration_activitySystemConfiguration, activitySystemConfiguration);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public InterruptingSystemConfiguration setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IDecommissioning selectDecomminsing() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IDecommissioning.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.InterruptingPackage.InterruptingSystemConfiguration_decomminsing);
  }

  public InterruptingSystemConfiguration setDecomminsing(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IDecommissioning decomminsing) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.InterruptingPackage.InterruptingSystemConfiguration_decomminsing, decomminsing);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> selectDescriptionTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation);
  }

  public InterruptingSystemConfiguration setDescriptionTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> descriptionTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, descriptionTranslation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public InterruptingSystemConfiguration setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph selectNoParagraphs() {
    return _getSingle(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs);
  }

  public InterruptingSystemConfiguration setNoParagraphs(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph noParagraphs) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs, noParagraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public InterruptingSystemConfiguration setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IInterruptQualityAssurance selectQualityAssurance() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IInterruptQualityAssurance.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.InterruptingPackage.InterruptingSystemConfiguration_qualityAssurance);
  }

  public InterruptingSystemConfiguration setQualityAssurance(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IInterruptQualityAssurance qualityAssurance) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.InterruptingPackage.InterruptingSystemConfiguration_qualityAssurance, qualityAssurance);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IRelaunching selectRelaunching() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IRelaunching.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.InterruptingPackage.InterruptingSystemConfiguration_relaunching);
  }

  public InterruptingSystemConfiguration setRelaunching(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IRelaunching relaunching) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.InterruptingPackage.InterruptingSystemConfiguration_relaunching, relaunching);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.ISystemStop selectStop() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.ISystemStop.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.InterruptingPackage.InterruptingSystemConfiguration_stop);
  }

  public InterruptingSystemConfiguration setStop(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.ISystemStop stop) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.InterruptingPackage.InterruptingSystemConfiguration_stop, stop);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public InterruptingSystemConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IDecommissioning.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.InterruptingPackage.InterruptingSystemConfiguration_decomminsing, visitor);
    _acceptMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, visitor);
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IInterruptQualityAssurance.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.InterruptingPackage.InterruptingSystemConfiguration_qualityAssurance, visitor);
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IRelaunching.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.InterruptingPackage.InterruptingSystemConfiguration_relaunching, visitor);
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.ISystemStop.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.InterruptingPackage.InterruptingSystemConfiguration_stop, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IInterruptingSystemConfiguration selectToMeStop(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.ISystemStop object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IInterruptingSystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.InterruptingPackage.InterruptingSystemConfiguration_stop, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IInterruptingSystemConfiguration selectToMeRelaunching(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IRelaunching object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IInterruptingSystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.InterruptingPackage.InterruptingSystemConfiguration_relaunching, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IInterruptingSystemConfiguration selectToMeQualityAssurance(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IInterruptQualityAssurance object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IInterruptingSystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.InterruptingPackage.InterruptingSystemConfiguration_qualityAssurance, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IInterruptingSystemConfiguration selectToMeDecomminsing(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IDecommissioning object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.javamodel.IInterruptingSystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.interrupting.InterruptingPackage.InterruptingSystemConfiguration_decomminsing, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,859130fb-1a63-11e9-b1cd-355f2e2f05a9,u2KeaAfR4lRdinXh03dAi4IWIHQ=] */
