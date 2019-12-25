package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISprint extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.ITimePlan, cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("46c6145c-3761-11e5-95d9-2b04d7ab02d9");
  
  // relations
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprintGoals selectSprintGoals();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprintCapacity selectSprintCapacity();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprintBacklog selectSprintBacklog();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.teams.javamodel.ITeam selectTeam();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,46c6145c-3761-11e5-95d9-2b04d7ab02d9,pQBB4ayrndXH6XTIf2C1hcwN/II=] */
