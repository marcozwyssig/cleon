package cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISprintPlannings extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b643c029-c009-11e5-a165-d34765931e10");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlanning> selectSprintplannings();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b643c029-c009-11e5-a165-d34765931e10,M7ccAhOBdcCJOH29HXgmuA3g+Q4=] */
