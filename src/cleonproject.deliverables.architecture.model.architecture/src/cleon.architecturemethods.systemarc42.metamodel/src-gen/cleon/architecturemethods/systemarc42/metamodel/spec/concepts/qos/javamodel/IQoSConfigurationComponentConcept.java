package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IQoSConfigurationComponentConcept extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConfigurationComponentConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("39818d2e-1d88-11e9-b601-db75aa6f89a4");
  
  // attributes
  
  public java.lang.Integer selectEstimate_KBits();
  
  public java.lang.Integer selectEstimateMean_KBits();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.javamodel.IServiceClass selectServiceClass();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,39818d2e-1d88-11e9-b601-db75aa6f89a4,p3uS6OFBNlkOgll4/W9rSDE7z4I=] */