package cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.usage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IServiceUsage extends ch.actifsource.core.javamodel.IDecorator, cleon.common.resources.metamodel.spec.confidentiality.javamodel.IConfidentialityClassificationAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("665c3da7-c690-11e6-8242-2f0ed6756d77");
  
  // relations
  
  public cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.javamodel.IService selectService();
  
  public cleon.common.resources.metamodel.spec.availability.javamodel.IAvailabilityClassification selectAvailabilityClassification();
  
  public cleon.common.resources.metamodel.spec.confidentiality.javamodel.IConfidentialityClassification selectConfidentialityClassification();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,665c3da7-c690-11e6-8242-2f0ed6756d77,ImqKIgvQVM7GNKVDfIZ0AShgjCE=] */
