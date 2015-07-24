package cleon.eda.spec.eventaggregator.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class PubSubEvent extends DynamicResource implements IPubSubEvent {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPubSubEvent> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPubSubEvent>() {
    
    @Override
    public IPubSubEvent create() {
      return new PubSubEvent();
    }
    
    @Override
    public IPubSubEvent create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new PubSubEvent(resourceRepository, resource);
    }
  
  };

  public PubSubEvent() {
    super(IPubSubEvent.TYPE_ID);
  }
  
  public PubSubEvent(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPubSubEvent.TYPE_ID);
  }

  // attributes
  
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

  public PubSubEvent setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.document.javamodel.IDocument> selectDocuments() {
    return _getList(cleon.doc.spec.document.javamodel.IDocument.class, cleon.doc.spec.document.DocumentPackage.Document_documents);
  }

  public PubSubEvent setDocuments(java.util.List<? extends cleon.doc.spec.document.javamodel.IDocument> documents) {
    _setList(cleon.doc.spec.document.DocumentPackage.Document_documents, documents);
    return this;
  }
    
  @Override
  public cleon.uml.spec.structural.classes.events.javamodel.IEvent selectEvent() {
    return _getSingle(cleon.uml.spec.structural.classes.events.javamodel.IEvent.class, cleon.eda.spec.eventaggregator.EventaggregatorPackage.PubSubEvent_event);
  }

  public PubSubEvent setEvent(cleon.uml.spec.structural.classes.events.javamodel.IEvent event) {
    _setSingle(cleon.eda.spec.eventaggregator.EventaggregatorPackage.PubSubEvent_event, event);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public PubSubEvent setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes);
  }

  public PubSubEvent setParagraphes(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public PubSubEvent setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public PubSubEvent setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectUseDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements);
  }

  public PubSubEvent setUseDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> useDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, useDocumentElements);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, visitor);
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptList(cleon.doc.spec.document.javamodel.IDocument.class, cleon.doc.spec.document.DocumentPackage.Document_documents, visitor);
    _acceptSingle(cleon.uml.spec.structural.classes.events.javamodel.IEvent.class, cleon.eda.spec.eventaggregator.EventaggregatorPackage.PubSubEvent_event, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.eda.spec.eventaggregator.javamodel.IPubSubEvent> selectToMeEvent(cleon.uml.spec.structural.classes.events.javamodel.IEvent object) {
    return _getToMeList(object.getRepository(), cleon.eda.spec.eventaggregator.javamodel.IPubSubEvent.class, cleon.eda.spec.eventaggregator.EventaggregatorPackage.PubSubEvent_event, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,98ea7936-d22a-11e4-8b90-c7d981a5f2fd,l3TlY9Fu0BReY15UTbrXhhJ3ceQ=] */
