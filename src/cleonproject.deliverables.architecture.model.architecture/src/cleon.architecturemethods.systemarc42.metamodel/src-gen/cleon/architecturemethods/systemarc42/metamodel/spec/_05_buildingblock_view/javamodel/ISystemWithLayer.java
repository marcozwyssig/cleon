package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISystemWithLayer extends cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractSystem, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractRootSystem {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d6859a6c-99aa-11e8-8f58-219af2c5d6d9");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemLayer> selectLayers();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d6859a6c-99aa-11e8-8f58-219af2c5d6d9,grTXhnNU66ntQKgIaNOrhytXizM=] */
