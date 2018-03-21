package cleon.implementation.gradle.spec.plugin.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPlugin extends ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersionAware, cleon.common.resources.spec.resources.naming.javamodel.IDisplayName, cleon.common.resources.spec.resources.descriptions.javamodel.IMandatoryDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8ae372cf-c0a8-11e7-a130-7198de5ddf3f");
  
  // attributes
  
  public java.lang.String selectNamespace();
  
  public java.util.List<? extends cleon.implementation.gradle.spec.plugin.javamodel.ITask> selectTasks();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8ae372cf-c0a8-11e7-a130-7198de5ddf3f,GZpOLKbo44+gDdFqTc1T3n3xYeI=] */