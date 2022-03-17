package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAuthZBuildingBlockForBackupJobs extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel.IAbstractAuthZBuildingBlockPermission {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("12f44f26-a609-11ec-9968-b970a72504b8");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.bcm.javamodel.IBackupJob selectBackupJob();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,12f44f26-a609-11ec-9968-b970a72504b8,ES32A40PO+7AVC/4A7pzRaRQbYg=] */
