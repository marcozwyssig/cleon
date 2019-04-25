package cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRoleSubnetGroup extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.ISubnetGroup {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("94d1c1e5-1da3-11e9-b601-db75aa6f89a4");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IRole> selectRoles();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,94d1c1e5-1da3-11e9-b601-db75aa6f89a4,ROW2kE0Wi1DeLf/4VIxGcFb016M=] */
