package cleon.uml.spec.behavioral.statemachine.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Condition extends DynamicResource implements ICondition {

  // abstract implementation, only used for static method calls
  private Condition() {
    super(ICondition.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e529a31f-3474-11e5-909a-4bcced25d7ee,5Edv5Ay9opjGb/ShNGwFmpVRzzs=] */
