package ikt.product.documentation.spec.concepts.segmentation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class NamedZone extends DynamicResource implements INamedZone {

  // abstract implementation, only used for static method calls
  private NamedZone() {
    super(INamedZone.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0325c007-0b77-11e9-a136-69d076e48ed1,P3jyctXsbdDUmfayoPYzVHzCopM=] */
