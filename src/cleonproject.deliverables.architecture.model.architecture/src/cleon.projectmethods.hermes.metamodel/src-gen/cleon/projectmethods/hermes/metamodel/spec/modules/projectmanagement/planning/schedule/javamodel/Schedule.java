package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Schedule extends DynamicResource implements ISchedule {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISchedule> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISchedule>() {
    
    @Override
    public ISchedule create() {
      return new Schedule();
    }
    
    @Override
    public ISchedule create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Schedule(resourceRepository, resource);
    }
  
  };

  public Schedule() {
    super(ISchedule.TYPE_ID);
  }
  
  public Schedule(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISchedule.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath);
  }
    
  public void setChapterPath(java.lang.String chapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, chapterPath);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  // relations
  
  @Override
  public cleon.common.calendar.metamodel.spec.javamodel.ICalendar selectCalendar() {
    return _getSingle(cleon.common.calendar.metamodel.spec.javamodel.ICalendar.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.SchedulePackage.Schedule_calendar);
  }

  public Schedule setCalendar(cleon.common.calendar.metamodel.spec.javamodel.ICalendar calendar) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.SchedulePackage.Schedule_calendar, calendar);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public Schedule setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Schedule setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Schedule setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IReleases selectReleases() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IReleases.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.SchedulePackage.Schedule_releases);
  }

  public Schedule setReleases(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IReleases releases) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.SchedulePackage.Schedule_releases, releases);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprints selectSprints() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprints.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.SchedulePackage.Schedule_sprints);
  }

  public Schedule setSprints(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprints sprints) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.SchedulePackage.Schedule_sprints, sprints);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.targetdates.javamodel.IDeadlines selectTargetDates() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.targetdates.javamodel.IDeadlines.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.SchedulePackage.Schedule_targetDates);
  }

  public Schedule setTargetDates(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.targetdates.javamodel.IDeadlines targetDates) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.SchedulePackage.Schedule_targetDates, targetDates);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Schedule setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptSingle(cleon.common.calendar.metamodel.spec.javamodel.ICalendar.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.SchedulePackage.Schedule_calendar, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IReleases.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.SchedulePackage.Schedule_releases, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprints.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.SchedulePackage.Schedule_sprints, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.targetdates.javamodel.IDeadlines.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.SchedulePackage.Schedule_targetDates, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.javamodel.ISchedule selectToMeReleases(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IReleases object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.javamodel.ISchedule.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.SchedulePackage.Schedule_releases, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.javamodel.ISchedule selectToMeSprints(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprints object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.javamodel.ISchedule.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.SchedulePackage.Schedule_sprints, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.javamodel.ISchedule selectToMeTargetDates(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.targetdates.javamodel.IDeadlines object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.javamodel.ISchedule.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.SchedulePackage.Schedule_targetDates, object.getResource());
  }
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.javamodel.ISchedule> selectToMeCalendar(cleon.common.calendar.metamodel.spec.javamodel.ICalendar object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.javamodel.ISchedule.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.SchedulePackage.Schedule_calendar, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5f541a84-a7d8-11e5-82dd-3b995d9c840c,bvfk11XzA7UhatZqDMRf2ohSgHE=] */
