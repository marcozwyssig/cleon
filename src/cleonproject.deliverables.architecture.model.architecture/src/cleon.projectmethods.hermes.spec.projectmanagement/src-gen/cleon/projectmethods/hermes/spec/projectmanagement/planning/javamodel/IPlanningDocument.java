package cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPlanningDocument extends cleon.common.doc.spec.doc.document.javamodel.INamedDocument, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c6b25ecc-bd15-11e6-ba29-0d3a53b7fc17");
  
  // relations
  
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.initialposition.javamodel.IInitialposition selectInitialposition();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.javamodel.IGoals selectGoals();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel.IConstraints selectConstraints();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.javamodel.IScope selectScope();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.javamodel.ISchedule selectSchedule();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.javamodel.IResourceManagementDocument selectResourceManagement();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c6b25ecc-bd15-11e6-ba29-0d3a53b7fc17,pmKDTA3wdy+UF5FxAtejpZH1anU=] */
