package ikt.product.documentation.spec.concepts.businesscontinuity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class BusinessContinuity extends DynamicResource implements IBusinessContinuity {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBusinessContinuity> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBusinessContinuity>() {
    
    @Override
    public IBusinessContinuity create() {
      return new BusinessContinuity();
    }
    
    @Override
    public IBusinessContinuity create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new BusinessContinuity(resourceRepository, resource);
    }
  
  };

  public BusinessContinuity() {
    super(IBusinessContinuity.TYPE_ID);
  }
  
  public BusinessContinuity(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBusinessContinuity.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public ikt.product.documentation.spec.concepts.businesscontinuity.availability.javamodel.IAvailability selectAvailability() {
    return _getSingle(ikt.product.documentation.spec.concepts.businesscontinuity.availability.javamodel.IAvailability.class, ikt.product.documentation.spec.concepts.businesscontinuity.BusinesscontinuityPackage.BusinessContinuity_availability);
  }

  public BusinessContinuity setAvailability(ikt.product.documentation.spec.concepts.businesscontinuity.availability.javamodel.IAvailability availability) {
    _setSingle(ikt.product.documentation.spec.concepts.businesscontinuity.BusinesscontinuityPackage.BusinessContinuity_availability, availability);
    return this;
  }
    
  @Override
  public ikt.product.documentation.spec.concepts.businesscontinuity.backup.javamodel.IBackup selectBackup() {
    return _getSingle(ikt.product.documentation.spec.concepts.businesscontinuity.backup.javamodel.IBackup.class, ikt.product.documentation.spec.concepts.businesscontinuity.BusinesscontinuityPackage.BusinessContinuity_backup);
  }

  public BusinessContinuity setBackup(ikt.product.documentation.spec.concepts.businesscontinuity.backup.javamodel.IBackup backup) {
    _setSingle(ikt.product.documentation.spec.concepts.businesscontinuity.BusinesscontinuityPackage.BusinessContinuity_backup, backup);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public BusinessContinuity setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public BusinessContinuity setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public BusinessContinuity setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public BusinessContinuity setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(ikt.product.documentation.spec.concepts.businesscontinuity.availability.javamodel.IAvailability.class, ikt.product.documentation.spec.concepts.businesscontinuity.BusinesscontinuityPackage.BusinessContinuity_availability, visitor);
    _acceptSingle(ikt.product.documentation.spec.concepts.businesscontinuity.backup.javamodel.IBackup.class, ikt.product.documentation.spec.concepts.businesscontinuity.BusinesscontinuityPackage.BusinessContinuity_backup, visitor);
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static ikt.product.documentation.spec.concepts.businesscontinuity.javamodel.IBusinessContinuity selectToMeAvailability(ikt.product.documentation.spec.concepts.businesscontinuity.availability.javamodel.IAvailability object) {
    return _getToMeSingle(object.getRepository(), ikt.product.documentation.spec.concepts.businesscontinuity.javamodel.IBusinessContinuity.class, ikt.product.documentation.spec.concepts.businesscontinuity.BusinesscontinuityPackage.BusinessContinuity_availability, object.getResource());
  }
  
  public static ikt.product.documentation.spec.concepts.businesscontinuity.javamodel.IBusinessContinuity selectToMeBackup(ikt.product.documentation.spec.concepts.businesscontinuity.backup.javamodel.IBackup object) {
    return _getToMeSingle(object.getRepository(), ikt.product.documentation.spec.concepts.businesscontinuity.javamodel.IBusinessContinuity.class, ikt.product.documentation.spec.concepts.businesscontinuity.BusinesscontinuityPackage.BusinessContinuity_backup, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e2395fff-0eae-11e9-9f19-6d15636f4ecc,46bb/pECpQ/7J/Ev/3werF/lIZs=] */
