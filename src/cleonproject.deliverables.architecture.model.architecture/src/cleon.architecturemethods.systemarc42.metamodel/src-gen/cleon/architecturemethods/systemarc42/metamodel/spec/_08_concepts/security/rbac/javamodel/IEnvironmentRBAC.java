package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEnvironmentRBAC extends ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6c337cfe-0eaf-11e9-9f19-6d15636f4ecc");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleRootGroups selectRoles();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.activity.javamodel.IActivityRootGroups selectActivities();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment selectEnvironment();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IEnvironmentRBAC selectMaster();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6c337cfe-0eaf-11e9-9f19-6d15636f4ecc,n2rRMFQiBc82Pt4TuYCzteMAyKc=] */
