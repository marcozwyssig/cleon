package cleon.architecturemethods.arc42.spec.arc42.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class NamedArc42 extends DynamicResource implements INamedArc42 {

  // abstract implementation, only used for static method calls
  private NamedArc42() {
    super(INamedArc42.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,58270d36-45a6-11e5-be7f-05f703299ead,Y3U+czshvyEFGJlIUuqowCK1/tc=] */
