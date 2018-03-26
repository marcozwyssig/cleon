package cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IServiceProducers extends cleon.support.projectmanagement.spec.planning.scope.deliverable.javamodel.IDeliverables {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e164d2a6-c690-11e6-8242-2f0ed6756d77");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.javamodel.IServiceUsage> selectServices();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e164d2a6-c690-11e6-8242-2f0ed6756d77,7nF9voU3BdDy1r3jHG2i/p1Csbg=] */
