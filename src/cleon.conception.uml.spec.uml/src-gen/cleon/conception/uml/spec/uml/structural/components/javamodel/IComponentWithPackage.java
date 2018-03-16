package cleon.conception.uml.spec.uml.structural.components.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IComponentWithPackage extends cleon.conception.uml.spec.uml.structural.components.javamodel.IAbstractComponent {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2adc4d98-85c1-11e3-be33-79789cf5eae3");
  
  // relations
  
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentDependency> selectHasDependency();
  
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageDecomposition> selectDecomposePackages();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2adc4d98-85c1-11e3-be33-79789cf5eae3,z6D3u3qZJcEb74jaw+snnEfIJxs=] */
