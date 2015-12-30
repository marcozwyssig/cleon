package cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class FunctionalRequirement extends DynamicResource implements IFunctionalRequirement {

  // abstract implementation, only used for static method calls
  private FunctionalRequirement() {
    super(IFunctionalRequirement.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,54db77d4-a95d-11e5-bda2-a7fc3bd7c783,6ynE02P0Cij82C7Pa7cQqlYPCS4=] */
