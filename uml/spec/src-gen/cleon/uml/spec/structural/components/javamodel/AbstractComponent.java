package cleon.uml.spec.structural.components.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractComponent extends DynamicResource implements IAbstractComponent {

  // abstract implementation, only used for static method calls
  private AbstractComponent() {
    super(IAbstractComponent.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1090955f-85c1-11e3-be33-79789cf5eae3,LObIr1HaIclMPRqSRf68cNM6E5U=] */
