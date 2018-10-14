package cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISchedule extends ch.actifsource.core.javamodel.IResource, cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("5f541a84-a7d8-11e5-82dd-3b995d9c840c");
  
  // relations
  
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.IReleases selectReleases();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprintplanning.javamodel.ISprintPlannings selectSprintPlanning();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.targetdates.javamodel.IDeadlines selectTargetDates();
  
  public cleon.common.resources.spec.calendar.javamodel.ICalendar selectCalendar();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,5f541a84-a7d8-11e5-82dd-3b995d9c840c,GD/W3fx3v8jt8d42coP145kfKZ8=] */
