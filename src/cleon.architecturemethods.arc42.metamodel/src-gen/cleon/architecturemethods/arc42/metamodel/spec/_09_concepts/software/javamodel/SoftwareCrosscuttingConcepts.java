package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SoftwareCrosscuttingConcepts extends DynamicResource implements ISoftwareCrosscuttingConcepts {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISoftwareCrosscuttingConcepts> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISoftwareCrosscuttingConcepts>() {
    
    @Override
    public ISoftwareCrosscuttingConcepts create() {
      return new SoftwareCrosscuttingConcepts();
    }
    
    @Override
    public ISoftwareCrosscuttingConcepts create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SoftwareCrosscuttingConcepts(resourceRepository, resource);
    }
  
  };

  public SoftwareCrosscuttingConcepts() {
    super(ISoftwareCrosscuttingConcepts.TYPE_ID);
  }
  
  public SoftwareCrosscuttingConcepts(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISoftwareCrosscuttingConcepts.TYPE_ID);
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

  public SoftwareCrosscuttingConcepts setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.javamodel.IAbstractConcept> selectConcepts() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.javamodel.IAbstractConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts._09_conceptsPackage.CrosscuttingConcepts_concepts);
  }

  public SoftwareCrosscuttingConcepts setConcepts(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.javamodel.IAbstractConcept> concepts) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts._09_conceptsPackage.CrosscuttingConcepts_concepts, concepts);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> selectDescriptionTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation);
  }

  public SoftwareCrosscuttingConcepts setDescriptionTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> descriptionTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, descriptionTranslation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public SoftwareCrosscuttingConcepts setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.domain_concept.javamodel.IDomainModelConcept selectDomain_concepts() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.domain_concept.javamodel.IDomainModelConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.SoftwarePackage.SoftwareCrosscuttingConcepts_domain_aE_concepts);
  }

  public SoftwareCrosscuttingConcepts setDomain_concepts(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.domain_concept.javamodel.IDomainModelConcept domain_concepts) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.SoftwarePackage.SoftwareCrosscuttingConcepts_domain_aE_concepts, domain_concepts);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public SoftwareCrosscuttingConcepts setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SoftwareCrosscuttingConcepts setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.under_the_hood.javamodel.IUnderTheHood_Concepts selectUnder_the_hood_concepts() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.under_the_hood.javamodel.IUnderTheHood_Concepts.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.SoftwarePackage.SoftwareCrosscuttingConcepts_under_aE_the_aE_hood_aE_concepts);
  }

  public SoftwareCrosscuttingConcepts setUnder_the_hood_concepts(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.under_the_hood.javamodel.IUnderTheHood_Concepts under_the_hood_concepts) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.SoftwarePackage.SoftwareCrosscuttingConcepts_under_aE_the_aE_hood_aE_concepts, under_the_hood_concepts);
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
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.domain_concept.javamodel.IDomainModelConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.SoftwarePackage.SoftwareCrosscuttingConcepts_domain_aE_concepts, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.under_the_hood.javamodel.IUnderTheHood_Concepts.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.SoftwarePackage.SoftwareCrosscuttingConcepts_under_aE_the_aE_hood_aE_concepts, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.javamodel.ISoftwareCrosscuttingConcepts selectToMeDomain_concepts(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.domain_concept.javamodel.IDomainModelConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.javamodel.ISoftwareCrosscuttingConcepts.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.SoftwarePackage.SoftwareCrosscuttingConcepts_domain_aE_concepts, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.javamodel.ISoftwareCrosscuttingConcepts selectToMeUnder_the_hood_concepts(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.under_the_hood.javamodel.IUnderTheHood_Concepts object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.javamodel.ISoftwareCrosscuttingConcepts.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.SoftwarePackage.SoftwareCrosscuttingConcepts_under_aE_the_aE_hood_aE_concepts, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7bf3ff71-98fd-11ee-aa72-593773060f63,z4TL2qaC/owRLpK2HPvsKJAA2kQ=] */
