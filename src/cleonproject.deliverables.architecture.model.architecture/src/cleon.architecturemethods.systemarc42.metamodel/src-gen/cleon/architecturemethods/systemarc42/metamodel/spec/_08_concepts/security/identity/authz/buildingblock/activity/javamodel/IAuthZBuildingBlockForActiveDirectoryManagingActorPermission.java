package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAuthZBuildingBlockForActiveDirectoryManagingActorPermission extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel.IAbstractAuthZBuildingBlockPermission {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4e74456d-df5c-11eb-95f9-6d420979d010");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.security.iam.javamodel.IActiveDirectoryManagingActor selectActiveDirectoryManagingActor();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4e74456d-df5c-11eb-95f9-6d420979d010,GbEIf1qM9bUhrGguZvQSzcXLJd4=] */
