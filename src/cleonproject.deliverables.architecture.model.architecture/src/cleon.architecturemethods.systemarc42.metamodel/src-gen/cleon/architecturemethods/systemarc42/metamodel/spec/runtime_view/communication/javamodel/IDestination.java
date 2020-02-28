package cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDestination extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("54bec968-877a-11e9-a61b-279ebde48b48");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfiguration selectDestinationSystemConfiguration();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.IDestinationSubSecurityZone> selectDestinationSubSecurityZone();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,54bec968-877a-11e9-a61b-279ebde48b48,2z6gENciUFw2WQDsuua5FnyjwVs=] */
