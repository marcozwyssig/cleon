package cleon.uml.spec.structural.components.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IComponentWithPackage extends cleon.uml.spec.structural.components.javamodel.IComponent {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4472ee70-1475-11e5-a016-a15bccd8b132");
  
  // relations
  
  public java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackage> selectPackages();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4472ee70-1475-11e5-a016-a15bccd8b132,2ViUBlrs/5nRCv/eA7NjE50yl6c=] */
