package cleon.architecturemethods.itarc42.metamodel.spec.concepts.businesscontinuity.availability.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAvailabilitySystemConfiguration extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("68803d0a-1e37-11e9-865e-41ef48a95f70");
  
  // relations
  
  public cleon.architecturemethods.itarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfiguration selectSystemConfiguration();
  
  public cleon.architecturemethods.itarc42.metamodel.spec.concepts.businesscontinuity.availability.javamodel.IAvailabilityConfiguration selectAvailability();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,68803d0a-1e37-11e9-865e-41ef48a95f70,L6Taqb+Yzx7jd4EeCpcOIXHmQNw=] */
