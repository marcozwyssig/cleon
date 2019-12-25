package cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Port extends DynamicResource implements IPort {

  // abstract implementation, only used for static method calls
  private Port() {
    super(IPort.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,70aa3b0a-0514-11e9-87b8-094c52ae4c98,mp71QKaQd8+t3CV97rmcalhn9aE=] */
