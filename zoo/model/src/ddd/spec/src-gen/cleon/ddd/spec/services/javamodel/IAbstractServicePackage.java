package cleon.ddd.spec.services.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractServicePackage extends cleon.uml.spec.structural.packages.javamodel.IPackage {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e2850326-01df-11e4-ab1e-81fd30785d6d");
  
  // relations
  
  public java.util.List<? extends cleon.ddd.spec.services.javamodel.IServicePackage> selectServicePackages();
  
  public java.util.List<? extends cleon.ddd.spec.javamodel.IDomainService> selectServices();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e2850326-01df-11e4-ab1e-81fd30785d6d,NB7V9dAW5Q0keDX/dfIBu4J+YTA=] */
