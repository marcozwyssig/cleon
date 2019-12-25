package cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.drivers.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Driver extends DynamicResource implements IDriver {

  // abstract implementation, only used for static method calls
  private Driver() {
    super(IDriver.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f1c309ff-a281-11e5-9332-1b5893de4362,meZiL/u+4TUXNNWbkTnDcVIsJVA=] */
