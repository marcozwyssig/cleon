package cleon.architecturemethods.itarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICPU extends cleon.architecturemethods.itarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.javamodel.IProcessor {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("084c2bda-2afe-11e9-9692-65766bc2daa5");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.itarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.javamodel.ICore> selectCores();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,084c2bda-2afe-11e9-9692-65766bc2daa5,T2OvyRinAo58TWhLTvl5QXH4tGc=] */
