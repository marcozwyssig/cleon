package cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRBAC extends cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.javamodel.IAbstractSecurityConcept, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6c337cfe-0eaf-11e9-9f19-6d15636f4ecc");
  
  // relations
  
  public cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.role.javamodel.IRoleRootGroups selectRoles();
  
  public cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IActivityRootGroups selectActivities();
  
  public cleon.architecturemethods.itarc42.metamodel.spec.deployment_view.environment.javamodel.IEnvironment selectEnvironment();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6c337cfe-0eaf-11e9-9f19-6d15636f4ecc,Qj0oVh6u29SwAiW19akDgBUiKSE=] */
