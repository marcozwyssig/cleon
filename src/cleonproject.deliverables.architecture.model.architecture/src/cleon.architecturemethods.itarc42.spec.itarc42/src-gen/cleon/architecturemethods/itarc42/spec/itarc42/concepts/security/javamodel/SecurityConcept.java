package cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class SecurityConcept extends DynamicResource implements ISecurityConcept {

  // abstract implementation, only used for static method calls
  private SecurityConcept() {
    super(ISecurityConcept.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ea49ca18-1d59-11e9-bba4-1d5db4cb1d61,FlvshS8XBjfcXevZTxUTkAQ7bYg=] */
