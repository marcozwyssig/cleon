package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITable extends ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ICommentAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("09a46257-b934-11ee-a0d0-e953bcbfaeef");
  
  public java.lang.Boolean selectPersistent();
  
  public java.lang.Boolean selectHistory();
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumn> selectColumns();
  
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IPrimaryKey selectPrimary_key();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumerationValue selectScope();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,09a46257-b934-11ee-a0d0-e953bcbfaeef,e+pylRZ7pgVDdUntG01ZGhx08Vs=] */
