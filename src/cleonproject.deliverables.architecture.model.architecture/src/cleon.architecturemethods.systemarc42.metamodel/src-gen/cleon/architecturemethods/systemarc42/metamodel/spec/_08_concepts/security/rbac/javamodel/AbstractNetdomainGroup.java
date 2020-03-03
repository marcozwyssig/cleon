package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractNetdomainGroup extends DynamicResource implements IAbstractNetdomainGroup {

  // abstract implementation, only used for static method calls
  private AbstractNetdomainGroup() {
    super(IAbstractNetdomainGroup.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IAbstractNetdomainGroup> selectToMeNetdomain(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNetDomainNode object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IAbstractNetdomainGroup.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.AbstractNetdomainGroup_netdomain, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IAbstractNetdomainGroup selectToMeSecurityGroups(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IAbstractSecurityGroups object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IAbstractNetdomainGroup.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.RbacPackage.AbstractNetdomainGroup_securityGroups, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b1b09ea6-1e06-11e9-834d-77c41fccc6bf,ktY43ypkLZK1AMglwER3tgBrf28=] */
