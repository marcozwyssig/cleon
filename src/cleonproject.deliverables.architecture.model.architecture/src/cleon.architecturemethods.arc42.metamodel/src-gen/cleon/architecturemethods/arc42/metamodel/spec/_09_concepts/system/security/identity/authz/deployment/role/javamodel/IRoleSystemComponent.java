package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRoleSystemComponent extends ch.actifsource.core.javamodel.IDecorator, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.javamodel.IAbstractSingleGroup, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IActivityAllocationFromSiteAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e33fb742-35e4-11e9-9d58-25409887bb2a");
  
  public java.lang.Integer selectUniqueId();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.actor.javamodel.IAuthZBuildingBlockForSystemComponent selectSystemComponentRoleTemplate();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite> selectAllocateActivitiesOfSite();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> selectExcludeActivities();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e33fb742-35e4-11e9-9d58-25409887bb2a,ZDMUXQlDpnqKibX36qADw7EnRjw=] */
