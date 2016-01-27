package cleon.sda.spec.projectmanagement.planning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPlanning extends cleon.sda.spec.projectmanagement.javamodel.IProjectDocument, cleon.doc.spec.document.javamodel.IDocument, cleon.doc.spec.document.javamodel.INoSubDocuments {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("5f541a84-a7d8-11e5-82dd-3b995d9c840c");
  
  // relations
  
  public cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.IReleasePlanning selectReleasePlanning();
  
  public cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintPlannings selectSprintPlanning();
  
  public cleon.sda.spec.projectmanagement.planning.targetdates.javamodel.ITargetDates selectTargetDates();
  
  public cleon.sda.spec.projectmanagement.planning.calendar.javamodel.ICalendar selectCalendar();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,5f541a84-a7d8-11e5-82dd-3b995d9c840c,TDyQIlubVUkJpkFF0CIDUiJbNo4=] */
