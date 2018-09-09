package cleon.initialization.projectmanagement.spec.planning.schedule.releases.workpackageplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWorkpackagePlanning extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2ca893b3-b487-11e8-8f7e-e5c7a2aaa874");
  
  // relations
  
  public cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackage selectWorkpackage();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2ca893b3-b487-11e8-8f7e-e5c7a2aaa874,Xev5JHo6gEykZPDJvdmOxvie8KU=] */
