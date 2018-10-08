package cleon.support.collaboration.spec.sda.manuals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Manual extends DynamicResource implements IManual {

  // abstract implementation, only used for static method calls
  private Manual() {
    super(IManual.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,24f1c6b0-4e6b-11e5-b08e-673a0d02fb08,noWJrgQG2l8e2IMGiRYGayBw1mM=] */
