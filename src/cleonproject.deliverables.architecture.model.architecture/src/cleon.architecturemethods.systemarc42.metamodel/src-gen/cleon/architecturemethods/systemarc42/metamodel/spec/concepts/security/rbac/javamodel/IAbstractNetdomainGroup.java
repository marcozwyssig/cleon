package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractNetdomainGroup extends ch.actifsource.core.javamodel.IDecorator, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.javamodel.IAbstractGroups {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b1b09ea6-1e06-11e9-834d-77c41fccc6bf");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.supplynode.javamodel.ISupplyNetDomainNode selectNetdomain();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.javamodel.IAbstractSecurityGroups> selectSecurityGroups();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b1b09ea6-1e06-11e9-834d-77c41fccc6bf,eMDO4aeVjHFd/qUYvTTFcf1d2d4=] */
