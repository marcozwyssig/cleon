package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISoftwareMonolithDatabase extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.javamodel.IAbstractSoftwareMonolithComponent {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("879c1900-bf7f-11ee-b188-131fa688415c");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.ITableArea> selectTableAreas();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumeration selectScope();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,879c1900-bf7f-11ee-b188-131fa688415c,iAbKut9FGPJl4iqMGl8yEr1HSJY=] */
