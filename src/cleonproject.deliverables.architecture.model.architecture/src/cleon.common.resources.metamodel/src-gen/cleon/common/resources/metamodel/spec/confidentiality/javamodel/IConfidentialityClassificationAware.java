package cleon.common.resources.metamodel.spec.confidentiality.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IConfidentialityClassificationAware extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c8368597-0b7b-11e9-8a28-597a9a8945ea");
  
  // relations
  
  public cleon.common.resources.metamodel.spec.confidentiality.javamodel.IConfidentialityClassification selectConfidentialityClassification();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c8368597-0b7b-11e9-8a28-597a9a8945ea,h3o3DIVPNvKqxs9fyRW9wQvaOHU=] */
