package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractSiteGroup extends DynamicResource implements IAbstractSiteGroup {

  // abstract implementation, only used for static method calls
  private AbstractSiteGroup() {
    super(IAbstractSiteGroup.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractSiteGroup> selectToMeSite(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractSiteGroup.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.DeploymentPackage.AbstractSiteGroup_site, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractSiteGroup selectToMeSecurityGroups(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractSecurityGroups object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractSiteGroup.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.DeploymentPackage.AbstractSiteGroup_securityGroups, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b1b09ea6-1e06-11e9-834d-77c41fccc6bf,l44eVIt4EtJwYZyB2iIva7P7lm8=] */
