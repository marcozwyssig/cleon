package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAccessConfigurationService extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("962adc32-c1d8-11eb-8c09-03c14294ecfb");
  
  public java.lang.Boolean selectUseFQDN();
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IHostAccessMode selectHostAccessMode();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService selectService();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,962adc32-c1d8-11eb-8c09-03c14294ecfb,Htb9yt7OyEI2I4/TS0LWuoOiAkE=] */
