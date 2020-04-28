package cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISupplyNetDomainNode extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNode, cleon.common.resources.metamodel.spec.id.javamodel.IStringBusinessObjectId {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0674e77a-0aaf-11e9-a8f9-abf1763bbc53");
  
  // attributes
  
  public java.lang.Integer selectFunctionId();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNetDomainNode> selectAllowedToManage();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ISite selectSite();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0674e77a-0aaf-11e9-a8f9-abf1763bbc53,W45vACrqO1VGN+YWMOjVprZNuwQ=] */
