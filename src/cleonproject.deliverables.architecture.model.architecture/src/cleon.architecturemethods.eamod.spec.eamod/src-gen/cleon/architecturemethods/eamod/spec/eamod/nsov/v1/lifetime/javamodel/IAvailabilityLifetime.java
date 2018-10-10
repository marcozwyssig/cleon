package cleon.architecturemethods.eamod.spec.eamod.nsov.v1.lifetime.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAvailabilityLifetime extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9fffa277-c6cb-11e6-8242-2f0ed6756d77");
  
  // relations
  
  public cleon.common.resources.spec.resources.availability.javamodel.IAvailabilityClassification selectAvailabilityClassification();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.eamod.nsov.v1.lifetime.javamodel.IConfidentialityClassification> selectConfidentialityLifetime();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9fffa277-c6cb-11e6-8242-2f0ed6756d77,poGrXbYkDvlvDACWcQWyMlYeiL8=] */
