package cleon.modelinglanguages.uml.metamodel.spec.structural.classes.interfaces.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Interface extends DynamicResource implements IInterface {

  // abstract implementation, only used for static method calls
  private Interface() {
    super(IInterface.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7163044f-2507-11e3-9870-1d4b8a45fe52,b48Sba6yGEu0V38r2EN3HlC2hs0=] */
