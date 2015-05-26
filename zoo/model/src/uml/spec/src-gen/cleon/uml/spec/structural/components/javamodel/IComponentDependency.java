package cleon.uml.spec.structural.components.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IComponentDependency extends cleon.arc42.spec.buildingblockview.javamodel.IDependency {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6cacbca2-ffc4-11e4-ac0a-959b440f987f");
  
  // relations
  
  public java.util.List<? extends cleon.uml.spec.structural.components.javamodel.IComponent> selectOn();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6cacbca2-ffc4-11e4-ac0a-959b440f987f,E6Oquknr7OxcDf2skWcFTW7r4NU=] */
