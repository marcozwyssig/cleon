package cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDependentBuildingBlock extends cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel.IBuildingBlock {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2fc8dc46-ffba-11e4-ac0a-959b440f987f");
  
  // relations
  
  public java.util.List<? extends cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel.IDependency> selectHasDependency();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2fc8dc46-ffba-11e4-ac0a-959b440f987f,AWr8Rs8n+Zb4juhoAi42IC7fg3k=] */