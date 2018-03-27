package cleon.conception.architecture.spec.togaf.reference._05_architecturebuildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISystem extends cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.ISystem, cleon.conception.architecture.spec.uml.structural.components.javamodel.IAbstractComponent {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0854a116-4a7d-11e6-b2ea-f94c9b140b76");
  
  // relations
  
  public java.util.List<? extends cleon.conception.architecture.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.javamodel.IArchitectureLayerBuildingBlockDecomposite> selectDecompose();
  
  public java.util.List<? extends cleon.conception.architecture.spec.buildingblock.javamodel.IDependency> selectHasDependency();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0854a116-4a7d-11e6-b2ea-f94c9b140b76,7kHOgqS49YO7QvR3FbZYCShuPrk=] */
