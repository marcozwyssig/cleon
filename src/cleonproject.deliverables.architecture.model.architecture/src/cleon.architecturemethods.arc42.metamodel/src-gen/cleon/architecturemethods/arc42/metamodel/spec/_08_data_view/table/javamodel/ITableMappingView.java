package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITableMappingView extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fe7d7631-cffb-11ee-9bb8-5f4f5b483c01");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumerationValue selectEnumerationValue();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITable> selectTables();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fe7d7631-cffb-11ee-9bb8-5f4f5b483c01,rCEIlqMeH54pcIDnwgF5m0xgE6w=] */
