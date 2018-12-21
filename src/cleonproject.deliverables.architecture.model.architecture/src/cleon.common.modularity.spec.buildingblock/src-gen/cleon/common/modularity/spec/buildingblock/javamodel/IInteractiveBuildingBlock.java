package cleon.common.modularity.spec.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IInteractiveBuildingBlock extends cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4a80d1f2-0511-11e9-87b8-094c52ae4c98");
  
  // relations
  
  public java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IInteraction> selectInteracts();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4a80d1f2-0511-11e9-87b8-094c52ae4c98,/a4cNfLAKZJKU7kjdbZX3CH8E2k=] */
