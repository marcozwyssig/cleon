package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.actor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAuthZBuildingBlockForResponsibility extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e1714cf6-d421-11eb-9862-7f597b9587dd");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel.IResponsibility selectResponsibility();
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.actor.javamodel.IAuthZBuildingBlockForSystemComponent> selectAuthZForSystemOrSystemComponents();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e1714cf6-d421-11eb-9862-7f597b9587dd,r9gYQZ6Xt/UQl5Kg0uVwFBaujHg=] */
