package cleon.common.resources.metamodel.spec.confidentiality.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IClassificationAware extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3506d11a-0b7c-11e9-8a28-597a9a8945ea");
  
  // relations
  
  public cleon.common.resources.metamodel.spec.confidentiality.javamodel.IClassification selectClassification();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3506d11a-0b7c-11e9-8a28-597a9a8945ea,H4/pPDst/NlLDP0xWkUIPKSE9/8=] */
