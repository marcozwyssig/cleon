package cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class FunctionalTemplateAware extends DynamicResource implements IFunctionalTemplateAware {

  // abstract implementation, only used for static method calls
  private FunctionalTemplateAware() {
    super(IFunctionalTemplateAware.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,54f228fc-d6e1-11e5-a98f-afca63b52e04,JP+grtZ/hsmYzpxbKJAkXRmoHqk=] */
