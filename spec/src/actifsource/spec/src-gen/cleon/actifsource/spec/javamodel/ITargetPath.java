package cleon.actifsource.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITargetPath extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("01463ab3-5202-11e5-89ac-35d4069568da");
  
  // relations
  
  public cleon.actifsource.spec.javamodel.IResource selectResource();
  
  public java.util.List<? extends ch.actifsource.generator.javamodel.IBuildConfig> selectBuildConfigs();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,01463ab3-5202-11e5-89ac-35d4069568da,bEDYRL+54w5I6ueYd0piUZv9A6Q=] */
