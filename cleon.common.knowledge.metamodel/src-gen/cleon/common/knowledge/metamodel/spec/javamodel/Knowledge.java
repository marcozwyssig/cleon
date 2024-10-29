package cleon.common.knowledge.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Knowledge extends DynamicResource implements IKnowledge {

  // abstract implementation, only used for static method calls
  private Knowledge() {
    super(IKnowledge.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,833768c2-b797-11e6-85e2-39e149963066,hxZ7O0bNCSmc+UnfeOifhz4xqxk=] */
