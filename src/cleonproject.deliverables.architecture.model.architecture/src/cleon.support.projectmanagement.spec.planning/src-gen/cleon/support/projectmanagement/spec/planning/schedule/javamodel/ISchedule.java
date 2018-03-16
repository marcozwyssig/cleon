package cleon.support.projectmanagement.spec.planning.schedule.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISchedule extends ch.actifsource.core.javamodel.IResource, cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("5f541a84-a7d8-11e5-82dd-3b995d9c840c");
  
  // relations
  
  public cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.IReleases selectReleases();
  
  public cleon.support.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlannings selectSprintPlanning();
  
  public cleon.support.projectmanagement.spec.planning.schedule.targetdates.javamodel.IDeadlines selectTargetDates();
  
  public cleon.common.resources.spec.calendar.javamodel.ICalendar selectCalendar();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,5f541a84-a7d8-11e5-82dd-3b995d9c840c,7+CTiGwKZhtpsDZMrziZ5yDaDXA=] */
