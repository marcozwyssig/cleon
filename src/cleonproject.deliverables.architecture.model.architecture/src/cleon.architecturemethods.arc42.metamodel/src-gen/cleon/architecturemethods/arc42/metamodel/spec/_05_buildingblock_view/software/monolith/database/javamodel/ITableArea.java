package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITableArea extends ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("01f5d505-b934-11ee-a0d0-e953bcbfaeef");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.ITable> selectTables();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,01f5d505-b934-11ee-a0d0-e953bcbfaeef,+3KkPSKBw+npBCK1BOp96uaFWCM=] */
