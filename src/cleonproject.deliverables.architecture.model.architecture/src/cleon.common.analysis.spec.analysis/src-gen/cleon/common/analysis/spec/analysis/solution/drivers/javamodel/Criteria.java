package cleon.common.analysis.spec.analysis.solution.drivers.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Criteria extends DynamicResource implements ICriteria {

  // abstract implementation, only used for static method calls
  private Criteria() {
    super(ICriteria.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1191ded4-a6f9-11e8-9c81-8bd68c62e435,XSJBdM1LDyBA0O5psI9lr4lumkY=] */
