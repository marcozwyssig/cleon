package ikt.product.documentation.spec.buildingblock.systemconfiguration.machinesystemconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICPU extends ikt.product.documentation.spec.buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.IProcessor {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("084c2bda-2afe-11e9-9692-65766bc2daa5");
  
  // relations
  
  public java.util.List<? extends ikt.product.documentation.spec.buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.ICore> selectCores();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,084c2bda-2afe-11e9-9692-65766bc2daa5,G8k3K0pwzftZOzTRvlDHyOEqL7M=] */
