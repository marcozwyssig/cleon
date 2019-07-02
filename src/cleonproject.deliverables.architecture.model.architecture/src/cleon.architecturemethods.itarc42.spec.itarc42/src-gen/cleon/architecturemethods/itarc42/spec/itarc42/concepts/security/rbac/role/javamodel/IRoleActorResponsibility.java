package cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRoleActorResponsibility extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractGroups, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fb08ba17-809b-11e9-8e65-f3f639e40a34");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IRoleSystemComponent> selectRolesForSystemComponents();
  
  public cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IResponsibility selectResponsibility();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fb08ba17-809b-11e9-8e65-f3f639e40a34,sEeMQXM0lSH9w8AfjU7pkS/xUJE=] */
