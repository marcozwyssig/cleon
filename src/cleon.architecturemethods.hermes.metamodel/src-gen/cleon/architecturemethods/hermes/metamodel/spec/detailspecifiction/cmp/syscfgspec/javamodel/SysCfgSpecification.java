package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SysCfgSpecification extends DynamicResource implements ISysCfgSpecification {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISysCfgSpecification> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISysCfgSpecification>() {
    
    @Override
    public ISysCfgSpecification create() {
      return new SysCfgSpecification();
    }
    
    @Override
    public ISysCfgSpecification create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SysCfgSpecification(resourceRepository, resource);
    }
  
  };

  public SysCfgSpecification() {
    super(ISysCfgSpecification.TYPE_ID);
  }
  
  public SysCfgSpecification(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISysCfgSpecification.TYPE_ID);
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
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.application.javamodel.ISysCfgAppCategorySpecification selectApp() {
    return _getSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.application.javamodel.ISysCfgAppCategorySpecification.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.ConfigurationPackage.AbstractSpecification_app);
  }

  public SysCfgSpecification setApp(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.application.javamodel.ISysCfgAppCategorySpecification app) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.ConfigurationPackage.AbstractSpecification_app, app);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public SysCfgSpecification setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> selectDescriptionTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation);
  }

  public SysCfgSpecification setDescriptionTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> descriptionTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, descriptionTranslation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public SysCfgSpecification setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.hardware.javamodel.ISysCfgHwCategorySpecification selectHw() {
    return _getSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.hardware.javamodel.ISysCfgHwCategorySpecification.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.ConfigurationPackage.AbstractSpecification_hw);
  }

  public SysCfgSpecification setHw(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.hardware.javamodel.ISysCfgHwCategorySpecification hw) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.ConfigurationPackage.AbstractSpecification_hw, hw);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.os.javamodel.ISysCfgOsCategorySpecification selectOs() {
    return _getSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.os.javamodel.ISysCfgOsCategorySpecification.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.ConfigurationPackage.AbstractSpecification_os);
  }

  public SysCfgSpecification setOs(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.os.javamodel.ISysCfgOsCategorySpecification os) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.ConfigurationPackage.AbstractSpecification_os, os);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public SysCfgSpecification setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration selectSpecificationForSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.SyscfgspecPackage.SysCfgSpecification_specificationForSystemConfiguration);
  }

  public SysCfgSpecification setSpecificationForSystemConfiguration(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration specificationForSystemConfiguration) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.SyscfgspecPackage.SysCfgSpecification_specificationForSystemConfiguration, specificationForSystemConfiguration);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public SysCfgSpecification setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SysCfgSpecification setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.application.javamodel.ISysCfgAppCategorySpecification.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.ConfigurationPackage.AbstractSpecification_app, visitor);
    _acceptMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, visitor);
    _acceptSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.hardware.javamodel.ISysCfgHwCategorySpecification.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.ConfigurationPackage.AbstractSpecification_hw, visitor);
    _acceptSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.os.javamodel.ISysCfgOsCategorySpecification.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.ConfigurationPackage.AbstractSpecification_os, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.SyscfgspecPackage.SysCfgSpecification_specificationForSystemConfiguration, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.javamodel.ISysCfgSpecification> selectToMeSpecificationForSystemConfiguration(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.javamodel.ISysCfgSpecification.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.SyscfgspecPackage.SysCfgSpecification_specificationForSystemConfiguration, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3f1f77e0-e64c-11e8-9ed8-5f22de89d1df,8FJo1YO3X0xBCjp/5ap8DR8iaA0=] */
