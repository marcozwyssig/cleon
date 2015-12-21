package cleon.uml.spec.behavioral.statemachine.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class StateMachine extends DynamicResource implements IStateMachine {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStateMachine> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStateMachine>() {
    
    @Override
    public IStateMachine create() {
      return new StateMachine();
    }
    
    @Override
    public IStateMachine create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new StateMachine(resourceRepository, resource);
    }
  
  };

  public StateMachine() {
    super(IStateMachine.TYPE_ID);
  }
  
  public StateMachine(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IStateMachine.TYPE_ID);
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

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public StateMachine setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> selectDocuments() {
    return _getList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents);
  }

  public StateMachine setDocuments(java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> documents) {
    _setList(cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, documents);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.behavioral.statemachine.javamodel.IEvent> selectEvents() {
    return _getList(cleon.uml.spec.behavioral.statemachine.javamodel.IEvent.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.StateMachine_events);
  }

  public StateMachine setEvents(java.util.List<? extends cleon.uml.spec.behavioral.statemachine.javamodel.IEvent> events) {
    _setList(cleon.uml.spec.behavioral.statemachine.StatemachinePackage.StateMachine_events, events);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public StateMachine setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public StateMachine setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public cleon.uml.spec.behavioral.statemachine.javamodel.ISingleState selectStart() {
    return _getSingle(cleon.uml.spec.behavioral.statemachine.javamodel.ISingleState.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.StateMachine_start);
  }

  public StateMachine setStart(cleon.uml.spec.behavioral.statemachine.javamodel.ISingleState start) {
    _setSingle(cleon.uml.spec.behavioral.statemachine.StatemachinePackage.StateMachine_start, start);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.behavioral.statemachine.javamodel.ISingleState> selectStates() {
    return _getList(cleon.uml.spec.behavioral.statemachine.javamodel.ISingleState.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.StateMachine_states);
  }

  public StateMachine setStates(java.util.List<? extends cleon.uml.spec.behavioral.statemachine.javamodel.ISingleState> states) {
    _setList(cleon.uml.spec.behavioral.statemachine.StatemachinePackage.StateMachine_states, states);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.behavioral.statemachine.javamodel.IStateMachine> selectSubStateMachine() {
    return _getList(cleon.uml.spec.behavioral.statemachine.javamodel.IStateMachine.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.StateMachine_subStateMachine);
  }

  public StateMachine setSubStateMachine(java.util.List<? extends cleon.uml.spec.behavioral.statemachine.javamodel.IStateMachine> subStateMachine) {
    _setList(cleon.uml.spec.behavioral.statemachine.StatemachinePackage.StateMachine_subStateMachine, subStateMachine);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public StateMachine setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectUseDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements);
  }

  public StateMachine setUseDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> useDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, useDocumentElements);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, visitor);
    _acceptList(cleon.uml.spec.behavioral.statemachine.javamodel.IEvent.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.StateMachine_events, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptSingle(cleon.uml.spec.behavioral.statemachine.javamodel.ISingleState.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.StateMachine_start, visitor);
    _acceptList(cleon.uml.spec.behavioral.statemachine.javamodel.ISingleState.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.StateMachine_states, visitor);
    _acceptList(cleon.uml.spec.behavioral.statemachine.javamodel.IStateMachine.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.StateMachine_subStateMachine, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, visitor);
  }

  // toMeRelations
  
  public static cleon.uml.spec.behavioral.statemachine.javamodel.IStateMachine selectToMeStates(cleon.uml.spec.behavioral.statemachine.javamodel.ISingleState object) {
    return _getToMeSingle(object.getRepository(), cleon.uml.spec.behavioral.statemachine.javamodel.IStateMachine.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.StateMachine_states, object.getResource());
  }
  
  public static cleon.uml.spec.behavioral.statemachine.javamodel.IStateMachine selectToMeEvents(cleon.uml.spec.behavioral.statemachine.javamodel.IEvent object) {
    return _getToMeSingle(object.getRepository(), cleon.uml.spec.behavioral.statemachine.javamodel.IStateMachine.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.StateMachine_events, object.getResource());
  }
  
  public static cleon.uml.spec.behavioral.statemachine.javamodel.IStateMachine selectToMeSubStateMachine(cleon.uml.spec.behavioral.statemachine.javamodel.IStateMachine object) {
    return _getToMeSingle(object.getRepository(), cleon.uml.spec.behavioral.statemachine.javamodel.IStateMachine.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.StateMachine_subStateMachine, object.getResource());
  }
  
  public static cleon.uml.spec.behavioral.statemachine.javamodel.IStateMachine selectToMeStart(cleon.uml.spec.behavioral.statemachine.javamodel.ISingleState object) {
    return _getToMeSingle(object.getRepository(), cleon.uml.spec.behavioral.statemachine.javamodel.IStateMachine.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.StateMachine_start, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6b3731f0-b07c-11e4-bca8-71d5b3e72cd6,dQLjx9rDOnmkT4KzeHpFctElcA8=] */
