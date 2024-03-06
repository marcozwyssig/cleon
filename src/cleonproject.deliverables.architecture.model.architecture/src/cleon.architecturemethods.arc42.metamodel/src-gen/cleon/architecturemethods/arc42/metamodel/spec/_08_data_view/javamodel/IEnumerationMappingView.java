package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEnumerationMappingView extends ch.actifsource.core.javamodel.IResource, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8fa61b6b-cffc-11ee-9bb8-5f4f5b483c01");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ITableMappingView> selectTableMappingView();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumeration selectScope();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8fa61b6b-cffc-11ee-9bb8-5f4f5b483c01,zaZvzdbwnom/kQKVqi5pfbS7U7w=] */
