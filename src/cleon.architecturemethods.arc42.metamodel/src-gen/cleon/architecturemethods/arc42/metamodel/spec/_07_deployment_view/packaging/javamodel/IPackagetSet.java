package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPackagetSet extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.javamodel.IAbstractPackage, ch.actifsource.core.javamodel.IDecorator, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fa35ca8a-cf5a-11ef-a3e8-99fb4b8645f8");
  
  // relations
  
  public cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent selectServiceComponent();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.javamodel.IPackageComponent> selectPackage();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fa35ca8a-cf5a-11ef-a3e8-99fb4b8645f8,C1mM9pJQ4ZN09NFBQvyUSVAp/0E=] */
