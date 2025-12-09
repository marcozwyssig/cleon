package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractTableRelation extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6fc728b3-621a-11f0-8ed9-1d79caf8da43");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTable selectToTable();
  
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn selectPrimaryKey();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6fc728b3-621a-11f0-8ed9-1d79caf8da43,EFcSLwMmCgHxr3l6iQgxBtnuljg=] */
