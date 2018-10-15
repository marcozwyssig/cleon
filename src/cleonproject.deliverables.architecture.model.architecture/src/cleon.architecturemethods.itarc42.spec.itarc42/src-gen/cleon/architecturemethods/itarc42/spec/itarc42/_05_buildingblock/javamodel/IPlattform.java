package cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPlattform extends cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.ISystem {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d6859a6c-99aa-11e8-8f58-219af2c5d6d9");
  
  // relations
  
  public cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.plattform.os.javamodel.IOperatingSystemsDecomposite selectDecomposeOperatingSystems();
  
  public cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.javamodel.IServersDecomposite selectDecomposeServers();
  
  public cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.storage.javamodel.IStoragesDecomposite selectDecomposeStorages();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d6859a6c-99aa-11e8-8f58-219af2c5d6d9,u24Ek2gmgLCJ9S5t0GqJzNg0/mA=] */
