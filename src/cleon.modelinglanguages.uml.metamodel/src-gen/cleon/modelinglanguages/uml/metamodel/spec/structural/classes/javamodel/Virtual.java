package cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Virtual extends DynamicResource implements IVirtual {

  // abstract implementation, only used for static method calls
  private Virtual() {
    super(IVirtual.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6c5468ca-356f-11e3-974d-d19f8c167114,IkLUGZhmJAb3G5MeklyZAZw8oTc=] */
