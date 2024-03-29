package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IActivitySiteGroup extends cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.javamodel.IAbstractSiteGroup {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e3611bf2-1e06-11e9-834d-77c41fccc6bf");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivitySystemConfiguration> selectActivitiesForSystemConfiguration();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e3611bf2-1e06-11e9-834d-77c41fccc6bf,rUPbwOqhx5YwA0vvUx/7eFjCANE=] */
