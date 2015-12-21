package cleon.sda.spec.projectmanagement.ressources.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Resource extends DynamicResource implements IResource {

  // abstract implementation, only used for static method calls
  private Resource() {
    super(IResource.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,99812219-ff9e-11e4-ac0a-959b440f987f,xHcrIuUi9Z3sshReCu4jOTPK+uA=] */
