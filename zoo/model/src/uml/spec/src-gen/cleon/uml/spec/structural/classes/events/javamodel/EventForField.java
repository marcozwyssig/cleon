package cleon.uml.spec.structural.classes.events.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class EventForField extends DynamicResource implements IEventForField {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEventForField> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEventForField>() {
    
    @Override
    public IEventForField create() {
      return new EventForField();
    }
    
    @Override
    public IEventForField create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new EventForField(resourceRepository, resource);
    }
  
  };

  public EventForField() {
    super(IEventForField.TYPE_ID);
  }
  
  public EventForField(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEventForField.TYPE_ID);
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
  public java.lang.String selectComments() {
    return _getSingleAttribute(java.lang.String.class, cleon.uml.spec.structural.classes.ClassesPackage.Description_comments);
  }
    
  public void setComments(java.lang.String comments) {
     _setSingleAttribute(cleon.uml.spec.structural.classes.ClassesPackage.Description_comments, comments);
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

  public EventForField setChapters(java.util.List<? extends cleon.doc.spec.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.SpecPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public EventForField setDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.javamodel.IParagraph.class, cleon.doc.spec.SpecPackage.Chapter_paragraphes);
  }

  public EventForField setParagraphes(java.util.List<? extends cleon.doc.spec.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.SpecPackage.Chapter_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public cleon.uml.spec.structural.classes.fields.javamodel.IField selectTarget() {
    return _getSingle(cleon.uml.spec.structural.classes.fields.javamodel.IField.class, cleon.uml.spec.structural.classes.events.EventsPackage.EventForField_target);
  }

  public EventForField setTarget(cleon.uml.spec.structural.classes.fields.javamodel.IField target) {
    _setSingle(cleon.uml.spec.structural.classes.events.EventsPackage.EventForField_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public EventForField setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.uml.spec.structural.classes.ClassesPackage.Description_comments, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, visitor);
    // relations
    _acceptList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Chapter_chapters, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.doc.spec.javamodel.IParagraph.class, cleon.doc.spec.SpecPackage.Chapter_paragraphes, visitor);
    _acceptSingle(cleon.uml.spec.structural.classes.fields.javamodel.IField.class, cleon.uml.spec.structural.classes.events.EventsPackage.EventForField_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.uml.spec.structural.classes.events.javamodel.IEventForField> selectToMeTarget(cleon.uml.spec.structural.classes.fields.javamodel.IField object) {
    return _getToMeList(object.getRepository(), cleon.uml.spec.structural.classes.events.javamodel.IEventForField.class, cleon.uml.spec.structural.classes.events.EventsPackage.EventForField_target, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1b6f35fa-7fc7-11e4-842a-1924f269f20b,GgEyZU5UDCPf0CcSV1BlAnxW6eA=] */
