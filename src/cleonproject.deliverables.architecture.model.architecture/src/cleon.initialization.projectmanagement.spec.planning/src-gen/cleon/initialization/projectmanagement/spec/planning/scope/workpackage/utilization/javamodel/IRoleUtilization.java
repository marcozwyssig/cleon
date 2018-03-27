package cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRoleUtilization extends ch.actifsource.core.javamodel.IDecorator, cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("75e4e41e-c291-11e6-ba8e-05f5391bcda8");
  
  public java.lang.Integer selectAllocation();
  
  // relations
  
  public cleon.initialization.projectmanagement.spec.planning.organisation.roles.javamodel.IRole selectRole();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,75e4e41e-c291-11e6-ba8e-05f5391bcda8,5+91Byv4M6fYFVEL7A1hIP9wH6o=] */
