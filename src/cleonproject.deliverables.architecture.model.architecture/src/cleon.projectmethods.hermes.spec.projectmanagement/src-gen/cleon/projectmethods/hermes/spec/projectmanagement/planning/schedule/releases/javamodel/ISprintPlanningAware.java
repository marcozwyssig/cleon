package cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISprintPlanningAware extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6578c5b7-c110-11e6-8f58-ad3c6ee7602f");
  
  // relations
  
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprint selectPlannedStartSprint();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprint selectPlannedEndSprint();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6578c5b7-c110-11e6-8f58-ad3c6ee7602f,ax1jB7Khc6Q01KukzijzmK22FgE=] */
