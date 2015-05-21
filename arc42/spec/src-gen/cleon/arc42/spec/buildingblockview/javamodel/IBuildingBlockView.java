package cleon.arc42.spec.buildingblockview.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBuildingBlockView extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("37b55799-ffcc-11e4-ac0a-959b440f987f");
  
  // relations
  
  public java.util.List<? extends cleon.arc42.spec.buildingblockview.javamodel.IBuildingBlock> selectBuildingBlocks();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,37b55799-ffcc-11e4-ac0a-959b440f987f,ir/tj8pCIMbWC1Z5DPVrw8wMUC4=] */
