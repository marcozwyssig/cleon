package cleon.modelinglanguages.network.spec.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface INetworkDiagram extends ch.actifsource.core.javamodel.INamedResource, cleon.common.doc.spec.doc.paragraph.javamodel.IStandardParagraph, cleon.common.doc.spec.doc.javamodel.INoDocumentElementComposite {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a6f94ec5-092f-11e9-8c40-11db3668c0c9");
  
  public java.lang.String selectPath();
  
  // relations
  
  public cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetworks selectNetwork();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a6f94ec5-092f-11e9-8c40-11db3668c0c9,YQcldCscNiKGkKckvshdvgR6Nlc=] */
