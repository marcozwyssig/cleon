package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAccessConfiguration extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("db632dc0-1ea1-11eb-9eef-0dadb2b460da");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessCommunicationType selectAccessCommunicationType();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfigurationService> selectAccessByService();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,db632dc0-1ea1-11eb-9eef-0dadb2b460da,QgIIcXYwfAYK2Ir5GAwLbQB7+04=] */
