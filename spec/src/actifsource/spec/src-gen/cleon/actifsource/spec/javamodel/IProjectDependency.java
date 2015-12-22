package cleon.actifsource.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IProjectDependency extends cleon.uml.spec.structural.components.javamodel.IComponentDependency {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d8688469-4260-11e5-8a2d-599443ec8ff4");
  
  // relations
  
  public java.util.List<? extends cleon.actifsource.spec.javamodel.IProject> selectTo();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d8688469-4260-11e5-8a2d-599443ec8ff4,69qfobsGLjyu6LtRVQO4rTCIe4E=] */
