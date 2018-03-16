package cleon.support.projectmanagement.spec.planning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPlanning extends cleon.common.doc.spec.doc.document.javamodel.INamedDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c6b25ecc-bd15-11e6-ba29-0d3a53b7fc17");
  
  // relations
  
  public cleon.support.projectmanagement.spec.planning.initialposition.javamodel.IInitialposition selectInitialposition();
  
  public cleon.support.projectmanagement.spec.planning.goals.javamodel.IGoals selectGoals();
  
  public cleon.support.projectmanagement.spec.planning.constraints.javamodel.IConstraints selectConstraints();
  
  public cleon.support.projectmanagement.spec.planning.scope.javamodel.IScope selectScope();
  
  public cleon.support.projectmanagement.spec.planning.schedule.javamodel.ISchedule selectSchedule();
  
  public cleon.support.projectmanagement.spec.planning.organisation.javamodel.IOrganisation selectOrganisation();
  
  public cleon.support.projectmanagement.spec.resource.javamodel.IResourceManagement selectResourceManagement();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c6b25ecc-bd15-11e6-ba29-0d3a53b7fc17,Rulsvh269NfP9XnejpzfcR/eg4s=] */
