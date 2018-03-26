package cleon.conception.architecture.spec.eamod.nsov.v1.lifetime.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IConfidentialityClassification extends ch.actifsource.core.javamodel.IDecorator, cleon.conception.architecture.spec.eamod.nsov.v1.lifetime.javamodel.ILifetimeAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ca23724e-c6cb-11e6-8242-2f0ed6756d77");
  
  // relations
  
  public cleon.common.resources.spec.resources.confidentiality.javamodel.IConfidentialityClassification selectConfidentialityClassification();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ca23724e-c6cb-11e6-8242-2f0ed6756d77,lGPxzjGVNMb0Tv0BTit7I3lbtoU=] */
