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
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.autonomy.javamodel.IAutonomyConcept selectAutonomy() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.autonomy.javamodel.IAutonomyConcept.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.BusinesscontinuityPackage.BusinessContinuityConcept_autonomy);
  }

  public BusinessContinuityConcept setAutonomy(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.autonomy.javamodel.IAutonomyConcept autonomy) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.BusinesscontinuityPackage.BusinessContinuityConcept_autonomy, autonomy);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.javamodel.IAvailabilityConcept selectAvailability() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.javamodel.IAvailabilityConcept.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.BusinesscontinuityPackage.BusinessContinuityConcept_availability);
  }

  public BusinessContinuityConcept setAvailability(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.javamodel.IAvailabilityConcept availability) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.BusinesscontinuityPackage.BusinessContinuityConcept_availability, availability);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel.IBackupConcept selectBackup() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel.IBackupConcept.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.BusinesscontinuityPackage.BusinessContinuityConcept_backup);
  }

  public BusinessContinuityConcept setBackup(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel.IBackupConcept backup) {
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
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.autonomy.javamodel.IAutonomyConcept.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.BusinesscontinuityPackage.BusinessContinuityConcept_autonomy, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.javamodel.IAvailabilityConcept.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.BusinesscontinuityPackage.BusinessContinuityConcept_availability, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel.IBackupConcept.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.BusinesscontinuityPackage.BusinessContinuityConcept_backup, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.javamodel.IBusinessContinuityConcept selectToMeAvailability(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.javamodel.IAvailabilityConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.javamodel.IBusinessContinuityConcept.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.BusinesscontinuityPackage.BusinessContinuityConcept_availability, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.javamodel.IBusinessContinuityConcept selectToMeBackup(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel.IBackupConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.javamodel.IBusinessContinuityConcept.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.BusinesscontinuityPackage.BusinessContinuityConcept_backup, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.javamodel.IBusinessContinuityConcept selectToMeAutonomy(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.autonomy.javamodel.IAutonomyConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.javamodel.IBusinessContinuityConcept.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.BusinesscontinuityPackage.BusinessContinuityConcept_autonomy, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e2395fff-0eae-11e9-9f19-6d15636f4ecc,xzUcI/vHgUc3QXlRaKyCHHFJgo0=] */
