package cleon.uml.spec.behavioral.statemachine.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SingleState extends DynamicResource implements ISingleState {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISingleState> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISingleState>() {
    
    @Override
    public ISingleState create() {
      return new SingleState();
    }
    
    @Override
    public ISingleState create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SingleState(resourceRepository, resource);
    }
  
  };

  public SingleState() {
    super(ISingleState.TYPE_ID);
  }
  
  public SingleState(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISingleState.TYPE_ID);
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
  public java.lang.Boolean selectIsAbstract() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.ClassesPackage.IsAbstract_isAbstract);
  }
    
  public void setIsAbstract(java.lang.Boolean isAbstract) {
     _setSingleAttribute(cleon.uml.spec.structural.classes.ClassesPackage.IsAbstract_isAbstract, isAbstract);
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

  public SingleState setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.behavioral.statemachine.javamodel.IStateInheritance> selectInherits() {
    return _getList(cleon.uml.spec.behavioral.statemachine.javamodel.IStateInheritance.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.SingleState_inherits);
  }

  public SingleState setInherits(java.util.List<? extends cleon.uml.spec.behavioral.statemachine.javamodel.IStateInheritance> inherits) {
    _setList(cleon.uml.spec.behavioral.statemachine.StatemachinePackage.SingleState_inherits, inherits);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public SingleState setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public SingleState setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.uml.spec.behavioral.statemachine.javamodel.ITransition> selectTransition() {
    return _getMap(cleon.uml.spec.behavioral.statemachine.javamodel.ITransition.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.SingleState_transition);
  }

  public SingleState setTransition(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.uml.spec.behavioral.statemachine.javamodel.ITransition> transition) {
    _setMap(cleon.uml.spec.behavioral.statemachine.StatemachinePackage.SingleState_transition, transition);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SingleState setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.ClassesPackage.IsAbstract_isAbstract, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptList(cleon.uml.spec.behavioral.statemachine.javamodel.IStateInheritance.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.SingleState_inherits, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptMap(cleon.uml.spec.behavioral.statemachine.javamodel.ITransition.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.SingleState_transition, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.uml.spec.behavioral.statemachine.javamodel.ISingleState selectToMeTransition(cleon.uml.spec.behavioral.statemachine.javamodel.ITransition object) {
    return _getToMeSingle(object.getRepository(), cleon.uml.spec.behavioral.statemachine.javamodel.ISingleState.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.SingleState_transition, object.getResource());
  }
  
  public static cleon.uml.spec.behavioral.statemachine.javamodel.ISingleState selectToMeInherits(cleon.uml.spec.behavioral.statemachine.javamodel.IStateInheritance object) {
    return _getToMeSingle(object.getRepository(), cleon.uml.spec.behavioral.statemachine.javamodel.ISingleState.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.SingleState_inherits, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7f13ba82-b07c-11e4-bca8-71d5b3e72cd6,zQiyMFZ/psex57qZI0N+c4zKL0g=] */
