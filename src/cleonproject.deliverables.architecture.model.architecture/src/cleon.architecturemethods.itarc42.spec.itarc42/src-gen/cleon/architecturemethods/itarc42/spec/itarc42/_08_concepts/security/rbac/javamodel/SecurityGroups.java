package cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class SecurityGroups extends DynamicResource implements ISecurityGroups {

  // abstract implementation, only used for static method calls
  private SecurityGroups() {
    super(ISecurityGroups.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.ISecurityGroups> selectToMeResponsible(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.ISecurityGroups.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.SecurityGroups_responsible, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.ISecurityGroups> selectToMeApproval(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.ISecurityGroups.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.SecurityGroups_approval, object.getResource());
  }
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.ISecurityGroups selectToMeSubnetGroup(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.ISubnetGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.ISecurityGroups.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.RbacPackage.SecurityGroups_subnetGroup, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ff9a619e-1d99-11e9-b601-db75aa6f89a4,VHgqP00xNlHsGrHnvBIRSKv8+PA=] */
