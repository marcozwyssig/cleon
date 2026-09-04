package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.subzonepolicy.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISubZoneAccessPolicy extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("80913edf-b844-11e9-8760-2d4a9d15ec14");
  
  // relations
  
  public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone selectPolicyForDestinationSecuritySubZone();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.IDestination> selectDestinationCommunication();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.IDestinationSubSecurityZone> selectDestination();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,80913edf-b844-11e9-8760-2d4a9d15ec14,iN+4DOX1hbPv7MPZb/3Ur1IQo6E=] */
