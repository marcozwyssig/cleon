package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISelect extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2dc7aaf7-d0cc-11ee-a38e-0b82bafb3097");
  
  public java.lang.Boolean selectSelectAllFields();
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ISelectField> selectSelectField();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2dc7aaf7-d0cc-11ee-a38e-0b82bafb3097,Www0zott3/RAYcpFZ1hz5fmGpyM=] */
