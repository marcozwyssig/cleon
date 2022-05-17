package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAuthZBuildingBlockForPermission extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel.IAbstractAuthZBuildingBlockPermission {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e2629021-0a00-11eb-a857-d17d567fc174");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IPermission selectPermission();
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockPropertyPermission> selectAuthZBuildingBlockPropertyPermission();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e2629021-0a00-11eb-a857-d17d567fc174,mDID06q+a17EcES+IfW9cbGow/E=] */
