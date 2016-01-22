package cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISprintPlanning extends ch.actifsource.core.javamodel.IDecorator, cleon.doc.spec.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("db3c786a-c009-11e5-a165-d34765931e10");
  
  // relations
  
  public cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.ISprint selectSprint();
  
  public cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintGoals selectSprintGoals();
  
  public cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintCapacity selectSprintCapacity();
  
  public cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintBacklog selectSprintBacklog();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,db3c786a-c009-11e5-a165-d34765931e10,1TvJ310s4ARGdYRMEgej0hyU0lE=] */
