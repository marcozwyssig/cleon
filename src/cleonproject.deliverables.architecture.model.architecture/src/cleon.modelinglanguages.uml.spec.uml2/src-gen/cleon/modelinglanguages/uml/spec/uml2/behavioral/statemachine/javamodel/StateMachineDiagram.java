package cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class StateMachineDiagram extends DynamicResource implements IStateMachineDiagram {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStateMachineDiagram> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStateMachineDiagram>() {
    
    @Override
    public IStateMachineDiagram create() {
      return new StateMachineDiagram();
    }
    
    @Override
    public IStateMachineDiagram create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new StateMachineDiagram(resourceRepository, resource);
    }
  
  };

  public StateMachineDiagram() {
    super(IStateMachineDiagram.TYPE_ID);
  }
  
  public StateMachineDiagram(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IStateMachineDiagram.TYPE_ID);
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

  @Override
  public java.lang.Boolean selectLeftToRight() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_leftToRight);
  }
    
  public void setLeftToRight(java.lang.Boolean leftToRight) {
     _setSingleAttribute(cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_leftToRight, leftToRight);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_path);
  }
    
  public void setPath(java.lang.String path) {
     _setSingleAttribute(cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_path, path);
  }

  @Override
  public java.lang.String selectScale() {
    return _getSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_scale);
  }
    
  public void setScale(java.lang.String scale) {
     _setSingleAttribute(cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_scale, scale);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.NoDocumentElementComposite_documentElements);
  }

  public StateMachineDiagram setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.NoDocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IEvent> selectEvents() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IEvent.class, cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachineDiagram_events);
  }

  public StateMachineDiagram setEvents(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IEvent> events) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachineDiagram_events, events);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ISingleState selectStart() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ISingleState.class, cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachineDiagram_start);
  }

  public StateMachineDiagram setStart(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ISingleState start) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachineDiagram_start, start);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ISingleState> selectStates() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ISingleState.class, cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachineDiagram_states);
  }

  public StateMachineDiagram setStates(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ISingleState> states) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachineDiagram_states, states);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateMachineDiagram> selectSubStateMachine() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateMachineDiagram.class, cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachineDiagram_subStateMachine);
  }

  public StateMachineDiagram setSubStateMachine(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateMachineDiagram> subStateMachine) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachineDiagram_subStateMachine, subStateMachine);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public StateMachineDiagram setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_leftToRight, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_path, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_scale, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.NoDocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IEvent.class, cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachineDiagram_events, visitor);
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ISingleState.class, cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachineDiagram_start, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ISingleState.class, cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachineDiagram_states, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateMachineDiagram.class, cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachineDiagram_subStateMachine, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateMachineDiagram selectToMeStates(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ISingleState object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateMachineDiagram.class, cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachineDiagram_states, object.getResource());
  }
  
  public static cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateMachineDiagram selectToMeEvents(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IEvent object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateMachineDiagram.class, cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachineDiagram_events, object.getResource());
  }
  
  public static cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateMachineDiagram selectToMeSubStateMachine(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateMachineDiagram object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateMachineDiagram.class, cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachineDiagram_subStateMachine, object.getResource());
  }
  
  public static cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateMachineDiagram selectToMeStart(cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ISingleState object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateMachineDiagram.class, cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.StatemachinePackage.StateMachineDiagram_start, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6b3731f0-b07c-11e4-bca8-71d5b3e72cd6,4DvUXOrw8ao24eAwR5WJs3o1aaI=] */
