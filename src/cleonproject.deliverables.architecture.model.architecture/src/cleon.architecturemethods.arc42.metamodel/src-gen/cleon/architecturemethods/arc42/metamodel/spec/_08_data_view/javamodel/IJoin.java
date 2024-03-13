package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IJoin extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("31b588e1-e114-11ee-995f-5faf5f77d478");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ITable selectWith();
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IOnField> selectOn();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,31b588e1-e114-11ee-995f-5faf5f77d478,+umwdqwTp8qEWAB6U0yBYru9SeQ=] */
