package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITableArea extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractNamedChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("01f5d505-b934-11ee-a0d0-e953bcbfaeef");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITable> selectTables();
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IView> selectViews();
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IView> selectSubviews();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,01f5d505-b934-11ee-a0d0-e953bcbfaeef,Yq447pm2Z9G0rnRjv86Cbfa1GlM=] */
