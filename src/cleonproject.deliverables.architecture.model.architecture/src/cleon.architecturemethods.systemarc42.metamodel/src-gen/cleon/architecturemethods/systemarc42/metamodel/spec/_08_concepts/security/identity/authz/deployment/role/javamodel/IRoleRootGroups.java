package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRoleRootGroups extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.javamodel.IAbstractRootGroups {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3e5a557a-1d99-11e9-b601-db75aa6f89a4");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel.IRoleSiteGroup> selectRoleForSite();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3e5a557a-1d99-11e9-b601-db75aa6f89a4,c5mrPyf1HasYNp4qlPAlYHRr2tY=] */
