package cleon.conception.architecture.spec.eamod.chrv.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class RequirementDocument extends DynamicResource implements IRequirementDocument {

  // abstract implementation, only used for static method calls
  private RequirementDocument() {
    super(IRequirementDocument.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,cd2639d2-c027-11e5-b927-b1b055d0575f,fRu/wd4WDZRg0RTqO65CAPk0ECM=] */
