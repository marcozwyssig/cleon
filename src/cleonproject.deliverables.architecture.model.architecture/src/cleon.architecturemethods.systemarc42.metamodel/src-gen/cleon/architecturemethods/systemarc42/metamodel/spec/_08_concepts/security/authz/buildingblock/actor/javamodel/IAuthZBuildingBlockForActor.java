package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.actor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAuthZBuildingBlockForActor extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f21c7d02-d41f-11eb-9862-7f597b9587dd");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor selectAuthZForActor();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.actor.javamodel.IAuthZBuildingBlockForResponsibility> selectAuthZForResponsibility();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f21c7d02-d41f-11eb-9862-7f597b9587dd,Yfx0irIIYDzhTcyFXeSkz4OoBXI=] */
