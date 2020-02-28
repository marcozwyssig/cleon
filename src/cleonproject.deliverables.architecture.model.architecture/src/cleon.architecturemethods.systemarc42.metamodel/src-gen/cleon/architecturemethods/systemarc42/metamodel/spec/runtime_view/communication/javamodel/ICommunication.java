package cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICommunication extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("91bc9aa9-8779-11e9-a61b-279ebde48b48");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.IAbstractSystem selectCommunicationSystem();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.IDestination> selectDestination();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,91bc9aa9-8779-11e9-a61b-279ebde48b48,gqb3doycMChtCiNeV+OAlVWTSRc=] */
