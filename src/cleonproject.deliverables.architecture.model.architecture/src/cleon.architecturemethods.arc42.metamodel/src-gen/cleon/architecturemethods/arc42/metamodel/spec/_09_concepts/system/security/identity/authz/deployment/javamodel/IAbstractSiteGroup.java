package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractSiteGroup extends ch.actifsource.core.javamodel.IDecorator, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.javamodel.IAbstractGroups {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b1b09ea6-1e06-11e9-834d-77c41fccc6bf");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite selectSite();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.javamodel.IAbstractSecurityGroups> selectSecurityGroups();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b1b09ea6-1e06-11e9-834d-77c41fccc6bf,g7izGj7dc9gRfMWPosDr/G4i94Q=] */
