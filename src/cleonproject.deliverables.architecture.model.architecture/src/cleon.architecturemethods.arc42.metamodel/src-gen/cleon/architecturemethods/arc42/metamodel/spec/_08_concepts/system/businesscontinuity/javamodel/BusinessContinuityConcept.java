package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class BusinessContinuityConcept extends DynamicResource implements IBusinessContinuityConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBusinessContinuityConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBusinessContinuityConcept>() {
    
    @Override
    public IBusinessContinuityConcept create() {
      return new BusinessContinuityConcept();
    }
    
    @Override
    public IBusinessContinuityConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new BusinessContinuityConcept(resourceRepository, resource);
    }
  
  };

  public BusinessContinuityConcept() {
    super(IBusinessContinuityConcept.TYPE_ID);
  }
  
  public BusinessContinuityConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBusinessContinuityConcept.TYPE_ID);
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
  public cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.javamodel.IAvailability selectAvailability() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.javamodel.IAvailability.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.BusinesscontinuityPackage.BusinessContinuityConcept_availability);
  }

  public BusinessContinuityConcept setAvailability(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.javamodel.IAvailability availability) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.BusinesscontinuityPackage.BusinessContinuityConcept_availability, availability);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel.IBackup selectBackup() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel.IBackup.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.BusinesscontinuityPackage.BusinessContinuityConcept_backup);
  }

  public BusinessContinuityConcept setBackup(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel.IBackup backup) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.BusinesscontinuityPackage.BusinessContinuityConcept_backup, backup);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public BusinessContinuityConcept setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public BusinessContinuityConcept setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public BusinessContinuityConcept setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public BusinessContinuityConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.javamodel.IAvailability.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.BusinesscontinuityPackage.BusinessContinuityConcept_availability, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel.IBackup.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.BusinesscontinuityPackage.BusinessContinuityConcept_backup, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.javamodel.IBusinessContinuityConcept selectToMeAvailability(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.javamodel.IAvailability object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.javamodel.IBusinessContinuityConcept.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.BusinesscontinuityPackage.BusinessContinuityConcept_availability, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.javamodel.IBusinessContinuityConcept selectToMeBackup(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel.IBackup object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.javamodel.IBusinessContinuityConcept.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.BusinesscontinuityPackage.BusinessContinuityConcept_backup, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e2395fff-0eae-11e9-9f19-6d15636f4ecc,oa+3twJe+Ii/0b26jgX9/vTPBL0=] */
