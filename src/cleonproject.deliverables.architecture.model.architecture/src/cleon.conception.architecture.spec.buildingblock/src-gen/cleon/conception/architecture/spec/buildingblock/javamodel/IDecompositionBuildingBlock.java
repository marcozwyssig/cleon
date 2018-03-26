package cleon.conception.architecture.spec.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDecompositionBuildingBlock extends cleon.conception.architecture.spec.buildingblock.javamodel.IBuildingBlock {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b62f1413-174c-11e5-9ca7-d1bb57b73459");
  
  // relations
  
  public java.util.List<? extends cleon.conception.architecture.spec.buildingblock.javamodel.IDecomposite> selectDecompose();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b62f1413-174c-11e5-9ca7-d1bb57b73459,bX7rFztX7Eei0R8sU35QXO33FM0=] */
