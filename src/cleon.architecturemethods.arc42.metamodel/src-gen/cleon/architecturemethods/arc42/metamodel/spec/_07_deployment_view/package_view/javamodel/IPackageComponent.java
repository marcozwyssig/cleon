package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.package_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPackageComponent extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.package_view.javamodel.IAbstractPackage, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e96972fa-bed8-11ef-9199-8d2aaa4407a0");
  
  // relations
  
  public cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent selectComponent();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.package_view.javamodel.IPackageComponent> selectPackage();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e96972fa-bed8-11ef-9199-8d2aaa4407a0,1/TIFcTwbUJGncZIuz4i3kHK51s=] */
