package cleon.sdp.spec.requirements.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractRequirement extends DynamicResource implements IAbstractRequirement {

  // abstract implementation, only used for static method calls
  private AbstractRequirement() {
    super(IAbstractRequirement.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5f437e30-ff9b-11e4-ac0a-959b440f987f,XjMxrBiKeXwqFV8eqFngWqJoVHE=] */
