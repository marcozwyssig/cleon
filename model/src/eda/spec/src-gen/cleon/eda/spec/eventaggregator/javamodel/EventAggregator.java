package cleon.eda.spec.eventaggregator.javamodel;

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
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
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
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters);
  }

  public EventAggregator setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.uml.spec.structural.classes.javamodel.IClassifier selectContext() {
    return _getSingle(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.eda.spec.eventaggregator.EventaggregatorPackage.EventAggregator_context);
  }

  public EventAggregator setContext(cleon.uml.spec.structural.classes.javamodel.IClassifier context) {
    _setSingle(cleon.eda.spec.eventaggregator.EventaggregatorPackage.EventAggregator_context, context);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.document.javamodel.IDocument> selectDocuments() {
    return _getList(cleon.doc.spec.document.javamodel.IDocument.class, cleon.doc.spec.document.DocumentPackage.Document_documents);
  }

  public EventAggregator setDocuments(java.util.List<? extends cleon.doc.spec.document.javamodel.IDocument> documents) {
    _setList(cleon.doc.spec.document.DocumentPackage.Document_documents, documents);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.eda.spec.eventaggregator.javamodel.IPubSubEvent> selectEvents() {
    return _getMap(cleon.eda.spec.eventaggregator.javamodel.IPubSubEvent.class, cleon.eda.spec.eventaggregator.EventaggregatorPackage.EventAggregator_events);
  }

  public EventAggregator setEvents(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.eda.spec.eventaggregator.javamodel.IPubSubEvent> events) {
    _setMap(cleon.eda.spec.eventaggregator.EventaggregatorPackage.EventAggregator_events, events);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock> selectOwnDecompositions() {
    return _getList(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.ReferenceOwnDecomposite_ownDecompositions);
  }

  public EventAggregator setOwnDecompositions(java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock> ownDecompositions) {
    _setList(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.ReferenceOwnDecomposite_ownDecompositions, ownDecompositions);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public EventAggregator setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes);
  }

  public EventAggregator setParagraphes(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, paragraphes);
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
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectUseDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements);
  }

  public EventAggregator setUseDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> useDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, useDocumentElements);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, visitor);
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptSingle(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.eda.spec.eventaggregator.EventaggregatorPackage.EventAggregator_context, visitor);
    _acceptList(cleon.doc.spec.document.javamodel.IDocument.class, cleon.doc.spec.document.DocumentPackage.Document_documents, visitor);
    _acceptMap(cleon.eda.spec.eventaggregator.javamodel.IPubSubEvent.class, cleon.eda.spec.eventaggregator.EventaggregatorPackage.EventAggregator_events, visitor);
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.ReferenceOwnDecomposite_ownDecompositions, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, visitor);
  }

  // toMeRelations
  
  public static cleon.eda.spec.eventaggregator.javamodel.IEventAggregator selectToMeEvents(cleon.eda.spec.eventaggregator.javamodel.IPubSubEvent object) {
    return _getToMeSingle(object.getRepository(), cleon.eda.spec.eventaggregator.javamodel.IEventAggregator.class, cleon.eda.spec.eventaggregator.EventaggregatorPackage.EventAggregator_events, object.getResource());
  }
  
  public static java.util.List<cleon.eda.spec.eventaggregator.javamodel.IEventAggregator> selectToMeContext(cleon.uml.spec.structural.classes.javamodel.IClassifier object) {
    return _getToMeList(object.getRepository(), cleon.eda.spec.eventaggregator.javamodel.IEventAggregator.class, cleon.eda.spec.eventaggregator.EventaggregatorPackage.EventAggregator_context, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3a134cb4-d22a-11e4-8b90-c7d981a5f2fd,rtGL/HQ7WFLk99zY/Sn+ocjxksI=] */
