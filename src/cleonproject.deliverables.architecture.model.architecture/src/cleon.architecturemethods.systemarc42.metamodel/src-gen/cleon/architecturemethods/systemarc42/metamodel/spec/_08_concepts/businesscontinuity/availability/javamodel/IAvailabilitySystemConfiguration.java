package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.availability.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAvailabilitySystemConfiguration extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("68803d0a-1e37-11e9-865e-41ef48a95f70");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration selectSystemConfiguration();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.availability.javamodel.IAvailabilityConfiguration selectAvailability();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,68803d0a-1e37-11e9-865e-41ef48a95f70,wOtBpy/6Xl7SwNMHf1lSYeACJ1s=] */
