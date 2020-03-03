package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.availability.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Availability extends DynamicResource implements IAvailability {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAvailability> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAvailability>() {
    
    @Override
    public IAvailability create() {
      return new Availability();
    }
    
    @Override
    public IAvailability create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Availability(resourceRepository, resource);
    }
  
  };

  public Availability() {
    super(IAvailability.TYPE_ID);
  }
  
  public Availability(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAvailability.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.availability.javamodel.IAvailabilitySystemConfiguration> selectAvailabilitySystemConfigurations() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.availability.javamodel.IAvailabilitySystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.availability.AvailabilityPackage.Availability_availabilitySystemConfigurations);
  }

  public Availability setAvailabilitySystemConfigurations(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.availability.javamodel.IAvailabilitySystemConfiguration> availabilitySystemConfigurations) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.availability.AvailabilityPackage.Availability_availabilitySystemConfigurations, availabilitySystemConfigurations);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public Availability setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Availability setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Availability setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Availability setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.availability.javamodel.IAvailabilitySystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.availability.AvailabilityPackage.Availability_availabilitySystemConfigurations, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.availability.javamodel.IAvailability selectToMeAvailabilitySystemConfigurations(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.availability.javamodel.IAvailabilitySystemConfiguration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.availability.javamodel.IAvailability.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.availability.AvailabilityPackage.Availability_availabilitySystemConfigurations, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ccb76508-0eae-11e9-9f19-6d15636f4ecc,JqIWS8f6MH2KPjqWcbukKWBQj3c=] */
