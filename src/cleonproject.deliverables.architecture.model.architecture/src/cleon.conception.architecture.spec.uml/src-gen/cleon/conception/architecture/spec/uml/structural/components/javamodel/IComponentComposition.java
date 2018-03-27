package cleon.conception.architecture.spec.uml.structural.components.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IComponentComposition extends cleon.conception.architecture.spec.uml.structural.components.javamodel.IAbstractComponent {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("18a510ec-85c1-11e3-be33-79789cf5eae3");
  
  // relations
  
  public java.util.List<? extends cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentCompositionDecomposite> selectDecomposeComponent();
  
  public java.util.List<? extends cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentCompositionDependency> selectHasDependency();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,18a510ec-85c1-11e3-be33-79789cf5eae3,oSD33PYQmY5U8EB08YoJySb6LR0=] */
