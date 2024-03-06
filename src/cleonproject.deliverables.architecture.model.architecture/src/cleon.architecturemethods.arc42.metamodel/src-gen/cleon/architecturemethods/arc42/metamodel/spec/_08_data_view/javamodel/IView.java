package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IView extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d1f10a4f-d0ca-11ee-a38e-0b82bafb3097");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ISelect selectSelect();
  
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ITable selectFrom();
  
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IGroup_By selectGroupby();
  
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IHaving selectHaving();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d1f10a4f-d0ca-11ee-a38e-0b82bafb3097,e89ODIotgkUlaAz0502dUMg0Qx4=] */
