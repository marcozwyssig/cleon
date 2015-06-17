package cleon.arc42.spec._05_buildingblockview.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IUseBuildingBlock extends cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock, cleon.doc.spec.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("53d51c49-7ad7-11e4-a6e2-23d949480f96");
  
  // relations
  
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock> selectUseDecompositions();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,53d51c49-7ad7-11e4-a6e2-23d949480f96,2I8yy1MItMBP6eaYdeF3WBxXWDA=] */
