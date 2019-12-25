package cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractSecurityGroups extends DynamicResource implements IAbstractSecurityGroups {

  // abstract implementation, only used for static method calls
  private AbstractSecurityGroups() {
    super(IAbstractSecurityGroups.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.javamodel.IAbstractSecurityGroups> selectToMeResponsible(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.javamodel.IAbstractSecurityGroups.class, cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.RbacPackage.AbstractSecurityGroups_responsible, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.javamodel.IAbstractSecurityGroups> selectToMeApproval(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.javamodel.IAbstractSecurityGroups.class, cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.RbacPackage.AbstractSecurityGroups_approval, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ff9a619e-1d99-11e9-b601-db75aa6f89a4,Lc1PLMqRzOgfQfpIZDDVfl47p2w=] */
