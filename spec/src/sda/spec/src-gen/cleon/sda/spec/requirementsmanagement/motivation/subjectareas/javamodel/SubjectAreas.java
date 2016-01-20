package cleon.sda.spec.requirementsmanagement.motivation.subjectareas.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SubjectAreas extends DynamicResource implements ISubjectAreas {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISubjectAreas> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISubjectAreas>() {
    
    @Override
    public ISubjectAreas create() {
      return new SubjectAreas();
    }
    
    @Override
    public ISubjectAreas create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SubjectAreas(resourceRepository, resource);
    }
  
  };

  public SubjectAreas() {
    super(ISubjectAreas.TYPE_ID);
  }
  
  public SubjectAreas(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISubjectAreas.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.subjectareas.javamodel.ISubjectAreas> selectAggregation() {
    return _getList(cleon.sda.spec.requirementsmanagement.motivation.subjectareas.javamodel.ISubjectAreas.class, cleon.sda.spec.requirementsmanagement.motivation.subjectareas.SubjectareasPackage.SubjectAreas_aggregation);
  }

  public SubjectAreas setAggregation(java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.subjectareas.javamodel.ISubjectAreas> aggregation) {
    _setList(cleon.sda.spec.requirementsmanagement.motivation.subjectareas.SubjectareasPackage.SubjectAreas_aggregation, aggregation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public SubjectAreas setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public SubjectAreas setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public SubjectAreas setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.subjectareas.javamodel.ISubjectArea> selectSubjectAreas() {
    return _getList(cleon.sda.spec.requirementsmanagement.motivation.subjectareas.javamodel.ISubjectArea.class, cleon.sda.spec.requirementsmanagement.motivation.subjectareas.SubjectareasPackage.SubjectAreas_subjectAreas);
  }

  public SubjectAreas setSubjectAreas(java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.subjectareas.javamodel.ISubjectArea> subjectAreas) {
    _setList(cleon.sda.spec.requirementsmanagement.motivation.subjectareas.SubjectareasPackage.SubjectAreas_subjectAreas, subjectAreas);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SubjectAreas setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.sda.spec.requirementsmanagement.motivation.subjectareas.javamodel.ISubjectAreas.class, cleon.sda.spec.requirementsmanagement.motivation.subjectareas.SubjectareasPackage.SubjectAreas_aggregation, visitor);
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptList(cleon.sda.spec.requirementsmanagement.motivation.subjectareas.javamodel.ISubjectArea.class, cleon.sda.spec.requirementsmanagement.motivation.subjectareas.SubjectareasPackage.SubjectAreas_subjectAreas, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.requirementsmanagement.motivation.subjectareas.javamodel.ISubjectAreas selectToMeSubjectAreas(cleon.sda.spec.requirementsmanagement.motivation.subjectareas.javamodel.ISubjectArea object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.requirementsmanagement.motivation.subjectareas.javamodel.ISubjectAreas.class, cleon.sda.spec.requirementsmanagement.motivation.subjectareas.SubjectareasPackage.SubjectAreas_subjectAreas, object.getResource());
  }
  
  public static cleon.sda.spec.requirementsmanagement.motivation.subjectareas.javamodel.ISubjectAreas selectToMeAggregation(cleon.sda.spec.requirementsmanagement.motivation.subjectareas.javamodel.ISubjectAreas object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.requirementsmanagement.motivation.subjectareas.javamodel.ISubjectAreas.class, cleon.sda.spec.requirementsmanagement.motivation.subjectareas.SubjectareasPackage.SubjectAreas_aggregation, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fd0ef3a1-bf5c-11e5-a56a-35b34376b412,13TbBGr5nzpwlRXjq0mdr541wNA=] */
