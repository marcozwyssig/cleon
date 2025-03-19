package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscmp.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SysCmpSpecification extends DynamicResource implements ISysCmpSpecification {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISysCmpSpecification> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISysCmpSpecification>() {
    
    @Override
    public ISysCmpSpecification create() {
      return new SysCmpSpecification();
    }
    
    @Override
    public ISysCmpSpecification create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SysCmpSpecification(resourceRepository, resource);
    }
  
  };

  public SysCmpSpecification() {
    super(ISysCmpSpecification.TYPE_ID);
  }
  
  public SysCmpSpecification(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISysCmpSpecification.TYPE_ID);
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
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapterPath_noChapterPath);
  }
    
  public void setNoChapterPath(java.lang.String noChapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapterPath_noChapterPath, noChapterPath);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public SysCmpSpecification setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> selectDescriptionTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation);
  }

  public SysCmpSpecification setDescriptionTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> descriptionTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, descriptionTranslation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public SysCmpSpecification setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public SysCmpSpecification setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemcomponent.javamodel.ISystemComponent selectSpecificationForSystemComponent() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemcomponent.javamodel.ISystemComponent.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscmp.SyscmpPackage.SysCmpSpecification_specificationForSystemComponent);
  }

  public SysCmpSpecification setSpecificationForSystemComponent(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemcomponent.javamodel.ISystemComponent specificationForSystemComponent) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscmp.SyscmpPackage.SysCmpSpecification_specificationForSystemComponent, specificationForSystemComponent);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.javamodel.ISysCfgSpecification> selectSystemConfigurationSpecifications() {
    return _getMap(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.javamodel.ISysCfgSpecification.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscmp.SyscmpPackage.SysCmpSpecification_systemConfigurationSpecifications);
  }

  public SysCmpSpecification setSystemConfigurationSpecifications(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.javamodel.ISysCfgSpecification> systemConfigurationSpecifications) {
    _setMap(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscmp.SyscmpPackage.SysCmpSpecification_systemConfigurationSpecifications, systemConfigurationSpecifications);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public SysCmpSpecification setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SysCmpSpecification setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemcomponent.javamodel.ISystemComponent.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscmp.SyscmpPackage.SysCmpSpecification_specificationForSystemComponent, visitor);
    _acceptMap(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.javamodel.ISysCfgSpecification.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscmp.SyscmpPackage.SysCmpSpecification_systemConfigurationSpecifications, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscmp.javamodel.ISysCmpSpecification> selectToMeSpecificationForSystemComponent(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemcomponent.javamodel.ISystemComponent object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscmp.javamodel.ISysCmpSpecification.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscmp.SyscmpPackage.SysCmpSpecification_specificationForSystemComponent, object.getResource());
  }
  
  public static cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscmp.javamodel.ISysCmpSpecification selectToMeSystemConfigurationSpecifications(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.javamodel.ISysCfgSpecification object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscmp.javamodel.ISysCmpSpecification.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscmp.SyscmpPackage.SysCmpSpecification_systemConfigurationSpecifications, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,60d7a195-e64b-11e8-9ed8-5f22de89d1df,+GUSP3E2f6NM4ovTpLPYjL+z3sc=] */
