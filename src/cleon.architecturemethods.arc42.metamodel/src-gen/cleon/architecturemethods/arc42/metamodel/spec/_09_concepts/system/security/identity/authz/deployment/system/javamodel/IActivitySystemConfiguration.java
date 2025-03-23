package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.system.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IActivitySystemConfiguration extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.javamodel.IAbstractSecurityGroups, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.javamodel.IStartAt {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0ef24c7d-1d9a-11e9-b601-db75aa6f89a4");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.system.javamodel.IAuthZBuildingBlockForAbstractSystemOrSystemConfiguration selectActivityForSystemOrSystemConfiguration();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.system.javamodel.IActivityPermission> selectActivitiesForPermissions();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0ef24c7d-1d9a-11e9-b601-db75aa6f89a4,DaFV0C4vyRKrWSHAmjrqnQ1Wt2I=] */
