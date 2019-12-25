package cleon.modelinglanguages.uml.metamodel.spec.behavioral.statemachine.javamodel;

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
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Boolean selectIsAbstract() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.ClassesPackage.IsAbstract_isAbstract);
  }
    
  public void setIsAbstract(java.lang.Boolean isAbstract) {
     _setSingleAttribute(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.ClassesPackage.IsAbstract_isAbstract, isAbstract);
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
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public SingleState setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public SingleState setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.behavioral.statemachine.javamodel.IStateInheritance> selectInherits() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.behavioral.statemachine.javamodel.IStateInheritance.class, cleon.modelinglanguages.uml.metamodel.spec.behavioral.statemachine.StatemachinePackage.SingleState_inherits);
  }

  public SingleState setInherits(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.behavioral.statemachine.javamodel.IStateInheritance> inherits) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.behavioral.statemachine.StatemachinePackage.SingleState_inherits, inherits);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public SingleState setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.metamodel.spec.behavioral.statemachine.javamodel.ITransition> selectTransition() {
    return _getMap(cleon.modelinglanguages.uml.metamodel.spec.behavioral.statemachine.javamodel.ITransition.class, cleon.modelinglanguages.uml.metamodel.spec.behavioral.statemachine.StatemachinePackage.SingleState_transition);
  }

  public SingleState setTransition(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.metamodel.spec.behavioral.statemachine.javamodel.ITransition> transition) {
    _setMap(cleon.modelinglanguages.uml.metamodel.spec.behavioral.statemachine.StatemachinePackage.SingleState_transition, transition);
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
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.ClassesPackage.IsAbstract_isAbstract, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.modelinglanguages.uml.metamodel.spec.behavioral.statemachine.javamodel.IStateInheritance.class, cleon.modelinglanguages.uml.metamodel.spec.behavioral.statemachine.StatemachinePackage.SingleState_inherits, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptMap(cleon.modelinglanguages.uml.metamodel.spec.behavioral.statemachine.javamodel.ITransition.class, cleon.modelinglanguages.uml.metamodel.spec.behavioral.statemachine.StatemachinePackage.SingleState_transition, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.modelinglanguages.uml.metamodel.spec.behavioral.statemachine.javamodel.ISingleState selectToMeTransition(cleon.modelinglanguages.uml.metamodel.spec.behavioral.statemachine.javamodel.ITransition object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.uml.metamodel.spec.behavioral.statemachine.javamodel.ISingleState.class, cleon.modelinglanguages.uml.metamodel.spec.behavioral.statemachine.StatemachinePackage.SingleState_transition, object.getResource());
  }
  
  public static cleon.modelinglanguages.uml.metamodel.spec.behavioral.statemachine.javamodel.ISingleState selectToMeInherits(cleon.modelinglanguages.uml.metamodel.spec.behavioral.statemachine.javamodel.IStateInheritance object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.uml.metamodel.spec.behavioral.statemachine.javamodel.ISingleState.class, cleon.modelinglanguages.uml.metamodel.spec.behavioral.statemachine.StatemachinePackage.SingleState_inherits, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7f13ba82-b07c-11e4-bca8-71d5b3e72cd6,oqKJMiBAjfmp85LFJEvDfxoKMIw=] */
