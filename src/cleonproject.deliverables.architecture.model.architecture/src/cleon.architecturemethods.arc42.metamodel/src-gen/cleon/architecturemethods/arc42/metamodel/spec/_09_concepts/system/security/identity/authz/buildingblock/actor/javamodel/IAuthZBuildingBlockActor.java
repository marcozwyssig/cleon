package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.actor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAuthZBuildingBlockActor extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("45f3c3b7-d41f-11eb-9862-7f597b9587dd");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.actor.javamodel.IAuthZBuildingBlockForActor> selectAuthZForActor();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,45f3c3b7-d41f-11eb-9862-7f597b9587dd,JfiWxkGeH5qrdyElG5liXas/P9Y=] */
