package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISchedule extends ch.actifsource.core.javamodel.IResource, cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("5f541a84-a7d8-11e5-82dd-3b995d9c840c");
  
  // relations
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IReleases selectReleases();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprints selectSprints();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.targetdates.javamodel.IDeadlines selectTargetDates();
  
  public cleon.common.calendar.metamodel.spec.javamodel.ICalendar selectCalendar();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,5f541a84-a7d8-11e5-82dd-3b995d9c840c,+rObHTTJR3TCVAxm4FMzHLWS22o=] */
