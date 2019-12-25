package cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPackage extends cleon.common.modularity.metamodel.spec.javamodel.IDecompositionBuildingBlock {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2f4eebfb-92f9-11e3-a63e-fb8038f76aec");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage> selectSubPackages();
  
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IClassifier> selectDecomposeClasses();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2f4eebfb-92f9-11e3-a63e-fb8038f76aec,638qBe112wm/83VKODw3h+TYdYo=] */
