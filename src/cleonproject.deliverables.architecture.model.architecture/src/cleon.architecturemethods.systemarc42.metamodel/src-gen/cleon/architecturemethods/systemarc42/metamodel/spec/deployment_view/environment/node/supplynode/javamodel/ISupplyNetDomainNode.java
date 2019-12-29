package cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.supplynode.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISupplyNetDomainNode extends cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.supplynode.javamodel.ISupplyNode, cleon.common.resources.metamodel.spec.id.javamodel.IStringBusinessObjectId, cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.javamodel.ICustomerAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0674e77a-0aaf-11e9-a8f9-abf1763bbc53");
  
  // attributes
  
  public java.lang.Integer selectGroupId();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.supplynode.javamodel.ISupplyNetDomainNode> selectAllowedToManage();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0674e77a-0aaf-11e9-a8f9-abf1763bbc53,jwBNMBm+kyBr/OsKYNXjRvva54U=] */
