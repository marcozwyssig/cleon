package cleon.uml.spec.behavioral.statemachine.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Transition extends DynamicResource implements ITransition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITransition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITransition>() {
    
    @Override
    public ITransition create() {
      return new Transition();
    }
    
    @Override
    public ITransition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Transition(resourceRepository, resource);
    }
  
  };

  public Transition() {
    super(ITransition.TYPE_ID);
  }
  
  public Transition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITransition.TYPE_ID);
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
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public Transition setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.uml.spec.behavioral.statemachine.javamodel.ICondition selectCondition() {
    return _getSingle(cleon.uml.spec.behavioral.statemachine.javamodel.ICondition.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.Transition_condition);
  }

  public Transition setCondition(cleon.uml.spec.behavioral.statemachine.javamodel.ICondition condition) {
    _setSingle(cleon.uml.spec.behavioral.statemachine.StatemachinePackage.Transition_condition, condition);
    return this;
  }
    
  @Override
  public cleon.uml.spec.behavioral.statemachine.javamodel.IEvent selectEvent() {
    return _getSingle(cleon.uml.spec.behavioral.statemachine.javamodel.IEvent.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.Transition_event);
  }

  public Transition setEvent(cleon.uml.spec.behavioral.statemachine.javamodel.IEvent event) {
    _setSingle(cleon.uml.spec.behavioral.statemachine.StatemachinePackage.Transition_event, event);
    return this;
  }
    
  @Override
  public cleon.doc.spec.chapter.javamodel.IChapter selectNoChapters() {
    return _getSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public Transition setNoChapters(cleon.doc.spec.chapter.javamodel.IChapter noChapters) {
    _setSingle(cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public Transition setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public Transition setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Transition setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public cleon.uml.spec.behavioral.statemachine.javamodel.IState selectTargetState() {
    return _getSingle(cleon.uml.spec.behavioral.statemachine.javamodel.IState.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.Transition_targetState);
  }

  public Transition setTargetState(cleon.uml.spec.behavioral.statemachine.javamodel.IState targetState) {
    _setSingle(cleon.uml.spec.behavioral.statemachine.StatemachinePackage.Transition_targetState, targetState);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Transition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptSingle(cleon.uml.spec.behavioral.statemachine.javamodel.ICondition.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.Transition_condition, visitor);
    _acceptSingle(cleon.uml.spec.behavioral.statemachine.javamodel.IEvent.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.Transition_event, visitor);
    _acceptSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(cleon.uml.spec.behavioral.statemachine.javamodel.IState.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.Transition_targetState, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.uml.spec.behavioral.statemachine.javamodel.ITransition> selectToMeTargetState(cleon.uml.spec.behavioral.statemachine.javamodel.IState object) {
    return _getToMeList(object.getRepository(), cleon.uml.spec.behavioral.statemachine.javamodel.ITransition.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.Transition_targetState, object.getResource());
  }
  
  public static java.util.List<cleon.uml.spec.behavioral.statemachine.javamodel.ITransition> selectToMeEvent(cleon.uml.spec.behavioral.statemachine.javamodel.IEvent object) {
    return _getToMeList(object.getRepository(), cleon.uml.spec.behavioral.statemachine.javamodel.ITransition.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.Transition_event, object.getResource());
  }
  
  public static cleon.uml.spec.behavioral.statemachine.javamodel.ITransition selectToMeCondition(cleon.uml.spec.behavioral.statemachine.javamodel.ICondition object) {
    return _getToMeSingle(object.getRepository(), cleon.uml.spec.behavioral.statemachine.javamodel.ITransition.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.Transition_condition, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,813e6228-b07c-11e4-bca8-71d5b3e72cd6,IbBHgiy/J6FOrWfrkgTvvxmZ64I=] */
