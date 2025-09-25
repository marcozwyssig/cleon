package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRoleSystemComponent extends ch.actifsource.core.javamodel.IDecorator, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.javamodel.IAbstractSingleGroup, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IActivityAllocationFromSiteAware, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.javamodel.IAbstractMember {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e33fb742-35e4-11e9-9d58-25409887bb2a");
  
  public java.lang.Integer selectUniqueId();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.javamodel.IRoleTemplate selectSystemComponentRoleTemplate();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite> selectAllocateActivitiesOfSite();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> selectExcludeActivities();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.javamodel.IAbstractMember> selectMemberOf();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.javamodel.IAbstractMember> selectMembers();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.system.javamodel.IAbstractSystemOrSystemConfiguration> selectAllowAccessTo();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> selectAvailablePermissionTemplateOfSystemConfigurations();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e33fb742-35e4-11e9-9d58-25409887bb2a,2SNSXQqErVX50kQgj3F/MpkxTNs=] */
