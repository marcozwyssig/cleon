package cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class LaunchingSystemConfiguration extends DynamicResource implements ILaunchingSystemConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILaunchingSystemConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILaunchingSystemConfiguration>() {
    
    @Override
    public ILaunchingSystemConfiguration create() {
      return new LaunchingSystemConfiguration();
    }
    
    @Override
    public ILaunchingSystemConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new LaunchingSystemConfiguration(resourceRepository, resource);
    }
  
  };

  public LaunchingSystemConfiguration() {
    super(ILaunchingSystemConfiguration.TYPE_ID);
  }
  
  public LaunchingSystemConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ILaunchingSystemConfiguration.TYPE_ID);
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
  public java.util.List<? extends cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.javamodel.IActivitySystemConfiguration> selectActivitySystemConfiguration() {
    return _getList(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.javamodel.IActivitySystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.ProcessPackage.ProcessSystemConfiguration_activitySystemConfiguration);
  }

  public LaunchingSystemConfiguration setActivitySystemConfiguration(java.util.List<? extends cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.javamodel.IActivitySystemConfiguration> activitySystemConfiguration) {
    _setList(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.ProcessPackage.ProcessSystemConfiguration_activitySystemConfiguration, activitySystemConfiguration);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public LaunchingSystemConfiguration setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> selectDescriptionTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation);
  }

  public LaunchingSystemConfiguration setDescriptionTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> descriptionTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, descriptionTranslation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public LaunchingSystemConfiguration setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.ILaunching selectLaunching() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.ILaunching.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.LaunchingPackage.LaunchingSystemConfiguration_launching);
  }

  public LaunchingSystemConfiguration setLaunching(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.ILaunching launching) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.LaunchingPackage.LaunchingSystemConfiguration_launching, launching);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph selectNoParagraphs() {
    return _getSingle(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs);
  }

  public LaunchingSystemConfiguration setNoParagraphs(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph noParagraphs) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs, noParagraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public LaunchingSystemConfiguration setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.IPreqrequisites selectPreqrequisites() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.IPreqrequisites.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.LaunchingPackage.LaunchingSystemConfiguration_preqrequisites);
  }

  public LaunchingSystemConfiguration setPreqrequisites(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.IPreqrequisites preqrequisites) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.LaunchingPackage.LaunchingSystemConfiguration_preqrequisites, preqrequisites);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.ILaunchingQualityAssurance selectQualityAssurance() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.ILaunchingQualityAssurance.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.LaunchingPackage.LaunchingSystemConfiguration_qualityAssurance);
  }

  public LaunchingSystemConfiguration setQualityAssurance(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.ILaunchingQualityAssurance qualityAssurance) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.LaunchingPackage.LaunchingSystemConfiguration_qualityAssurance, qualityAssurance);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.IRequirementsSystemAcceptance selectRequirements() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.IRequirementsSystemAcceptance.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.LaunchingPackage.LaunchingSystemConfiguration_requirements);
  }

  public LaunchingSystemConfiguration setRequirements(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.IRequirementsSystemAcceptance requirements) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.LaunchingPackage.LaunchingSystemConfiguration_requirements, requirements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public LaunchingSystemConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, visitor);
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.ILaunching.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.LaunchingPackage.LaunchingSystemConfiguration_launching, visitor);
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.IPreqrequisites.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.LaunchingPackage.LaunchingSystemConfiguration_preqrequisites, visitor);
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.ILaunchingQualityAssurance.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.LaunchingPackage.LaunchingSystemConfiguration_qualityAssurance, visitor);
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.IRequirementsSystemAcceptance.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.LaunchingPackage.LaunchingSystemConfiguration_requirements, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.ILaunchingSystemConfiguration selectToMePreqrequisites(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.IPreqrequisites object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.ILaunchingSystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.LaunchingPackage.LaunchingSystemConfiguration_preqrequisites, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.ILaunchingSystemConfiguration selectToMeLaunching(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.ILaunching object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.ILaunchingSystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.LaunchingPackage.LaunchingSystemConfiguration_launching, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.ILaunchingSystemConfiguration selectToMeQualityAssurance(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.ILaunchingQualityAssurance object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.ILaunchingSystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.LaunchingPackage.LaunchingSystemConfiguration_qualityAssurance, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.ILaunchingSystemConfiguration selectToMeRequirements(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.IRequirementsSystemAcceptance object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.javamodel.ILaunchingSystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.launching.LaunchingPackage.LaunchingSystemConfiguration_requirements, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,68435c3e-1a63-11e9-b1cd-355f2e2f05a9,yg1FJM+W2ZHtCw4539+gK11oXq8=] */
