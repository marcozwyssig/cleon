package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IViewBase extends ch.actifsource.core.javamodel.IDecorator, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c400e4bd-e120-11ee-995f-5faf5f77d478");
  
  public java.lang.Boolean selectUsed();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ISelect selectSelect();
  
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDatabaseElement selectFrom();
  
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IGroup_By selectGroupby();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IJoin> selectJoin();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c400e4bd-e120-11ee-995f-5faf5f77d478,0LIkTKv+uydba+1x+xrKV3WfTaM=] */
