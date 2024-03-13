package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IGroup_By extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7bb8684b-d0cd-11ee-a38e-0b82bafb3097");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IGroupByField> selectGroupBy();
  
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.view.javamodel.IHaving selectHaving();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7bb8684b-d0cd-11ee-a38e-0b82bafb3097,F/1JpOxp1FotVZ87v9wqvk8duqE=] */
