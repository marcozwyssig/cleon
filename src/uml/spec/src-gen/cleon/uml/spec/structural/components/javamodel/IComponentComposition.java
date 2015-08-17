package cleon.uml.spec.structural.components.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IComponentComposition extends cleon.uml.spec.structural.components.javamodel.IAbstractComponent {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("18a510ec-85c1-11e3-be33-79789cf5eae3");
  
  // relations
  
  public java.util.List<? extends cleon.uml.spec.structural.components.javamodel.IComponentCompositionDecomposition> selectDecomposeComponent();
  
  public java.util.List<? extends cleon.uml.spec.structural.components.javamodel.IComponentCompositionDependency> selectHasDependency();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,18a510ec-85c1-11e3-be33-79789cf5eae3,txra6fFNRlB2+BUWaF7aSt2Wedg=] */
