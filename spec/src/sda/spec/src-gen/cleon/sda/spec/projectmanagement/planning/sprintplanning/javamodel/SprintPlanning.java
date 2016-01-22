package cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SprintPlanning extends DynamicResource implements ISprintPlanning {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISprintPlanning> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISprintPlanning>() {
    
    @Override
    public ISprintPlanning create() {
      return new SprintPlanning();
    }
    
    @Override
    public ISprintPlanning create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SprintPlanning(resourceRepository, resource);
    }
  
  };

  public SprintPlanning() {
    super(ISprintPlanning.TYPE_ID);
  }
  
  public SprintPlanning(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISprintPlanning.TYPE_ID);
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

  public SprintPlanning setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public SprintPlanning setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public SprintPlanning setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.ISprint selectSprint() {
    return _getSingle(cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.ISprint.class, cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.SprintPlanning_sprint);
  }

  public SprintPlanning setSprint(cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.ISprint sprint) {
    _setSingle(cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.SprintPlanning_sprint, sprint);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintBacklog selectSprintBacklog() {
    return _getSingle(cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintBacklog.class, cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.SprintPlanning_sprintBacklog);
  }

  public SprintPlanning setSprintBacklog(cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintBacklog sprintBacklog) {
    _setSingle(cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.SprintPlanning_sprintBacklog, sprintBacklog);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintCapacity selectSprintCapacity() {
    return _getSingle(cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintCapacity.class, cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.SprintPlanning_sprintCapacity);
  }

  public SprintPlanning setSprintCapacity(cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintCapacity sprintCapacity) {
    _setSingle(cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.SprintPlanning_sprintCapacity, sprintCapacity);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintGoals selectSprintGoals() {
    return _getSingle(cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintGoals.class, cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.SprintPlanning_sprintGoals);
  }

  public SprintPlanning setSprintGoals(cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintGoals sprintGoals) {
    _setSingle(cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.SprintPlanning_sprintGoals, sprintGoals);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public SprintPlanning setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SprintPlanning setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.ISprint.class, cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.SprintPlanning_sprint, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintBacklog.class, cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.SprintPlanning_sprintBacklog, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintCapacity.class, cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.SprintPlanning_sprintCapacity, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintGoals.class, cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.SprintPlanning_sprintGoals, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintPlanning> selectToMeSprint(cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.ISprint object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintPlanning.class, cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.SprintPlanning_sprint, object.getResource());
  }
  
  public static cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintPlanning selectToMeSprintGoals(cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintGoals object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintPlanning.class, cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.SprintPlanning_sprintGoals, object.getResource());
  }
  
  public static cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintPlanning selectToMeSprintCapacity(cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintCapacity object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintPlanning.class, cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.SprintPlanning_sprintCapacity, object.getResource());
  }
  
  public static cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintPlanning selectToMeSprintBacklog(cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintBacklog object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintPlanning.class, cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.SprintPlanning_sprintBacklog, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db3c786a-c009-11e5-a165-d34765931e10,20KIxriwslYTqainknezM/PNFhU=] */
