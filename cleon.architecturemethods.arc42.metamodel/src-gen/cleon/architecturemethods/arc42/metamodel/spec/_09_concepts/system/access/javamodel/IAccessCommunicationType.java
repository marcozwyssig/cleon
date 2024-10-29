package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAccessCommunicationType extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a028c2b5-1e98-11eb-9eef-0dadb2b460da");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IPortService> selectServicesForAccess();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a028c2b5-1e98-11eb-9eef-0dadb2b460da,2xEFBKoen/9vpANsWA58Wg5cIQc=] */
