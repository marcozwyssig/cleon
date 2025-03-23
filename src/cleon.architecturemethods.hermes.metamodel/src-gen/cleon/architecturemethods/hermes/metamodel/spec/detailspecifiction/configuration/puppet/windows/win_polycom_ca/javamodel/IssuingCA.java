package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class IssuingCA extends DynamicResource implements IIssuingCA {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIssuingCA> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIssuingCA>() {
    
    @Override
    public IIssuingCA create() {
      return new IssuingCA();
    }
    
    @Override
    public IIssuingCA create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new IssuingCA(resourceRepository, resource);
    }
  
  };

  public IssuingCA() {
    super(IIssuingCA.TYPE_ID);
  }
  
  public IssuingCA(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IIssuingCA.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectCaAuditFilter() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_caAuditFilter);
  }
    
  public void setCaAuditFilter(java.lang.Integer caAuditFilter) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_caAuditFilter, caAuditFilter);
  }

  @Override
  public java.lang.String selectCaCADistinguishedNameSuffix() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_caCADistinguishedNameSuffix);
  }
    
  public void setCaCADistinguishedNameSuffix(java.lang.String caCADistinguishedNameSuffix) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_caCADistinguishedNameSuffix, caCADistinguishedNameSuffix);
  }

  @Override
  public java.lang.Integer selectCaCRLDeltaPeriodUnits_aE__aA_Days_aC_() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_caCRLDeltaPeriodUnits_aE__aA_Days_aC_);
  }
    
  public void setCaCRLDeltaPeriodUnits_aE__aA_Days_aC_(java.lang.Integer caCRLDeltaPeriodUnits_aE__aA_Days_aC_) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_caCRLDeltaPeriodUnits_aE__aA_Days_aC_, caCRLDeltaPeriodUnits_aE__aA_Days_aC_);
  }

  @Override
  public java.lang.Integer selectCaCRLPeriodUnits() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_caCRLPeriodUnits);
  }
    
  public void setCaCRLPeriodUnits(java.lang.Integer caCRLPeriodUnits) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_caCRLPeriodUnits, caCRLPeriodUnits);
  }

  @Override
  public java.lang.String selectCaCryptoProviderName() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_caCryptoProviderName);
  }
    
  public void setCaCryptoProviderName(java.lang.String caCryptoProviderName) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_caCryptoProviderName, caCryptoProviderName);
  }

  @Override
  public java.lang.Boolean selectCaExplicitIssuing() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_caExplicitIssuing);
  }
    
  public void setCaExplicitIssuing(java.lang.Boolean caExplicitIssuing) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_caExplicitIssuing, caExplicitIssuing);
  }

  @Override
  public java.lang.String selectCaHashAlgorithmName() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_caHashAlgorithmName);
  }
    
  public void setCaHashAlgorithmName(java.lang.String caHashAlgorithmName) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_caHashAlgorithmName, caHashAlgorithmName);
  }

  @Override
  public java.lang.Integer selectCaKeyLength() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_caKeyLength);
  }
    
  public void setCaKeyLength(java.lang.Integer caKeyLength) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_caKeyLength, caKeyLength);
  }

  @Override
  public java.lang.Integer selectCaValidityPeriodUnits_aE__aA_Year_aC_() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_caValidityPeriodUnits_aE__aA_Year_aC_);
  }
    
  public void setCaValidityPeriodUnits_aE__aA_Year_aC_(java.lang.Integer caValidityPeriodUnits_aE__aA_Year_aC_) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_caValidityPeriodUnits_aE__aA_Year_aC_, caValidityPeriodUnits_aE__aA_Year_aC_);
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
  public java.lang.String selectExportToUncPathCer() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_exportToUncPathCer);
  }
    
  public void setExportToUncPathCer(java.lang.String exportToUncPathCer) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_exportToUncPathCer, exportToUncPathCer);
  }

  @Override
  public java.lang.String selectExportToUncPathCrl() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_exportToUncPathCrl);
  }
    
  public void setExportToUncPathCrl(java.lang.String exportToUncPathCrl) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_exportToUncPathCrl, exportToUncPathCrl);
  }

  @Override
  public java.lang.String selectExportToUncPathCsr() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_exportToUncPathCsr);
  }
    
  public void setExportToUncPathCsr(java.lang.String exportToUncPathCsr) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_exportToUncPathCsr, exportToUncPathCsr);
  }

  @Override
  public java.lang.String selectGmsa() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_gmsa);
  }
    
  public void setGmsa(java.lang.String gmsa) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_gmsa, gmsa);
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

  @Override
  public java.lang.String selectRepeatinterval() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_repeatinterval);
  }
    
  public void setRepeatinterval(java.lang.String repeatinterval) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_repeatinterval, repeatinterval);
  }

  @Override
  public java.lang.String selectTemplateUncPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_templateUncPath);
  }
    
  public void setTemplateUncPath(java.lang.String templateUncPath) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_templateUncPath, templateUncPath);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public IssuingCA setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> selectDescriptionTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation);
  }

  public IssuingCA setDescriptionTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> descriptionTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, descriptionTranslation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public IssuingCA setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public IssuingCA setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public IssuingCA setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public IssuingCA setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_caAuditFilter, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_caCADistinguishedNameSuffix, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_caCRLDeltaPeriodUnits_aE__aA_Days_aC_, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_caCRLPeriodUnits, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_caCryptoProviderName, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_caExplicitIssuing, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_caHashAlgorithmName, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_caKeyLength, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_caValidityPeriodUnits_aE__aA_Year_aC_, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_exportToUncPathCer, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_exportToUncPathCrl, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_exportToUncPathCsr, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_gmsa, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_repeatinterval, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ca.Win_polycom_caPackage.IssuingCA_templateUncPath, visitor);
    // relations
    _acceptMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b086d6cf-04af-11f0-8e81-9be04e08660a,NAOfISAHZYfHSHxns9W6ingQ6Hc=] */
