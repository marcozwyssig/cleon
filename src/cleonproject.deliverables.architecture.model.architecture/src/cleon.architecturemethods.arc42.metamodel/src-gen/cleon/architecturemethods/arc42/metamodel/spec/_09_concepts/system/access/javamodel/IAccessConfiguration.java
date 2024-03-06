package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAccessConfiguration extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("db632dc0-1ea1-11eb-9eef-0dadb2b460da");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessCommunicationType selectAccessCommunicationType();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfigurationService> selectAccessByService();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IPurpose selectPurpose();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,db632dc0-1ea1-11eb-9eef-0dadb2b460da,sZ6ixX0Edf20d4kSQENH4CV8sk0=] */
