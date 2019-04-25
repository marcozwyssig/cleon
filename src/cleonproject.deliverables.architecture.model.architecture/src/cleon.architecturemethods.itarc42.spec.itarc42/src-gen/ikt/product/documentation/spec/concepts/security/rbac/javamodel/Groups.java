package ikt.product.documentation.spec.concepts.security.rbac.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Groups extends DynamicResource implements IGroups {

  // abstract implementation, only used for static method calls
  private Groups() {
    super(IGroups.TYPE_ID);
  }
  
  // toMeRelations
  
  public static ikt.product.documentation.spec.concepts.security.rbac.javamodel.IGroups selectToMeSecurityGroups(ikt.product.documentation.spec.concepts.security.rbac.javamodel.ISecurityGroups object) {
    return _getToMeSingle(object.getRepository(), ikt.product.documentation.spec.concepts.security.rbac.javamodel.IGroups.class, ikt.product.documentation.spec.concepts.security.rbac.RbacPackage.Groups_securityGroups, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4e8cc1b1-1d99-11e9-b601-db75aa6f89a4,x+jagrHmEew6Pph5I5SzVhRj7mM=] */
