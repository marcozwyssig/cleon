package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.activity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IActivityTemplateAware extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c8872d57-d426-11eb-9862-7f597b9587dd");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.activity.javamodel.IAbstractAuthZBuildingBlockPermission> selectActivityTemplatesOnSites();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.activity.javamodel.IAbstractAuthZBuildingBlockPermission> selectActivityTemplatesOnLocalSite();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c8872d57-d426-11eb-9862-7f597b9587dd,wARds9cU6C6/AKOb8Iid5vJ+j9E=] */
