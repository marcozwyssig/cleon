package cleon.sda.spec.projectmanagement.scope.outcome.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Outcome extends DynamicResource implements IOutcome {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOutcome> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOutcome>() {
    
    @Override
    public IOutcome create() {
      return new Outcome();
    }
    
    @Override
    public IOutcome create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Outcome(resourceRepository, resource);
    }
  
  };

  public Outcome() {
    super(IOutcome.TYPE_ID);
  }
  
  public Outcome(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOutcome.TYPE_ID);
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

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectNo() {
    return _getSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.scope.outcome.OutcomePackage.Outcome_no);
  }
    
  public void setNo(java.lang.String no) {
     _setSingleAttribute(cleon.sda.spec.projectmanagement.scope.outcome.OutcomePackage.Outcome_no, no);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public Outcome setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public Outcome setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public Outcome setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sda.spec.projectmanagement.scope.outcome.javamodel.IRequiredSkills> selectRequiredSkills() {
    return _getMap(cleon.sda.spec.projectmanagement.scope.outcome.javamodel.IRequiredSkills.class, cleon.sda.spec.projectmanagement.scope.outcome.OutcomePackage.Outcome_requiredSkills);
  }

  public Outcome setRequiredSkills(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sda.spec.projectmanagement.scope.outcome.javamodel.IRequiredSkills> requiredSkills) {
    _setMap(cleon.sda.spec.projectmanagement.scope.outcome.OutcomePackage.Outcome_requiredSkills, requiredSkills);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Outcome setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.scope.outcome.OutcomePackage.Outcome_no, visitor);
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptMap(cleon.sda.spec.projectmanagement.scope.outcome.javamodel.IRequiredSkills.class, cleon.sda.spec.projectmanagement.scope.outcome.OutcomePackage.Outcome_requiredSkills, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static cleon.sda.spec.projectmanagement.scope.outcome.javamodel.IOutcome selectToMeRequiredSkills(cleon.sda.spec.projectmanagement.scope.outcome.javamodel.IRequiredSkills object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.scope.outcome.javamodel.IOutcome.class, cleon.sda.spec.projectmanagement.scope.outcome.OutcomePackage.Outcome_requiredSkills, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ffbb7b2a-b53c-11e5-bc0c-f35b68c3609a,c2VE+X/WwNpCT4cVjTegInN3Leo=] */
