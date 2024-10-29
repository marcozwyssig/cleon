package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRoleSiteGroup extends cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.javamodel.IAbstractSiteGroup, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IActivityAllocationFromSiteAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("94d1c1e5-1da3-11e9-b601-db75aa6f89a4");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleActorGroup> selectRoleforActors();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite> selectAllocateActivitiesFromSite();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,94d1c1e5-1da3-11e9-b601-db75aa6f89a4,9DiM4hvMg9daY/jnHKsUKxkKJOw=] */
