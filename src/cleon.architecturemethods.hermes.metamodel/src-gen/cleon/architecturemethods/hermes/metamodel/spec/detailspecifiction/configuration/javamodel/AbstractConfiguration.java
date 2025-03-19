package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractConfiguration extends DynamicResource implements IAbstractConfiguration {

  // abstract implementation, only used for static method calls
  private AbstractConfiguration() {
    super(IAbstractConfiguration.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f3285f19-0023-11f0-945c-87b19aec41f4,RB2V1llvWTSsGKg1+1PyNTqMYbQ=] */
