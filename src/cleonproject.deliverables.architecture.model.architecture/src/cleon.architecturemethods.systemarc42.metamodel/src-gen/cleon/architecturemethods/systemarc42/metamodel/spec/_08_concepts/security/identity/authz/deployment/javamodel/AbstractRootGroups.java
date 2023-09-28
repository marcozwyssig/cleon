package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractRootGroups extends DynamicResource implements IAbstractRootGroups {

  // abstract implementation, only used for static method calls
  private AbstractRootGroups() {
    super(IAbstractRootGroups.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.javamodel.IAbstractRootGroups selectToMeSiteGroups(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.javamodel.IAbstractSiteGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.javamodel.IAbstractRootGroups.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.DeploymentPackage.AbstractRootGroups_siteGroups, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4e8cc1b1-1d99-11e9-b601-db75aa6f89a4,XJ1Su+2HykWcSIO9KEkuAnqe1yQ=] */
