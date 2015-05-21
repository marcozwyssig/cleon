package cleon.arc42.spec.buildingblockview.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDependency extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9416ead6-ffb9-11e4-ac0a-959b440f987f");
  
  // relations
  
  public java.util.List<? extends cleon.arc42.spec.buildingblockview.javamodel.IBuildingBlock> selectOn();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9416ead6-ffb9-11e4-ac0a-959b440f987f,9K1tL1S5n70wU+ntQyeFQKElxyw=] */
