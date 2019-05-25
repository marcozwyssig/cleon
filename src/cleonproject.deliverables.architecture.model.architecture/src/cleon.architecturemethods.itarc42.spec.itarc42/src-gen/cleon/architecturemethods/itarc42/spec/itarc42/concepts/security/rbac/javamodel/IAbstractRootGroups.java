package cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractRootGroups extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractGroups {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4e8cc1b1-1d99-11e9-b601-db75aa6f89a4");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractNetdomainGroup> selectNetDomainGroups();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4e8cc1b1-1d99-11e9-b601-db75aa6f89a4,woekUZrLshvbgWhg0uBB41wm15Y=] */
