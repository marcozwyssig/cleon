package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAuthZBuildingBlockActivity extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6dd2381d-03d6-11eb-9c97-71aa0c3a8a81");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForSystem> selectAuthZForSystems();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IPermissions selectUses();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6dd2381d-03d6-11eb-9c97-71aa0c3a8a81,0p+3J26S0UABwP62MIBjFnvAskk=] */
