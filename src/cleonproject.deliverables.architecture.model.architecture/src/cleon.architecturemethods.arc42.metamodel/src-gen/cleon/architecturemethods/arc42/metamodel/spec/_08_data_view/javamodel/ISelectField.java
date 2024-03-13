package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISelectField extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IAbstractField {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("50a4626f-d0cc-11ee-a38e-0b82bafb3097");
  
  public java.lang.String selectAlias();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ISelectAggregate selectAggregate();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,50a4626f-d0cc-11ee-a38e-0b82bafb3097,54SI3Ka6ET26YFSXZoXyHyIKVg8=] */
