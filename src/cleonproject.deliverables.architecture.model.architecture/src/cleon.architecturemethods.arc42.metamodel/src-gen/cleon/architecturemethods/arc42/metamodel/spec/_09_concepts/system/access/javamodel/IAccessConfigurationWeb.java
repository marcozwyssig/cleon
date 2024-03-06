package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAccessConfigurationWeb extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2f2144a1-2438-11eb-83b1-3d2a97975978");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfigurationWebService> selectAccessByService();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2f2144a1-2438-11eb-83b1-3d2a97975978,RfSo/2NhYldwPY9F7xbJXR/vtnQ=] */
