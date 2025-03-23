package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAuthZBuildingBlockActor extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("45f3c3b7-d41f-11eb-9862-7f597b9587dd");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.javamodel.IAuthZBuildingBlockForActor> selectAuthZForActor();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IResponsibilities selectResponsibilities();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,45f3c3b7-d41f-11eb-9862-7f597b9587dd,ci4o8iPxd+FEyIDAt1hnpg5khmY=] */
