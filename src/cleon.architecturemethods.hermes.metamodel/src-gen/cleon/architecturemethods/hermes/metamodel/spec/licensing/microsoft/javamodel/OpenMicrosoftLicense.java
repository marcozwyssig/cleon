package cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class OpenMicrosoftLicense extends DynamicResource implements IOpenMicrosoftLicense {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOpenMicrosoftLicense> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOpenMicrosoftLicense>() {
    
    @Override
    public IOpenMicrosoftLicense create() {
      return new OpenMicrosoftLicense();
    }
    
    @Override
    public IOpenMicrosoftLicense create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new OpenMicrosoftLicense(resourceRepository, resource);
    }
  
  };

  public OpenMicrosoftLicense() {
    super(IOpenMicrosoftLicense.TYPE_ID);
  }
  
  public OpenMicrosoftLicense(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOpenMicrosoftLicense.TYPE_ID);
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

  public OpenMicrosoftLicense setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> selectDescriptionTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation);
  }

  public OpenMicrosoftLicense setDescriptionTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> descriptionTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, descriptionTranslation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public OpenMicrosoftLicense setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IMicrosoftLicenseType selectMicrosoftLicenseType() {
    return _getSingle(cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IMicrosoftLicenseType.class, cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.MicrosoftPackage.OpenMicrosoftLicense_microsoftLicenseType);
  }

  public OpenMicrosoftLicense setMicrosoftLicenseType(cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IMicrosoftLicenseType microsoftLicenseType) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.MicrosoftPackage.OpenMicrosoftLicense_microsoftLicenseType, microsoftLicenseType);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public OpenMicrosoftLicense setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant selectProduct_variant() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant.class, cleon.architecturemethods.hermes.metamodel.spec.licensing.LicensingPackage.AbstractProductLicensing_product_aE_variant);
  }

  public OpenMicrosoftLicense setProduct_variant(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant product_variant) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.licensing.LicensingPackage.AbstractProductLicensing_product_aE_variant, product_variant);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public OpenMicrosoftLicense setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public OpenMicrosoftLicense setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, visitor);
    _acceptSingle(cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IMicrosoftLicenseType.class, cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.MicrosoftPackage.OpenMicrosoftLicense_microsoftLicenseType, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant.class, cleon.architecturemethods.hermes.metamodel.spec.licensing.LicensingPackage.AbstractProductLicensing_product_aE_variant, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IOpenMicrosoftLicense> selectToMeMicrosoftLicenseType(cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IMicrosoftLicenseType object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IOpenMicrosoftLicense.class, cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.MicrosoftPackage.OpenMicrosoftLicense_microsoftLicenseType, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a450423d-dfc1-11ef-b0be-9b4cac321140,seomn8Pr2txFszGhUgXIx/WvyuU=] */
