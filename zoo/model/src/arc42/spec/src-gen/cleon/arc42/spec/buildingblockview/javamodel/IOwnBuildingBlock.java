package cleon.arc42.spec.buildingblockview.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOwnBuildingBlock extends cleon.arc42.spec.buildingblockview.javamodel.IBuildingBlock {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("44745a10-7a47-11e4-a6e2-23d949480f96");
  
  // relations
  
  public java.util.List<? extends cleon.arc42.spec.buildingblockview.javamodel.IBuildingBlock> selectOwnDecompositions();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,44745a10-7a47-11e4-a6e2-23d949480f96,DktbpyRJ40TuSdErkXKTm060h58=] */
