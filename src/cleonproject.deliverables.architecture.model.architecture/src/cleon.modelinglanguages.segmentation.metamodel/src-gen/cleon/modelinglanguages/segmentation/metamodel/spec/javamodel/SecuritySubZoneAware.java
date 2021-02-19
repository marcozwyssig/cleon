package cleon.modelinglanguages.segmentation.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class SecuritySubZoneAware extends DynamicResource implements ISecuritySubZoneAware {

  // abstract implementation, only used for static method calls
  private SecuritySubZoneAware() {
    super(ISecuritySubZoneAware.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,02abe8e7-0b84-11e9-a136-69d076e48ed1,9gwCqxQ2HM2lytBxjPsfUaMlAs8=] */
