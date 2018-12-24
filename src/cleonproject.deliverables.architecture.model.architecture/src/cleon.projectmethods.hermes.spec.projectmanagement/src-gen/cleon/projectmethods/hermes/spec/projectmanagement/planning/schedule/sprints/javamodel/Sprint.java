package cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Sprint extends DynamicResource implements ISprint {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISprint> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISprint>() {
    
    @Override
    public ISprint create() {
      return new Sprint();
    }
    
    @Override
    public ISprint create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Sprint(resourceRepository, resource);
    }
  
  };

  public Sprint() {
    super(ISprint.TYPE_ID);
  }
  
  public Sprint(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISprint.TYPE_ID);
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
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.AbstractChapter_chapters);
  }

  public Sprint setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.AbstractChapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Sprint setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.calendar.javamodel.IDay selectEnd() {
    return _getSingle(cleon.common.resources.spec.calendar.javamodel.IDay.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.ReleasesPackage.TimePlan_end);
  }

  public Sprint setEnd(cleon.common.resources.spec.calendar.javamodel.IDay end) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.ReleasesPackage.TimePlan_end, end);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Sprint setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprintBacklog selectSprintBacklog() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprintBacklog.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.Sprint_sprintBacklog);
  }

  public Sprint setSprintBacklog(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprintBacklog sprintBacklog) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.Sprint_sprintBacklog, sprintBacklog);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprintCapacity selectSprintCapacity() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprintCapacity.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.Sprint_sprintCapacity);
  }

  public Sprint setSprintCapacity(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprintCapacity sprintCapacity) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.Sprint_sprintCapacity, sprintCapacity);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprintGoals selectSprintGoals() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprintGoals.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.Sprint_sprintGoals);
  }

  public Sprint setSprintGoals(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprintGoals sprintGoals) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.Sprint_sprintGoals, sprintGoals);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.calendar.javamodel.IDay selectStart() {
    return _getSingle(cleon.common.resources.spec.calendar.javamodel.IDay.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.ReleasesPackage.TimePlan_start);
  }

  public Sprint setStart(cleon.common.resources.spec.calendar.javamodel.IDay start) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.ReleasesPackage.TimePlan_start, start);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.workstate.javamodel.IWorkState selectState() {
    return _getSingle(cleon.common.resources.spec.resources.workstate.javamodel.IWorkState.class, cleon.common.resources.spec.resources.workstate.WorkstatePackage.WorkStateAware_state);
  }

  public Sprint setState(cleon.common.resources.spec.resources.workstate.javamodel.IWorkState state) {
    _setSingle(cleon.common.resources.spec.resources.workstate.WorkstatePackage.WorkStateAware_state, state);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.teams.javamodel.ITeam selectTeam() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.teams.javamodel.ITeam.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.Sprint_team);
  }

  public Sprint setTeam(cleon.projectmethods.hermes.spec.projectmanagement.resource.teams.javamodel.ITeam team) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.Sprint_team, team);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Sprint setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.AbstractChapter_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.common.resources.spec.calendar.javamodel.IDay.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.ReleasesPackage.TimePlan_end, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprintBacklog.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.Sprint_sprintBacklog, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprintCapacity.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.Sprint_sprintCapacity, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprintGoals.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.Sprint_sprintGoals, visitor);
    _acceptSingle(cleon.common.resources.spec.calendar.javamodel.IDay.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.ReleasesPackage.TimePlan_start, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.workstate.javamodel.IWorkState.class, cleon.common.resources.spec.resources.workstate.WorkstatePackage.WorkStateAware_state, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.teams.javamodel.ITeam.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.Sprint_team, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprint selectToMeSprintGoals(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprintGoals object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprint.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.Sprint_sprintGoals, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprint selectToMeSprintCapacity(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprintCapacity object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprint.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.Sprint_sprintCapacity, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprint selectToMeSprintBacklog(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprintBacklog object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprint.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.Sprint_sprintBacklog, object.getResource());
  }
  
  public static java.util.List<cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprint> selectToMeTeam(cleon.projectmethods.hermes.spec.projectmanagement.resource.teams.javamodel.ITeam object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprint.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.Sprint_team, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,46c6145c-3761-11e5-95d9-2b04d7ab02d9,V+jnsR8oDdLcakVgdOy03JFSSJ8=] */
