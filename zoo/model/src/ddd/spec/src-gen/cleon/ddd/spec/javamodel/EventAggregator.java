package cleon.ddd.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class EventAggregator extends DynamicResource implements IEventAggregator {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEventAggregator> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEventAggregator>() {
    
    @Override
    public IEventAggregator create() {
      return new EventAggregator();
    }
    
    @Override
    public IEventAggregator create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new EventAggregator(resourceRepository, resource);
    }
  
  };

  public EventAggregator() {
    super(IEventAggregator.TYPE_ID);
  }
  
  public EventAggregator(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEventAggregator.TYPE_ID);
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
  public java.lang.String selectResponsibility() {
    return _getSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility);
  }
    
  public void setResponsibility(java.lang.String responsibility) {
     _setSingleAttribute(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, responsibility);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Chapter_chapters);
  }

  public EventAggregator setChapters(java.util.List<? extends cleon.doc.spec.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.SpecPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.uml.spec.structural.classes.javamodel.IClassifier selectContext() {
    return _getSingle(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.ddd.spec.SpecPackage.EventAggregator_context);
  }

  public EventAggregator setContext(cleon.uml.spec.structural.classes.javamodel.IClassifier context) {
    _setSingle(cleon.ddd.spec.SpecPackage.EventAggregator_context, context);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public EventAggregator setDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.ddd.spec.javamodel.IPubSubEvent> selectEvents() {
    return _getMap(cleon.ddd.spec.javamodel.IPubSubEvent.class, cleon.ddd.spec.SpecPackage.EventAggregator_events);
  }

  public EventAggregator setEvents(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.ddd.spec.javamodel.IPubSubEvent> events) {
    _setMap(cleon.ddd.spec.SpecPackage.EventAggregator_events, events);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public EventAggregator setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock> selectUseDecompositions() {
    return _getList(cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseBuildingBlock_useDecompositions);
  }

  public EventAggregator setUseDecompositions(java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock> useDecompositions) {
    _setList(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseBuildingBlock_useDecompositions, useDecompositions);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, visitor);
    // relations
    _acceptList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Chapter_chapters, visitor);
    _acceptSingle(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.ddd.spec.SpecPackage.EventAggregator_context, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, visitor);
    _acceptMap(cleon.ddd.spec.javamodel.IPubSubEvent.class, cleon.ddd.spec.SpecPackage.EventAggregator_events, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseBuildingBlock_useDecompositions, visitor);
  }

  // toMeRelations
  
  public static cleon.ddd.spec.javamodel.IEventAggregator selectToMeEvents(cleon.ddd.spec.javamodel.IPubSubEvent object) {
    return _getToMeSingle(object.getRepository(), cleon.ddd.spec.javamodel.IEventAggregator.class, cleon.ddd.spec.SpecPackage.EventAggregator_events, object.getResource());
  }
  
  public static java.util.List<cleon.ddd.spec.javamodel.IEventAggregator> selectToMeContext(cleon.uml.spec.structural.classes.javamodel.IClassifier object) {
    return _getToMeList(object.getRepository(), cleon.ddd.spec.javamodel.IEventAggregator.class, cleon.ddd.spec.SpecPackage.EventAggregator_context, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3a134cb4-d22a-11e4-8b90-c7d981a5f2fd,H2yNT2a59oUGsprH5hQE/AieXUo=] */
