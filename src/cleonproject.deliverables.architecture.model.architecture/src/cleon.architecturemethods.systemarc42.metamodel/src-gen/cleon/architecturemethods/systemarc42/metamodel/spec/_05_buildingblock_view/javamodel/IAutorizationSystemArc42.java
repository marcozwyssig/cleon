package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAutorizationSystemArc42 extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAutorization, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c727191a-23f5-11eb-83b1-3d2a97975978");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForSystemConfiguration selectActivityBlock();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c727191a-23f5-11eb-83b1-3d2a97975978,lpEw+vvTZWPmkW6iILUiqajkcSA=] */
