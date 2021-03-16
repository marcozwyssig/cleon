package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAuthZBuildingBlockForSharePermission extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAbstractAuthZBuildingBlockPermission {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7424ddb6-862f-11eb-9869-4317e18e6c88");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.hardware.storage.javamodel.IShare selectShare();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7424ddb6-862f-11eb-9869-4317e18e6c88,kXO+QKy4sZxWpGE4QhWrls+1EzY=] */
