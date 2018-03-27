package cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISolutions extends cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.ISystem {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d6f6d790-4a7c-11e6-b2ea-f94c9b140b76");
  
  // relations
  
  public java.util.List<? extends cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturerDecomposite> selectDecompose();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d6f6d790-4a7c-11e6-b2ea-f94c9b140b76,0T0wpAWDM/ULbSHZX5J4MJ41t9M=] */
