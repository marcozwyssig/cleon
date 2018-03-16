package cleon.conception.uml.spec.uml.behavioral.statemachine.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class State extends DynamicResource implements IState {

  // abstract implementation, only used for static method calls
  private State() {
    super(IState.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9294aba1-352f-11e5-909a-4bcced25d7ee,3qbAj4UAhKJgI38n69pvR3iC/a8=] */
