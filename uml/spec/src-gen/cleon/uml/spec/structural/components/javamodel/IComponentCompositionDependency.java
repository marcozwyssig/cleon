package cleon.uml.spec.structural.components.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IComponentCompositionDependency extends cleon.arc42.spec.buildingblockview.javamodel.IDependency {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("72e79576-ffc4-11e4-ac0a-959b440f987f");
  
  // relations
  
  public java.util.List<? extends cleon.uml.spec.structural.components.javamodel.IComponentComposition> selectOn();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,72e79576-ffc4-11e4-ac0a-959b440f987f,Vt6eCd8mzL4vzDp5FYe0Z4wgs3Q=] */
