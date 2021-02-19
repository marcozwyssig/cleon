package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPlanning extends cleon.common.doc.metamodel.spec.document.javamodel.IDocument, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c6b25ecc-bd15-11e6-ba29-0d3a53b7fc17");
  
  // relations
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.initialposition.javamodel.IInitialposition selectInitialposition();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.goals.javamodel.IGoals selectGoals();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.constraints.javamodel.IConstraints selectConstraints();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.javamodel.IScope selectScope();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.javamodel.ISchedule selectSchedule();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.javamodel.IResourceManagementDocument selectResourceManagement();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c6b25ecc-bd15-11e6-ba29-0d3a53b7fc17,sS0x0a9KJHr29Su41+tOSGLFu88=] */
