package ikt.product.documentation.spec.buildingblock.systemconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractSystemConfiguration extends DynamicResource implements IAbstractSystemConfiguration {

  // abstract implementation, only used for static method calls
  private AbstractSystemConfiguration() {
    super(IAbstractSystemConfiguration.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,13ab12f8-0218-11e9-b327-17da2da63a8f,8yN5xjjZrAgHVXYCJ0p1PkqTzuY=] */
