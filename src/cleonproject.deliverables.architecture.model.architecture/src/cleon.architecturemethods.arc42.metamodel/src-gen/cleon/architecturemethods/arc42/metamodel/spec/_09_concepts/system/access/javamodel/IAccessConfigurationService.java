package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAccessConfigurationService extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("962adc32-c1d8-11eb-8c09-03c14294ecfb");
  
  public java.lang.Boolean selectUseFQDN();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IHostAccessMode selectHostAccessMode();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IPortService selectService();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,962adc32-c1d8-11eb-8c09-03c14294ecfb,oKfMNuqe/bGr6lKHHGx0ERiNkIo=] */
