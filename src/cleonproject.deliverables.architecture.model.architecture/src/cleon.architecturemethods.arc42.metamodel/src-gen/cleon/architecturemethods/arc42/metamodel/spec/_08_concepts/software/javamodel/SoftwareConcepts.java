package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SoftwareConcepts extends DynamicResource implements ISoftwareConcepts {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISoftwareConcepts> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISoftwareConcepts>() {
    
    @Override
    public ISoftwareConcepts create() {
      return new SoftwareConcepts();
    }
    
    @Override
    public ISoftwareConcepts create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SoftwareConcepts(resourceRepository, resource);
    }
  
  };

  public SoftwareConcepts() {
    super(ISoftwareConcepts.TYPE_ID);
  }
  
  public SoftwareConcepts(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISoftwareConcepts.TYPE_ID);
  }

  // attributes
  
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

  public SoftwareConcepts setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_concepts.javamodel.IConcept> selectConcepts() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.javamodel.IConcept.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts._08_conceptsPackage.Concepts_concepts);
  }

  public SoftwareConcepts setConcepts(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_concepts.javamodel.IConcept> concepts) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._08_concepts._08_conceptsPackage.Concepts_concepts, concepts);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.javamodel.IDDD_Concept selectDdd() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.javamodel.IDDD_Concept.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.SoftwarePackage.SoftwareConcepts_ddd);
  }

  public SoftwareConcepts setDdd(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.javamodel.IDDD_Concept ddd) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.SoftwarePackage.SoftwareConcepts_ddd, ddd);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public SoftwareConcepts setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public SoftwareConcepts setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SoftwareConcepts setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.javamodel.IDDD_Concept.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.SoftwarePackage.SoftwareConcepts_ddd, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.javamodel.ISoftwareConcepts selectToMeDdd(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.ddd.javamodel.IDDD_Concept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.javamodel.ISoftwareConcepts.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.SoftwarePackage.SoftwareConcepts_ddd, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7bf3ff71-98fd-11ee-aa72-593773060f63,ME9HGHXlRQrWzkO+xr8fo0pf0y4=] */
