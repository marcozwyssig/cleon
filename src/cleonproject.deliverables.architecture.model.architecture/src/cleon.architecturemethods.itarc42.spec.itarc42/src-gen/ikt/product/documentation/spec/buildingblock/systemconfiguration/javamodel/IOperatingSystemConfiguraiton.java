package ikt.product.documentation.spec.buildingblock.systemconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOperatingSystemConfiguraiton extends ikt.product.documentation.spec.buildingblock.systemconfiguration.javamodel.IAbstractSystemConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("75800d3e-1bfe-11e9-9896-651e5faa32a4");
  
  // relations
  
  public ikt.product.documentation.spec.buildingblock.systemconfiguration.javamodel.IRuntime selectRuntime();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,75800d3e-1bfe-11e9-9896-651e5faa32a4,klt9t5/uMMR+gQv9NeyF9Fs9wJE=] */
