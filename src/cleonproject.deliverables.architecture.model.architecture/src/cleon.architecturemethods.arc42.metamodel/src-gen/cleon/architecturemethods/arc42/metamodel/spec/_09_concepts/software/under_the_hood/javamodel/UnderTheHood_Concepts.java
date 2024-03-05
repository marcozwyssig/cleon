package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.under_the_hood.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class UnderTheHood_Concepts extends DynamicResource implements IUnderTheHood_Concepts {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IUnderTheHood_Concepts> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IUnderTheHood_Concepts>() {
    
    @Override
    public IUnderTheHood_Concepts create() {
      return new UnderTheHood_Concepts();
    }
    
    @Override
    public IUnderTheHood_Concepts create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new UnderTheHood_Concepts(resourceRepository, resource);
    }
  
  };

  public UnderTheHood_Concepts() {
    super(IUnderTheHood_Concepts.TYPE_ID);
  }
  
  public UnderTheHood_Concepts(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IUnderTheHood_Concepts.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterPath);
  }
    
  public void setChapterPath(java.lang.String chapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterPath, chapterPath);
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
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public UnderTheHood_Concepts setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.javamodel.IAbstractConcept> selectConcepts() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.javamodel.IAbstractConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts._09_conceptsPackage.Concepts_concepts);
  }

  public UnderTheHood_Concepts setConcepts(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.javamodel.IAbstractConcept> concepts) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts._09_conceptsPackage.Concepts_concepts, concepts);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public UnderTheHood_Concepts setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public UnderTheHood_Concepts setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.under_the_hood.persistency_concept.javamodel.IPersistency_Concept selectPersistency_concept() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.under_the_hood.persistency_concept.javamodel.IPersistency_Concept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.under_the_hood.Under_the_hoodPackage.UnderTheHood_aE_Concepts_persistency_aE_concept);
  }

  public UnderTheHood_Concepts setPersistency_concept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.under_the_hood.persistency_concept.javamodel.IPersistency_Concept persistency_concept) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.under_the_hood.Under_the_hoodPackage.UnderTheHood_aE_Concepts_persistency_aE_concept, persistency_concept);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public UnderTheHood_Concepts setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterPath, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.javamodel.IAbstractConcept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts._09_conceptsPackage.Concepts_concepts, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.under_the_hood.persistency_concept.javamodel.IPersistency_Concept.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.under_the_hood.Under_the_hoodPackage.UnderTheHood_aE_Concepts_persistency_aE_concept, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.under_the_hood.javamodel.IUnderTheHood_Concepts selectToMePersistency_concept(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.under_the_hood.persistency_concept.javamodel.IPersistency_Concept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.under_the_hood.javamodel.IUnderTheHood_Concepts.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.under_the_hood.Under_the_hoodPackage.UnderTheHood_aE_Concepts_persistency_aE_concept, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f80c7a78-b930-11ee-a0d0-e953bcbfaeef,3+7G8Zxw8ElfVT37GcjvsseSMps=] */
