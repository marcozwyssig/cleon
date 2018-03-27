package cleon.initialization.projectmanagement.spec.steering.controlling.module.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IModulesControlling extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("daab8237-bdfc-11e6-a3f0-c7681ee45a3f");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.initialization.projectmanagement.spec.steering.controlling.module.javamodel.IModuleControlling> selectModuleControllings();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,daab8237-bdfc-11e6-a3f0-c7681ee45a3f,BMt9OJCvaQDyz8tiT/WlUDEkADU=] */
