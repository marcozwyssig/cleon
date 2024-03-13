package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICondition extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IAbstractColumn {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f75c24b0-d0d0-11ee-bd60-4767a6be68d4");
  
  public java.lang.String selectValue();
  
  // relations
  
  public ch.actifsource.core.validation.javamodel.IConditionalOperator selectOperator();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f75c24b0-d0d0-11ee-bd60-4767a6be68d4,u9mw0xyBKatCKJLsSHa5dC5V2iA=] */
