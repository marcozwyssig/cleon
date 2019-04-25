package ikt.product.documentation.spec.concepts.businesscontinuity.availability.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAvailability extends ikt.product.documentation.spec.concepts.businesscontinuity.javamodel.IBusinessContinuityConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ccb76508-0eae-11e9-9f19-6d15636f4ecc");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends ikt.product.documentation.spec.concepts.businesscontinuity.availability.javamodel.IAvailabilitySystemConfiguration> selectAvailabilitySystemConfigurations();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ccb76508-0eae-11e9-9f19-6d15636f4ecc,qW1h0AvWPdUJGPPWFeii1Z5vX4s=] */
