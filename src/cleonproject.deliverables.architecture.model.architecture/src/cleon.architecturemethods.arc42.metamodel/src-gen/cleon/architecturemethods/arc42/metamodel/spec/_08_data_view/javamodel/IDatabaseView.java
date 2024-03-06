package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDatabaseView extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("846aa8f6-db90-11ee-bf0f-4753d26fac10");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel.ISoftwareMonolithDatabase selectSoftwareMonolithDatabase();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ITableArea> selectTableAreas();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumeration selectScope();
  
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IEnumerationMappingView selectEnumerationMappingView();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,846aa8f6-db90-11ee-bf0f-4753d26fac10,gkW7hEt9nm60eX2n3ZjJCBt7tEM=] */
