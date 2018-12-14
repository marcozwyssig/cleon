package cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SprintGoals extends DynamicResource implements ISprintGoals {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISprintGoals> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISprintGoals>() {
    
    @Override
    public ISprintGoals create() {
      return new SprintGoals();
    }
    
    @Override
    public ISprintGoals create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SprintGoals(resourceRepository, resource);
    }
  
  };

  public SprintGoals() {
    super(ISprintGoals.TYPE_ID);
  }
  
  public SprintGoals(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISprintGoals.TYPE_ID);
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

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_chapters);
  }

  public SprintGoals setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public SprintGoals setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprintGoal> selectGoals() {
    return _getList(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprintGoal.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.SprintGoals_goals);
  }

  public SprintGoals setGoals(java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprintGoal> goals) {
    _setList(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.SprintGoals_goals, goals);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_paragraphs);
  }

  public SprintGoals setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SprintGoals setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprintGoal.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.SprintGoals_goals, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprintGoals selectToMeGoals(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprintGoal object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprintGoals.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.SprintGoals_goals, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,99200ab1-c126-11e5-bfd0-47571a06cb62,gmSWIVCJqMl37kRUom5bwZGggm4=] */
