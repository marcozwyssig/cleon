package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.package_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPackageSet extends ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.package_view.javamodel.IAbstractPackage {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("184f3428-bed5-11ef-b625-9d1578892e52");
  
  // relations
  
  public cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent selectRootComponent();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.package_view.javamodel.IPackageComponent> selectPackage();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,184f3428-bed5-11ef-b625-9d1578892e52,rvrEWKnWtQ9v2hRfYUC0FkQPCQs=] */
