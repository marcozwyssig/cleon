package ikt.product.documentation.spec.concepts.businesscontinuity.availability.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAvailabilitySystemConfiguration extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator, cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("68803d0a-1e37-11e9-865e-41ef48a95f70");
  
  // relations
  
  public cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfiguration selectSystemConfiguration();
  
  public ikt.product.documentation.spec.concepts.businesscontinuity.availability.javamodel.IAvailabilityConfiguration selectAvailability();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,68803d0a-1e37-11e9-865e-41ef48a95f70,tx8fjNCv/d/F3WN+u5skOg3AeG8=] */
