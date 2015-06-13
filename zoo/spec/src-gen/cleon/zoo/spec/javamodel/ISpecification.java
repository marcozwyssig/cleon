package cleon.zoo.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISpecification extends cleon.zoo.spec.javamodel.IProject, ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2cdf0732-e9ba-11e4-848b-0509e3792151");
  
  // relations
  
  public java.util.List<? extends cleon.zoo.spec.javamodel.ITemplate> selectTemplates();
  
  public cleon.zoo.spec.javamodel.ISample selectSample();
  
  public java.util.List<? extends cleon.zoo.spec.javamodel.IModel> selectModel();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2cdf0732-e9ba-11e4-848b-0509e3792151,3raZzchgl2G9Bn2XJUmOG+uDP9c=] */
