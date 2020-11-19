package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAuthZBuildingBlockForPermission extends ch.actifsource.core.javamodel.IDecorator, cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, cleon.common.resources.metamodel.spec.active.javamodel.IActiveWithDefaultTrueAware, cleon.common.resources.metamodel.spec.descriptions.javamodel.IMandatoryDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e2629021-0a00-11eb-a857-d17d567fc174");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IPermission selectPermission();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e2629021-0a00-11eb-a857-d17d567fc174,Ez3J9T3K74AbrE5SpCgjJHQnC+I=] */
