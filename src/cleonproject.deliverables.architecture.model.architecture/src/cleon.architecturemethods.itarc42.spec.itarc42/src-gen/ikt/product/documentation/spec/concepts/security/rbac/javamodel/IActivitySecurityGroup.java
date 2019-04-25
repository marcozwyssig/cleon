package ikt.product.documentation.spec.concepts.security.rbac.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IActivitySecurityGroup extends ikt.product.documentation.spec.concepts.security.rbac.javamodel.ISecurityGroups {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0ef24c7d-1d9a-11e9-b601-db75aa6f89a4");
  
  // relations
  
  public cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfiguration selectSystemConfiguration();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends ikt.product.documentation.spec.concepts.security.rbac.javamodel.IActivity> selectActivities();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0ef24c7d-1d9a-11e9-b601-db75aa6f89a4,/OU7I+ZaORLig20ByY40I6I/Y18=] */
