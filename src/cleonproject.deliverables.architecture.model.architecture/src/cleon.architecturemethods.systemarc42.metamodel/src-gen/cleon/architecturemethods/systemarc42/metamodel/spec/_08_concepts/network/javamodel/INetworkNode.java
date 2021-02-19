package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface INetworkNode extends cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("eb84db3b-7ae6-11e9-a70f-4dc03941a024");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode selectNode();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,eb84db3b-7ae6-11e9-a70f-4dc03941a024,WJpj24dcmhxGEgDkB8/9lAeK1y8=] */
