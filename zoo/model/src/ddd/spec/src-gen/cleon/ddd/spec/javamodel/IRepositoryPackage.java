package cleon.ddd.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRepositoryPackage extends cleon.uml.spec.structural.packages.javamodel.IPackage {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6b207fc8-01ce-11e4-ab1e-81fd30785d6d");
  
  // relations
  
  public java.util.List<? extends cleon.ddd.spec.javamodel.IRepository> selectRepositories();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6b207fc8-01ce-11e4-ab1e-81fd30785d6d,ookjqKnt2Vuh/+pJF1YuYqI+gis=] */
