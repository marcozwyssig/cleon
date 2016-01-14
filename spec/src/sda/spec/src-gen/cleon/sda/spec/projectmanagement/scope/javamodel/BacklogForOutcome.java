package cleon.sda.spec.projectmanagement.scope.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class BacklogForOutcome extends DynamicResource implements IBacklogForOutcome {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBacklogForOutcome> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBacklogForOutcome>() {
    
    @Override
    public IBacklogForOutcome create() {
      return new BacklogForOutcome();
    }
    
    @Override
    public IBacklogForOutcome create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new BacklogForOutcome(resourceRepository, resource);
    }
  
  };

  public BacklogForOutcome() {
    super(IBacklogForOutcome.TYPE_ID);
  }
  
  public BacklogForOutcome(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBacklogForOutcome.TYPE_ID);
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
  public cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog selectBacklog() {
    return _getSingle(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog.class, cleon.sda.spec.projectmanagement.scope.ScopePackage.BacklogForOutcome_backlog);
  }

  public BacklogForOutcome setBacklog(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog backlog) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.ScopePackage.BacklogForOutcome_backlog, backlog);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public BacklogForOutcome setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.doc.spec.chapter.javamodel.IChapter selectNoChapters() {
    return _getSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public BacklogForOutcome setNoChapters(cleon.doc.spec.chapter.javamodel.IChapter noChapters) {
    _setSingle(cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.scope.outcome.javamodel.IOutcome selectOutcome() {
    return _getSingle(cleon.sda.spec.projectmanagement.scope.outcome.javamodel.IOutcome.class, cleon.sda.spec.projectmanagement.scope.ScopePackage.BacklogForOutcome_outcome);
  }

  public BacklogForOutcome setOutcome(cleon.sda.spec.projectmanagement.scope.outcome.javamodel.IOutcome outcome) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.ScopePackage.BacklogForOutcome_outcome, outcome);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public BacklogForOutcome setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public BacklogForOutcome setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public BacklogForOutcome setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public BacklogForOutcome setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog.class, cleon.sda.spec.projectmanagement.scope.ScopePackage.BacklogForOutcome_backlog, visitor);
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.scope.outcome.javamodel.IOutcome.class, cleon.sda.spec.projectmanagement.scope.ScopePackage.BacklogForOutcome_outcome, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.projectmanagement.scope.javamodel.IBacklogForOutcome> selectToMeOutcome(cleon.sda.spec.projectmanagement.scope.outcome.javamodel.IOutcome object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.scope.javamodel.IBacklogForOutcome.class, cleon.sda.spec.projectmanagement.scope.ScopePackage.BacklogForOutcome_outcome, object.getResource());
  }
  
  public static cleon.sda.spec.projectmanagement.scope.javamodel.IBacklogForOutcome selectToMeBacklog(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.scope.javamodel.IBacklogForOutcome.class, cleon.sda.spec.projectmanagement.scope.ScopePackage.BacklogForOutcome_backlog, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b59f22b9-b9c1-11e5-a5dc-db9071475fc6,jcPAvL2qsDRQn9fwugJlWqTMkFs=] */
