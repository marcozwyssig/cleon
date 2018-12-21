package cleon.common.modularity.spec.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IInheritableBuildingBlock extends cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b9115cb9-ffba-11e4-ac0a-959b440f987f");
  
  // relations
  
  public java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IInheritance> selectInherits();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b9115cb9-ffba-11e4-ac0a-959b440f987f,ttlQZGirOViqa2ESVd+JWhutCqs=] */
