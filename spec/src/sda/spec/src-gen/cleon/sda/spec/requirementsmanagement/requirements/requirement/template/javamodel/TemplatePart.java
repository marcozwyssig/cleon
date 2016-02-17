package cleon.sda.spec.requirementsmanagement.requirements.requirement.template.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class TemplatePart extends DynamicResource implements ITemplatePart {

  // abstract implementation, only used for static method calls
  private TemplatePart() {
    super(ITemplatePart.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5f8785eb-d55d-11e5-89ea-2d8d86e9ef89,I4RZ6bz0Rnfzgt2yl1OGpPKxp6Q=] */
