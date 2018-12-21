package cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TechnicalConstraints extends DynamicResource implements ITechnicalConstraints {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITechnicalConstraints> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITechnicalConstraints>() {
    
    @Override
    public ITechnicalConstraints create() {
      return new TechnicalConstraints();
    }
    
    @Override
    public ITechnicalConstraints create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TechnicalConstraints(resourceRepository, resource);
    }
  
  };

  public TechnicalConstraints() {
    super(ITechnicalConstraints.TYPE_ID);
  }
  
  public TechnicalConstraints(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITechnicalConstraints.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_chapters);
  }

  public TechnicalConstraints setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.NoDocumentElementComposite_documentElements);
  }

  public TechnicalConstraints setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.NoDocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public TechnicalConstraints setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel.ITechnicalConstraint> selectTechnicalConstraints() {
    return _getList(cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel.ITechnicalConstraint.class, cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints._02_architecture_constraintsPackage.TechnicalConstraints_technicalConstraints);
  }

  public TechnicalConstraints setTechnicalConstraints(java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel.ITechnicalConstraint> technicalConstraints) {
    _setList(cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints._02_architecture_constraintsPackage.TechnicalConstraints_technicalConstraints, technicalConstraints);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TechnicalConstraints setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.NoDocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptList(cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel.ITechnicalConstraint.class, cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints._02_architecture_constraintsPackage.TechnicalConstraints_technicalConstraints, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel.ITechnicalConstraints selectToMeTechnicalConstraints(cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel.ITechnicalConstraint object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel.ITechnicalConstraints.class, cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints._02_architecture_constraintsPackage.TechnicalConstraints_technicalConstraints, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ef433a64-e100-11e8-8499-a3b0fb3cad90,axjkcsQ1a32E11nyL9tecxfsXl8=] */