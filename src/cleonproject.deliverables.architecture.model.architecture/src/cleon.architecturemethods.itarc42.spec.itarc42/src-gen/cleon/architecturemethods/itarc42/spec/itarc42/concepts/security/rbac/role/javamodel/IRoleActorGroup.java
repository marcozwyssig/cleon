package cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRoleActorGroup extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractSecurityGroups, ch.actifsource.core.javamodel.IDecorator, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractGroups {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("88193678-1d9f-11e9-b601-db75aa6f89a4");
  
  public java.lang.String selectRoleDescription();
  
  // relations
  
  public cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor selectActor();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IRoleActorResponsibility> selectRoleActorResponsibilities();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,88193678-1d9f-11e9-b601-db75aa6f89a4,TTKRHOVtDPn71s3AIU6XLPr/XEY=] */
